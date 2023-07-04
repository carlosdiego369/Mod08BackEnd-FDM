package com.devsuperior.desafio01;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.service.OrderService;
import com.devsuperior.desafio01.service.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class Desafio01Application implements CommandLineRunner {

    public static void main(String[] args) {

		SpringApplication.run(Desafio01Application.class, args);
    }

	@Override
	public void run (String... args) throws Exception{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println(" __________________________________________________");
		System.out.println("| Valor básico do pedido (sem desconto) | Frete    |");
		System.out.println(" _______________________________________|__________");
		System.out.println("| Abaixo de R$ 100.00                   | R$ 20.00 |");
		System.out.println(" _______________________________________|__________");
		System.out.println("| De R$ 100.00 até R$ 200.00 exclusive  | R$ 12.00 |");
		System.out.println(" _______________________________________|__________");
		System.out.println("| R$ 200.00 ou mais                     | Grátis   |");
		System.out.println(" _______________________________________|__________");


		System.out.println("\nENTRADA (dados do pedido: código, valor básico e porcentagem de desconto)");
		int code = input.nextInt();
		double basic = input.nextDouble();
		double discount = input.nextDouble();


		Order order = new Order(code,basic,discount);

		OrderService orderService = new OrderService();

		orderService.total(order);

		printOff("\nSAÍDA");
		printOff("\nPedido código " + code);
		printOff("Valor total: R$ " + new DecimalFormat("##0.00").format(orderService.total(order)));

	}

	public static void printOff(String text){
		System.out.println(text);
	}
}
