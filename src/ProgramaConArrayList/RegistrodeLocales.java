package ProgramaConArrayList;
import java.util.*;

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
			
			boolean encontrado=	buscarLocal(idLocal);
			if(encontrado) {
				System.out.println("El local ha sido encontrado sus datos son:");
				System.out.println(Locales.toString());//locales.get(3).toString
				
			
			}else {
				System.out.println("El Local no ha sido encontrado");
			}

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;

		default:
			break;
		}
	}while(key!=0);
	}
	
	
	public static void getmenu() {
		System.out.println("Menú:");
        System.out.println("1. Añadir Local");
        System.out.println("2. Busqueda de Locales por IDLOCAL int ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("0. Salir");
        System.out.print("Ingrese su opción: ");
      
	}
	public static void anadirLocal() {
		Scanner sc=new Scanner(System.in);
		byte key=0;
		System.out.println("\n 1.-Local Alquilado  \n 2.-Local en Propiedad");
		
		
			String estadoLocal,ubicacionLocal,gerenteLocal, tipoLocal,direccionLocal,horariosLocal,nombrePropiedad,fechaCompra;
			int idLocal,metrosLocal,precioIBI;
			String fechaPagoIBI;
			String fechaAlquiler;
			 key=sc.nextByte();
			 sc.nextLine();
			//poner los valores de local al princip
			switch (key) {
			case 1://LOCALALQUILADO
				System.out.println("Introduce idLocal String");
				idLocal=sc.nextInt();sc.nextLine(); // Consumir el salto de línea
				
				System.out.println("Introduce estadoLoca Stringl");
				estadoLocal=sc.nextLine();
				
				System.out.println("Introduce horariosLocal String");
				horariosLocal=sc.nextLine();//
				
				System.out.println("Introduce direccionLocal String");
				direccionLocal=sc.nextLine();
				
				System.out.println("Introduce ubicacionLocal String");
				ubicacionLocal=sc.nextLine();//
				
				System.out.println("Introduce gerenteLocal int");
				gerenteLocal=sc.nextLine();//
				
				System.out.println("Introduce fechaAlquiler String");
				fechaAlquiler=sc.nextLine();//
				
				System.out.println("Introduce tipoLocal String");
				tipoLocal=sc.nextLine();//
//		instanciamos nuevo local alquilado
				
				LocalAlquilado l1=new LocalAlquilado(idLocal, estadoLocal, horariosLocal, direccionLocal, ubicacionLocal, gerenteLocal, fechaAlquiler, tipoLocal);
//				introducimos el local en el arraylist
				Locales.add(l1);;//
				System.out.println("El Local ha sido añadido satisfactorioamente");
				getmenu();
				key=sc.nextByte();
				break;
			case 2://LOCALPROPIO
				System.out.println("Introduce nombrePropiedad String");
				nombrePropiedad=sc.nextLine();//
				System.out.println("Introduce fechaCompra Stringl");
				fechaCompra=sc.nextLine();//
				System.out.println("Introduce metrosLocal String");
				metrosLocal=sc.nextInt();sc.nextLine(); // Consumir el salto de línea
				System.out.println("Introduce fechaPagoIBI String");
				fechaPagoIBI=sc.nextLine();//
				System.out.println("Introduce precioIBI String");
				precioIBI=sc.nextInt();//
				System.out.println("Introduce idLocal int");
				idLocal=sc.nextInt();sc.nextLine(); // Consumir el salto de línea
				System.out.println("Introduce estadoLocal String");
				estadoLocal=sc.nextLine();//
				System.out.println("Introduce horariosLocal String");
				horariosLocal=sc.nextLine();//
				System.out.println("Introduce direccionLocal String");
				direccionLocal=sc.nextLine();//
				System.out.println("Introduce ubicacionLocal String");
				ubicacionLocal=sc.nextLine();//
				System.out.println("Introduce gerenteLocal INT");
				gerenteLocal=sc.nextLine();//
//		instanciamos nuevo local alquilado
				
				LocalPropio lp1=new LocalPropio(nombrePropiedad, fechaCompra, metrosLocal,fechaPagoIBI, precioIBI, idLocal, estadoLocal, horariosLocal, direccionLocal, ubicacionLocal, gerenteLocal);
//				introducimos el local en el array
				Locales.add(lp1);;
				System.out.println("El Local ha sido añadido satisfactorioamente");
				getmenu();
				key=sc.nextByte();
				
			default:
				break;
			}
		}
	
		
		
	


	public static Boolean buscarLocal(int idLocal) {
		boolean encontrado=false;
	
		for(Local lo:Locales) {
		//contador para ver numero de local la funcion int 
		
		if(lo.getIdLocal()==idLocal) {
			encontrado=true;
			
		}
	
	}
	return encontrado;
	}
}
			
			
			
		
			
	 
