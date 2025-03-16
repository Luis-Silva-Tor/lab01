public class Coordenada {
    private double x; // Coordenada en el eje X
    private double y; // Coordenada en el eje y

    // Inicializa la coordenada en el origen (0,0)
    
    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con parámetros del eje x,y
    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Constructor 
    public Coordenada(Coordenada c) {
        this.x = c.x;
        this.y = c.y;
    }

    // Métodos setter
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    // Métodos getter
    public double getX() { return x; }
    public double getY() { return y; }

    // Distancia entre dos coordenadas Otra coordenada con la que se calculará la distancia.
    
    public double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2));
    }

    // Método toString cadena de la coordenada con un decimal de precisión.
    @Override
    public String toString() {
        return String.format("[%.1f, %.1f]", x, y);
    }
}
