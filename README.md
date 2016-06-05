#MyBatis generator project
### This is used to generate xml, mapper and java entities based on configuration in config.xml. This used library from http://www.mybatis.org/generator/

Usage:
- Download and import project into eclipse. Using import gradle instead of import java project.
- Open and configure in config.xml
	* Include your jdbc driver library in build.gradle
	* Change attributes in <jdbcConnection> tag to connect to your database. My exmaple using mySQL
- Add your tables in your schema to generate code by adding block code below in config.xml. In this example, I just only have one table called 'user', there is one or more tables in schema, how many tables you want to generate code (xml, entities, mapper ) , how many <table> tags that you will add.
```
<table schema="your-schema" tableName="user" domainObjectName="User">
    	<property name="useActualColumnNames" value="false"/>
    	<property name="runtimeSchema" value="${@DEFAULT_SCHEMA}"/>
    </table>
``` 
	