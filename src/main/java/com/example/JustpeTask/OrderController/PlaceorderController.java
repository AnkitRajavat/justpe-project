package com.example.JustpeTask.OrderController;

import com.example.JustpeTask.OderService.PlaceorderService;
import com.example.JustpeTask.OrderEntity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PlaceorderController {



    @Autowired
    public PlaceorderService placeorderService;

    @GetMapping("/orderstatus")
    public String showOrderstatus(Model model){
         List<OrderDetail> order=placeorderService.getallorder();
        model.addAttribute("orders",order);
        return "orderDetails";
    }

}
