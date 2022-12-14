
package pruebapractica.pkg2_rodrigovasquez;

public class Figura {
    public double largo;
    public double alto;
    public double ancho;
    public String figura;

    public Figura(double largo, double alto, double ancho, String figura) {
        this.largo = largo;
        this.alto = alto;
        this.ancho = ancho;
        this.figura = figura;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public double area() {
        switch(figura) {
            //Quise validar para las diferentes maneras de escribir la figura en mayusculas/minusculas, pero ya validé eso en el main
            case "triangulo":
                double areaTriangulo = (alto * largo) / 2;
                return areaTriangulo;
            case "cuadrado":
                double areaCuadrado = largo * largo;
                return areaCuadrado;
            case "rectangulo":
                double areaRectangulo = alto * largo;
                return areaRectangulo;
        }
        return 0;
    }
    public double volumen() {
        switch(figura) {
            case "triangulo":
                //No supe muy bien como utilizar la formula de volumen en este caso, así me quede en eso 
                double volumenTriangulo = ((alto * largo) / 2) * alto;
                return volumenTriangulo;
            case "cuadrado":
                double volumenCuadrado = largo * largo * largo;
                return volumenCuadrado;
            case "rectangulo":
                double volumenRectangulo = alto * largo * ancho;
                return volumenRectangulo;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        //Re-arregle el toString para que se mire más ordenado
        return "Figura: " + figura + "    Largo: " + largo + "    Alto: " + alto + "    Ancho: " + ancho;
    }
    
    
}
