package com.example.JustpeTask.OderService;

import com.example.JustpeTask.OrderEntity.BussinessDetails;
import com.example.JustpeTask.OrderRepository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImp implements Serviceoder {

    @Autowired
    private Repo repo;
    @Override
    public void createform(BussinessDetails bussinessDetails) {
        repo.save(bussinessDetails);
    }

    @Override
    public List<BussinessDetails> getAllDetails() {
        return repo.findAll();
    }
}
