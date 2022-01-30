package behavourial.chainOfResponsibility.server;

import behavourial.chainOfResponsibility.middleware.Middleware;
import behavourial.chainOfResponsibility.model.Request;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private final Map<String, String> users = new HashMap<>();
    @Setter
    private Middleware middleware;

    public boolean login(Request request) {
        if (!middleware.check(request)) {
            System.out.println("failed middleware");
            return false;
        }
        return (users.containsKey(request.getEmail()) && users.get(request.getEmail()).equals(request.getPassword()));
    }

    public void register(Request request) {
        users.put(request.getEmail(), request.getPassword());
    }

}
