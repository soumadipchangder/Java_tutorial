package com.cms.config;

import org.springframework.context.annotation.*;
import org.springframework.orm.jpa.*;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.cms")
@EnableTransactionManagement
public class AppConfig {

@Bean
public LocalContainerEntityManagerFactoryBean entityManagerFactory(){

LocalContainerEntityManagerFactoryBean factory =
new LocalContainerEntityManagerFactoryBean();

factory.setPersistenceUnitName("Customer_Management_System_By_Using_Hibernate");
factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

return factory;
}

@Bean
public JpaTransactionManager transactionManager(){

JpaTransactionManager tx = new JpaTransactionManager();
tx.setEntityManagerFactory(entityManagerFactory().getObject());

return tx;
}

}