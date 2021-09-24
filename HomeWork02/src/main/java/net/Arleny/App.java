package net.Arleny;

import net.Arleny.bean.Person;
import net.Arleny.bean.Student;
import net.Arleny.bean.pet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    ApplicationContext ioc = new ClassPathXmlApplicationContext("application.xml");
    @Test
    public void test01(){
        Person person01 = ioc.getBean("person", Person.class);
        Person person02 = ioc.getBean("person", Person.class);

        System.out.println(ioc.getBean(pet.class));


        System.out.println(person01 == person02);
    }
}
