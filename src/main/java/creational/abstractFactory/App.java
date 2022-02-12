package creational.abstractFactory;

import creational.abstractFactory.factory.Factory;
import creational.abstractFactory.factory.MacFactory;
import creational.abstractFactory.factory.WinFactory;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@Slf4j
@EnableConfigurationProperties({AbstractFactoryConfig.class})
public class App implements CommandLineRunner {
    private final AbstractFactoryConfig config;
    private Factory factory;

    public App(AbstractFactoryConfig config) {
        this.config = config;
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.run();
    }

    @Override
    public void run(String... args) {
        switch (config.getFactory().toLowerCase()) {
            case "windows" -> {
                log.debug("selected windows config");
                this.factory = new WinFactory();
            }
            case "mac" -> {
                log.debug("selected mac config");
                this.factory = new MacFactory();
            }
            default -> log.info("default config");
        }
        factory.createButton().render();
        factory.createCheckbox().render();
    }
}

