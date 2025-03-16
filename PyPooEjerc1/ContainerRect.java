public class ContainerRect {
    private Rectangulo[] rectangulos; // para almacenar los rectangulos 
    private double[] distancias; // para almacenar las distancias de cada rectángulo
    private double[] areas;  //  almacenar las áreas de cada rectángulo 
    private int numRec; // Contador del número de rectángulos almacenados
    
    public ContainerRect(int capacidad) {
        rectangulos = new Rectangulo[capacidad]; // p 
        distancias = new double[capacidad];  // par
        areas = new double[capacidad]; //  
        numRec = 0; // se inicia el contador en cero 
    }
     // Método para agregar un rectángulo al contenedor
    
    public void addRectangulo(Rectangulo r) {  // Verifica si hay espacio disponible
        if (numRec < rectangulos.length) {
            rectangulos[numRec] = r;
            distancias[numRec] = r.calcularDistancia();  // Calcula y almacena la distancia
            areas[numRec] = r.calcularArea();  // calcula el area 
            numRec++;
        } else {
            System.out.println(" ");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo Coordenadas Distancia Area\n");
        for (int i = 0; i < numRec; i++) {
            sb.append((i + 1) + " ")
              .append(rectangulos[i]).append(" ")  // Llama al toString de Rectangulo
              .append(String.format("%.3f", distancias[i])).append(" ") // Formatea la distancia con 3 decimales
              .append(String.format("%.2f", areas[i])).append("\n");  // Formatea el área con 2 decimales
        }
        return sb.toString();
    }
}
