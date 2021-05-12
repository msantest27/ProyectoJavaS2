package Semana2.Actividad1;

public class Empleado {
	public String nombre;
	public String apellido;
	public int numeBps;
	public int numeFuncionario;
	public String direccion;
	public String telefono;
	public Sucursal sucursal;
	
	public Empleado(String nombre, String apellido, int numeBps, int numeFuncionario, String direccion, String telefono,
			Sucursal sucursal) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeBps = numeBps;
		this.numeFuncionario = numeFuncionario;
		this.direccion = direccion;
		this.telefono = telefono;
		//this.sucursal = sucursal;
	}

	


	public Empleado() {
		super();
		this.nombre = "";
		this.apellido = "";
		this.numeBps = 0;
		this.numeFuncionario = 0;
		this.direccion = "";
		this.telefono = "";
//		this.sucursal = null;
	}

	


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", numeBps=" + numeBps + ", numeFuncionario="
				+ numeFuncionario + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}




	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeBps() {
		return numeBps;
	}

	public void setNumeBps(int numeBps) {
		this.numeBps = numeBps;
	}

	public int getNumeFuncionario() {
		return numeFuncionario;
	}

	public void setNumeFuncionario(int numeFuncionario) {
		this.numeFuncionario = numeFuncionario;
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

//	public Sucursal getSucursal() {
//		return sucursal;
//	}
//
//	public void setSucursal(Sucursal sucursal) {
//		this.sucursal = sucursal;
//	}
	
	public double getSueldo() {
		return 0;
	}
}
