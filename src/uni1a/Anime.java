package uni1a;

public class Anime extends ContenidoAudiovisual {
    // ATRIBUTOS
    private String estudioAnimacion;
    private boolean esAdaptacionManga;

    // CONSTRUCTOR
    public Anime(String titulo, int duracionEnMinutos, String genero, String estudioAnimacion, boolean esAdaptacionManga) {
        super(titulo, duracionEnMinutos, genero);
        this.estudioAnimacion = estudioAnimacion;
        this.esAdaptacionManga = esAdaptacionManga;
    }

    // 3. METODO
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Anime ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio de Animación: " + estudioAnimacion);
        System.out.println("¿Es adaptación de manga?: " + (esAdaptacionManga ? "Sí" : "No"));
    }
}		