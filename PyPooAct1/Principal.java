import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primera parte para leer desde el comienzo del codigo
        System.out.print("Ingrese una esquina del 1er rectángulo: ");
        Coordenada c1 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Ingrese la esquina opuesta del 1er rectángulo: ");
        Coordenada c2 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());

        // En esta parte se crea el primer rectangulo
        Rectangulo rectA = new Rectangulo(c1, c2);

        // Leer coordenadas del segundo rectángulo
        System.out.print("Ingrese una esquina del 2do rectángulo: ");
        Coordenada c3 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Ingrese la esquina opuesta del 2do rectángulo: ");
        Coordenada c4 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());

        // Se crea el segundo rectangulo 
        Rectangulo rectB = new Rectangulo(c3, c4);

        // Imprimir los rectángulos de las esquinas 
        System.out.println(rectA);
        System.out.println(rectB);

        // Verificar relación entre los rectángulos
        if (Verificador.seSobreponen(rectA, rectB)) {
            System.out.println("Rectángulos A y B se sobreponen.");
            System.out.println("Área de sobreposición = " + calcularAreaSobreposicion(rectA, rectB));
        } else if (Verificador.seJuntan(rectA, rectB)) {
            System.out.println("Rectángulos A y B se juntan.");
        } else {
            System.out.println("Rectángulos A y B son disjuntos.");
        }

        scanner.close();
    }

    // Método para calcular el área de sobreposición
    public static double calcularAreaSobreposicion(Rectangulo a, Rectangulo b) {
        double xIzq = Math.max(a.getEsquina1().getX(), b.getEsquina1().getX());
        double xDer = Math.min(a.getEsquina2().getX(), b.getEsquina2().getX());
        double yInf = Math.max(a.getEsquina1().getY(), b.getEsquina1().getY());
        double ySup = Math.min(a.getEsquina2().getY(), b.getEsquina2().getY());

        if (xDer > xIzq && ySup > yInf) {
            return (xDer - xIzq) * (ySup - yInf);
        }
        return 0; // en esta parte retornara cuando no haya sobreposicion 
    }
}
