/**
 * Class Pelicula
 */
package uni1a;

// Subclase Pelicula que extiende de ContenidoAudiovisual

import java.util.ArrayList;
import java.util.List;
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    
    private List<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>(); }

    public void agregarActor(Actor actor) {
        this.actores.add(actor);}
    public String getEstudio() {
        return estudio;
    }
    
    public List<Actor> getActores() { return actores;}
    public void setActores(List<Actor> actores) { this.actores = actores;}

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println();
    }
}