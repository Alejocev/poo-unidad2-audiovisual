# Proyecto Contenido Audiovisual - POO (Unidad 2)

## 1. Descripción del Proyecto
Este proyecto es un sistema desarrollado en Java que aplica conceptos de Programación Orientada a Objetos (POO) como
Herencia, Encapsulamiento, Polimorfismo, Asociación y Agregación.
Permite gestionar distintos tipos de contenidos audiovisuales y sus entidades asociadas en la Universidad Politécnica Salesiana.

## 2. Clases e Implementación
- **Clase Base:** `ContenidoAudiovisual`
- **Subclases Originales:** `Pelicula`, `SerieDeTV`, `Documental`
- **Nuevas Clases de Asociación y Agregación:**
  - `Actor`: Asociado a la clase `Pelicula`.
  - `Temporada`: Asociada a la clase `SerieDeTV`.
  - `Investigador`: Asociado a la clase `Documental`.
- **Nuevas Subclases Creadas:**
  - `Anime`: Hereda de `ContenidoAudiovisual`, agregando atributos específicos de animación.
  - `Podcast`: Hereda de `ContenidoAudiovisual`, integrando atributos de formato de audio.

## 3. Instrucciones de Instalación y Uso
1. Clonar el repositorio localmente:
   ```bash
   git clone https://github.com/Alejocev/poo-unidad2-audiovisual.git
