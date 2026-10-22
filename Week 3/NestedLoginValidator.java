/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Josh
 */
public class NestedLoginValidator {
    
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "password123";
        boolean isAccountLocked = false;

        String inputUsername = "admin";
        String inputPassword = "password123";

        if (inputUsername.equals(correctUsername)) {
            if (inputPassword.equals(correctPassword)) {
                if (!isAccountLocked) {
                    System.out.println("Login successful! Welcome.");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }
            } else {
                System.out.println("Login failed: Incorrect password.");
            }
        } else {
            System.out.println("Login failed: Username not found.");
        }
    }
}

