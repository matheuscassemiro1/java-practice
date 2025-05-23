package javacore.nelio.exercicios.poo.processarPedidos.entities;

import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthdate() {
        return birthDate;
    }

    public Client(String name, String email, Date birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
}
