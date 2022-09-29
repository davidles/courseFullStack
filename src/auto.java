public class auto {

    int cant_puertas = 2;


    public auto(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    public int add_quatity(){
        return this.cant_puertas++;
    }
}
