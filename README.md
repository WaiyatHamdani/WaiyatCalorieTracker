ERD

![erd](img/erd.jpg)

The Website 
![login](img/1.jpg)
![register](img/2.jpg)


# To start by building your own application properties for PostgreSQL

### URL, Username, and Password
- `spring.application.name=WaiyatCaloriesCounter`
- `spring.datasource.url=jdbc:postgresql://localhost:####/your_db_name`
- `spring.datasource.username=your_username`
- `spring.datasource.password=your_password`

## Spring Database Configuration
- `spring.jpa.show-sql=true`
- `spring.jpa.properties.hibernate.format_sql=true`
- `spring.datasource.driverClassName=org.postgresql.Driver`
- `spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect`
- `spring.jpa.hibernate.ddl-auto=update`
> Other modes for `ddl-auto`: `create`, `validate`, `update`, `create-drop`

6. Then you can start the Java server by running `WaiyatCaloriesCounterApplication.java`.

## Client Setup
To start your React application in Visual Studio Code using the bash terminal:

1. First, run `npm install` after pulling the project.
2. Install React Router DOM: `npm install react-router-dom`
3. Install Axios: `npm install axios`
