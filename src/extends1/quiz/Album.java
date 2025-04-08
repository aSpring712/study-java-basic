package extends1.quiz;

/**
 * Album
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class Album extends Item {

	private String artist; // 아티스트

	public Album(String name, int price, String artist) {
		super(name, price);

		this.artist = artist;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("- 아티스트: " + this.artist);
	}
}