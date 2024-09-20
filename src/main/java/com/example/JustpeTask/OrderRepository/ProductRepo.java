package com.example.JustpeTask.OrderRepository;

import com.example.JustpeTask.OrderEntity.BussinessType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<BussinessType,Long> {
}
