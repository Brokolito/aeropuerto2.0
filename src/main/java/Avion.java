import java.util.ArrayList;

public class Avion {
	private int anho;
	private String nombre;
	private double kmRecorridos;
	private Aeropuerto aeropuerto;
	private ArrayList<Vuelo> vuelos;

	public Avion(String nombre, int anho, double kmRecorridos) {
		this.nombre=nombre;
		this.anho=anho;
		this.kmRecorridos=kmRecorridos;
		this.vuelos=new ArrayList<Vuelo>();
	}

	public int getAnho() {
		return this.anho;
	}

	public String getNombre() {
		return this.nombre;
	}

	public double getKmRecorridos() {
		return this.kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	public ArrayList<Vuelo> getVuelos() {
		return vuelos;
	}

	@Override
	public String toString() {
		return "Nombre: "+nombre+", año: "+anho+",KmRecorridos: "+kmRecorridos ;
	}
}