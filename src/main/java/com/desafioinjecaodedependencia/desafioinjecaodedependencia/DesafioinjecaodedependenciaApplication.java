package com.desafioinjecaodedependencia.desafioinjecaodedependencia;

import com.desafioinjecaodedependencia.desafioinjecaodedependencia.domain.Order;
import com.desafioinjecaodedependencia.desafioinjecaodedependencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioinjecaodedependenciaApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioinjecaodedependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Order order = new Order(1034, 150.0, 0.2);
//		Order order = new Order(2282, 800.0, 0.1);
		Order order = new Order(1309, 95.90, 0.0);

		Double result = orderService.total(order);

		System.out.println("Pedido código "+order.getCode());
		System.out.println("Valor total: " + result);
	}
}
