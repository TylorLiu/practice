package org.tylor.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liubin10  2018/3/15
 */
@Configuration
public class DataSourceConfig {

  /*  @Bean
    public DataSource initDataSource(DataSourceProperties properties){
        DataSource dataSource = (DataSource)properties.initializeDataSourceBuilder().type(DataSource.class).build();
        DatabaseDriver databaseDriver = DatabaseDriver.fromJdbcUrl(properties.determineUrl());
        String validationQuery = databaseDriver.getValidationQuery();
        if (validationQuery != null) {
            dataSource.setTestOnBorrow(true);
            dataSource.setValidationQuery(validationQuery);
        }
        return dataSource;
    }*/




}
