package com.example.JustpeTask.OderService;

import com.example.JustpeTask.OrderEntity.BussinessDetails;

import java.util.List;

public interface Serviceoder {
    public void createform(BussinessDetails bussinessDetails);
    public List<BussinessDetails> getAllDetails();
}
