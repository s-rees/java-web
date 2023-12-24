package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);
}
