/** Clase Geometria
  la vamos a usar para realizar
  diversos cálculos de geometría
  @author Manuel
  @author Manolo
  @version 1.0
*/


public class Geometria {

    public static final double PI = 3.1416;
    
    /** Método calcularAreaCuadrado
      que nos calcula el ára de un cuadrado
      dado el lado
      @param lado de tipo double, lado que define al cuadrado
      @return área del cuadrado, de tipo double
    */
    public static double calcularAreaCuadrado (double lado) {
        return lado * lado;
    }

    /** Método calcularAreaRectangulo
      que nos calcula el ára de un rectángulo
      dada la altura y la base
      @param base de tipo double, base del rectángulo
      @param altura de tipo double, altura del rectángulo
      @return área del rectángulo, de tipo double
      */
    public static double calcularAreaRectangulo (double base, double altura){
        return base * altura;
    }

    /** Método calcularAreaTriangulo
      que nos calcula el ára de un triángulo
      dada la altura y la base
      @param base de tipo double, base del triángulo
      @param altura de tipo double, altura del triángulo
      @return área del triángulo, de tipo double
      */
    public static double calcularAreaTriangulo (double base, double altura){
        return base * altura / 2.0 ;
    }

    /** Método calcularAreaCirculo
      que nos calcula el ára de un círculo
      dado el radio
      @param radio de tipo double, raidio que define al círculo
      @return área del círculo, de tipo double
    */
    public static double calcularAreaCirculo (double radio){
        return radio * radio * PI;
    }

}
