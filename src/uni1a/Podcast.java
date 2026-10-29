package uni1a;

public class Podcast extends ContenidoAudiovisual {
		
		    // ATRIBUTOS
		    private String plataforma;
		    private int numeroEpisodio;

		    // CONSTRUCTOR
		    public Podcast(String titulo, int duracionEnMinutos, String genero, String plataforma, int numeroEpisodio) {
		        super(titulo, duracionEnMinutos, genero);
		        this.plataforma = plataforma;
		        this.numeroEpisodio = numeroEpisodio;
		    }

		    // MÉTODO
		    @Override
		    public void mostrarDetalles() {
		        System.out.println("--- Detalles del Podcast ---");
		        System.out.println("ID: " + getId());
		        System.out.println("Título: " + getTitulo());
		        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
		        System.out.println("Género: " + getGenero());
		        System.out.println("Plataforma: " + plataforma);
		        System.out.println("Número de Episodio: " + numeroEpisodio);
		    }
		

	}


