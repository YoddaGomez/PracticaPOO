package GestionProductos;

public class Principal {
	String fechaCaducidad;
	String NumeroLote;
	   
    public Principal(String fechaCaducidad, String numeroLote){
        this.fechaCaducidad = fechaCaducidad;
        this.NumeroLote = numeroLote;
    }
   
    public void setFechaCaducidad(String fecha){
        fechaCaducidad = fecha;
    }
   
    public void setNumeroLote(String num){
        NumeroLote = num;
    }
   
    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
   
    public String getNumeroLote(){
        return NumeroLote;
    }
    public void imprimirInfo(){
        System.out.println("Fecha Caducidad: " + getFechaCaducidad() + "\nNumero de Lote: " + getNumeroLote());
    }
}