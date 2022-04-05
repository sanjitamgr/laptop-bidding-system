package com.bidding.laptop.repository;

import com.bidding.laptop.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, Integer> {
}
