package com.serverless.emp.rds;


import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.ibatis.type.TypeAliasRegistry;

import javax.sql.DataSource;

/**
 * Created by pallavi on 24/9/17.
 */
public class BuildSqlSessionFactory {

    private static SqlSessionFactory factory;

    static {

        DataSource dataSource = getDataSource();

        TransactionFactory trxFactory = new JdbcTransactionFactory();
        Environment env = new Environment("dev", trxFactory, dataSource);

        Configuration config = new Configuration(env);

        config.addMapper(EmpDBMapper.class);

        factory = new SqlSessionFactoryBuilder().build(config);

    }

    private static DataSource getDataSource() {

        PooledDataSource dataSource = new PooledDataSource();

        dataSource.setDriver(System.getenv("DB_DRIVER"));
        dataSource.setUrl("jdbc:mysql://"
                + System.getenv("RDS_HOSTNAME")
                + "/"
                + System.getenv("RDS_DB_NAME"));
        dataSource.setUsername(System.getenv("RDS_USERNAME"));
        dataSource.setPassword(System.getenv("RDS_PASSWORD"));



        return dataSource;

    }


    public static SqlSessionFactory getSqlSessionFactory() {

        return factory;
    }

}
