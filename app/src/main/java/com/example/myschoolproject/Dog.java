package com.example.myschoolproject;


public class Dog {


    @Override
    public String toString() {
        return "Dog{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", auxdata='" + auxdata + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAuxdata() {
        return auxdata;
    }

    public void setAuxdata(String auxdata) {
        this.auxdata = auxdata;
    }

    private String ID;
    private String name;
    private String company;
    private String auxdata;
}