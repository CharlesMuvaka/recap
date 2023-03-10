import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojos.Employee;

public class Main {
    public static void main(String[] args) {
        /*
                                 Spring core container
            - provides interfaces that are used to manage the bean's lifecycle.
                1. BeanFactory
                Resource resource = new Resource("bean.xml");
                BeanFactory factory = new XmlResourcePath(resource);

                - Creates object when requested
                2. ApplicationContext - An implementation of the BeanFactory interface.
                - Objects created when an instance is initialised.

         */

        //initializing a Spring core Container
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //creating an object from a bean using the container
        Employee one = (Employee) context.getBean("emp1");
        System.out.println(one);
    }
}