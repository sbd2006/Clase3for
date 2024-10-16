import java.util.Scanner;

public class MainFo {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double edad  = 0, estadoCivil = 0, estatura = 0, sexo = 0, acumuladorEdad = 0, acumuladorEstatura = 0;
        int contadorPersonas = 0, cantidadPersonas = 0;

        System.out.println("Ingrese el numero de personas que quieres registrar: ");
        cantidadPersonas = sc.nextInt();

        


        for (int numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {

        System.out.println("Ingrese la edad de la persona " + numeroPersona + " : ");
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


       logicaFor answer = new logicaFor(edad, estadoCivil, estatura, sexo, acumuladorEdad, acumuladorEstatura, contadorPersonas, cantidadPersonas);
       answer.CalcularPromedio();
       sc.close();

    }
}
    
