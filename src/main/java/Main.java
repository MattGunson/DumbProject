import java.util.Scanner;

public class Main {

	public static Calculator calculator = new Calculator();
	public static void main(String[] args) {
		System.out.println("Getting input:");
		Scanner sc = new Scanner(System.in);
		try {
			String[] line = sc.nextLine().split(" ");
			while (!line[0].equals("quit")) {
				String command = line[0];
				int left, right;
				switch (command) {
					case "add":
					left = Integer.parseInt(line[1]);
					right = Integer.parseInt(line[2]);
					System.out.println(calculator.add(left, right));
					break;

					case "subtract":
					left = Integer.parseInt(line[1]);
					right = Integer.parseInt(line[2]);
					System.out.println(calculator.subtract(left, right));
					break;

					case "multiply":
					left = Integer.parseInt(line[1]);
					right = Integer.parseInt(line[2]);
					System.out.println(calculator.multiply(left, right));
					break;

					case "divide":
					left = Integer.parseInt(line[1]);
					right = Integer.parseInt(line[2]);
					System.out.println(calculator.divide(left, right));
					break;
				}
				line = sc.nextLine().split(" ");
			}
		} catch (Exception e) {
			System.out.println("PANIC: an exception was thrown");
		}
		sc.close();
	}
}
