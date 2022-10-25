import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
public class Aeropuerto {
	private ArrayList<Avion> aviones;
	public Aeropuerto() {
		this.aviones= new ArrayList<>();
	}

	public void buscarUsuariosFecha(Date fecha) {
		for (int i=0;i<aviones.size();i++){
			if(aviones.get(i).getVuelos().get(i).getFecha().equals(fecha)){
				System.out.println(aviones);
			}
		}
	}

	public void buscarUsuariosVuelo(String ciudad1, String ciudad2, Date fecha) {
		for (int i=0;i<aviones.size();i++){
			if(aviones.get(i).getVuelos().get(i).getCiudad1().equals(ciudad1) && aviones.get(i).getVuelos().get(i).getCiudad2().equals(ciudad2)){
				System.out.println(aviones.get(i));
			}
		}
	}

	public void vizualizarAviones() {
		for (int i=0;i<aviones.size();i++){
			System.out.println(aviones.get(i));
		}
	}

	public ArrayList<Avion> buscarPasajeroCOVID() {
		ArrayList<Avion> covid=new ArrayList<Avion>();
		for (int i = 0; i < aviones.size(); i++) {
			if(aviones.get(i).getVuelos().get(i).getPasajeros().get(i).getPasaporteSanitario().getPcr()==true){
				covid.add(aviones.get(i));
				System.out.println("El vuelo "+i+" tiene al menos un pasajero con COVID");
			}
		}
		return covid;
	}

	public Avion addAvion(String nombre, int anho,double kmRecorridos) {
		Avion avion= new Avion(nombre,anho,kmRecorridos);
		System.out.println(avion);
		return avion;
	}
}