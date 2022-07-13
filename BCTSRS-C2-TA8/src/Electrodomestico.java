/**
 * This is the class of the third exercise of TA8
 * 
 * @author Roger Rubio Rufaste
 */
public class Electrodomestico {
	public enum EnergeticConsum{
		A,B,C,D,E,F
	}
	public enum Color{
		WHITE, BLACK, RED, BLUE, GREY
	}
	
	private final Color DEF_COLOR = Color.WHITE;
	private final EnergeticConsum DEF_CONSUM = EnergeticConsum.F;
	private final double DEF_PRICE = 100.0;
	private final double DEF_WEIGHT = 5.0;
	
	private double basePrice = DEF_PRICE;
	private EnergeticConsum energeticConsum = DEF_CONSUM;
	private Color color = DEF_COLOR;
	private double weight = DEF_WEIGHT;
	
	/**
	 * This is the default constructor of the class
	 * 
	 */
	public Electrodomestico() {
		
	}
	
	/**
	 * This is the constructor for only price and weight
	 * 
	 * @param basePrice
	 * @param weigth
	 */
	public Electrodomestico(double basePrice, double weight) {
		this.basePrice = basePrice;
		this.weight = weight;
	}

	/**
	 * This is the constructor with all the fields
	 * 
	 * @param basePrice
	 * @param energeticConsum
	 * @param color
	 * @param weight
	 */
	public Electrodomestico(double basePrice, String energeticConsum,
			String color, double weight) {
		this.basePrice = basePrice;
		this.energeticConsum = validateEnergeticConsum(energeticConsum);
		this.color = validateColor(color);
		this.weight = weight;
	}

	/**
	 * @return the basePrice
	 */
	public double getBasePrice() {
		return basePrice;
	}

	/**
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	/**
	 * @return the energeticConsum
	 */
	public EnergeticConsum getEnergeticConsum() {
		return energeticConsum;
	}

	/**
	 * @param energeticConsum the energeticConsum to set
	 */
	public void setEnergeticConsum(EnergeticConsum energeticConsum) {
		this.energeticConsum = energeticConsum;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weigth the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * This method validates the String variable introduced for EnergeticConsum and transforms it into an Enum.
	 * 
	 * @param consum variable EnergeticConsum in String
	 * @return c variable EnergeticConsum in Enum
	 */
	public EnergeticConsum validateEnergeticConsum(String consum) {
		EnergeticConsum c = null;
		
		switch (consum) {
		case "A":
			c = EnergeticConsum.A;
			break;
		case "B":
			c = EnergeticConsum.B;
			break;
		case "C":
			c = EnergeticConsum.C;
			break;
		case "D":
			c = EnergeticConsum.D;
			break;
		case "E":
			c = EnergeticConsum.E;
			break;
		case "F":
			c = EnergeticConsum.F;
			break;
		default:
			System.out.println("The value for Energetic Consumption is invalid. This attribute will be null.");
			c = EnergeticConsum.F;
		}
		
		return c;
	}
	
	/**
	 * This method validates the String variable introduced for "Color" and transforms it into an Enum
	 * 
	 * @param color the String variable color
	 * @return c the Enum variable color
	 */
	public Color validateColor(String color) {
		Color c = null;
		
		switch (color) {
		case "white":
			c = Color.WHITE;
			break;
		case "black":
			c = Color.BLACK;
			break;
		case "blue":
			c = Color.BLUE;
			break;
		case "red":
			c = Color.RED;
			break;
		case "grey":
			c = Color.GREY;
			break;
		default:
			System.out.println("The value introduced for Color is invalid. This attribute will be null.");
			c = Color.WHITE;
		}
		
		return c;
	}
}
