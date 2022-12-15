public class Funciones {
    public static void main(String[] args) {
        int result = sum( 1, 2, 3);
        System.out.println("La suma de los params es: " + result);

        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.println("El coche tiene " + miCoche.puertas + " puertas");
    }

    public static int sum(int a, int b, int c) {
        //int result = a + b + c;
        //System.out.println(result);
        return (a + b + c);
    }
}

class Coche {
    public int puertas = 2;

    public void addPuerta() {
        puertas++;
    }
}