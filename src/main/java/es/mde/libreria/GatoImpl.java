package es.mde.libreria;

public class GatoImpl extends MascotaImpl implements Gato {

	private int vidas = 7;
	
	public GatoImpl() {}

	@Override
	public int getVidas() {
		return vidas;
	}

	@Override
	public String toString() {
		return "Este gato se llama " + getNombre() + ", es de tamaño " + getSize() + " , y tiene " + getEdad() + " años, y aún le quedan " + getVidas() + " vidas.";
	}

	
}
