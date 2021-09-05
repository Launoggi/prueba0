//MODIFICACION DE PRUEBA
package reto3;

public class Producto 
{
    private String nombre;
    private Fecha fechaCaducidad;
    private Fecha fechaEnvasado;
    private int nLote;
    private String paisOrigen;
    
    public Producto(){
        this.nombre="";
        this.fechaCaducidad=new Fecha();
        this.fechaEnvasado=new Fecha();
        this.nLote=0;
        this.paisOrigen="";
    }
    
    public Producto(String nombre, Fecha fechaCaducidad, Fecha fechaEnvasado, int nLote, String paisOrigen){
        this.nombre=nombre;
        this.fechaCaducidad=fechaCaducidad;
        this.fechaEnvasado=fechaEnvasado;
        this.nLote=nLote;
        this.paisOrigen=paisOrigen;
    }

    /**
     * @return the nombre
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * @return the fechaCaducidad
     */
    public Fecha getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * @return the fechaEnvasado
     */
    public Fecha getFechaEnvasado() {
        return fechaEnvasado;
    }

    /**
     * @return the nLote
     */
    public int getnLote() {
        return nLote;
    }

    /**
     * @return the paisOrigen
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(Fecha fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @param fechaEnvasado the fechaEnvasado to set
     */
    public void setFechaEnvasado(Fecha fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    /**
     * @param nLote the nLote to set
     */
    public void setnLote(int nLote) {
        this.nLote = nLote;
    }

    /**
     * @param paisOrigen the paisOrigen to set
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    @Override
    public String toString(){
        return ("Nombre: "+this.nombre+"\n"+
                "Fecha Caducidad: "+this.fechaCaducidad.toString()+"\n"+
                "Fecha Envasado: "+this.fechaEnvasado.toString()+"\n"+
                "Número de Lote: "+this.nLote+"\n"+
                "Pais de Origen: "+this.paisOrigen);
    }
}
