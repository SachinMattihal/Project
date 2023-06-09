package sample;
import java.util.Random;

public class Generate_otp {
	static char[] OTPGenerator(int len) {
		System.out.println("Generating OTP: ");
		System.out.print("Your OTP is ");

		String numbers = "0123456789";

		Random random = new Random();

		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			otp[i] = numbers.charAt(random.nextInt(numbers.length()));
		}
		return otp;
	}

	public static void main(String[] args) {
		int length = 6;
		System.out.println(OTPGenerator(length));
	}
}