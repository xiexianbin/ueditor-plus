package cn.xiexianbin.ueditor.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * uecitor web application.
 *
 * @author Xie Xianbin
 * @since 1.4.3
 */
@ImportResource(locations = { "classpath:/deployerConfigContext.xml" })
@SpringBootApplication
public class UeditorWebApplication {

	/**
	 * main function.
	 *
	 * @param args
	 *            list args
	 */
	public static void main(final String[] args) {
		SpringApplication.run(UeditorWebApplication.class, args);
	}
}
