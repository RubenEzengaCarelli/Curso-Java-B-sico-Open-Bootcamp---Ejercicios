package com.company.Interface;

public class Main {

    public static void main(String[] args) {

       CocheCRUD cocheCRUD = new CocheCRUDImpl();

       cocheCRUD.save();
       cocheCRUD.delete();
       cocheCRUD.findAll();

       

    }
}
