package com.example.Notification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FCMNotificationDataRepository extends JpaRepository<FCMNotificationData,Long> {
}
