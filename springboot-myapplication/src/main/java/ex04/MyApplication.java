package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @SpringBootApplication 메타 어노테이션
 * 
 * 
 * + @SpringBootConfiguration : cf @Configuration -> ex01, ex02
 
 * + @ComponentScan			  : ex04 하위 패키지 스캐닝을 한다.
 * 
 * + @EnableAutoConfiguration : 
 * 		1. MVC, AOP, Security, JPA 등을 자동 "디폴트"(미세 설정 필수) 설정
 * 		2. 발견된 Dependency(Library) 기반으로 설정한다.
 *
 */

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {}

	}
}
