package com.lgb.webnetflix.config.db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.lgb.webnetflix.config.AES;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.Transaction;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class DatabaseConfig {
	private String secrectKey="Aa@123456";
	
	
	@Value("${db.datasource.driver-class-name}")
	private String driverClassName;
	
	@Value("${db.datasource.url}")
	private String urlDB;
	
	@Value("${db.datasource.username}")
	private String userName;
	
	@Value("${db.datasource.password}")
	private String password;
	
	@Bean(name="dataSource")
	public DataSource dataSource() {
		
		HikariConfig hikariConfig = new HikariConfig();
		
		hikariConfig.setJdbcUrl(AES.decrypt(urlDB, secrectKey));
		hikariConfig.setDriverClassName(driverClassName);
		hikariConfig.setUsername(AES.decrypt(userName, secrectKey));
		hikariConfig.setPassword(AES.decrypt(password, secrectKey));
		
		HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);
		
		return hikariDataSource;  
	}
	
	@Bean(name="trasactionManager")
	public DataSourceTransactionManager dataSourceTransactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
	
	@Bean(name="sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
		
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		
		sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/lgb/webnetflix/mapper/sql/*.xml"));
		
		
		return sqlSessionFactoryBean.getObject();
	}
}
