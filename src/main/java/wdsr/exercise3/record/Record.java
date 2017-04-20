package wdsr.exercise3.record;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType (propOrder={"artist","title","genre"})
public class Record {
	private Integer id;
	private String title;
	private String artist;
	private Genre genre;
	
	private Record() {
		// empty - needed for JAXB
	}
	
	public Record(String title, String artist, Genre genre) {
		this(null, title, artist, genre);
	}	

	public Record(Integer id, String title, String artist, Genre genre) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.genre = genre;
	}
	
	@XmlAttribute(required=false)
	public Integer getId() {
		return id;
	}

	@XmlElement(required=true)
	public String getTitle() {
		return title;
	}

	@XmlElement(required=true)
	public String getArtist() {
		return artist;
	}

	@XmlElement(required=true)
	public Genre getGenre() {
		return genre;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "Record [id="+id+", title=" + title + ", artist=" + artist + ", genre=" + genre + "]";
	}
}