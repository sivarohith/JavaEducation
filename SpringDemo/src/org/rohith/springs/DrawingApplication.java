package org.rohith.springs;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class DrawingApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Triangle tri = new Triangle();
//		tri.draw();
		
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));		//initializing the bean factory for the project.
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//		Triangle triangle = (Triangle) context.getBean("triangle");		//casting and assigning to a local variable 
//		
//		triangle.draw();
Shape shape = (Shape) context.getBean("triangle");		//casting and assigning to a local variable 
		
shape.draw();

	}

}
