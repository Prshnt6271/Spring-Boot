package com.curd.Repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curd.Entity.Bill;
@Repository
public interface UserRepo extends JpaRepository<Bill,Integer> {
}
