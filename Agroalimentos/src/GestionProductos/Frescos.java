package GestionProductos;

public class Frescos extends Principal{
	private String FechaEnvasado;
	private String PaisDeOrigen;
	private double temperaturaCongelacionRecomendada;
	
	public Frescos(String fechaCaducidad, String numeroLote) {
		super(fechaCaducidad, numeroLote);
		// TODO Auto-generated constructor stub
		temperaturaCongelacionRecomendada=0;
		FechaEnvasado = "Desconocido";
        PaisDeOrigen = "Desconocido";
	}
	
	public void setFechaEnvasado(String fecha){
        FechaEnvasado = fecha;
    }
   
    public void setPaisDeOrigen(String pais){
        PaisDeOrigen = pais;
    }
   
    public String getFechaEnvasado(){
        return FechaEnvasado;
    }
   
    public String getPaisDeOrigen(){
        return PaisDeOrigen;
    }
    public void setTemperaturaRecomendada(double temperatura) {
    	temperaturaCongelacionRecomendada=temperatura;
    }
    public double getTemperaturaRecomendada () {
    	return temperaturaCongelacionRecomendada;
    }
   
    public void imprimirDatos(){
        imprimirInfo();
        System.out.println("Temperatura Recomendada: " + getTemperaturaRecomendada() + "\n" + "Fecha de envasado: " + getFechaEnvasado() + "\nPais de origen: " + getPaisDeOrigen() + "\n");
        
    }

}