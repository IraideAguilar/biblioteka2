package Vista;

import Controlador.SociosControlador;
import modelo.Config;
import modelo.SocioModelo;
import Vista.Principal;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		//controladorak sortu
       SociosControlador socioControlador = new SociosControlador();
       
       
       //modeloak sortuk
       SocioModelo socioModelo = new SocioModelo();
		
       
       //lehioak sortu
	   Principal principal = new Principal();
	   
	   GestionSocios gestionSocios = new GestionSocios(principal,true);
	   
	   FormularioSocio formularioSocios = new FormularioSocio(gestionSocios,true);
	   
	   
	   //lehioei kontroladoreak ezarri, horrela erlazionatuta egongo dira
	   
	   principal.setSociosControlador(socioControlador);
	   gestionSocios.setSociosControlador(socioControlador);
	   formularioSocios.setSocioControlador(socioControlador);
	   
	   
	   
	   
	   //kontroladoreari lehioak asignatu
	   
	   socioControlador.setPrincipal(principal);
	   socioControlador.setGestionSocios(gestionSocios);
	   socioControlador.setFormularioSocio(formularioSocios);
	   socioControlador.setSocioModelo(socioModelo);
	   
	   principal.setVisible(true);
	}

}
