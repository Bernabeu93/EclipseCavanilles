package cavanilles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cavanilles.model.alumno;
import cavanilles.repository.RepositorioAlumno;

@RestController
@RequestMapping("/api")
public class ControladorAlumno {
	
	@Autowired
	private RepositorioAlumno repository;
	
	@GetMapping("/alumno")
	public List<alumno> allAlumno() {
		return repository.findAll();
	}
	
	@GetMapping("/alumno/{name}")
	public List<alumno> findByNombre(@PathVariable("name") String name) {
		return repository.findByNombre(name);
	}
	
	@PostMapping("/alumno")
	public alumno createAlumno(@RequestBody alumno alumno) {
		return repository.save(alumno);
	}
	
	@PutMapping("/alumno/{id}")
	public alumno updateAlumno(@PathVariable("id") Long id, @RequestBody alumno alumno) {
	    return repository.save(alumno);
	}
	
	@DeleteMapping("/alumno/{id}")
	public void deleteAlumno(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
}
