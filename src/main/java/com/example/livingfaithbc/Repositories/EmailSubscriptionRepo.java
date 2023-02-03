package com.example.livingfaithbc.Repositories;

import com.example.livingfaithbc.models.EmailSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailSubscriptionRepo extends JpaRepository<EmailSubscription, Long>{}
