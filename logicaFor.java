public class logicaFor {
    double edad  = 0, estadoCivil = 0, estatura = 0, sexo = 0, acumuladorEdad = 0, acumuladorEstatura = 0;
    int contadorPersonas = 0, cantidadPersonas;
    
    public logicaFor(double edad, double estadoCivil, double estatura, double sexo, double acumuladorEdad, double acumuladorEstatura,
            int contadorPersonas, int cantidadPersonas) {
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.estatura = estatura;
        this.sexo = sexo;
        this.acumuladorEdad = acumuladorEdad;
        this.acumuladorEstatura = acumuladorEstatura;
        this.contadorPersonas = contadorPersonas;
        this.cantidadPersonas = cantidadPersonas;
    }

    public void CalcularPromedio(){
        double promedioEdad = acumuladorEdad / contadorPersonas;
        double promedioEstatura = acumuladorEstatura / contadorPersonas;
        double porcentajePersonas = (contadorPersonas / cantidadPersonas) * 100;

        System.out.println("El promedio de edad de las personas que cumplen es: " + promedioEdad + " años");
        System.out.println("El promedio de estatura de las personas que cumplen es: " + promedioEstatura + " cms");
        System.out.println("El porcentaje de personas que cumplen con la condición es del " + porcentajePersonas + " %");

        
    }

}
