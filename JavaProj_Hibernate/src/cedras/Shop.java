package cedras;

public class Shop {
	private long id;
	private String name;
	private String tomato;
	private String onion;
	private String potato;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTomato() {
		return tomato;
	}

	public void setTomato(String tomato) {
		this.tomato = tomato;
	}

	public String getOnion() {
		return onion;
	}
	
	public void setOnion(String onion) {
		this.onion = onion;
	}

	public String getPotato() {
		return potato;
	}
	
	public void setPotato(String potato) {
		this.potato = potato;
	}

	public String toString() {
		return "{Shop Receipt} ID: " + this.id + ", Name: " + 
		       this.name + ", Tomatoes: " + this.tomato + ", Onions: " + 
			   this.onion + ", Potatoes: " + this.potato ;
	}
}