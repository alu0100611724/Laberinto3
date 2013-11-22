package personajes;


import personajes.comportamientos.IBehaviour;
import personajes.comportamientos.NormalBehaviour;

public class GuerreroPlanta extends GuerreroInvisible {
	
	protected char caracter;
	
	public GuerreroPlanta(){
		caracter = '$';
		strategy = new NormalBehaviour();
	}
	
	public GuerreroPlanta(IBehaviour b) {
		super(b);
		caracter = '$';
	}
	
	public void move() {       
		strategy.moveCommand();
	}
	 
}
