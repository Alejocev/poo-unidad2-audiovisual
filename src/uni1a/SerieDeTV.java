/**
 * Class SerieDeTV
 */
package uni1a;


//Importaciones

import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
   

    private List<Temporada> temporadas;
     
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
    this.temporadas= new ArrayList<>(); }
    
    
    public void agregarTemporada(Temporada temporada) { this.temporadas.add(temporada);}
    
    
   // GETTERS AND SETTERS   
    public List<Temporada> getTemporadas(){return temporadas;}
    public void setTemporadas(List<Temporada>temporadas) {this.temporadas=temporadas;}
   
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println();
    }
}