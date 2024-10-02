import java.util.Scanner;
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double edad  = 0, estadoCivil = 0, estatura = 0, sexo = 0, promedioEdad = 0, promedioEstatura = 0, porcentajePersonas = 0, acumuladorEdad = 0, acumuladorEstatura = 0;
    int contadorPersonas = 0, cantidadPersonas = 3;

    for (int numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {

    System.out.println("Ingrese la edad de la persona " + numeroPersona + ": ");
    edad = sc.nextDouble();

    System.out.print("Ingrese el estado civil de la persona " + numeroPersona + " (1.Soltero  2.Casado): ");
    estadoCivil = sc.nextDouble();

    System.out.print("Ingrese la estatura de la persona " + numeroPersona + " en cms: ");
    estatura = sc.nextDouble();

    System.out.print("Ingrese el sexo de la persona " + numeroPersona + " (1.Hombre  2.Mujer): ");
    sexo = sc.nextDouble();

    if ((edad >= 18) && (estadoCivil == 1) && (estatura > 170) && (sexo == 1)) {
        contadorPersonas = contadorPersonas + 1;
        acumuladorEdad = acumuladorEdad + edad;
        acumuladorEstatura = acumuladorEstatura + estatura;
    }
}


    promedioEdad = acumuladorEdad / contadorPersonas;
    promedioEstatura = acumuladorEstatura / contadorPersonas;
    porcentajePersonas = (double) contadorPersonas / cantidadPersonas * 100;

    System.out.println("El promedio de edad de las personas que cumplen es: " + promedioEdad + " años");
    System.out.println("El promedio de estatura de las personas que cumplen es: " + promedioEstatura + " cms");
    System.out.println("El porcentaje de personas que cumplen con la condición es del " + porcentajePersonas + " %");


}
    
