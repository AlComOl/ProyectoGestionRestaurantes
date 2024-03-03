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
		byte key;
	do {
		key = 0;
		getmenu();
		key = sc.nextByte();
		
		
		switch (key) {
		case 1:
			anadirLocal();
			break;
		case 2:
			System.out.println("Introduce el ID del Local");
			int idLocal = sc.nextInt();
			
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
			
			System.out.println("Introduce  IdLocal (INT)");
				idLocal=sc.nextInt();
				sc.nextLine();
			System.out.println("Introduce estadoLoca Stringl");
				estadoLocal=sc.nextLine();
			System.out.println("Introduce horariosLocal String");
				horariosLocal=sc.nextLine();
			System.out.println("Introduce direccionLocal String");
				direccionLocal=sc.nextLine();
			System.out.println("Introduce ubicacionLocal String");
				ubicacionLocal=sc.nextLine();
			System.out.println("Introduce gerenteLocal int");
				gerenteLocal=sc.nextLine();
			byte key=0;
		System.out.println("\n 1.-Local Alquilado  \n 2.-Local en Propiedad");	
			 key=sc.nextByte();
			 sc.nextLine();
			//poner los valores de local al principio
			switch (key) {
			//VALORES DE LOCAL
			
		case 1://LOQUILADO
				System.out.println("Introduce fechaAlquiler String");
				fechaAlquiler=sc.nextLine();
				
				System.out.println("Introduce tipoLocal String");
				tipoLocal=sc.nextLine();
				
//				instanciamos nuevo local alquilado
				LocalAlquilado l1=new LocalAlquilado(idLocal, estadoLocal, horariosLocal, direccionLocal, ubicacionLocal, gerenteLocal, fechaAlquiler, tipoLocal);
				
//				introducimos el local en el arraylist
				Locales.add(l1);
				
				System.out.println("El Local ha sido añadido");
				getmenu();
				key=sc.nextByte();
				break;
			case 2://LOCALPROPIO
				System.out.println("Introduce nombrePropiedad String");
				nombrePropiedad=sc.nextLine();
				
				System.out.println("Introduce fechaCompra Stringl");
				fechaCompra=sc.nextLine();
				
				System.out.println("Introduce metrosLocal String");
				metrosLocal=sc.nextInt();
				sc.nextLine(); // Consumir el salto de línea
				
				System.out.println("Introduce fechaPagoIBI String");
				fechaPagoIBI=sc.nextLine();
				
				System.out.println("Introduce precioIBI String");
				precioIBI=sc.nextInt();
				
				System.out.println("Introduce idLocal int");
				idLocal=sc.nextInt();
				sc.nextLine(); // Consumir el salto de línea
				
				System.out.println("Introduce estadoLocal INT");
				estadoLocal=sc.nextLine();//
				
		
//		instanciamos nuevo local alquilado
				
				LocalPropio lp1=new LocalPropio(nombrePropiedad, fechaCompra, metrosLocal,fechaPagoIBI, precioIBI, idLocal, estadoLocal, horariosLocal, direccionLocal, ubicacionLocal, gerenteLocal);
//				introducimos el local en el array
				Locales.add(lp1);
				System.out.println("El Local ha sido añadido satisfactorioamente");
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
	
	
	

			
			
			
		
			
	 
