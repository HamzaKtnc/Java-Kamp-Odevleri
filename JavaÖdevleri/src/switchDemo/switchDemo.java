package switchDemo;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'X';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel, Geçtiniz");
			break;
		case 'B':
			System.out.println("İyi, Geçtiniz");
			break;
		case 'C':
			System.out.println("Fena Değil, Geçtiniz");
			break;
		case 'D':
			System.out.println("Sınırda, Geçtiniz");
			break;
		case 'F':
			System.out.println("Kötü, Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz!!");
			break;

		}

	}

}