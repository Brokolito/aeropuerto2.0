public class Ciudad {
	private String pais;
	private String longitud;
	private String latitud;
	public Ciudad(String pais, String longitud,String latitud){
		this.pais=pais;
		this.longitud=longitud;
		this.latitud=latitud;
	}
	public String getPais() {
		return this.pais;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public String getLatitud() {
		return this.latitud;
	}
}