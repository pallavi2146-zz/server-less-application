package com.serverless.emp.rds;

import com.serverless.emp.Bean.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
/**
 * Created by pallavi on 24/9/17.
 */
public interface EmpDBMapper {

    // Insert employee details
    // ---------------------------------------------------------------------
    @Insert("INSERT into employee(id, name, role)")
    public void insertEmpDetails(Employee emp);


    // get employee details
    // -------------------------------------------------------------------------
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "role"),
            @Result(property = "role", column = "role")
    })
    @Select("SELECT id, name, role from employee WHERE id = #{id}")
    public Employee selectEmp(long id);


}
