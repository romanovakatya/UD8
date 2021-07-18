package models;

public class Serie {
	
	//atributos,
	
	private String title;
	private int numberOfSeasons;
	private boolean delivered;
	private String genre;
	private String creator;
	
	//constantes para valores por defecto,
	final private int NUMBEROFSEASONS = 3;
	final private boolean DELIVERED = false;
	
	//constructores,
	
	//por defecto,	
	public Serie() {
		this.title = "";
		this.numberOfSeasons = this.NUMBEROFSEASONS;
		this.delivered = this.DELIVERED;
		this.genre = "";
		this.creator = "";
	}
	
	//con atributos el titulo y creador,
	public Serie(String title, String creator) {
		this.title = title;
		this.numberOfSeasons = this.NUMBEROFSEASONS;
		this.delivered = this.DELIVERED;
		this.genre = "";
		this.creator = creator;
	}
	
	
	//con todos los atributos,
	public Serie(String title, int numberOfSeasons, String genre, String creator) {
		this.title = title;
		this.numberOfSeasons = numberOfSeasons;
		this.delivered = this.DELIVERED;
		this.genre = genre;
		this.creator = creator;
	}

	
	//los getters,
	public String getTitle() {
		return title;
	}

	public int getNumberOfSeasons() {
		return numberOfSeasons;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public String getGenre() {
		return genre;
	}

	public String getCreator() {
		return creator;
	}

	@Override
	public String toString() {
		return "Serie [title=" + title + ", numberOfSeasons=" + numberOfSeasons + ", delivered=" + delivered
				+ ", genre=" + genre + ", creator=" + creator + "]";
	}
	
	
	
}
