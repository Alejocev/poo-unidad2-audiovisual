package uni1a;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		        // 1. Probamos creando un Documental y un Investigador
		        Documental miDocumental = new Documental("Los Misterios del Océano", 90, "Ciencia", "Biología Marina");
		        Investigador investigador1 = new Investigador("Dra. Elena Ríos","Perez", "Ecuatoriana", "Biología", "ocenanos", "Documental 1", 5, 90.0);
		        
		        // Asociamos el investigador al documental usando el método que creamos
		        miDocumental.agregarInvestigador(investigador1);
		        
		        // 2. Mostramos los detalles para verificar
		        miDocumental.mostrarDetalles();
		        System.out.println("Investigador asignado: " + miDocumental.getInvestigadores().get(0).getNombre());
		        
		        System.out.println("-----------------------------------");
		        
		        // 3. Probamos creando una Película y un Actor
		        Pelicula miPelicula = new Pelicula("Interstellar", 169, "Ciencia Ficción", "Warner bros");
		        Actor actor1 = new Actor("Matthew", "McConaughey", "Americano", "Ciencia ficcion", 54);
		        
		        miPelicula.agregarActor(actor1);
		        miPelicula.mostrarDetalles();
		        System.out.println("Actor asignado: " + miPelicula.getActores().get(0).getNombre()+ " " + miPelicula.getActores().get(0).getApellido());
		        System.out.println("-----------------------------------");
		      
	
		                // 1. Crear un objeto de tipo Anime
		                Anime miAnime = new Anime("Shingeki no Kyojin", 24, "Acción", "MAPPA", true);
		                
		             
		                // 3. Probar el método mostrarDetalles sobrescrito (Polimorfismo)
		                miAnime.mostrarDetalles();
		                System.out.println();
		                
		             // 4. Crear y mostrar el Podcast
		                Podcast miPodcast = new Podcast("Entiende tu Mente", 30, "Psicología", "Spotify", 150);
		                miPodcast.mostrarDetalles();
		            }
		            }
		        
		        
		   
		

	


