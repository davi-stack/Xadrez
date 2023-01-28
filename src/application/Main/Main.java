package application.Main;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		UI jogo = new UI();
		Scanner sr = new Scanner(System.in);
        jogo.game(sr);
	}

}
