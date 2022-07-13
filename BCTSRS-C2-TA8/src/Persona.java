/**
 * This is the class of the first exercise of TA8
 * 
 * @author Roger Rubio Rufaste
 */
public class Persona {
	public enum Sex {
		MALE,
		FEMALE
	}
	private final Sex DEF_SEX = Sex.MALE;
	private String name;
	private int age;
	private String dni;
	private Sex sex = DEF_SEX;
	private double weight;
	private double height;

	/**
	 * Default constructor of the class
	 * 
	 */
	public Persona(String dni) {
		this.name="";
		this.age=0;
		this.dni=dni;
		this.weight= 0;
		this.height= 0;
	}
	
	/**
	 * Constructor for name, age and sex
	 * 
	 * @param name
	 * @param age
	 * @param sex
	 */
	public Persona(String name, int age, String dni, String sex) {
		this.name=name;
		this.age=age;
		this.dni=dni;
		this.sex=validateSex(sex);
		this.weight= 0;
		this.height= 0;
	}

	/**
	 * Constructor for all the attributes
	 * 
	 * @param name
	 * @param age
	 * @param dni
	 * @param sex
	 * @param weigth
	 * @param heigth
	 */
	public Persona(String name, int age, String dni, String sex, double weight, double height) {
		this.name = name;
		this.age = age;
		this.dni = dni;
		this.sex = validateSex(sex);
		this.weight = weight;
		this.height = height;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the sex
	 */
	public Sex getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = validateSex(sex);
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
	public void setWeigth(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param heigth the height to set
	 */
	public void setHeigth(double height) {
		this.height = height;
	}
	
	/**
	 * This method validates the String variable "sex" introduced to transform it into an "Enum" type
	 * 
	 * @param sex
	 * @return
	 */
	private Persona.Sex validateSex(String sex) {
		Sex s = null;
		switch (sex) {
		case "male":
			s = Sex.MALE;
			break;
		case "female":
			s = Sex.FEMALE;
			break;
		default:
			System.out.println("Wrong sex value. Sex attribute of this 'Person' will be null.");
		}
		return s;
	}
}
