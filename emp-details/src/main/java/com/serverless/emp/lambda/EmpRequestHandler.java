package com.serverless.emp.lambda;

import com.amazonaws.Response;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.serverless.emp.Bean.Employee;
import com.serverless.emp.rds.EmpDAO;
import org.json.simple.parser.JSONParser;

import java.io.*;

/**
 * Created by pallavi on 21/9/17.
 */
public class EmpRequestHandler implements RequestHandler<Employee, String> {

    public String handleRequest(Employee emp, Context context){

        JSONParser parser = new JSONParser();


        LambdaLogger logger = context.getLogger();
        logger.log("Loading Java Lambda handler of EmpRequestHandler");

        EmpDAO empDAO = new EmpDAO();
        empDAO.addEmpDetails(emp);


        return  "Employee details added into the DB.";


    }


}
