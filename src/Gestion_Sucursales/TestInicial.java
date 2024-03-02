package Gestion_Sucursales;
import java.util.*;
public class TestInicial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int menu,IDlocal,metrosLocal,CodigoPostaLoc,fechaInicioContra,fechaFinContra,mensualidad;
		String direccionProp,propietarioLocal,correoProp,UbicaLoc,DireccionLoc;
		Encargado e1=new Encargado();
		Empleado empleado1=new Empleado();
		do {
			System.out.println("MENU \n 1-Introducir datos \n 2-Todos los datos local(vista Empleado) \n 3-Todos los datos local(vista Encargado)\n 4-SALIR");
			menu=sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Introduce ID Local");
				IDlocal=sc.nextInt();
//				habia utilizado los setters para pasar el valor a empleado pero me hha parecido mejor la otra solucion.
//				empleado1.setIDlocal(IDlocal);
				 sc.nextLine();
				System.out.println("Introduce direccion del Local(Calle)");
				DireccionLoc=sc.nextLine();
//				empleado1.setDireccionLoc(DireccionLoc);
				System.out.println("Introduce metros cuatrados del Local");
				metrosLocal=sc.nextInt();
//				empleado1.setMetrosLocal(metrosLocal);
				System.out.println("Introduce Codigo Postal del Local");
				CodigoPostaLoc=sc.nextInt();
//				empleado1.setCodigoPostaLoc(CodigoPostaLoc);
				 sc.nextLine();
				System.out.println("Introduce Nombre y Apellidos del propietario");
				propietarioLocal=sc.next();
//				empleado1.setPropietarioLocal(propietarioLocal);;
				sc.nextLine();
				
				
				System.out.println("Introduce Correo electronico del Local");
				correoProp=sc.next();
//				empleado1.setCorreoProp(correoProp);
				sc.nextLine();
				
				
				System.out.println("Introduce Ubicacion segun googlemaps del (enlace web) Local");
				UbicaLoc=sc.next();
//				empleado1.setUbicaLoc(UbicaLoc);
				
				System.out.println("Introduce Localidad del Local");
				DireccionLoc=sc.next();
//				empleado1.setDireccionLoc(DireccionLoc);
				
				System.out.println("Introduce que se paga de mensualidad en el local del Local");
				mensualidad=sc.nextInt();
				
				System.out.println("Introduce la fecha que se ha contratado del Local");
				fechaInicioContra=sc.nextInt();
				
				System.out.println("Introduce la fecha que se finaliza el contratado del Local");
				fechaFinContra=sc.nextInt();
				
				System.out.println("Introduce la direccion del propietario");
				direccionProp=sc.next();
//				introduzco valores en el constructor
			 
				e1=new Encargado(IDlocal,metrosLocal,CodigoPostaLoc,propietarioLocal,correoProp,UbicaLoc,DireccionLoc,direccionProp,fechaInicioContra,fechaFinContra,mensualidad);
//				Aqui lo que esta haciendo es copiar los valores del objetos que hemos sobrecargado en la clase encargado.
				empleado1=e1.devolverDatos();
				 
				break;
			case 2:
				System.out.println("Datos a los que puede acceder el empleado");
				System.out.println(empleado1.toString());
				break;
			case 3:
				System.out.println("Datos a los que puede acceder el Encargado");
				System.out.println(e1.toString());
			default:
				break;
			}
			
		
		}while(menu!=0);

	}

}
