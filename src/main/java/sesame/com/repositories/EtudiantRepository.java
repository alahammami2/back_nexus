package sesame.com.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import sesame.com.entities.Etudiant;
@Service
public interface EtudiantRepository extends  JpaRepository<Etudiant, Long>{

}
