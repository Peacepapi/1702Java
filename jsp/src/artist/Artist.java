package artist;

/**
 * Model class: packages the data for the view to understand
 *
 */
public class Artist {

	private int artistId;
	private String name;
	
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Artist(int artistId, String name) {
		super();
		this.artistId = artistId;
		this.name = name;
	}
	public Artist() {
		super();
	}
	
	
	
}