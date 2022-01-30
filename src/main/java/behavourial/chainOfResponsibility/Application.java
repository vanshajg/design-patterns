package behavourial.chainOfResponsibility;

import behavourial.chainOfResponsibility.middleware.AuthMiddleware;
import behavourial.chainOfResponsibility.middleware.Middleware;
import behavourial.chainOfResponsibility.middleware.ThrottlingMiddleware;
import behavourial.chainOfResponsibility.model.Request;
import behavourial.chainOfResponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        server.register(Request.builder().email("admin@vanshajgirotra.com").password("password").build());
        Middleware throttlingMiddleware = new ThrottlingMiddleware(3);
        Middleware AuthMiddleware = new AuthMiddleware();
        throttlingMiddleware.setNext(AuthMiddleware);
        server.setMiddleware(throttlingMiddleware);
        do {
            System.out.println("email: ");
            String email = reader.readLine();
            System.out.println("password: ");
            String password = reader.readLine();
            Request request = Request.builder().email(email).password(password).build();
            server.login(request);

        }while(true);
    }
}
