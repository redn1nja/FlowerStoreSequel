package com.example.lab7;


import com.flowers.Chamomile;
import com.flowers.Flower;
import com.logic.FlowerBucket;
import com.logic.FlowerPack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/bucket")
public class FlowerController {
    @GetMapping
    public List<FlowerBucket> getFlowers(){
        Flower f = new Chamomile();
        FlowerPack p = new FlowerPack(f, 15);
        FlowerBucket buck = new FlowerBucket();
        buck.add(p);
        return List.of(buck);
    }
}
