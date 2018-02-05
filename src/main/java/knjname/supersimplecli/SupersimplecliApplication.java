package knjname.supersimplecli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SupersimplecliApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SupersimplecliApplication.class, args);
	}

    @Override
    public void run(String[] args) throws Exception {
		System.out.println("Batch run!!!");
		System.out.println("  args: " + String.join(", ", args));
		System.out.println("  env: " + System.getenv("MY_ENV_VALUE"));
    }
}
