// Contiene métodos estáticos para verificar la relación espacial entre dos rectángulos, 

public class Verificador {
    // Método para verificar si dos rectángulos se sobreponen
	
	 // Verifica si dos rectángulos se sobreponen.
	 // 
	 // a Primer rectángulo.
	 // b Segundo rectángulo.
	 // si los rectángulos se sobreponen, false en caso contrario.
	
    public static boolean seSobreponen(Rectangulo a, Rectangulo b) {
        return !(a.getEsquina2().getX() <= b.getEsquina1().getX() ||  // A la izquierda
                 a.getEsquina1().getX() >= b.getEsquina2().getX() ||  // A la derecha
                 a.getEsquina2().getY() <= b.getEsquina1().getY() ||  // Debajo
                 a.getEsquina1().getY() >= b.getEsquina2().getY());   // Encima
    }

    // Método para verificar si los rectángulos se tocan pero no se sobreponen
    
    // @param a Primer rectángulo.
    // b Segundo rectángulo.
    //si los rectángulos se tocan en los bordes pero no se sobreponen, false en caso contrario.
    
    
    public static boolean seJuntan(Rectangulo a, Rectangulo b) {
        return !seSobreponen(a, b) && (
               a.getEsquina2().getX() == b.getEsquina1().getX() || 
               a.getEsquina1().getX() == b.getEsquina2().getX() ||
               a.getEsquina2().getY() == b.getEsquina1().getY() || 
               a.getEsquina1().getY() == b.getEsquina2().getY());
    }

    // Método para verificar si los rectángulos son disjuntos (no se tocan ni se sobreponen)
    
    // Verifica si dos rectángulos son disjuntos (no se tocan ni se sobreponen).
    //
    //@param a Primer rectángulo.
    // @param b Segundo rectángulo.
    //  los rectángulos no se tocan ni se sobreponen, false en caso contrario.
    public static boolean sonDisjuntos(Rectangulo a, Rectangulo b) {
        return !seSobreponen(a, b) && !seJuntan(a, b);
    }
}
