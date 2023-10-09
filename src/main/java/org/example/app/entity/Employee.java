package org.example.app.entity;

public class Employee {

    private int id;
    private String name;
    private String occupation;
    private int phone;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name, String occupation, int phone) {
        this.name = name;
        this.occupation = occupation;
        this.phone = phone;
    }

    public Employee(int id, String name, String occupation, int phone) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getPhone() {
        return phone;
    }
}
