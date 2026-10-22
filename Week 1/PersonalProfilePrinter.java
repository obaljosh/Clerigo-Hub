/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Josh
 */
public class PersonalProfilePrinter {
    public static void main(String[] args) {
        String fullName = "Antonio C Clerigo III";

        int age = 26;
        double heightInMeters = 5.0;
        char middleInitial = 'A';
        boolean isStudent = true;

        System.out.println("=== PERSONAL PROFILE ===");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + heightInMeters + " m");
        System.out.println("Middle Initial: " + middleInitial);
        System.out.println("Is Student: " + isStudent);
    }
}

