import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String procuct2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double prince1 = 2100.0;
		double prince2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n",product1,prince1);
		System.out.printf("%s, which price is $ %.2f%n",procuct2,prince2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c",age,code,gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n",measure);
		System.out.printf("Rouded (three decimal places:) %.3f%n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n",measure);

		
	}

}
