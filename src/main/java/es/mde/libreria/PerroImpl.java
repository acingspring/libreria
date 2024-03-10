package es.mde.libreria;

public class PerroImpl extends MascotaImpl implements Perro {

	private String chip;
	
	public PerroImpl() {}
	
	@Override
	public String getChip() {
		return chip;
	}

	@Override
	public String toString() {
		return "Este perro se llama " + getNombre() + ", es de tamaño " + getSize() + " , y tiene " + getEdad() + " años y su código de chip es " + getChip();
	}
}
