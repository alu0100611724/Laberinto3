package productos;

import builder.abstracto.Habitacion;
import builder.concreto.HabitacionDeElementos;
import director.JuegoDelLaberinto;

public class JuegoDelLaberintoLuchas extends JuegoDelLaberinto {
	
	public JuegoDelLaberintoLuchas() {
		super();
	}

	public Habitacion fabricarHabitacion(int n) {
		return new HabitacionDeElementos(n);
	}
	
	
}
