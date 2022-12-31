import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojos.Employee;

public class Main {
    public static void main(String[] args) {
        /*
                                 Spring core container
            - provides interfaces that are used to manage the bean's lifecycle.
                1. BeanFactory
                2. ApplicationContext - An implementation of the BeanFactory interface.

         */

        //initializing a Spring core Container
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //creating an object from a bean using the container
        Employee one = (Employee) context.getBean("emp1");
        System.out.println(one.getSalary());
    }
}