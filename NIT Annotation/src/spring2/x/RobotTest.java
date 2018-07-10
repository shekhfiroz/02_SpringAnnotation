package spring2.x;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RobotTest {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/spring2/x/application-context.xml");
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}
}
