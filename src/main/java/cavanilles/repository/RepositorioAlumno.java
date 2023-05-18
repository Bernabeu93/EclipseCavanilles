package cavanilles.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import cavanilles.model.alumno;

@Repository
public interface RepositorioAlumno extends JpaRepository<alumno, Long>{
	
	List<alumno> findByNombre(@Param("Nombre") String name);
	
}
 