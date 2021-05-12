package semana2.actividad1;

public class EmpJornalero extends Empleado {
	public double valorHora;
	public double horasEnElMes;
	

	
	
	public EmpJornalero() {
		super();
	}

	public EmpJornalero(String nombre, String apellido, int numeBps, int numeFuncionario, String direccion,
			String telefono, Sucursal sucursal, double valorHora, double horasEnElMes) {
		super(nombre, apellido, numeBps, numeFuncionario, direccion, telefono, sucursal);
		this.valorHora = valorHora;
		this.horasEnElMes = horasEnElMes;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHorasEnElMes() {
		return horasEnElMes;
	}

	public void setHorasEnElMes(double horasEnElMes) {
		this.horasEnElMes = horasEnElMes;
	}
	
	public double getSueldo() {
		double sueldo;
		sueldo = valorHora*horasEnElMes;
		return sueldo;
	}
	
	
}
