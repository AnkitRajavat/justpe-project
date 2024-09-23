package com.example.JustpeTask.OrderController;

import com.example.JustpeTask.OderService.PlaceorderService;
import com.example.JustpeTask.OderService.ServiceImp;
import com.example.JustpeTask.OrderEntity.BussinessDetails;
import com.example.JustpeTask.OrderEntity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PlaceorderController {

    @Autowired
    public BussinessDetails bussinessDetails;

    @Autowired
    public ServiceImp serviceImp;

    @GetMapping("/orderstatus")
    public String showOrderstatus(Model model){
        BussinessDetails bussinessDetails=serviceImp.findLastUser();
        model.addAttribute("bussinessDetails",bussinessDetails);

         List<BussinessDetails> order=serviceImp.getAllDetails();
        model.addAttribute("orders",order);
        return "Activation_form";
    }

}
