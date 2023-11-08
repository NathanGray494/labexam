package ie.atu.labexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LabexamApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabexamApplication.class, args);
    }

}
