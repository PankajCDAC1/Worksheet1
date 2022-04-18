package com.SpringWorksheet;
import java.util.List;
import java.lang.Integer;



public class Emp {
    private  int age;
    private String name;
    private String address;
    private List<Integer> number;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Integer> getNumber() {
        return number;
    }

    public void setNumber(List<Integer> number) {
        this.number = number;
    }

    public Emp() {
    }

    public Emp(String name) {
        this.name = name;
    }

    public Emp(int age) {
        this.age = age;
    }

    public Emp(List<Integer> number) {
        this.number = number;
    }




    @Override
    public String toString() {
        return "Emp [number= " + number + ", name= " + name  + " , age= " + age + ", address= " + address + " ]" ;
    }
}
