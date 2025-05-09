package javacore.nelio.exercicios.poo.processarPedidos.entities;

public class Product {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
