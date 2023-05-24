package com.example.myschoolproject;



public class Dog {
    @Override
    public String toString() {
        return "Dog{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Company='" + Company + '\'' +
                ", AuxData='" + AuxData + '\'' +
                '}';
    }

    private String ID;
    private String Name;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getAuxData() {
        return AuxData;
    }

    public void setAuxData(String auxData) {
        AuxData = auxData;
    }

    private String Company;
    private String AuxData;

}
