package personajes;


import personajes.comportamientos.AgressiveBehaviour;
import personajes.comportamientos.IBehaviour;

public class GuerreroFuego extends GuerreroInvisible {
	
	public GuerreroFuego(){
		caracter = '@';
		strategy = new AgressiveBehaviour();
	}
	
	public GuerreroFuego(IBehaviour b) {
		super(b);
		caracter = '@';
	}
	
	public void move() {       
		strategy.moveCommand();
	}
	 
}
