package behavourial.chainOfResponsibility.middleware;

import behavourial.chainOfResponsibility.model.Request;
import lombok.Setter;

public abstract class Middleware {
    @Setter
    private Middleware next;

    public abstract boolean check(Request request);

    protected boolean checkNext(Request request) {
        return next == null || next.check(request);
    }
}
