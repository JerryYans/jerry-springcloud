package com.jerry.springcloud.service.user.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.jerry.springcloud.service.user.model.User;
import com.jerry.springcloud.service.user.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile({"local","default"})
public class BeanConfig {

    @Bean
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:h2:mem:test");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }

    @Bean
    InitializingBean saveData(UserRepository userRepository){
        return ()->{
            userRepository.save(new User("zhang","Today I will learn Spring Boot",12));
            userRepository.save(new User("yan","I will do my first Spring Boot Project",2016));
            userRepository.save(new User("wang","Read more about Spring Boot",22));
            userRepository.save(new User("li","Spring Boot using Cloud Foundry",22));
        };
    }
}
