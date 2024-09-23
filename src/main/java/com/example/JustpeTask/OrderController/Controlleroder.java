package com.example.JustpeTask.OrderController;

import com.example.JustpeTask.OderService.BussinessTypeservice;
import com.example.JustpeTask.OderService.ServiceImp;
import com.example.JustpeTask.OrderEntity.BussinessDetails;
import com.example.JustpeTask.OrderEntity.BussinessType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Controlleroder {
    @Autowired
    private ServiceImp serviceImp;


@Autowired
private BussinessTypeservice bussinessTypeservice;



 @GetMapping("/form")
    public String getalldetails(Model model){
     model.addAttribute("listUser",serviceImp.getAllDetails());
        return "Alluser_from";
 }


      @GetMapping("/add")
    public String createform(Model model){

         List< BussinessType> bussinessType=bussinessTypeservice.findproduct();

         model.addAttribute("product",bussinessType);
     model.addAttribute("form",new BussinessDetails());
      return "addBussiness";
}


  @PostMapping("/orderstatus")
public String savebussiness(@ModelAttribute BussinessDetails bussinessDetails,Model model){
     System.out.println(bussinessDetails.toString());
    serviceImp.createform(bussinessDetails);
    model.addAttribute("form",new BussinessDetails());
    model.addAttribute("message","you have registered successfully");
return "Orderstatus";
}
}

