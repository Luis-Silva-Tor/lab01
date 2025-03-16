import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Objeto Scanner para leer la entrada del usuario
        ContainerRect container = new ContainerRect(10); // Almacena hasta 10 rectángulos

        for (int i = 0; i < 2; i++) { // Permitir al usuario ingresar dos rectángulos
            System.out.println("Ingrese una esquina del rectángulo " + (i + 1) + ":");
            double x1 = scanner.nextDouble(); // Lectura de la coordenada X de la primera esquina
            double y1 = scanner.nextDouble(); // Lectura de la coordenada y de la primera esquina
            System.out.println("Ingrese la esquina opuesta del rectángulo " + (i + 1) + ":");
            double x2 = scanner.nextDouble(); // Lectura de la coordenada X de la segunda esquina
            double y2 = scanner.nextDouble(); // Lectura de la coordenada y de la segunda esquina
            
            Rectangulo rect = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
            container.addRectangulo(rect);  // Se agrega el rectángulo al contenedor
        }
        
        System.out.println(container);
        scanner.close();
    }
}