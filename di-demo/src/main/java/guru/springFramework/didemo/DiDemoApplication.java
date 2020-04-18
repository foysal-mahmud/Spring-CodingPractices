package guru.springFramework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springFramework.didemo.controllers.ConstructorInjectedController;
import guru.springFramework.didemo.controllers.MyController;
import guru.springFramework.didemo.controllers.PropertyInjectedController;
import guru.springFramework.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController controller = (MyController) context.getBean("myController");
		controller.hello();
		
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
	}

}
