// BUILDER PATTERN

 public class Infos {
    
    private final String artName ;
    private final String artist ;
    private final int price ;
    private final String name ;
    private final String gender ;
    private final String surname ;
    private final String phoneNumber ;
    private final String idNumber ;
    private final String payingMethod ;

    // THIS IS AN BUILDER PATTERN AND CONSTRUCTOR TAKES BUILDER CLASS OBJCET
    // THIS CLASS HAS FINAL VARIABLES THAT COMES DERIVED VARIABLES FROM InfoBuilder CLASS
    public Infos(InfoBuilder ArtBuilder)
    {
        this.artName = ArtBuilder.artName ;
        this.artist = ArtBuilder.artist ;
        this.price = ArtBuilder.price ;
        this.name = ArtBuilder.name ;
        this.surname = ArtBuilder.surname ;
        this.phoneNumber = ArtBuilder.phoneNumber ;
        this.idNumber = ArtBuilder.idNumber ;
        this.payingMethod = ArtBuilder.payingMethod ;
        this.gender = ArtBuilder.gender ;
    }

    public String getArtName() {
        return artName;
    }

    public String getArtist() {
        return artist;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getPayingMethod() {
        return payingMethod;
    }
       
    public String getGender() {
        return gender ;
    }
    
    
public static class InfoBuilder  { // STATIC CLASS AND IT IS ACCESSABLE FOR Infos CLASS ( Infos.InfoBuilder ) 
    
    private final String Arts[] = {"Art1","Art2","Art3","Art4","Art5","Art6"};
    public String whichArt ,string1,string2,string3 ;
    public String name ;
    public String surname ;
    public String phoneNumber ;
    public String idNumber ;
    public String artName ;
    public String artist ;
    public String payingMethod ;
    public int price ;
    public String gender ;
    
// BUILDER PATTERN
    public InfoBuilder()
    {
    }
    public InfoBuilder name (String name)
    {
        this.name = name ;
        return this ;
    }
    
    public InfoBuilder surname (String surname)
    {
        this.surname = surname ;
        return this ;
    }
    
    public InfoBuilder phoneNumber (String phoneNumber)
    {
        this.phoneNumber = phoneNumber ;
        return this ;
    }
    
    public InfoBuilder idNumber (String idNumber)
    {
        this.idNumber = idNumber ;
        return this ;
    }
    
    public InfoBuilder artName (String artName)
    {
        this.artName = artName ;
        return this ;
    }
    
    public InfoBuilder artist (String artist)
    {
        this.artist = artist ;
        return this ;
    }
    
    public InfoBuilder payingMethod (String payingMethod)
    {
        this.payingMethod = payingMethod ;
        return this ;
    }
    
    public InfoBuilder price (int price)
    {
        this.price = price ;
        return this ;
    }
     
    public InfoBuilder gender (String gender)
    {
        this.gender = gender ;
        return this ;
    }
    public Infos Build() // Build FUNCTION CREATE AN OBJECT WITH THESE VARIABLES TO MAKE THEM FINAL
    {
        Infos arts = new Infos(this);
        return arts ;
    }
    
  }
}
