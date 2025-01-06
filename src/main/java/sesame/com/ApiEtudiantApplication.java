package sesame.com;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import sesame.com.entities.Etudiant;
import sesame.com.repositories.EtudiantRepository;
@SpringBootApplication
public class ApiEtudiantApplication {

EtudiantRepository etdRepository;
	public ApiEtudiantApplication(EtudiantRepository etdRepository) {
	super();
	this.etdRepository = etdRepository;
}
	public static void main(String[] args) {
		SpringApplication.run(ApiEtudiantApplication.class, args);
	}
	@Bean
	CommandLineRunner start() {
		return args -> {
			
			etdRepository.save(new Etudiant(1L,"Ali","Ali", new Date()));
			etdRepository.save(new Etudiant(2L,"Asma","Asma", new Date()));
			etdRepository.save(new Etudiant(3L,"Ahmed","Ahmed", new Date()));

			//customerRepository.findAll().forEach(System.out::println);
		};
	}
}