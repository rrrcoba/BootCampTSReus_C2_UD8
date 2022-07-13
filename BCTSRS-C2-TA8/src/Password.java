/**
 * This is the class of the second exercise of TA8
 * 
 * @author Roger Rubio Rufaste
 */

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Password {
	private int length = 8;
	private String password;

	/**
	 * This is the default constructor of the class
	 */
	public Password() {
		this.password = generatePass(this.length);
	}

	
	/**
	 * This is a constructor that generates a password of the length indicated
	 * 
	 * @param length
	 */
	public Password(int length) {
		this.length = length;
		this.password = this.generatePass(length);
	}

	/**
	 * This method generates a random password for a length indicated
	 * 
	 * @param l length of the password
	 * @return String that is the random password
	 */
	private String generatePass(int l) {
		// All chars and numbers with CAPS and without CAPS
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		SecureRandom random = new SecureRandom();

		/*
		 * We start an iteration for the length introduced. Each iteration randomly
		 * chooses a char from "chars"
		 */
		return IntStream.range(0, l).map(i -> random.nextInt(chars.length()))
				.mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex))).collect(Collectors.joining());
	}


	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}


	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
