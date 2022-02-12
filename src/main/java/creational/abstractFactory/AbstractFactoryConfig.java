package creational.abstractFactory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "abstractfactory")
@Getter
@Setter
public class AbstractFactoryConfig {
    private String factory;
}
