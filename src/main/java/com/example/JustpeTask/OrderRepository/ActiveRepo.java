package com.example.JustpeTask.OrderRepository;

import com.example.JustpeTask.OrderEntity.ActivationBussiness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ActiveRepo extends JpaRepository<ActivationBussiness,Long> {
}
