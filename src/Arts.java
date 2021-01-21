
public class Arts implements ArtInterface{  // DECLARING THE VARIABLES 
    
    private String artName ;
    private String artist ;
    private String price ;
    private String story ;
    private final String artType ;

    public String getArtName() {  // SETTER AND GETTER METHODS FOR TAKING OR SENDING 
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
    
    
  public Arts (String artType) // CONSTRUCTOR TAKES AN artTYPE STRING BECAUSE EACH PAINTING HAS DIFFERENT AND CERTAIN TYPES WITH DIFFERENT INFORMATIONS.
  {
      this.artType = artType ;
  }
       
    @Override 
    public void draw()
    {
        // WE DID NOT DO SOME PROCESSES YET
    }
    
}
