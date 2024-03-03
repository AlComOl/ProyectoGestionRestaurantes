package ProgramaConArrayList;
import java.util.*;

public class RegistrodeLocales {
 
	public static ArrayList<Local>Locales=new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte key=0;
			getmenu();
				key=sc.nextByte();
				sc.nextLine();
			
			switch (key) {
			case 1:
				anadirLocal();
			break;
			case 2:
				System.out.println("Introduce el ID del Local");
				int idLocal=sc.nextInt();
				if(
						buscarLocal(idLocal)==true) {
				System.out.println(Locales.toString());
				}else {
					System.out.println("el local no esta en la coleccion");
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
	

}
	
	
	public static void getmenu() {
		System.out.println("Menú:");
        System.out.println("1. Añadir Local");
        System.out.println("2. Busqueda de Locales por IDLOCAL int ");
        System.out.println("3.");
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
			
			switch (key) {
			case 1:
				System.out.println("Introduce tipoLocal String");
				tipoLocal=sc.nextLine();
				
				System.out.println("Introduce estadoLoca Stringl");
				estadoLocal=sc.nextLine();
				System.out.println("Introduce ubicacionLocal String");
				ubicacionLocal=sc.nextLine();//
				System.out.println("Introduce gerenteLocal String");
				gerenteLocal=sc.nextLine();//
				System.out.println("Introduce direccionLocal String");
				direccionLocal=sc.nextLine();//
				System.out.println("Introduce idLocal int");
				idLocal=sc.nextInt();//
				 sc.nextLine(); // Consumir el salto de línea
				System.out.println("Introduce horariosLocal String");
				horariosLocal=sc.nextLine();//
				System.out.println("Introduce horariosLocal String");
				fechaAlquiler=sc.nextLine();//
//		instanciamos nuevo local alquilado
				
				LocalAlquilado l1=new LocalAlquilado(idLocal, estadoLocal, horariosLocal, direccionLocal, ubicacionLocal, gerenteLocal, fechaAlquiler, tipoLocal);
//				introducimos el local en el array
				Locales.add(l1);
				System.out.println("El Local ha sido añadido satisfactorioamente");
				getmenu();
				key=sc.nextByte();
				break;
			case 2:
				System.out.println("Introduce tipoLocal String");
				tipoLocal=sc.nextLine();//
				System.out.println("Introduce estadoLoca Stringl");
				estadoLocal=sc.nextLine();//
				System.out.println("Introduce ubicacionLocal String");
				ubicacionLocal=sc.nextLine();//
				System.out.println("Introduce gerenteLocal String");
				gerenteLocal=sc.nextLine();//
				System.out.println("Introduce direccionLocal String");
				direccionLocal=sc.nextLine();//
				System.out.println("Introduce idLocal int");
				idLocal=sc.nextInt();//
				 sc.nextLine(); // Consumir el salto de línea
				System.out.println("Introduce horariosLocal String");
				horariosLocal=sc.nextLine();//
				System.out.println("Introduce horariosLocal String");
				fechaAlquiler=sc.nextLine();//
				System.out.println("Introduce nombrePropiedad String");
				nombrePropiedad=sc.nextLine();//
				System.out.println("Introduce nombrePropiedad String");
				fechaCompra=sc.nextLine();//
				System.out.println("Introduce nombrePropiedad String");
				metrosLocal=sc.nextInt();//
				System.out.println("Introduce nombrePropiedad String");
				fechaPagoIBI=sc.nextLine();//
				System.out.println("Introduce nombrePropiedad String");
				precioIBI=sc.nextInt();//
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
		Scanner sc=new Scanner(System.in);
		boolean encontrado=false;
	;
	
	for(Local lo:Locales) {
		
		
		if(lo.getIdLocal()==idLocal) {
			encontrado=true;
			String localEncontrado1[]=new String[10];
			
			
		}
	
	}
	return encontrado;
	}
	

	
			
			
		}
			
			
			
		
			
	 
