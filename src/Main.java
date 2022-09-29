/**Crear una clase coche.

 Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

 Una función que incremente el número de puertas que tiene el coche.

 Crear un objeto miCoche en el main y añadirle una puerta.

 Mostrar el número de puertas que tiene el objeto.
 */

public class Main {
    public static void main(String[] args) {

        int result = suma(10, 10);
        System.out.println(result);

        Coche miCoche = new Coche();

        System.out.println(miCoche.puertas);
    }



    public static int suma(int a, int b){
        return a + b;
    }
}



class Coche{
    int puertas = 2;

    public void aumentarPuertas(){
        this.puertas++;
    }
}


