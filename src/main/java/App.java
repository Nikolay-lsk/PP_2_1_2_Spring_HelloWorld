import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHello1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello1.getMessage());

        HelloWorld beanHello2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello2.getMessage());

        Cat cat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getName() + " " + cat1.getAge() + " " + cat1.getBreed());

        Cat cat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getName() + " " + cat2.getAge() + " " + cat2.getBreed());

        boolean helloworld = beanHello1 == beanHello2;
        boolean cat = cat1 == cat2;

        System.out.println(helloworld);
        System.out.println(cat);
    }
}