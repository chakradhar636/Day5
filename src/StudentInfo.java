/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication2;

import java.io.Serializable;
import java.util.List;

class StudentInfo implements Serializable
{
    //transient data members will not take part in Serialization
    transient String name;
    String address;
    int rid;
    StudentInfo(String n,String address, int r)
    {
        this.address=address;
        this.name = n;
        this.rid = r;
    }

    void printStudentInfo()
    {
        System.out.println("StudentInfo details Test:"+name+" "+address+" "+rid+" ");
    }

    public String toString()
    {
        return "name="+name+"," +
                "address="+address+
                "rid="+rid;
    }
}


class StudentInfoArray implements Serializable{
    StudentInfo arr[];

    StudentInfoArray(StudentInfo arr[])
    {
        this.arr = arr;
    }
}

class StudentInfoList implements Serializable{
    List  lst;

    StudentInfoList(List lst)
    {
        this.lst = lst;
    }
}