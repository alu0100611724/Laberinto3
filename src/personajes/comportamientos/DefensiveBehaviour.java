package personajes.comportamientos;

public class DefensiveBehaviour implements IBehaviour {

	public DefensiveBehaviour() {
		
	}

	@Override
	public void moveCommand() {
		System.out.println("Huye.");
	}

}
