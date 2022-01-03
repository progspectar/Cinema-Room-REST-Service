package cinema.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("purchase")

public class PurchaseController {

    public  SeatsController seatsController;


       public PurchaseController() {
           seatsController = new SeatsController();
    }

    @ResponseBody
    @GetMapping
    public Object show() {
           return seatsController.list();
    }
}
