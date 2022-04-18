package com.SpringWorksheet;
import java.util.List;
import java.lang.Integer;

public class Empl {
        private  int age;
        private String name;
        private String address;
        private List<Integer> number;

    public Empl(int age, String name, String address, List<Integer> number) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.number = number;

    }

    @Override
    public String toString() {
        return this.age+" : " +  this.name+" : " +  this.address+" : " +  this.number+" : " ;
    }

    public Empl() {
    }
}
