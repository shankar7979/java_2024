package com.coforge.main;

import com.coforge.model.Rectangle;
import com.coforge.model.Shape;
import com.coforge.model.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Rectangle rectangle;

        Shape rectangle = context.getBean("rect1", Rectangle.class);

        System.out.println(rectangle);
        //Square square
        Shape square = context.getBean("square1", Square.class);

        System.out.println("Rectangle area" + rectangle.area());
        System.out.println(square);
        System.out.println("Square area" + square.area());


    }
}
