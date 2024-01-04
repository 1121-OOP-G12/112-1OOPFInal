import java.util.Scanner;

public class LendingService {

	private int key;
	private int dehumidifierDormA;
	private int dehumidifierDormB;

	public LendingService(int initialDehumidifierDormA, int initialDehumidifierDormB) {
		this.key = 1;
		this.dehumidifierDormA = initialDehumidifierDormA;
		this.dehumidifierDormB = initialDehumidifierDormB;
	}
	
	public static void main(String[] args) {
		LendingService lendingService = new LendingService(10, 20);
		lendingService.borrowItems();
	}

	public void borrowItems() {
		Scanner sc = new Scanner(System.in);
		String input;
		do {
			System.out.println("Enter 'K' to borrow a key, 'D' to borrow a dehumidifier, or 'N' to finish:");
			input = sc.next().toUpperCase();

			switch (input) {
			case "K":
				borrowKey();
				break;
			case "D":
				borrowDehumidifier();
				break;
			case "N":
				System.out.println("Remember to return the items!");
				break;
			default:
				System.out.println("Invalid input. Please enter 'K', 'D', or 'N'.");
			}
		} while (!input.equals("N"));
	}

	private void borrowKey() {
		if (key > 0) {
			key--;
			System.out.println("You have successfully borrowed a key.");
		} else {
			System.out.println("Sorry, there are no keys available for borrowing.");
		}
	}


	
	private void borrowDehumidifier() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dorm name ('A' or 'B'):");
		String dormName = sc.next().toUpperCase();

		switch (dormName) {
		case "A":
			borrowDehumidifierFromDormA();
			break;
		case "B":
			borrowDehumidifierFromDormB();
			break;
		default:
			System.out.println("Invalid dorm name.");
		}
	}

	private void borrowDehumidifierFromDormA() {
		if (dehumidifierDormA > 0) {
			dehumidifierDormA--;
			System.out.println("You have successfully borrowed a dehumidifier from dormA.");
		} else {
			System.out.println("Sorry, there are no dehumidifiers available in dormA.");
		}
	}

	private void borrowDehumidifierFromDormB() {
		if (dehumidifierDormB > 0) {
			dehumidifierDormB--;
			System.out.println("You have successfully borrowed a dehumidifier from dormB.");
		} else {
			System.out.println("Sorry, there are no dehumidifiers available in dormB.");
		}
	}

	
}
