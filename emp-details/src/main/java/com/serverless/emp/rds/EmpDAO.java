package com.serverless.emp.rds;

import com.serverless.emp.Bean.Employee;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by pallavi on 25/9/17.
 */
public class EmpDAO {

    public void  addEmpDetails(Employee emp) {

        SqlSession session = BuildSqlSessionFactory.getSqlSessionFactory().openSession();
        EmpDBMapper mapper = session.getMapper(EmpDBMapper.class);
        mapper.insertEmpDetails(emp);
        session.commit();
        session.close();

    }
}
