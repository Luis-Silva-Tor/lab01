public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    // Constructor
    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = new Coordenada(Math.min(c1.getX(), c2.getX()), Math.min(c1.getY(), c2.getY()));
        this.esquina2 = new Coordenada(Math.max(c1.getX(), c2.getX()), Math.max(c1.getY(), c2.getY()));
    }

    // Métodos setter
    public void setEsquina1(Coordenada c) { this.esquina1 = c; }
    public void setEsquina2(Coordenada c) { this.esquina2 = c; }

    // Métodos getter
    public Coordenada getEsquina1() { return esquina1; }
    public Coordenada getEsquina2() { return esquina2; }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        double base = Math.abs(esquina2.getX() - esquina1.getX());
        double altura = Math.abs(esquina2.getY() - esquina1.getY());
        return base * altura;
    }

    // Método toString
    @Override
    public String toString() {
        return String.format("Rectangulo = (%s, %s)", esquina1, esquina2);
    }
}
