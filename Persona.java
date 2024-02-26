//Abstraccion capacidad de crear una clase
public class Persona {
    //propiedades y encapsulamiento
    private static String nombre, id, ocupacion;
    private static short edad;
    private static boolean estado;
    private static final short DuracionCarrera = 4;

    public Persona(String nombre, String id, String ocupacion, short edad, boolean estado) {
        this.nombre = nombre;
        this.id = id;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.estado = estado;
    }

    //polimorfismo, se usa el mismo metodo para acciones diferentes
    public Persona(String id, short edad, boolean estado) {
        this.nombre = "Alexa";
        this.ocupacion = "Estudiante";
        this.id = id;
        this.edad = edad;
        this.estado = estado;
    }

    public Persona(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    //Getters and Setters
    public static String getNombre() {
        return nombre;
    }

    public static String getId() {
        return id;
    }

    public static String getOcupacion() {
        return ocupacion;
    }

    public static short getEdad() {
        return edad;
    }

    public static boolean getEstado() {
        return estado;
    }

    public static void setNombre(String nombre) {
        Persona.nombre = nombre;
    }

    public static void setId(String id) {
        Persona.id = id;
    }

    public static void setOcupacion(String ocupacion) {
        Persona.ocupacion = ocupacion;
    }

    public static void setEdad(short edad) {
        Persona.edad = edad;
    }

    public static void setEstado(boolean estado) {
        Persona.estado = estado;
    }
//Asignar un estado a la persona.
    public void Estado(boolean estado) {
        if (estado) {
            System.out.println(this.nombre +" ahora está disponible.");
        } else {
            System.out.println(this.nombre +"La persona no esta disponible");
        }

    }
    // Actualizar el estado de las personas
    public void cambiarEstado(boolean nuevoEstado) {
        this.estado = nuevoEstado;
        if (nuevoEstado) {
            System.out.println(this.nombre + " ahora está disponible.");
        } else {
            System.out.println(this.nombre + " ahora no está disponible.");
        }
    }
    //Asignar una accion a una instancia de la clase.
    public void realizarAccion(String accion) {
        System.out.println(this.nombre + " está realizando la acción: " + accion);

    }
    //Calcular cuanto le falta al estudiante para finalizar su carrera segun su edad
    public void FinCarrera() {
        short añosParaTerminar = (short) (DuracionCarrera - (this.edad - 18));
        if (añosParaTerminar > 0) {
            System.out.println(this.nombre + " terminará la carrera en " + añosParaTerminar + " años.");
        } else {
            System.out.println(this.nombre + " ya ha terminado su carrera.");
        }
    }
    //Identificar si una persona es mayor de eddad.
    public String esMayorEdad() {
        if (this.edad >= 18) {
            return "Sí";
        } else {
            return "No";
        }
    }
}
