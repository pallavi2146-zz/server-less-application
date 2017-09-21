package com.serverless.emp.db;

import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;

/**
 * Created by pallavi on 21/9/17.
 */
public class QueryTable {

    private final DynamoDB dynamoDB;
    private final String tableName;


    public QueryTable(DynamoDB dynamoDB, String tableName) {

        this.dynamoDB = dynamoDB;
        this.tableName = tableName;

    }

    private  void getEmp(int id) {

        Table table = dynamoDB.getTable(tableName);

        Item item = table.getItem("Id", // attribute name
                id, // attribute value
                "Id, Name, Role", // projection expression
                null); // name map - don't need this
        System.out.println(item.toJSONPretty());

    }
}
