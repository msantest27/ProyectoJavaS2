package semana2.actividad1;

public class EmpMensual extends Empleado {
	public double salarioMensual;
	public String tipoDeRegimen;
	
	

	public EmpMensual() {
		super();
	}

	
	
	public EmpMensual(String nombre, String apellido, int numeBps, int numeFuncionario, String direccion,
			String telefono, Sucursal sucursal, double salarioMensual, String tipoDeRegimen) {
		super(nombre, apellido, numeBps, numeFuncionario, direccion, telefono, sucursal);
		this.salarioMensual = salarioMensual;
		this.tipoDeRegimen = tipoDeRegimen;
	}



	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	public String getTipoDeRegimen() {
		return tipoDeRegimen;
	}

	public void setTipoDeRegimen(String tipoDeRegimen) {
		this.tipoDeRegimen = tipoDeRegimen;
	}

	public double getSueldo() {
		return salarioMensual;
	}
}
