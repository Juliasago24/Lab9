package com.example;

public class PasswordValidator {
    // Adding the attributes to this class to call
    NotificationService myNotificationService;
    
    //Constructor
    public PasswordValidator(NotificationService myNotificationService) {
        this.myNotificationService = myNotificationService;
    }

    //Getters and setters
    public NotificationService getMyNotificationService() {
        retur