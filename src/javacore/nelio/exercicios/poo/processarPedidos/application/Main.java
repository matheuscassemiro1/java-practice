package javacore.nelio.exercicios.poo.processarPedidos.application;

/* PROPOSTA DO EXERCÍCIO
Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
o instante do sistema: new Date()

INPUT
Enter cliente data:
Name: Alex Green
Email: alex@gmail.com
Birth date (DD/MM/YYYY): 15/03/1985
Enter order data:
Status: PROCESSING
How many items to this order? 2
Enter #1 item data:
Product name: TV
Product price: 1000.00
Quantity: 1
Enter #2 item data:
Product name: Mouse
Product price: 40.00
Quantity: 2

OUTPUT
ORDER SUMMARY:
Order moment: 20/04/2018 11:25:09
Order status: PROCESSING
Client: Alex Green (15/03/1985) - alex@gmail.com
Order items:
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity
 */

import javacore.nelio.exercicios.poo.processarPedidos.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = scan.next();
        Client client = new Client(name, email, format.parse(birthDate));
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = scan.next();
        System.out.print("How many items to this order? ");
        int howMany = scan.nextInt();
        Order order = new Order(new Date());
        order.setClient(client);
        order.setStatus(OrderStatus.valueOf(status));
        for (int i = 0; i < howMany; i++){
            System.out.printf("Enter #%s data:\n", i+1);
            System.out.print("Product name: ");
            String productName = scan.next();
            System.out.print("Product price: ");
            Double productPrice = scan.nextDouble();
            System.out.print("Quantity: ");
            Integer productQuantity = scan.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem();
            orderItem.setProduct(product, productQuantity);
            order.addItem(orderItem);
        }
        System.out.println(order);
    }
}
