package behavourial.chainOfResponsibility.middleware;

import behavourial.chainOfResponsibility.model.Request;

public class AuthMiddleware extends Middleware {
    @Override
    public boolean check(Request request) {
        System.out.println("checking auth");
        return request.getEmail().equals("admin@vanshajgirotra.com") && request.getPassword().equals("password") && checkNext(request);
    }
}
