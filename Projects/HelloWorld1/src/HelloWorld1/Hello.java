package HelloWorld1;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<String, String>{
    public String handleRequest(String name, Context context) {
        return String.format("Hello %s.", name);
    }
}