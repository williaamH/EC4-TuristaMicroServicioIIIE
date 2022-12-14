package idatcom.TuristaMIcroServicioIIIE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TuristaMIcroServicioIiieApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuristaMIcroServicioIiieApplication.class, args);
	}

}
