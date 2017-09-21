package com.serverless.emp.Bean;

/**
 * Created by pallavi on 21/9/17.
 */


public class EmpBean {

    private final long id;
    private final String name;
    private final String role;


    // Constructor
    // -------------------------------------------------------------------

    private EmpBean(long id, String name, String role) {
        super();

        this.id = id;
        this.name = name;
        this.role = role;

    }


    // Getters and Setters
    // -------------------------------------------------------------------

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    // Factory Methods
    // ------------------------------------------------------------------------

    public static EmpBean from(long id, String name, String role) {
        return new EmpBean(id, name, role);
    }

}
