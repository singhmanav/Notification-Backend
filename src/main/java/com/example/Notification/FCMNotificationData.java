package com.example.Notification;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class FCMNotificationData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column
    private String notificationCat;
    @Column
    private String notificationText;
    @Column
    private String notificationDetail;
    @Column
    private String notificationDetailUrl;
    @Column
    private String imageUrl;
    @Column
    private String callToAction;
    @Id
    private Long id;

    public FCMNotificationData(String notificationCat, String notificationText, String notificationDetail, String notificationDetailUrl, String imageUrl, String callToAction, Long id) {
        this.notificationCat = notificationCat;
        this.notificationText = notificationText;
        this.notificationDetail = notificationDetail;
        this.notificationDetailUrl = notificationDetailUrl;
        this.imageUrl = imageUrl;
        this.callToAction = callToAction;
        this.id = id;
    }

    public String getNotificationCat() {
        return notificationCat;
    }
    public void setNotificationCat(String notificationCat) {
        this.notificationCat = notificationCat;
    }
    public String getNotificationText() {
        return notificationText;
    }
    public void setNotificationText(String notificationText) {
        this.notificationText = notificationText;
    }
    public String getNotificationDetail() {
        return notificationDetail;
    }
    public void setNotificationDetail(String notificationDetail) {
        this.notificationDetail = notificationDetail;
    }
    public String getNotificationDetailUrl() {
        return notificationDetailUrl;
    }
    public void setNotificationDetailUrl(String notificationDetailUrl) {
        this.notificationDetailUrl = notificationDetailUrl;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getCallToAction() {
        return callToAction;
    }
    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}