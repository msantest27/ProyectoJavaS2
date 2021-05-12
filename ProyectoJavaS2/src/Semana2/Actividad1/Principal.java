package Semana2.Actividad1;

import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Empleado> empleadosVacio1 = new LinkedList<Empleado>();
		LinkedList<Empleado> empleadosVacio2 = new LinkedList<Empleado>();
		Sucursal instanciaSuc1 = new Sucursal("Casa Central", 1, "Montevideo", "28082888", "259142368838", empleadosVacio1);
		Sucursal instanciaSuc2 = new Sucursal("Sucursal Durazno", 3, "Durazno", "258223698", "248648282538", empleadosVacio2);
		
		EmpJornalero jornalero1 = new EmpJornalero("Juan", "Zabala", 328672, 68, "Durazno", "26223858", null, 215.5, 120 );
		EmpJornalero jornalero2 = new EmpJornalero("Pedro", "Rosen", 669825, 30, "Montevideo", "2852639", null, 280, 100.5 );
		
		EmpMensual mensual1 = new EmpMensual("Romina", "Paito", 333458, 50, "Durazno", "2887469", null, 38000, "Comercial");
		EmpMensual mensual2 = new EmpMensual("Lucas", "Manzi", 225698, 45, "Montevideo", "2887469", null, 38500, "Comercial");
		
//		jornalero2.setSucursal(instanciaSuc1);
//		mensual2.setSucursal(instanciaSuc1);
		
		instanciaSuc1.empleados.add(jornalero2);
		instanciaSuc1.empleados.add(mensual2);
		
//		jornalero1.setSucursal(instanciaSuc2);
//		mensual1.setSucursal(instanciaSuc2);
		
		instanciaSuc2.empleados.add(jornalero1);
		instanciaSuc2.empleados.add(mensual1);
		
		double sueldosSuc1 = 0;
		double sueldosSuc2 = 0;
		
//		EmpMensual mensualobject = new EmpMensual();
//		EmpJornalero jornaleroobject = new EmpJornalero();
//		
//		Empleado s = mensualobject;
		
		LinkedList<Empleado> empleadosSuc1 = instanciaSuc1.empleados;
		LinkedList<Empleado> empleadosSuc2 = instanciaSuc2.empleados;
		
		System.out.println("Empleados de la Sucursal 1");
		for (Empleado e : empleadosSuc1) {
			System.out.println(e.toString());
				}
		System.out.println("Empleados de la Sucursal 2");
		for (Empleado e : empleadosSuc2) {
			System.out.println(e.toString());
		}
		
		
		
		for (Empleado s : empleadosSuc1) {
			sueldosSuc1 = sueldosSuc1 + s.getSueldo();
			}
		for (Empleado t : empleadosSuc2)	{
			sueldosSuc2 = sueldosSuc2 + t.getSueldo();
		}
		
		System.out.println("Gastos por conceptos de sueldo Sucursal 1 - " + sueldosSuc1);
		System.out.println("Gastos por conceptos de sueldo Sucursal 2 - " + sueldosSuc2);
					
	}
	
}
