package json;

public class Artist {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Artist(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Artist() {
		super();
	}
	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
