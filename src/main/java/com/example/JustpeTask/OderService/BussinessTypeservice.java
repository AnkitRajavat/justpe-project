package com.example.JustpeTask.OderService;

import com.example.JustpeTask.OrderEntity.BussinessType;
import com.example.JustpeTask.OrderRepository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BussinessTypeservice {

    @Autowired
    private ProductRepo productRepo;

    public List<BussinessType> findproduct(){
        return productRepo.findAll();
    }
    public Optional<BussinessType> getbyid(long id){
        return productRepo.findById(id);
    }
    public Optional<BussinessType> getProductByName(String name) {
        return productRepo.findByName(name);
    }


}
