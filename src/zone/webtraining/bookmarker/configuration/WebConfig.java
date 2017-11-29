package zone.webtraining.bookmarker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import zone.webtraining.bookmarker.controllers.BookmarksController;

@Configuration
@EnableWebMvc
public class WebConfig {

    @Bean
    public BookmarksController bookmarksController() {
        return new BookmarksController();
    }
}
