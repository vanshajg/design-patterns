package behavourial.chainOfResponsibility.middleware;

import behavourial.chainOfResponsibility.model.Request;


public class ThrottlingMiddleware extends Middleware {
    private final int requestPerMin;
    private int requestCount;
    private long currentTime;


    public ThrottlingMiddleware(int requestPerMin) {
        this.requestPerMin = requestPerMin;
        requestCount = 0;
        currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(Request request) {
        System.out.println("checking throttling request");
        if (System.currentTimeMillis() > currentTime + 60_000) {
            requestCount = 0;
            currentTime = System.currentTimeMillis();
        } else {
            requestCount++;
        }
        if (requestCount > requestPerMin) {
            System.out.println("rate limit exceeded");
            return false;
        }
        return checkNext(request);
    }
}
