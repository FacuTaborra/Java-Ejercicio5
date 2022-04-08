package UI;

import entidades.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		int numero;
		Scanner lector = new Scanner(System.in);
		ArrayList<entidades.Empleado> empleados = new ArrayList<>();
		
		System.out.println("Carga empleados");
		for(int i = 0; i< 1; i++) {
			System.out.println("Carga empleado numero " + (i+1));
			System.out.print("Ingrese dni: ");
			int dni = Integer.parseInt(lector.nextLine());
			System.out.print("Ingrese nombre: ");
			String nombre = lector.nextLine();
			System.out.print("Ingrese apellido: ");
			String apellido = lector.nextLine();
			System.out.print("Ingrese email: ");
			String email = lector.nextLine();
			System.out.print("Ingrese sueldo base: ");
			float sueldoBase = Float.parseFloat(lector.nextLine());
			System.out.print("1-Para Aministrativo, 2-Vendedor: ");
			numero = Integer.parseInt(lector.nextLine());
			if(numero == 1){
				System.out.print("Ingrese sueldo por hora extra: ");
				float hsExtra = Float.parseFloat(lector.nextLine());
				System.out.print("Ingrese total de horas extra al mes: ");
				int hsMes = Integer.parseInt(lector.nextLine()); 
				entidades.Administrativo unAdministrativo = new entidades.Administrativo(dni, nombre, apellido, email, sueldoBase, hsExtra , hsMes);
				empleados.add(unAdministrativo);
				unAdministrativo = null;
			}else if(numero == 2) {
				System.out.print("Ingrese porcentaje de comision: ");
				float porcenComision = Float.parseFloat(lector.nextLine());
				System.out.print("Ingrese total de ventas: ");
				int totalVentas = Integer.parseInt(lector.nextLine()); 
				entidades.Vendedor unVendedor = new entidades.Vendedor(dni, nombre, apellido, email, sueldoBase,porcenComision, totalVentas);
				empleados.add(unVendedor);
				unVendedor = null;
			}else {
				System.out.print("Numero incorrecto");
			}
		}
		
		for(int i = 0; i< empleados.size(); i++) {
			System.out.println("\n-------------------------------\n" + empleados.get(i).getDetalle());
		}
		
		
		
		lector.close();
	}

}
