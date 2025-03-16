//
// Clase Rectangulo
 //
// Representa un rectángulo definido por dos coordenadas opuestas.

public class Rectangulo {
    private Coordenada esquina1; // Coordenada de una esquina del rectángulo (mínima en X e Y)
    private Coordenada esquina2; // Coordenada de una esquina del rectángulo (mínima en y e x)

    // Constructor
    // Establece la primera esquina del rectángulo. 
    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = new Coordenada(Math.min(c1.getX(), c2.getX()), Math.min(c1.getY(), c2.getY()));
        this.esquina2 = new Coordenada(Math.max(c1.getX(), c2.getX()), Math.max(c1.getY(), c2.getY()));
    }

    // Métodos setter
    //Establece la segunda esquina del rectángulo.
    public void setEsquina1(Coordenada c) { this.esquina1 = c; }
    public void setEsquina2(Coordenada c) { this.esquina2 = c; }

    // Métodos getter
    // Obtiene la primera esquina del rectángulo 
    public Coordenada getEsquina1() { return esquina1; }
    public Coordenada getEsquina2() { return esquina2; }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return Math.abs((esquina2.getX() - esquina1.getX()) * (esquina2.getY() - esquina1.getY()));
    }

    
    // calcular Distancia entre esquina1 y esquina2. 
    public double calcularDistancia() {
        return esquina1.distancia(esquina2);
    }
    
    // las coordenadas de las esquinas del rectángulo. 
    
    public String toString() {
        return "[" + esquina1 + ", " + esquina2 + "]";
    }
}
