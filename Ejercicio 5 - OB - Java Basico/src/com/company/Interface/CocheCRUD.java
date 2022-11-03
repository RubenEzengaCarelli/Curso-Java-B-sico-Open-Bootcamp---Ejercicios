package com.company.Interface;

public interface CocheCRUD {

    default void save(){
        System.out.println("This is function save");
    }

    default void findAll(){
        System.out.println("This is function findAll");
    }

    default void delete(){
        System.out.println("This is function delete");
    }
}
