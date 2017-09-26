package com.serverless.emp.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.serverless.emp.entity.Employee;
import com.serverless.emp.rds.EmpDAO;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 * Created by pallavi on 21/9/17.
 */
public class EmpRequestHandler implements RequestHandler<Employee, JSONObject> {

    public JSONObject handleRequest(Employee emp, Context context){

        JSONParser parser = new JSONParser();


        LambdaLogger logger = context.getLogger();
        logger.log("Loading Java Lambda handler of EmpRequestHandler");

        EmpDAO empDAO = new EmpDAO();
        empDAO.addEmpDetails(emp);

        JSONObject response = new JSONObject();
        response.put("message", "Employee created sucessfully!");

        return  response;


    }

}
