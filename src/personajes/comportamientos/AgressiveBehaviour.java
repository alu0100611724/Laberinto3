package personajes.comportamientos;

public class AgressiveBehaviour implements IBehaviour {

	public AgressiveBehaviour() {
		
	}

	@Override
	public void moveCommand() {
		System.out.println("Come.");
	}

}
