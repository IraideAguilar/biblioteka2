package Controlador;


import Vista.FormularioSocio;
import Vista.GestionSocios;
import Vista.Principal;
import modelo.Socio;
import modelo.SocioModelo;

public class SociosControlador {
	
	private Principal principal;
	private GestionSocios gestionSocios;
	private FormularioSocio formularioSocio;
	private SocioModelo socioModelo;
	
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public GestionSocios getGestionSocios() {
		return gestionSocios;
	}
	public void setGestionSocios(GestionSocios gestionSocios) {
		this.gestionSocios = gestionSocios;
	}
	public FormularioSocio getFormularioSocio() {
		return formularioSocio;
	}
	public void setFormularioSocio(FormularioSocio formularioSocio) {
		this.formularioSocio = formularioSocio;
	}
	public SocioModelo getSocioModelo() {
		return socioModelo;
	}
	public void setSocioModelo(SocioModelo socioModelo) {
		this.socioModelo = socioModelo;
	}
	public void abrirGestionSocios() {
		this.gestionSocios.setVisible(true);
		
	}
	public void abrirFormularioSocios() {
		this.formularioSocio.setVisible(true);
		
	}
	public void cerrarFormularioSocio() {
		this.formularioSocio.setVisible(false);
		
	}
	
	
		
	

	public void guardarSocio(String nombre, String apellido, String direccion, String poblacion, String provincia, String dni) {
		Socio socio = new Socio();
		
		socio.setNombre(nombre);
		socio.setApellido(apellido);
		socio.setDireccion(direccion);
		socio.setPoblacion(poblacion);
		socio.setProvincia(provincia);
		socio.setDni(dni);
		
		
		
	}
	
	

}
