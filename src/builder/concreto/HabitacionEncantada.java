package builder.concreto;

import builder.abstracto.Habitacion;
import complementos.Hechizo;

public class HabitacionEncantada extends Habitacion {

	protected Hechizo encantamiento;
	
	public HabitacionEncantada(int numHabitacion, Hechizo h) {
		super(numHabitacion);
		encantamiento=h;
	}

	public Hechizo getEncantamiento() {
		return encantamiento;
	}

}
