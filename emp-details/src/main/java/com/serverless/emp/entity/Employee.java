package com.serverless.emp.entity;

/**
 * Created by pallavi on 21/9/17.
 */


public class Employee implements java.io.Serializable {

    private Integer id;
    private String name;
    private String role;


    // Getters and Setters
    // -------------------------------------------------------------------

    public void setId(Integer id){
        this.id = id;

    }

    public Integer getId() {

        return id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setRole(String role) {

        this.role = role;
    }

    public String getRole() {

        return role;
    }


}
