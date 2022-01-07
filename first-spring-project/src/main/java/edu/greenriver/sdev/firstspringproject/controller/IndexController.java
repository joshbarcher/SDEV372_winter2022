package edu.greenriver.sdev.firstspringproject.controller;

import edu.greenriver.sdev.firstspringproject.model.Surfboard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class IndexController
{
    private List<Surfboard> products = List.of(
        new Surfboard("Boogie", 199.99, 6.5, "red", true),
        new Surfboard("Surf Inc", 99.99, 5.5, "green", false),
        new Surfboard("Acme Company", 399.99, 5, "yellow", false),
        new Surfboard("Surfshark", 499.99, 4.5, "blue-teal", true)
    );

    //this web resource is available at http://localhost:8080/surfboards
    @GetMapping("surfboards")
    public List<Surfboard> getAllProducts()
    {
        return products;
    }

    /* this web resource is available at
          http://localhost:8080
          http://localhost:8080/
          http://localhost:8080/home
          http://localhost:8080/index
     */
    @GetMapping(path = {"/", "", "home", "index"})
    public Surfboard defaultProduct()
    {
        return products.get(0);
    }

    //this web resource is available at http://localhost:8080/random
    @GetMapping("random")
    public Surfboard randomProduct()
    {
        return products.get(new Random().nextInt(products.size()));
    }
}










