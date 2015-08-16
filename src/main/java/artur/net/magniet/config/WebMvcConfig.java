package artur.net.magniet.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("unused")
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String get() {
        return "home";
    }



}