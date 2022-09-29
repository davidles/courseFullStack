/**En este ejercicio practicarás las estructuras de control, para ello deberás crear:

 Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
 Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

 Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que
 tendrá el bucle deberá:

 Incrementar el valor de la variable en uno cada vez que se ejecute.

 Mostrarlo por pantalla cada vez que se ejecute.

 Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

 Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual
 o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

 Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo
 del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que
 poner un default para cuando el valor de la variable no sea una estación.
 */

public class Main {
    public static void main(String[] args) {

        int numero = -2;
      //  evaluacion(numero);

      //  control_while(numero);

      //  control_dowhile(numero);

       // control_for();

        control_switch();

    }



    public static void evaluacion(int numero){
        if(numero > 0){
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        }else {
            System.out.println("Numero es cero");
        }
    }

    /**
     *  Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que
     *  tendrá el bucle deberá:
     *
     *  Incrementar el valor de la variable en uno cada vez que se ejecute.
     *
     *  Mostrarlo por pantalla cada vez que se ejecute.
     *
     */

    public static void control_while(int nro){
       while (nro < 3){
           nro++;
           System.out.println(nro);
       }
    }


    public static void control_dowhile(int nro){
        do{
            System.out.println(nro);
            nro = 3;
        }while(nro < 3);
    }

    /**
     *  Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual
     *  o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
     */

    public static void control_for(){
        for(int numero = 0; numero <= 3; numero++){
            System.out.println(numero);
        }
    }

    /**
     *  Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo
     *  del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que
     *  poner un default para cuando el valor de la variable no sea una estación.
     */

    public static void control_switch(){
        var estacion = "verano";
        switch (estacion){
            case("verano"):
                System.out.println("Estás en verano");
                break;
            case("invierno"):
                System.out.println("Estás en invierno");
                break;
            case("primavera"):
                System.out.println("Estás en primavera");
                break;
            case("otoño"):
                System.out.println("Estás en otoño");
                break;
            default:
                System.out.println("No es una estacion");

        }
    }
}




