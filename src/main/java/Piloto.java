public class Piloto {
	private String nombre;
	private String apellido;
	private int rut;
	private int idPiloto;
	public Vuelo unnamed_Vuelo_;

	public Piloto(String nombre, String apellido, int rut, int idPiloto) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.rut=rut;
		this.idPiloto=idPiloto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getRut() {
		return this.rut;
	}
}