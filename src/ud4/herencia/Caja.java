package ud4.herencia;

public class Caja {
    int ancho, alto, fondo;
    Unidad unidad;
    String etiqueta;
    

    public double getVolumen() {
        if (unidad == Unidad.CM) {
            ancho = (ancho / 100);
            alto = (alto / 100);
            fondo = (fondo / 100); 
        }
        return (ancho * alto * fondo);
    }

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo; 
        this.unidad = unidad;
    }
    
    
    public void setEtiqueta(String etiqueta) {
        if(etiqueta.length() <=30) {
            this.etiqueta = etiqueta;
        }
    }

    @Override
    public String toString(){
        return "Caja [Ancho = " + ancho 
                + ", Alto = " + alto 
                + ", Fondo = " + fondo 
                + ", Unidad = " + unidad 
                + ", Etiqueta = " + etiqueta + "]";
    }

}