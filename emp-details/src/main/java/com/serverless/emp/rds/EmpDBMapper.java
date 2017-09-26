package com.serverless.emp.rds;

import com.serverless.emp.entity.Employee;
import org.apache.ibatis.annotations.*;

/**
 * Created by pallavi on 24/9/17.
 */
public interface EmpDBMapper {

    // Insert employee details
    // ---------------------------------------------------------------------
    @Insert("INSERT into employee(name, role) VALUES( #{emp.name}, #{emp.role});")
    public void insertEmpDetails(@Param("emp") Employee emp);


    // get employee details
    // -------------------------------------------------------------------------
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "role", column = "role")
    })
    @Select("SELECT id, name, role from employee WHERE id = #{id}")
    public Employee selectEmp(Integer id);

}
