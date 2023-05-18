package cavanilles.model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


//declaramos el modelo de datos segun las BBDD
//Necesitamos constructor por defecto y constructor vacio para la clase abstracta



//ahora ponemos las anotaciones necesarias, dependencias
@Entity
@Table(name = "usuarios")
@EntityListeners(AuditingEntityListener.class)

public class alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "DNI")
	private String dni;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	@Column(name = "Apellidos")
	private String Apellidos;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "foto") 
	private String foto;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "tipo_usuario")
	private String tipoUsuario;
	
	@Column(name = "activo")
	private boolean activo;
	
	//Inicio del constructor por defecto
	//Ponemos todos los parámetros y los asignamos
	
	public alumno(Long id, String dni, String Nombre, String Apellidos, String usuario, String password, String foto, String direccion, String telefono, String tipoUsuario, Boolean activo) {
		this.id=id;
		this.dni=dni;
		this.Nombre=Nombre;
		this.Apellidos=Apellidos;
		this.usuario=usuario;
		this.password=password;
		this.foto=foto;
		this.direccion=direccion;
		this.telefono=telefono;
		this.tipoUsuario=tipoUsuario;
		this.activo=activo;
			
	}
	//fin del constructor por defecto
	
	
	
	
	
	public alumno() {
		
	}
	
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

	public String getNombre() {
		return Nombre;
	}





	public void setNombre(String nombre) {
		Nombre = nombre;
	}





	public String getApellidos() {
		return Apellidos;
	}





	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}





	public String getUsuario() {
		return usuario;
	}





	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getFoto() {
		return foto;
	}





	public void setFoto(String foto) {
		this.foto = foto;
	}





	public String getDireccion() {
		return direccion;
	}





	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}





	public String getTelefono() {
		return telefono;
	}





	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}





	public String getTipoUsuario() {
		return tipoUsuario;
	}





	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}





	public boolean isActivo() {
		return activo;
	}





	public void setActivo(boolean activo) {
		this.activo = activo;
	}



	@Override
	public String toString() {
		return "alumno [id=" + id + ", DNI=" + dni + ", nombre=" + Nombre + ", apellidos=" + Apellidos + ", usuario="
				+ usuario + ", password=" + password + ", foto=" + foto + ", direccion=" + direccion + ", telefono="
				+ telefono + ", tipoUsuario=" + tipoUsuario + ", activo=" + activo + "]";
	}	
}
