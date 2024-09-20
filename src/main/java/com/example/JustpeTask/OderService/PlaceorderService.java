package com.example.JustpeTask.OderService;

import com.example.JustpeTask.OrderEntity.OrderDetail;
import com.example.JustpeTask.OrderRepository.PlaceorderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceorderService {
    @Autowired
    private PlaceorderRepo placeorderRepo;

    public List<OrderDetail> getallorder(){
        return  placeorderRepo.findAll();
    }
}
