package controller;

import java.util.Scanner;

public class TecladoConsola implements Runnable {
	private final Thread hilo;
	private boolean corriendo = false;

	public TecladoConsola() {
		hilo = new Thread(this);
	}

	public void iniciar() {
		corriendo = true;
		hilo.start();
	}

	public void detener() {
		corriendo = false;
	}

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);

		while (corriendo) {
			if (scanner.hasNext()) {
				char c = scanner.next().charAt(0);

				switch (c) {
				case 'a':
					System.out.println("Presionaste la tecla 'a'");
					break;
				case 'b':
					System.out.println("Presionaste la tecla 'b'");
					break;
				case 'c':
					System.out.println("Presionaste la tecla 'c'");
					break;
				case 'q':
					detener();
					break;
				default:
					System.out.println("Presionaste una tecla no reconocida");
					break;
				}
			}
		}

	}
}