package study.basecamp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import study.basecamp.Game.Game;
import study.basecamp.Game.GameImpl;
import study.basecamp.Game.NumberGenerator;
import study.basecamp.Game.NumberGeneratorImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "study.*" })
// Включаем MVC
public class WebConfig {

    @Bean
    public Game game(){
        return new GameImpl();
    }

    @Bean
    public NumberGenerator generator(){
        return new NumberGeneratorImpl();
    }

}
