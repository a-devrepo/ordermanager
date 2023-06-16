package com.devsuperior.ordermanager;

import com.devsuperior.ordermanager.entities.Order;
import com.devsuperior.ordermanager.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdermanagerApplication implements CommandLineRunner {

    @Autowired
    OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(OrdermanagerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1309, 95.90, 0.0);
        double total = orderService.total(order);
        String out = """
                	Pedido código %d
                	Valor total: R$ %.2f
                """.formatted(order.getCode(), total);

        System.out.println(out);
    }
}
