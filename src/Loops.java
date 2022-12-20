public class Loops {
    public static void main(String[] args) {
        int numeroIf = -2;
        int numeroWhile = 0;
        int numeroFor = 0;
        String estacion = "Invierno";

        if (numeroIf == 0) {
            System.out.println("numeroIf es igual a " + 0);
        } else if (numeroIf < 0) {
            System.out.println("numeroIf es negativo");
        }
        else {
            System.out.println("numeroIf es positivo");
        }

        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile: " + numeroWhile);
        }

        do {
            System.out.println("Autoincrementar el valor de numeroWhile, siendo que sea menor a 3: " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        for (int var = 0; var <= numeroFor; var += 1) {
            System.out.println(var);
        }

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
