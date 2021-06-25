package GestionProductos;

public class Refrigerados extends Principal{
	  private String CodigoSupervisionAlimentaria;
	  private String FechaEnvasado;
	  private String PaisDeOrigen;
	  private double temperaturaCongelacionRecomendada;

	public Refrigerados(String fechaCaducidad, String numeroLote) {
		super(fechaCaducidad, numeroLote);
		// TODO Auto-generated constructor stub
		 CodigoSupervisionAlimentaria = "Desconocido";
		 FechaEnvasado = "Desconocido";
	        PaisDeOrigen = "Desconocido";
	        temperaturaCongelacionRecomendada=0;
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
	public void setCodigoSupervisionAlimentaria(String codigo){
        CodigoSupervisionAlimentaria = codigo;
    }
   
    public String getCodigoSupervisionAlimentaria(){
        return CodigoSupervisionAlimentaria;
    }
    public void setTemperaturaRecomendada(double temperatura) {
    	temperaturaCongelacionRecomendada=temperatura;
    }
    public double getTemperaturaRecomendada () {
    	return temperaturaCongelacionRecomendada;
    }
   
    public void imprimirDatos(){
        imprimirInfo();
        System.out.println("Codigo de Supervision Alimentaria: " + getCodigoSupervisionAlimentaria() + "Fecha de envasado: " + getFechaEnvasado() + "\nPais de origen: " + getPaisDeOrigen() + "\n" + "Temperatura Recomendada: " + getTemperaturaRecomendada() + "\n");
        
        
    }

}