public class Loops {
    public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("numeroIf es positivo");
        } else if (numeroIf < 0) {
            System.out.println("numeroIf es negativo");
        }
        else {
            System.out.println("numeroIf es igual a: " + 0);
        }

        int numeroWhile = 0;

        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile: " + numeroWhile);
        }

        int numeroDoWhile = 3;

        do {
            numeroWhile++;
            System.out.println("Autoincrementar el valor de numeroDoWhile, siendo que sea menor a 3: " + numeroDoWhile);
        } while (numeroWhile < 3);


        for (int numeroFor = 0; numeroFor <= 5; numeroFor += 1) {
            System.out.println(numeroFor);
        }

        String estacion = "Invierno";

        switch (estacion) {
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es una estación valida!");
        }
    }

}
