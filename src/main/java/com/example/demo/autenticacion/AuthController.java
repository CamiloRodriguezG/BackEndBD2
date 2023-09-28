package com.example.demo.autenticacion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private DataSource dataSource;

    @PostMapping("/connect")
    public void connectToDatabase(@RequestBody Usuario usuario) throws SQLException {

        /*
        DriverManagerDataSource dataS = new DriverManagerDataSource();
        dataS.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataS.setUrl("jdbc:oracle:thin:@localhost:1521/orclpdb");
        dataS.setUsername(usuario.getUsername());
        dataS.setPassword(usuario.getPassword());
        dataS.getConnection();
        */

    }

    @PostMapping("/createestudiante")
    public String crearNuevoUsuario(@RequestBody Usuario usuario) {
        try (Connection connection = dataSource.getConnection()) {
            String sqlCreacion = "CREATE USER " + usuario.getUsername() + " IDENTIFIED BY " + usuario.getPassword()+ "DEFAULT TABLESPACE ESTDFLT TEMPORARY TABLESPACE ESTTMP";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(sqlCreacion);
            }
            String sqlGrantRole = "GRANT ESTUDIANTE TO "+usuario.getUsername();
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(sqlGrantRole);
            }
            return "Estudiante agregado";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }
}
