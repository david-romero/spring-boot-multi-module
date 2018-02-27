package io.manco.maxim.sbmm.batch;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import io.manco.maxim.sbmm.core.CoreApplication;

@SpringBootApplication
public class BatchApplication {

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder()
		.bannerMode(Banner.Mode.CONSOLE)
		.sources(CoreApplication.class, BatchApplication.class)
		.run(args);
    }
	
}
