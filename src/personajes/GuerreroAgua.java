package personajes;


import personajes.comportamientos.DefensiveBehaviour;
import personajes.comportamientos.IBehaviour;

public class GuerreroAgua extends GuerreroInvisible {
	
	protected char caracter;
	
	public GuerreroAgua(){
		caracter = '&';
		strategy = new DefensiveBehaviour();
	}
	
	public GuerreroAgua(IBehaviour b) {
		super(b);
		caracter = '&';
	}
	
	public void move() {       
		strategy.moveCommand();
	}
	 
}
