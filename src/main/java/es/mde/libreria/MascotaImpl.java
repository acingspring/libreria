package es.mde.libreria;

public abstract class MascotaImpl implements Mascota {

	private String nombre, size;
	private int edad;
	
	public MascotaImpl() {	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String getSize() {
		return size;
	}

	@Override
	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Esta mascota se llama " + getNombre() + ", es de tamaño " + getSize() + " , y tiene " + getEdad() + " años";
	}
}
