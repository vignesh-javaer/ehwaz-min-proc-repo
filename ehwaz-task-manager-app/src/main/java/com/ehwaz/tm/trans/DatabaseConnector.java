/**
 * 
 */
package com.ehwaz.tm.trans;

/**
 * @author vignesh
 *
 */

//@Configuration
//@ComponentScan(basePackages= {"com.ehwaz.tm"})
//@EnableTransactionManagement
public class DatabaseConnector {
	
//	@Value(value = "${spring.datasource.driver-class-name}")
//	private String DRIVER;
//	
//	@Value(value = "${spring.datasource.url}")
//	private String DB_URL;
//	
//	@Value(value = "${spring.datasource.username}")
//	private String DB_USRN;
//
//	@Value(value = "${spring.datasource.password}")
//	private String DB_PWE;
//	
//	@Value(value = "${spring.jooq.sql-dialect}")
//	private String HBE_DIALECT;
//	
//	@Value(value = "${spring.jpa.show-sql}")
//	private String HBE_SHOW_SQL;
//	
//	@Value(value = "${spring.jpa.hibernate.ddl-auto}")
//	private String HBE_DDL;
//	
//	@Value(value = "${entity.package.scan}")
//	private String HBE_PACKAGE_SCAN;
//	
//	//1. datasource
//	@Bean
//	public DataSource getDataSource() {
//		DriverManagerDataSource datasource = new DriverManagerDataSource();
//		datasource.setDriverClassName(DRIVER);
//		datasource.setUrl(DB_URL);
//		datasource.setUsername(DB_USRN);
//		datasource.setPassword(DB_PWE);
//		return datasource;
//	}
//	
//	// 2. hibernate properties
//	@Bean
//	public Properties getOrmProperty() {
//		Properties prop = new Properties();
//		prop.setProperty("hibernate.dialect", HBE_DIALECT);
//		prop.setProperty("hibernate.show_sql", HBE_SHOW_SQL);
//		prop.setProperty("hibernate.hbm2ddl.auto", HBE_DDL);
//		return prop;
//	}
//	
//	
//	// 3. hibernate session
//	public LocalSessionFactoryBean sessionFactory() {
//		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//		sessionFactory.setHibernateProperties(getOrmProperty());
//		sessionFactory.setDataSource(getDataSource());
//		sessionFactory.setPackagesToScan(HBE_PACKAGE_SCAN);
//		return sessionFactory;
//	}
//	
//	// 4. transactional manager
//	@Bean
//	@Autowired
//	public HibernateTransactionManager setTransaction(final SessionFactory session) {
//		HibernateTransactionManager txManager = new HibernateTransactionManager();
//		txManager.setSessionFactory(session);
//		return txManager;
//	}

}
