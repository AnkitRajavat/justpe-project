package com.example.JustpeTask.OrderRepository;

import com.example.JustpeTask.OrderEntity.BussinessDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<BussinessDetails ,Long> {
}
