package ProgramaArrayList_version1_2;
import java.util.*;

public class TestMainLocal {

	public static void main(String[] args) {
		ArrayList <Local>locales=new ArrayList<>(); 
		Scanner sc=new Scanner(System.in);
		int opcion;
		
		do {
			getmenu();
			opcion=sc.nextInt();
				 
			switch (opcion) {
			case 1:
				anyadirLocal(locales);
				System.out.println("El local ha sido agregado");
				
				break;
			case 2:
				System.out.println("Introduce IdLocal a buscar");
				int idBuscar=sc.nextInt();
				int encontrado=buscaPorId(locales,idBuscar);
				
					if(encontrado!=-1) {
					System.out.println(locales.get(encontrado).toString());
					}else {
						System.out.println("El IdLocal no está en el abase de datos");
					}
				break;
			case 3:
				System.out.println("Busqueda de la subcadena en la direccion (Introduce subcadena");
				String busqueda=sc.next();
				busquedaDireccion(locales,busqueda);
				
				break;
			case 4:
				MostrarLocales(locales);
				break;
			case 5:
				
				break;

			default:
				break;
			}
			
		}while(opcion!=0);
		System.out.println("Has salido de la aplicacion");
		sc.close();
	}
	
	
	/***********************************
	 * @author acome
	 * @descripcion Menu
	 * ********************************/
	public static void getmenu() {
		System.out.println("Menu:");
        System.out.println("1. Anadir Local");
        System.out.println("2. Busqueda de Locales por IDLOCAL int ");
        System.out.println("3. Busqueda de Locales por direccion (calle del local) ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("0. Salir");
        System.out.print("Ingrese su opcion: ");
      
	}
	
	/***************************************
	 * @descripcion añade local al arraylist
	 *
	 **************************************/
	public static void anyadirLocal(ArrayList <Local>locales) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Introduce Estado de Local (Pulsa 1-Abierto, 2-Cerrado, 3-Reforma)");
		int estadoOperacion=sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce horarios del Local");
		String horarioApertura=sc.next();
		System.out.println("Introduce direccion del Local ");
		String direccionLocal=sc.nextLine();
		sc.nextLine();
		System.out.println("Introduce  Localidad Local ");
		String localidad=sc.next();
		sc.nextLine();
		System.out.println("Introduce Nombre y Apellido Gerente Local Local ");
		String gerenteLocal=sc.nextLine();
		System.out.println("Introduce fecha del Inicio del Contrato Local ");
		String fechaInicioContrato=sc.nextLine();
		System.out.println("Introduce fecha de Fin del Contrato Local ");
		String fechaFinContrato=sc.nextLine();
		System.out.println("Introduce metros cuadrados del  Local ");
		double metros=sc.nextDouble();
		
		System.out.println("Introduce codigo Postal Local ");
		int codigoPostal=sc.nextInt();
		sc.nextLine();//necesitas consumir la nueva línea que queda en el búfer del teclado antes de leer una cadena con  sc.nextLine()
		System.out.println("Pulsa 1.-Local Alquilado 2.-Local en Propiedad");
		String key=sc.next();
		sc.nextLine();
				switch (key) {
				case "1":
					System.out.println("Introduce nombre Propietario del Local");
					String propietarioLocal=sc.next();
					System.out.println("Introduce telefono del Propietario del Local");
					String telefonoPropietario=sc.next();
					System.out.println("Introduce correo @electronico Propietario del Local ");
					String correoPropietario=sc.next();
					System.out.println("Introduce  direccion Propietario del  Local ");
					String direccionProp=sc.next();
					
					
					
					LocalAlquilado la=new LocalAlquilado( propietarioLocal, telefonoPropietario,
							correoPropietario, direccionProp,  fechaInicioContrato,
							fechaFinContrato,estadoOperacion,  horarioApertura,
							direccionLocal,localidad,gerenteLocal,
							 codigoPostal,metros);
					
						locales.add(la);
					break;
				case "2":
				
					System.out.println("Introduce nombre Local");
					String nombre=sc.nextLine();
					
					System.out.println("Introduce fecha de compra del  Local");
					String fechaCompra=sc.nextLine();
					
					LocalPropio lp =new LocalPropio(estadoOperacion, horarioApertura, direccionLocal,
							localidad, gerenteLocal,  codigoPostal,metros,nombre,fechaCompra);
						locales.add(lp);
					break;
		
				default:
					break;
				}
				
			}
	/********************************************************************
	 * @param locales arraylist de locales
	 * @param idLocal a buscar
	 * @return devuelve la posicion del local buscado o -1 
	 ******************************************************************/
	public static int buscaPorId(ArrayList <Local>locales,int idLocal) {
		int rdo=-1, i=0;
		
		for(Local x :locales) {
			
			if(x.getIdLocal()== idLocal) {
				rdo=i;
			}
			i++;
		}
		
		return rdo;
	}
	
	public static void busquedaDireccion(ArrayList <Local>locales,String busqueda) {
		
		System.out.println("Los locales con estas palabras en la direccion son :");
		
			for(Local x :locales) {
				
				String direccion=x.getDireccionLocal();
				
				if(direccion.contains(busqueda)) {
					
				System.out.println(x.toString());
				}
			}
		
	}
	
	public static void MostrarLocales(ArrayList <Local>locales) {
		
		for(Local x :locales) {
			
			System.out.println(x.toString());
		}
	}
	

}
