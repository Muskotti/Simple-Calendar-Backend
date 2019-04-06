package fi.tuni.tiko.SimpleCalendarBackend;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Value("${prmjxxufhbuacr:9fa1be1fdb4c5dd272119e280674fa79026e8f8e082daf1aeba263806611ba9c@ec2-23-23-241-119.compute-1.amazonaws.com:5432/d85unttfeo5dag}")
    private String dbUrl;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
    }
}
