package com.yuge.jpa.jpainterceptor;

import com.yuge.jpa.jpainterceptor.config.OwnRepositoryFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// 使用已有ExposeInvocationInterceptor拦截器，无需扩展
//@EnableJpaRepositories(repositoryFactoryBeanClass = OwnRepositoryFactoryBean.class)
public class JpaInterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaInterceptorApplication.class, args);
    }

}
