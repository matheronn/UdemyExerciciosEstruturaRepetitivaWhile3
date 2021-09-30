import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opt = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;

		while (opt != 4) {
			if (opt == 1) {
				alcool += 1;
				opt = sc.nextInt();
			} else if (opt == 2) {
				gasolina = gasolina + 1;
				opt = sc.nextInt();
			} else if (opt == 3) {
				disel += 1;
				opt = sc.nextInt();
			} else {
				System.out.println("opçao invalida");
				opt = sc.nextInt();
			}

		}

		System.out.println("muito obrigado");
		System.out.println("alcool:" + alcool);
		System.out.println("gasolina:" + gasolina);
		System.out.println("disel:" + disel);

		sc.close();

	}
}
