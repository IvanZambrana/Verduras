/* La clase verdura es parte de un sistema gestión de alimentos. Está diseñada para representar objetos relacionados con los diferentes tipos de verduras, almacenando
 la información más relevante sobre las verduras, como por ejemplo su nombre, calorías o si es necesario cocinarla.
 */

public class Verdura {
    //Atributos de la clase Verdura
    private int id; // Número que sirve como identificador único para cada verdura.
    private String nombre; // Un String que almacena el nombre de la verdura.
    private String color; // Un String que registra el color de la verdura.
    private int calorias; // Número entero que representa la cantidad de calorías asociadas con la verdura
    private boolean debeCocinarse; // Valor booleano que indica si la verdura requiere cocción antes de su comida. En caso de ser true, indica que se tiene que cocinar.


    // Constructor de la clase Verdura

    /*  id (int): El identificador único de la verdura.
        nombre (String): El nombre de la verdura.
        color (String): El color predominante de la verdura.
        calorias (int): La cantidad de calorías asociadas a la verdura.
        debeCocinarse (boolean): Un valor booleano que indica si la verdura debe ser cocinada.

     */
    public Verdura(int id, String nombre, String color, int calorias, boolean debeCocinarse) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.debeCocinarse = debeCocinarse;
    }
    
    // Metodos de la clase Verdura
    /*
    La clase Verdura incluye los métodos getters y setters para acceder y modificar los valores de sus atributos:

    getId(): Retorna el identificador único de la verdura.
    setId(int id): Establece el identificador único de la verdura.
    getNombre(): Retorna el nombre de la verdura.
    setNombre(String nombre): Establece el nombre de la verdura.
    getColor(): Retorna el color predominante de la verdura.
    setColor(String color): Establece el color de la verdura.
    getCalorias(): Retorna la cantidad de calorías asociadas a la verdura.
    setCalorias(int calorias): Establece la cantidad de calorías de la verdura.
    isDebeCocinarse(): Retorna si la verdura debe ser cocinada (true) o no (false).
    setDebeCocinarse(boolean debeCocinarse): Establece si la verdura debe cocinarse o no.
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public boolean isDebeCocinarse() {
        return debeCocinarse;
    }

    public void setDebeCocinarse(boolean debeCocinarse) {
        this.debeCocinarse = debeCocinarse;
    }
}
