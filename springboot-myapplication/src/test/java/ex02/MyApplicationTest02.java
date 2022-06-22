package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * Spring Boot Test Integration 기반
 * 
 * 	Boot Test Integration(@SpringBootTest)에서는
 * 	자동(스캔)을 위해서 설정 클래스에 @SpringBootConfiguration을 달아야 한다.
 */

//@SpringBootTest(classes= {MyApplication.class})
@SpringBootTest
public class MyApplicationTest02 {
	@Autowired
	private MyComponent myComponent;

	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
