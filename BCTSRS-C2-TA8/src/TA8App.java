/**
 * This is the main class that instances classes created inside the package
 * 
 * @author Roger Rubio Rufaste
 *
 */
public class TA8App {

	/**
	 * This main app instances a variety of classes inside the package to test its functionalities
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO
		
		// Persona class instances
		Persona personDefault = new Persona("44444444D");
		Persona person2 = new Persona("Roger", 24, "44444444D", "male");
		Persona person3 = new Persona("Roger", 24, "44444444D", "male", 70.1, 175.0);
		System.out.println("The name of the default person is: "+personDefault.getName());
		System.out.println("The name of the second person is: "+person2.getName()+", and the sex is: "+person2.getSex());
		System.out.println("The weight of the third person is: "+person3.getHeight());
		
		// Password class instances
		Password passDefault = new Password();
		Password randomPassWithLen = new Password(16);
		System.out.println("The default random password of length "+passDefault.getLength()+" is: "+passDefault.getPassword());
		System.out.println("The random password of length "+randomPassWithLen.getLength()+" is: "+randomPassWithLen.getPassword());
		
		// Electrodomestico class instances
		Electrodomestico device1 = new Electrodomestico();
		Electrodomestico device2 = new Electrodomestico(500.0, 50.0);
		Electrodomestico device3 = new Electrodomestico(199.9, "A", "grey", 30.0);
		System.out.println("The default price of first default device is: "+device1.getBasePrice());
		System.out.println("The weigth of the second device is: "+device2.getWeight());
		System.out.println("The energetic consumption of the third device is: "+device3.getEnergeticConsum());
		
		// Serie class instances
		Serie series1 = new Serie();
		Serie series2 = new Serie("Anabelle", "Gary Dauberman");
		Serie series3 = new Serie("It", 1, false, "Terror", "Stephen King");
		System.out.println("The default seasons of the first series is: "+series1.getNumSeasons());
		System.out.println("The title of the second series is: "+series2.getTitle()+" by "+series2.getCreator());
		System.out.println("The genre of the third series is: "+series3.getGenre());
	}

}
