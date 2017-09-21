package com.serverless.emp.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import org.json.simple.parser.JSONParser;

import java.io.*;

/**
 * Created by pallavi on 21/9/17.
 */
public class EmpRequestHandler implements RequestStreamHandler {

    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {

        JSONParser parser = new JSONParser();


        LambdaLogger logger = context.getLogger();
        logger.log("Loading Java Lambda handler of EmpRequestHandler");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));


    }


}
