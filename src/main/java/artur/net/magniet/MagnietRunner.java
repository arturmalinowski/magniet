package artur.net.magniet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SuppressWarnings("unused")
@EnableAutoConfiguration
@ComponentScan
public class MagnietRunner {

    public static void main(String[] args) {
        SpringApplication.run(MagnietRunner.class, args);
    }
}
