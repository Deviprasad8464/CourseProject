package com.airtribe.payflow.repository;


import com.airtribe.payflow.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


    Optional<Object> findByUpiId(String upiId);
}
