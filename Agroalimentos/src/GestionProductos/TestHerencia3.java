
package GestionProductos;

public class TestHerencia3 {
	public static void main(String[] args) {
	
		 Congelados nuggets = new Congelados("16-10-2020","B1603004");
	        Frescos lechuga = new Frescos("20-10-2020","R1610005");
	        Frescos Tomate = new Frescos("20-10-2020","I1610005");
	        Refrigerados jugo = new Refrigerados("25-10-2020","T1609006");
	        Refrigerados leche = new Refrigerados("25-10-2020","O1609006");
	        Refrigerados Yogurt = new Refrigerados("25-10-2020","O1609006");
	        Congelados Pescado = new  Congelados("20-10-2020" , "J1610005");
	        Congelados Frutas = new Congelados("10-10-2020", "E162312456");
	        Congelados Postres = new Congelados("20-06-2020", "S13452467");
	        Congelados Jamon = new Congelados("09-06-2020", "U78900023");
	        Congelados Frapes = new Congelados("03-06-2020","S4123410");
	        
	        nuggets.setFechaCaducidad("30 - 07 - 2021 ");
	        nuggets.setTemperaturaRecomendada(-18);
	    
	       
	        lechuga.setFechaCaducidad("03- 05- 2021");
	        lechuga.setNumeroLote("R1610005");
	        lechuga.setFechaEnvasado("03-04-2021");
	        lechuga.setPaisDeOrigen("Mexico");
	        lechuga.setTemperaturaRecomendada(23);
	       
	        Tomate.setFechaCaducidad("08- 05- 2021");
	        Tomate.setNumeroLote("D1240238");
	        Tomate.setFechaEnvasado("14-04-2021");
	        Tomate.setPaisDeOrigen("Mexico");
	        Tomate.setTemperaturaRecomendada(25);
	       
	        
	        jugo.setFechaCaducidad("16 - 04 - 2021");
	        jugo.setNumeroLote("I1609006");
	        jugo.setCodigoSupervisionAlimentaria("B#6745");
	        jugo.setFechaEnvasado("13 - 04 - 2021");
	        jugo.setPaisDeOrigen("Yucatan");
	        jugo.setTemperaturaRecomendada(20);
	     
	        
	        leche.setFechaCaducidad("21-04-2015   si es que esta abierta");
	        leche.setNumeroLote("I1609006");
	        leche.setCodigoSupervisionAlimentaria("P#45293");
	        leche.setFechaEnvasado("13 - 04 - 2021");
	        leche.setPaisDeOrigen("Yucatan");
	        leche.setTemperaturaRecomendada(25);
	     
	        Yogurt.setFechaCaducidad("18-04-2015");
	        Yogurt.setNumeroLote("S1024920");
	        Yogurt.setCodigoSupervisionAlimentaria("N#130234");
	        Yogurt.setFechaEnvasado("4 - 03 - 2021");
	        Yogurt.setPaisDeOrigen("Yucatan");
	        Yogurt.setTemperaturaRecomendada(22);

	        
	        Pescado.setNumeroLote("T1610005");
	        Pescado.setFechaCaducidad("30-04-2021");
	        Pescado.setTemperaturaRecomendada(0);
	        Pescado.setProductoEnvasado("Plastico con bolsa");
	        Pescado.setSalinidadAgua(05-10);
	        
	      
	        Frapes.setNumeroLote("P7356201");
	        Frapes.setFechaCaducidad("27-05-2021");
	        Frapes.setTemperaturaRecomendada2(0);
	        Frapes.setProductoEnvasado2("Plastico");
	        Frapes.setSalinidadAgua2(8);
	       
	       Frutas.setFechaCaducidad("15-05-2021");
	       Frutas.setNumeroLote("O162312456");
	       Frutas.setTemperaturaRecomendada(12);
	       Frutas.setProductoEnvasado("plastico");
	       Frutas.setPorcentajeNitrogeno(20);
	       Frutas.setPorcentajeOxigeno(22);
	       Frutas.setPorcentajeDioxidoCarbono (8);
	       Frutas.setVaporAgua (20);
	       
	      
	       Jamon.setFechaCaducidad("18-06-2021");
	       Jamon.setNumeroLote("O3322002");
	       Jamon.setTemperaturaRecomendada2(10);
	       Jamon.setProductoEnvasado2("plastico");
	       Jamon.setPorcentajeNitrogeno2(8);
	       Jamon.setPorcentajeOxigeno2(5);
	       Jamon.setPorcentajeDioxidoCarbono2 (13);
	       Jamon.setVaporAgua2 (50);
	       
	       
	       Postres.setFechaCaducidad("29-12-2021");
	       Postres.setNumeroLote("j13452467");
	       Postres.setTemperaturaRecomendada(30);
	       Postres.setProductoEnvasado("Frasco de Cristal");
	       Postres.setMetodoCongelacionEmpleado(6);
	       Postres.setTiempoExposicionNitrogeno(5);
	      
	       
	        System.out.println("Producto Congelado: ");
	        System.out.println("NUGGETS");
	        System.out.println("Producto Fresco: ");
	        System.out.println("LECHUGA");
	        lechuga.imprimirDatos();
	        System.out.println("Producto Fresco: ");
	        System.out.println("TOMATE");
	        Tomate.imprimirDatos();
	        System.out.println("Producto Refrigerado: ");
	        System.out.println("JUGO");
	        jugo.imprimirDatos();
	        System.out.println("Producto Refrigerado: ");
	        System.out.println("LECHE");
	        leche.imprimirDatos();
	        System.out.println("Producto Refrigerado: ");
	        System.out.println("YOGURT");
	        Yogurt.imprimirDatos();
	        System.out.println("Producto CongeladoPorAgua: ");
	        System.out.println("PESCADO");
	        Pescado.imprimirDatosAgua();
	        System.out.println("Producto CongeladoPorAgua: ");
	        System.out.println("FRAPES");
	        Frapes.imprimirDatosAgua2();
	        System.out.println("Producto CongeladoPorAire: ");
	        System.out.println("FRUTAS");
	        Frutas.imprimirDatosAire();
	        System.out.println("Producto CongeladoPorAire: ");
	        System.out.println("JAMON");
	        Jamon.imprimirDatosAire2();
	        System.out.println("Producto CongeladoPorNitrogeno: ");
	        System.out.println("POSTRES");
	        Postres.imprimirDatosNitrogeno();    
	       
	}
}
