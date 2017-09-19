package filestorage;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;

/**
 * Created by pallavi on 19/9/17.
 */
public class RequestFunctionHandler implements RequestHandler<Map<String,String>,String>{

    public String handleRequest(Map<String, String> values, Context context) {

        return "Hello world, I got triggered";
    }


}
