package com.example.JustpeTask.OrderController;

import com.example.JustpeTask.OderService.ActiveService;
import com.example.JustpeTask.OderService.BussinessTypeservice;
import com.example.JustpeTask.OrderEntity.ActivationBussiness;
import com.example.JustpeTask.OrderEntity.BussinessType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ActiveController {

    @Autowired
    private BussinessTypeservice bussinessTypeservice;

    @Autowired
    public ActiveService activeService;

    @GetMapping("/activition")
    public String newform( Model model ){
        List<BussinessType> bussinessType=bussinessTypeservice.findproduct();

        model.addAttribute("product",bussinessType);
        model.addAttribute("active",new ActivationBussiness());
        return "Activation_form";
    }
    @PostMapping("/submit")
    public String saveform(@ModelAttribute ActivationBussiness activationBussiness,Model model){
        activeService.savedata(activationBussiness);
        return"Message";
    }
}
