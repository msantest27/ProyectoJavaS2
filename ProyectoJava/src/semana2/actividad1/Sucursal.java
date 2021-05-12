package semana2.actividad1;
import java.util.LinkedList;
public class Sucursal {
	public String nombre;
	public int idSucursal;
	public String direccion;
	public String telefono;
	public String rut;
	LinkedList<Empleado> empleados = new LinkedList<Empleado>();
	
	public Sucursal(String nombre, int idSucursal, String direccion, String telefono, String rut,
			LinkedList<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.idSucursal = idSucursal;
		this.direccion = direccion;
		this.telefono = telefono;
		this.rut = rut;
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
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

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public LinkedList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(LinkedList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
