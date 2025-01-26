package com.github.ucio1.jrtb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
		"package com.github.ucio1.jrtb",
		"org.telegram.telegrambots"
})

@SpringBootApplication
public class JavarushTelegramBotApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavarushTelegramBotApplication.class, args);
	}

}
