import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
	private Date fecha;
	private ArrayList<Avion> aviones;
	private ArrayList<Pasajero> pasajeros;
	private Ciudad ciudad1;
	private Ciudad ciudad2;

	public Vuelo(Date fecha,Ciudad ciudad1, Ciudad ciudad2) {
		this.fecha = fecha;
		this.pasajeros=new ArrayList<Pasajero>();
		this.aviones= new ArrayList<Avion>();
		this.ciudad1=ciudad1;
		this.ciudad2=ciudad2;
	}
	public Date getFecha() {
		return this.fecha;
	}

	public ArrayList<Avion> getAviones() {
		return aviones;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public Ciudad getCiudad1() {
		return ciudad1;
	}

	public Ciudad getCiudad2() {
		return ciudad2;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}