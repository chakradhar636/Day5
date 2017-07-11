/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication2;

import java.io.Serializable;
import java.util.List;
class Address implements Serializable{
    String street;
    String city;
    int pin;


    Address(String street,String city,int pin){
        this.street=street;
        this.city=city;
        this.pin=pin;
    }
    void print()
    {
        System.out.println("Address details Test:"+street+" "+city+" "+pin+" ");
    }

    public String toString()
    {
        return "name="+street+"," +
                "model="+city+
                "vid="+pin
                ;
    }

}
class Vehicle implements Serializable
{
    //transient data members will not take part in Serialization
    String name;
    String model;
    int vid;
    transient String pic;
    Address add=new Address("a","a",2);
    Vehicle(String name,String model, int vid,String pic,Address add)
    {
        this.name=name;
        this.model = model;
        this.vid = vid;
        this.pic=pic;
        this.add=add;
    }

    void printVehicleInfo()
    {
        System.out.println("Vehicle details Test:"+name+" "+model+" "+vid+" "+pic+" ");
        add.print();
    }

    public String toString()
    {
        return "name="+name+"," +
                "model="+model+
                "vid="+vid
                +"pic"+pic;
    }
}


class VehicleInfoArray implements Serializable{
    Vehicle arr[];

    VehicleInfoArray(Vehicle arr[])
    {
        this.arr = arr;
    }
}

class VehicleInfoList implements Serializable{
    List  lst;

    VehicleInfoList(List lst)
    {
        this.lst = lst;
    }
}