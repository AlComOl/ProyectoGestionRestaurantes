package ProgramaConArrayList;
import java.util.*;

/**************************************
*@author acome

En esta segunda entrega el programa principal o alguna clase tendrá que tener:

    un array o un arrayList de objetos.
    herencia
    tratamiento de cadenas
    si es posible vectores o matrices
***************************************/

public class RegistrodeLocales {
 
	public static ArrayList<Local>Locales=new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte key=0;
	do {
		
		getmenu();
		key = sc.nextByte();
		
		
		switch (key) {
		case 1:
			anadirLocal();
			break;
		case 2:
			System.out.println("Introduce el ID del Local");
			int idLocal = sc.nextInt();
			sc.nextLine();
			
			int encontrado=	buscarLocal(idLocal);
			if(encontrado!=-1) {
				System.out.println("El local ha sido encontrado sus datos son:");
//obtiene el elemento que se encuentra en la posicion selecionada del indice y se muestra con el toString
				
				System.out.println(Locales.get(encontrado).toString());
			
			}else {
				System.out.println("El Local no ha sido encontrado");
			}

			break;
		case 3:
				System.out.println("Introduce busqueda (subcadena a buscar en el nombre)");
				sc.nextLine();
				String subCadena=sc.nextLine();
				
				
				busquedaDireccion(subCadena);
				
			break;
		case 4:

			break;
		case 5:

			break;

		default:
			break;
		}
	}while(key!=0);
	System.out.println("Has salido de la aplicacion");
	
	}
	
	/*******************************
	 * @author acome
	 * @descripcion es el menu del main
	 * 
	 * ****************************/
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
	
	/*********************************************
	 * @descripcion la funcion instancia e introduce los 
	 * valores de los atributos con el constructor y después 
	 * añade al arrayList el obgeto instanciado y lleno atributos
	 **********************************************/
	public static void anadirLocal() {
		Scanner sc=new Scanner(System.in);
		
		
		
			String estadoLocal,ubicacionLocal,gerenteLocal, tipoLocal,direccionLocal,horariosLocal,nombrePropiedad,fechaCompra;
			int idLocal,metrosLocal,precioIBI;
			String fechaPagoIBI;
			String fechaAlquiler;
			System.out.println("Introduce valores comunes");
			
//			System.out.println("Introduce  IdLocal (INT)");
//				idLocal=sc.nextInt();
//				sc.nextLine();
			System.out.println("Introduce el estado del Local (Buen Estado, Mal Estado)");
				estadoLocal=sc.nextLine();
			System.out.println("Introduce horarios apetura y cierre del local (Ejemplo 9:00am 5:00pm)");
				horariosLocal=sc.nextLine();
			System.out.println("Introduce la direccion del Local(Calle y numero String)");
				direccionLocal=sc.nextLine();
			System.out.println("Introduce ubicacionLocal (cordenas en google maps)");
				ubicacionLocal=sc.nextLine();
			System.out.println("Introduce Nombre y Apellodos del Gerente del Local (String)");
				gerenteLocal=sc.nextLine();
			byte key=0;
		System.out.println("\n 1.-Local Alquilado  \n 2.-Local en Propiedad");	
			 key=sc.nextByte();
			 sc.nextLine();
			//poner los valores de local al principio
			switch (key) {
			//VALORES DE LOCAL
			
		case 1://LOQUILADO
				System.out.println("Introduce Fecha en la que se Alquilo el Local (String 12-02-24)");
				fechaAlquiler=sc.nextLine();
				
				System.out.println("Introduce Si esta Alquilado el local o es en propiedad (Alquilado propiedad) String");
				tipoLocal=sc.nextLine();//preguntar a gema 
				
//				instanciamos nuevo local alquilado
				LocalAlquilado l1=new LocalAlquilado(estadoLocal, horariosLocal, direccionLocal, ubicacionLocal, gerenteLocal, fechaAlquiler, tipoLocal);
				
//				introducimos el local en el arraylist
				Locales.add(l1);
				
				System.out.println("El Local ha sido añadido");
				getmenu();
				key=sc.nextByte();
				break;
			case 2://LOCALPROPIO
				System.out.println("Introduce nombre del Local  (String)");
				nombrePropiedad=sc.nextLine();
				
				System.out.println("Introduce fecha e  la que se Compro el Local (String)");
				fechaCompra=sc.nextLine();
				
				System.out.println("Introduce metros del Local");
				metrosLocal=sc.nextInt();
				sc.nextLine(); // Consumir el salto de línea
				
				System.out.println("Introduce fecha e la que se hace el Pago del IBI (String)");
				fechaPagoIBI=sc.nextLine();
				
				System.out.println("Introduce precio del IBI (String)");
				precioIBI=sc.nextInt();

				
				System.out.println("Introduce estado en el que esta el Local (String)");
				estadoLocal=sc.nextLine();//
				
		
//		instanciamos nuevo local alquilado
				
				LocalPropio lp1=new LocalPropio(nombrePropiedad, fechaCompra, metrosLocal,fechaPagoIBI, precioIBI, estadoLocal, horariosLocal, direccionLocal, ubicacionLocal, gerenteLocal);
//				introducimos el local en el array
				Locales.add(lp1);
				System.out.println("El Local ha sido añadido satisfactoriamente");
				getmenu();
				key=sc.nextByte();
				
			default:
				break;
			}
		}
	
		
		
	

	/**********************************************
	 * @param idLocal
	 * @descripcion la funcion busca si hay algún local 
	 * en el arrayList iterando con un foreach, si lo encuentra
	 * devuelve la posicion y si no -1
	 ***********************************************/
	public static int buscarLocal(int idLocal) {
		int i=0, rdo=-1;
	
	
		for(Local lo:Locales) {
		//contador para ver numero de local la funcion int 
			
			if(lo.getIdLocal()==idLocal) {
				rdo=i;
			}
			i++;
		}
		
	
		return rdo;
	}	
	
	/*****************************************************
		@param subCadena
		@descripcion itera por los locales y si encuentra la 
		direccion contiene la subcadena la muestra

	******************************************************/
	public static void busquedaDireccion(String subCadena) {
	    for (Local local : Locales) {
	        String direccion = local.getDireccionLocal();
	        if (direccion.contains(subCadena)) {
	            System.out.println("Se ha encontrado un local con la siguiente dirección:");
	            System.out.println(local.toString());
	        }
	    }
	}
	
	
	}
	
	
	

			
			
			
		
			
	 
