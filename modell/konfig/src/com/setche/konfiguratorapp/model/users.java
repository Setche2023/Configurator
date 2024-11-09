package com.setche.konfiguratorapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class users {

    private int id;
    private String name;
    private String email;
    private String password;
    private String adresse;
    private String role;
    private List<Preference> preferences;
    private List<Commande> orderHistory;

    // Constructors
    public users(int id, String name, String email, String password, String adresse, String role) {
        this.id = id;
        setName(name);
        setEmail(email);
        setPassword(password);
        this.adresse = adresse;
        this.role = role;
        this.preferences = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
    }
    
    // Inscription methode
    public static users inscription(int id, String name, String email, String password, String adresse, String role) throws Exception {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name must not be null");
        if (email == null || !Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", email))
            throw new IllegalArgumentException("Invalid email address");
        if (password == null || password.length() < 8)
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        
        return new users(id, name, email, password, adresse, role);
}

    // Connection Authentication
    public void logIn(String email, String password) throws Exception{
        if (!this.email.equals(email) || !this.password.equals(password)){
            throw new Exception("Invalid credentials");
        }
        System.out.println("Login successful!");
    }

    // Profil update methode
    public void profilUpdate(String newName, String newEmail, String newAdresse) throws Exception {
        setName(newName);
        setEmail(newEmail);
        this.adresse = newAdresse;
        System.out.println("Profile updated successfully");
    }

    // Method to add a preference
    public void addPreference(Preference preference) {
        if (!preferences.contains(preference)){
            preferences.add(preference);
            System.out.println("Preference added successfully");
        }else{
            System.out.println("Preference already exists");
    }
}

    // Method to see the history of the ordners
    public List<Commande> seeOrderHistory() {
        return orderHistory;
    }

    // Getters and Setters with validations


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Preference> getPreferences() {
        return this.preferences;
    }

    public void setPreferences(List<Preference> preferences) {
        this.preferences = preferences;
    }

    public List<Commande> getOrdnerHistory() {
        return this.orderHistory;
    }

    public void setOrdnerHistory(List<Commande> ordnerHistory) {
        this.orderHistory = ordnerHistory;
    }
}

