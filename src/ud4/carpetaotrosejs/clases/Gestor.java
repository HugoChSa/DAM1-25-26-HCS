package ud4.carpetaotrosejs.clases;



public class Gestor {
    public String nombre;
    public final String telefono;
    double importeMaximo;

    public Gestor(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 100000;
    }

    public void mostrar(){
        System.out.println("GESTOR/A: " + nombre + " (" + telefono +") ");
    }


    /*    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        Gestor.telefono = telefono;
    }

    public double getImporteMaximo() {
        return importeMaximo;
    }

    public void setImporteMaximo(double importeMaximo) {
        this.importeMaximo = importeMaximo;
    }

    public void mostrarGestor(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Importe máximo: " + importeMaximo);
    }


        public static Gestor leerDatosGestor(){
        Gestor gestor = new Gestor();   
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        gestor.nombre = sc.nextLine();
        System.out.println("Teléfono: ");
        gestor.telefono = sc.nextLine();
        System.out.println("Importe máximo: ");
        gestor.importeMaximo = sc.nextDouble();

       
        return gestor; */

}


