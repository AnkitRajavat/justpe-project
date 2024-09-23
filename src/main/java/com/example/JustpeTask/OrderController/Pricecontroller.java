package com.example.JustpeTask.OrderController;

import com.example.JustpeTask.OderService.BussinessTypeservice;
import com.example.JustpeTask.OrderEntity.BussinessType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class Pricecontroller {
    @Autowired
    private BussinessTypeservice bussinessTypeservice;

    @ResponseBody
    @GetMapping("/products/price")
    public ResponseEntity<Long> getProductPrice(@RequestParam String productName) {
        Optional<BussinessType> product =bussinessTypeservice.getProductByName(productName);
        if (product.isPresent()) {
            return new ResponseEntity<>(product.get().getPrice(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
