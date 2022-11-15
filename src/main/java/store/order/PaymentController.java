package store.order;


import store.Items.*;
import store.flowers.Flower;
import store.order.delivery.PostDelivery;
import store.order.payment.PayPalPay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/pay")
public class PaymentController {
    @GetMapping
    public String getOrder(){
        Flower f = new Flower(15.0, "red", 10.0);
        Flower f2 = new Flower(10.0, "blue", 15.0);
        FlowerBucket buck = new FlowerBucket();

        Item romashka = new ChamomileFlower();
        ItemDecorator rib = new RibbonDecorator(romashka);
        buck.add(f);
        buck.add(f2);
        Order order = new Order();
        order.addItem(buck);
        order.addItem(rib);
        order.setPaymentStrategy(new PayPalPay());
        order.setDeliveryStrategy(new PostDelivery());
        return order.processOrder();
    }
}
