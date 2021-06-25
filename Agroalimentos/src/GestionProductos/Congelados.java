package GestionProductos;

public class Congelados extends Principal{
	private double TemperaturaRecomendada;
	private String ProductoEnvasado;
	private double PorcentajeNitrogeno;
	private double PorcentajeOxigeno;
	private double PorcentajeDioxidoCarbono;
	private double VaporAgua;
	private double SalinidadAgua;
	private double TiempoExposicionNitrogeno;
	private double MetodoCongelacionEmpleado;
	private double TemperaturaRecomendada2;
	private String ProductoEnvasado2;
	private double PorcentajeNitrogeno2;
	private double PorcentajeOxigeno2;
	private double PorcentajeDioxidoCarbono2;
	private double VaporAgua2;
	private double SalinidadAgua2;
	private double TiempoExposicionNitrogeno2;
	private double MetodoCongelacionEmpleado2;
	public Congelados(String fechaCaducidad, String numeroLote) {
		super(fechaCaducidad, numeroLote);
		// TODO Auto-generated constructor stub
	}
		public double getTemperaturaRecomendada() {
			return TemperaturaRecomendada;
		}
	

		public void setTemperaturaRecomendada(double temperaturaRecomendada) {
			TemperaturaRecomendada = temperaturaRecomendada;
		}

		public String getProductoEnvasado() {
			return ProductoEnvasado;
		}

		public void setProductoEnvasado(String productoEnvasado) {
			ProductoEnvasado = productoEnvasado;
		}

		public double getPorcentajeNitrogeno() {
			return PorcentajeNitrogeno;
		}

		public void setPorcentajeNitrogeno(double porcentajeNitrogeno) {
			PorcentajeNitrogeno = porcentajeNitrogeno;
		}

		public double getPorcentajeOxigeno() {
			return PorcentajeOxigeno;
		}

		public void setPorcentajeOxigeno(double porcentajeOxigeno) {
			PorcentajeOxigeno = porcentajeOxigeno;
		}

		public double getPorcentajeDioxidoCarbono() {
			return PorcentajeDioxidoCarbono;
		}

		public void setPorcentajeDioxidoCarbono(double porcentajeDioxidoCarbono) {
			PorcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
		}

		public double getVaporAgua() {
			return VaporAgua;
		}

		public void setVaporAgua(double vaporAgua) {
			VaporAgua = vaporAgua;
		}

		public double getSalinidadAgua() {
			return SalinidadAgua;
		}

		public void setSalinidadAgua(double salinidadAgua) {
			SalinidadAgua = salinidadAgua;
		}

		public double getTiempoExposicionNitrogeno() {
			return TiempoExposicionNitrogeno;
		}

		public void setTiempoExposicionNitrogeno(double tiempoExposicionNitrogeno) {
			TiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
		}

		public double getMetodoCongelacionEmpleado() {
			return MetodoCongelacionEmpleado;
		}

		public void setMetodoCongelacionEmpleado(double metodoCongelacionEmpleado) {
			MetodoCongelacionEmpleado = metodoCongelacionEmpleado;
		}


		public double getTemperaturaRecomendada2() {
			return TemperaturaRecomendada2;
		}
		public void setTemperaturaRecomendada2(double temperaturaRecomendada2) {
			TemperaturaRecomendada2 = temperaturaRecomendada2;
		}
		public String getProductoEnvasado2() {
			return ProductoEnvasado2;
		}
		public void setProductoEnvasado2(String productoEnvasado2) {
			ProductoEnvasado2 = productoEnvasado2;
		}
		public double getPorcentajeNitrogeno2() {
			return PorcentajeNitrogeno2;
		}
		public void setPorcentajeNitrogeno2(double porcentajeNitrogeno2) {
			PorcentajeNitrogeno2 = porcentajeNitrogeno2;
		}
		public double getPorcentajeOxigeno2() {
			return PorcentajeOxigeno2;
		}
		public void setPorcentajeOxigeno2(double porcentajeOxigeno2) {
			PorcentajeOxigeno2 = porcentajeOxigeno2;
		}
		public double getPorcentajeDioxidoCarbono2() {
			return PorcentajeDioxidoCarbono2;
		}
		public void setPorcentajeDioxidoCarbono2(double porcentajeDioxidoCarbono2) {
			PorcentajeDioxidoCarbono2 = porcentajeDioxidoCarbono2;
		}
		public double getVaporAgua2() {
			return VaporAgua2;
		}
		public void setVaporAgua2(double vaporAgua2) {
			VaporAgua2 = vaporAgua2;
		}
		public double getSalinidadAgua2() {
			return SalinidadAgua2;
		}
		public void setSalinidadAgua2(double salinidadAgua2) {
			SalinidadAgua2 = salinidadAgua2;
		}
		public double getTiempoExposicionNitrogeno2() {
			return TiempoExposicionNitrogeno2;
		}
		public void setTiempoExposicionNitrogeno2(double tiempoExposicionNitrogeno2) {
			TiempoExposicionNitrogeno2 = tiempoExposicionNitrogeno2;
		}
		public double getMetodoCongelacionEmpleado2() {
			return MetodoCongelacionEmpleado2;
		}
		public void setMetodoCongelacionEmpleado2(double metodoCongelacionEmpleado2) {
			MetodoCongelacionEmpleado2 = metodoCongelacionEmpleado2;
		}
		public void imprimirDatosAire(){
		    imprimirInfo();
		    System.out.println("Temperatura Recomendada: " + getTemperaturaRecomendada());
		    System.out.println("Producto Envasado :" + getProductoEnvasado());
		    System.out.println("COMPOSICIÓN DEL AIRE");
		    System.out.println("-Porcentaje de Nitrogeno: " + getPorcentajeNitrogeno() + "\n");
		    System.out.println("-Porcentaje de Oxigeno: "+ getPorcentajeOxigeno() + "\n");
		    System.out.println("-Porcentaje de Dioxido de Carbono: " + getPorcentajeDioxidoCarbono() + "\n");
		    System.out.println("-Porcentaje de Vapor de Agua: " + getVaporAgua() + "\n");
		}

		public void imprimirDatosAgua(){
		    imprimirInfo();
		    System.out.println("Temperatura Recomendada: " + getTemperaturaRecomendada());
		    System.out.println("Producto Envasado :" + getProductoEnvasado() + "\n");
		    System.out.println("Informacion adicional (salinidad)");
		    System.out.println("-Salinidad del Agua: " + getSalinidadAgua() + "gr (NaCl)/1L H2O" + "\n");
		}

		public void imprimirDatosNitrogeno(){
		    imprimirInfo();
		    System.out.println("Temperatura Recomendada: " + getTemperaturaRecomendada());
		    System.out.println("Producto Envasado :" + getProductoEnvasado());
		             System.out.println("CONGELACION POR NITROGENO: ");
		    System.out.println("-Metodo de congelacion Empleado: " + getMetodoCongelacionEmpleado() + "\n");
		    System.out.println("-Tiempo de exposición al Nitrogeno: "+ getTiempoExposicionNitrogeno() + "\n");
	}
		public void imprimirDatosAire2(){
		    imprimirInfo();
		    System.out.println("Temperatura Recomendada: " + getTemperaturaRecomendada2());
		    System.out.println("Producto Envasado :" + getProductoEnvasado2());
		    System.out.println("COMPOSICIÓN DEL AIRE");
		    System.out.println("-Porcentaje de Nitrogeno: " + getPorcentajeNitrogeno2() + "\n");
		    System.out.println("-Porcentaje de Oxigeno: "+ getPorcentajeOxigeno2() + "\n");
		    System.out.println("-Porcentaje de Dioxido de Carbono: " + getPorcentajeDioxidoCarbono2() + "\n");
		    System.out.println("-Porcentaje de Vapor de Agua: " + getVaporAgua2() + "\n");
		}
		public void imprimirDatosAgua2(){
		    imprimirInfo();
		    System.out.println("Temperatura Recomendada: " + getTemperaturaRecomendada2());
		    System.out.println("Producto Envasado :" + getProductoEnvasado2() + "\n");
		    System.out.println("Informacion adicional (salinidad)");
		    System.out.println("-Salinidad del Agua: " + getSalinidadAgua2() + "gr (NaCl)/1L H2O" + "\n");
		}
		public void setFechaEnvasado(String string) {
			// TODO Auto-generated method stub
			
			
		}
		public void setPaisDeOrigen(String string) {
			// TODO Auto-generated method stub
			
		}
		public void imprimirDatos() {
			// TODO Auto-generated method stub
			
		}
}