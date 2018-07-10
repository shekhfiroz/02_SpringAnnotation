package spring2autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AutoWireTest {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/spring2autowire/application-context.xml");
		System.out.println(context);
		Car car = context.getBean("car",Car.class);
		System.out.println(car);
	}

}
