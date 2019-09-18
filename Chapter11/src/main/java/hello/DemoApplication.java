package hello;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
public class DemoApplication {
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "HelloWorld";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}