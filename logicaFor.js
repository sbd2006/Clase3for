var edad = 0, estadoCivil = 0, estatura = 0, sexo = 0, promedioEdad = 0, promedioEstatura = 0, porcentajePersonas = 0, contadorPersonas = 0, acumuladorEdad = 0, acumuladorEstatura = 0, cantidadPersonas = 3;

for (let numeroPersona = 0; numeroPersona <= cantidadPersonas; numeroPersona++) {
    edad = parseFloat(prompt("Ingrese la edad de la persona: " +numeroPersona));
    estadoCivil = parseFloat(prompt("Ingrese el estado civil de la persona: " +numeroPersona+ "  1.Soltero    2.Casado"));
    estatura = parseFloat(prompt("Ingrese la estatura de la persona: " +numeroPersona + " en cms"));
    sexo = parseFloat(prompt("Ingrese el sexo de la persona: " +numeroPersona + "  1.Hombre    2.Mujer"));


    /* prompt es una ventana emergente para responder el mensaje y parsefloat es para tranformar el mensaje a tipo de mensaje a float
     PD: EL "PARSE" SIRVE PARA CUALQUIER VARIABLE
    */

    if((edad >= 18)&&(estadoCivil==1)&&(estatura>170)&&(sexo==1)){

        contadorPersonas = contadorPersonas +1;
        acumuladorEdad = acumuladorEdad + edad;
        acumuladorEstatura = acumuladorEstatura  + estatura;


    }

}

promedioEdad = acumuladorEdad / contadorPersonas;
promedioEstatura = acumuladorEstatura /contadorPersonas;
porcentajePersonas = (contadorPersonas / cantidadPersonas)*100;

alert ("El promedio de edad de las personas que cumplen es: " + promedioEdad + " años");
alert ("El promedio de estatura de las personas que cumplen es: " + promedioEstatura + " metros");
alert ("El porcentaje de personas que cumplen con la condicion es del " + porcentajePersonas + " %");