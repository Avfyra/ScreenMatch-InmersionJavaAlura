import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido a ScreenMatch");
        //System.out.println("Película: Matrix");


        //Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasicio = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula de finales del milenio.
                """;
        double mediaEvaluacionesUsuario = 0;


        System.out.println("Película: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasicio);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("La media de la evaluación de la película Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >+ 2023){
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        /*
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la calificaición que le darias a la película Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionesUsuario = mediaEvaluacionesUsuario + notaMatrix / 3;
            System.out.println("La evaluación promedio de la película Matrix asignada por el usuario es: " + mediaEvaluacionesUsuario);
        }
        */

    }
}