package com.example.livingfaithbc.Repositories;


import com.example.livingfaithbc.models.JoinForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinControllerRepo extends JpaRepository<JoinForm, Long> {

}
