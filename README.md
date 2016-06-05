#MyBatis generator project
### This is used to generate xml, mapper and java entities based on configuration in config.xml. This used library from http://www.mybatis.org/generator/

Usage:
- Download and import project into eclipse. Using import gradle instead of import java project.
- Open and configure in config.xml
	* Include your jdbc driver library in build.gradle
	* Change attributes in <jdbcConnection> tag to connect to your database. My exmaple using mySQL
- Add your tables in your schema to generate code by adding block code below in config.xml. In this example, I just only have one table called 'user', there is one or more tables in schema, how many tables you want to generate code (xml, entities, mapper ) , how many <table> <table> tags that you should add.
```
<table schema="your-schema" tableName="user" domainObjectName="User">
    	<property name="useActualColumnNames" value="false"/>
    	<property name="runtimeSchema" value="${@DEFAULT_SCHEMA}"/>
    </table>
``` 

- Then run Generator.java to generate code. You will saw the message "Successfully! Please check your mapper, model and xml packages." if ran successfully.
	* package com.duy.mapper: contains XXXMapper.java ( Ex. UserMapper.java )
	* package com.duy.model: contains entities (ex. User.java )
	* package com.duy.xml: contains xml mapper ( ex. User.xml )
	
Enjoy it!
	