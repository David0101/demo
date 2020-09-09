import com.exercise.eg.feign.demo.EnableJimRegistrara;
import com.exercise.eg.feign.demo.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@EnableFeignClients


@SpringBootApplication
@EnableJimRegistrara
@ComponentScan(basePackages = {"com.exercise.eg.feign.demo"})

public class FeignApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FeignApplication.class, args);
        System.out.println(context.getBean(HelloService.class));
        System.out.println(context.getBean("helloService"));
    }
}
