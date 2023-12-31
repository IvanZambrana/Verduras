public class Main {
    /*Que tenga los siguientes atributos: id, nombre, color, calorías, debeCocinarse

    a) Crear un vector (array) de tipo Verdura que pueda almacenar 5 verduras. Crear 5 verduras y guardarlas en el vector.

    b) Recorrer el vector creado y mostrar por pantalla el nombre y las calorías de las verduras almacenadas.

    c) Cambiar todos los datos de dos verduras. Mostrar por pantalla los datos de todas las verduras luego del cambio.

    d) Recorrer el vector y mostrar por pantalla únicamente a las verduras que sean de color verde.*/
    public static void main(String[] args) {

        // Definición e inicialización del vector que almacenará las verduras
        Verdura [] verduras =new Verdura[5];
        // Se añaden los objetos Verdura al vector en su posición correspondiente
        verduras[0] = new Verdura(1, "lechuga", "verde", 15, false );
        verduras[1] = new Verdura(2, "acelga", "verde", 19, true);
        verduras[2] = new Verdura(3, "coliflor", "blanco", 25, true);
        verduras[3] = new Verdura(4, "berenjena", "berenjena", 25, true);
        verduras[4] = new Verdura(5, "calabaza", "naranja", 45, true);

        // b) Se Recorre el vector creado y se muestra por pantalla el nombre y las calorías de las verduras almacenadas.
        for (Verdura verdura: verduras) {
            System.out.println("La verdura "+verdura.getNombre()+" tiene "+verdura.getCalorias()+" calorias");
        }

       // c) Se cambian todos los datos de dos verduras.
        verduras[0].setId(6);
        verduras[0].setNombre("zanahoria");
        verduras[0].setColor("naranja");
        verduras[0].setCalorias(18);
        verduras[0].setDebeCocinarse(true);

        verduras[1].setId(7);
        verduras[1].setNombre("espinaca");
        verduras[1].setColor("verde");
        verduras[1].setCalorias(23);
        verduras[1].setDebeCocinarse(true);

        // c) Se Recorre el vector y se muestra por pantalla los datos de todas las verduras luego del cambio.
        for (Verdura verdura: verduras) {
            System.out.println("ID: " + verdura.getId() + ", Nombre: " + verdura.getNombre() +
                    ", Color: " + verdura.getColor() + ", Calorías: " + verdura.getCalorias() + " calorías, Cocinar: " +
                    verdura.isDebeCocinarse());
        }

        //d) Se recorre el vector y se muestra por pantalla únicamente a las verduras que sean de color verde.
        boolean esVerde=false;
        for (Verdura verdura: verduras) {

            if(verdura.getColor().equals("verde")){
                System.out.println("ID: " + verdura.getId() + ", Nombre: " + verdura.getNombre() +
                        ", Color: " + verdura.getColor() + ", Calorías: " + verdura.getCalorias() + " calorías, Cocinar: " +
                        verdura.isDebeCocinarse());
                esVerde=true;
            }
        }
        // Si no hay verduras verdes se imprimirá un mensaje por pantalla indicándolo.
        if(!esVerde){
            System.out.println("No hay verduras verdes");
        }


    }
}