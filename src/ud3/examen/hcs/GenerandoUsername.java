package ud3.examen.hcs;

/**
 * @Author Hugo Chan Saball
*/

public class GenerandoUsername {
    public static void main(String[] args) {
        String nombre = "Óscar";
        String ap1 = "Graña";
        String ap2 = "Müller";

        String nombreCompleto = nombre +" "+ ap1 +" "+ ap2;
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Username: " + getUsername(nombre, ap1, ap2));
    }


    static String getUsername(String nombre, String ap1, String ap2) {
        


        
        String nombreDeUsuario = nombre.charAt(0) + ap1.substring(0, 4) + ap2.substring(0, 4);
        
        
        String username = nombreDeUsuario.toLowerCase();


        String vocalesConTilde = "áéíóúÁÉÍÓÚ";

        if (username.contains(vocalesConTilde)) {
            username.replace(vocalesConTilde, "aeiou");
            return username;
        }
        
        
        

        return nombreDeUsuario;
        

    }

}
