package ftt.ec.FTTSpringBootService;

//JavaBean, POJO

public class Person {

    private long id;
    private String name;
    private String time;
    private float value;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
        this.time = String.valueOf(new java.util.Date());
        this.value = new java.util.Random().nextFloat() * 1000;
    }

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
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
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the value
	 */
	public float getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(float value) {
		this.value = value;
	}

}