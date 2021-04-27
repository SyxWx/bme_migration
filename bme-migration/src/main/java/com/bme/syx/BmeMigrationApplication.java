package com.bme.syx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class BmeMigrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmeMigrationApplication.class, args);
    }


    @RequestMapping(value = {"","/index"})
    public String index(Model model){
        model.addAttribute("msg","谢谢阅读");
        return "index";
    }
}
