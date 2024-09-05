ERD

![erd](img/erd.jpg)

The Website 
![login](img/1.jpg)
![register](img/2.jpg)


To start by build your own applciation properties for postgress
spring.application.name=WaiyatCaloriesCounter
#url ,username , password
spring.datasource.url=jdbc:postgresql://localhost:####/your_db_name
spring.datasource.username=pyour_username
spring.datasource.password=your_password

# Spring database stuff
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.datasource.driverClassName=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
# other modes for ddl: create, validate, update, create-drop


Then you can start java server by running WaiyatCaloriesCounterApplication.java


for the Client : start your react application in visual studio code using bash terminal
1) first npm install after pulling
2) npm install react-router-dom
3) npm install axios
4) 
