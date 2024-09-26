package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String password = "Contraseña";
        System.out.println(password);
        NotificationService myNotificationService = new NotificationService();
        PasswordValidator myPasswordValidator = new PasswordValidator(myNotificationService);
        boolean boleano= myPasswordValidator.isValidPassword(password);
        System.err.println(boleano);
    }
}