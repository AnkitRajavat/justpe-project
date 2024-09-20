package com.example.JustpeTask.OrderRepository;

import com.example.JustpeTask.OrderEntity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceorderRepo extends JpaRepository<OrderDetail,Long> {
}
