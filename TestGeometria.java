public class TestGeometria {

    public static void main(String[] args){

        double areaCuadrado = Geometria.calcularAreaCuadrado(2.123);
        System.out.println("Área del cuadrado de lado 2.123 vale " + 
                areaCuadrado);

        double areaRectangulo = Geometria.calcularAreaRectangulo(2.123, 1.233);
        System.out.println("Área del rectángulo de base 2.123 y altura 1.233 " +                                "vale " + areaRectangulo);

        double areaTriangulo = Geometria.calcularAreaTriangulo(2.123, 1.233);
        System.out.println("Área del triángulo de base 2.123 y altura 1.233 " +                                "vale " + areaTriangulo);

        double areaCirculo = Geometria.calcularAreaCirculo(1.233);
        System.out.println("Área del círuculo de radio 1.233 " +                                "vale " + areaCirculo);

    }

}
