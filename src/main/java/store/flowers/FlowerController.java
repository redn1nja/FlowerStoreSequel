package store.flowers;


import store.Items.FlowerBucket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/flower")
public class FlowerController {
    @GetMapping
    public List<FlowerBucket> getFlowers(){
        Flower f = new Flower(14.0, "white", 11.0);
        FlowerBucket buck = new FlowerBucket();
        buck.add(f);
        return List.of(buck);
    }
}
