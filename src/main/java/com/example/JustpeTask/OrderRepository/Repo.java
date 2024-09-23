package com.example.JustpeTask.OrderRepository;

import com.example.JustpeTask.OrderEntity.BussinessDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<BussinessDetails ,Long> {

    @Query("SELECT b FROM BussinessDetails b WHERE b.id = (SELECT MAX(b2.id) FROM BussinessDetails b2)")
    BussinessDetails findLastUser();
}
