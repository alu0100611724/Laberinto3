package complementos;

import director.JuegoDelLaberinto;
import productos.JuegoDelLaberintoEncantado;
import productos.JuegoDelLaberintoLuchas;

public class Main {

	public static void main(String[] args) {
		
		
		JuegoDelLaberinto fabricaLab = new JuegoDelLaberintoEncantado();
		System.out.println("\nHogwarts Maze\n");
		Laberinto hogwarts = fabricaLab.crearLaberinto();
		hogwarts.play();
		
		fabricaLab = new JuegoDelLaberintoLuchas();
		System.out.println("\nMortal Kombat Maze\n");
		Laberinto laberintoLucha = fabricaLab.crearLaberinto();
		laberintoLucha.play();
		
	}

}


