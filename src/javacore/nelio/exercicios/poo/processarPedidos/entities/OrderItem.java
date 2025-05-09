package javacore.nelio.exercicios.poo.processarPedidos.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public Double subtotal(){
        return price * quantity;
    }

    public void setProduct(Product product, Integer quantity){
        this.product = product;
        this.price = product.getPrice();
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(product.getName())
                .append(", ")
                .append("$")
                .append(String.format("%.2f", price))
                .append(" Quantity: ")
                .append(quantity)
                .append(" ");
        return builder.toString();
    }
}
