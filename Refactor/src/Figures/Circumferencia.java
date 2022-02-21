package Figures;

// clase Circumferencia
public class Circumferencia {
	private double ràdio;
	private String color;

	public double getRad() {
		return ràdio;
	}

	public void setRad(double rad) {
		this.ràdio = rad;
	}

	public Circumferencia(double radio) {
		this.ràdio = radio;
	}

	public void imprimir() {
		color = "rojo";
		System.out.println("Diámetro: " + 2 * ràdio);
		System.out.println("Color: " + color);
		System.out.print(ràdio * ràdio);
		double area = 2 * 3.1416 * (ràdio * ràdio);
		System.out.println(area);
	}

	public boolean esIgual(boolean Decimals, Circumferencia otro) {
		double radio1 = this.ràdio;
		double radio2 = otro.getRad();
		if (Decimals) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
