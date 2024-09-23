package com.example.JustpeTask.OderService;

import com.example.JustpeTask.OrderEntity.ActivationBussiness;
import com.example.JustpeTask.OrderRepository.ActiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActiveService {

    @Autowired
    public ActiveRepo activeRepo;

    public void savedata(ActivationBussiness activationBussiness){
         activeRepo.save(activationBussiness);
    }

}
