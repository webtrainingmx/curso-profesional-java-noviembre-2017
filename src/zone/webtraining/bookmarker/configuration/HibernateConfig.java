package zone.webtraining.bookmarker.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource(value = {"classpath:application.properties"})
@ComponentScans(value = {
        @ComponentScan("zone.webtraining.bookmarker.dao"),
        @ComponentScan("zone.webtraining.bookmarker.services")
})
public class HibernateConfig {


}
