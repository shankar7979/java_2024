package com.coforge;

import com.coforge.exception.ProductException;
import com.coforge.model.Product;
import com.coforge.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("product shopping kart");

        String ch = "y";
        Product product;
        Scanner scanner = new Scanner(System.in);

        ApplicationContext context = new AnnotationConfigApplicationContext
                (ProductService.class);

        ProductService service = context.getBean(ProductService.class);

        while (ch.equals("y")) {
            System.out.println("1.Add Product");
            System.out.println("2.Show All Product");

            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    product = new Product();
                    System.out.println("Enter id name and cost of product");
                    product.setId(scanner.nextInt());
                    product.setName(scanner.next());
                    product.setCost(scanner.nextFloat());
                    try {
                        service.addProduct(product);
                    } catch (ProductException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        service.showAllProduct().forEach(System.out::println);
                    } catch (ProductException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
            }
            System.out.println("continue y\\n");
            ch= scanner.next();
        }
    }
}
