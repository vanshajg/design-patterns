package behavourial.chainOfResponsibility.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Request {
    private String email;
    private String password;
    private String body;
}
