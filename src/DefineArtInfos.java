
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DefineArtInfos {
    
    private final String Arts[] = {"Art1","Art2","Art3","Art4","Art5","Art6"};
   
    public void defineArtInfos(String artType)
    {
        Arts arts = (Arts) ArtFactory.getArt(artType); 
   // WE SEND AN ARTTYPE STRING NEXT TO EACH OBJECT IN HASHMAP AND ACCORDING TO ARTTYPE WE DETERMINE THEIR INFORMATIONS
   // setArtName,setArtist,setPrice,setStory FUNCTIONS DO THAT.
        
         if (artType.equalsIgnoreCase(Arts[0]))
        {
           arts.setArtName("Psisik Çöl");
           arts.setArtist("Leman Akpınar");
           arts.setPrice("5000$");
           
           try {
                readStory("Psisik_Col.txt",arts);
            } catch (IOException ex) {
                Logger.getLogger(DefineArtInfos.class.getName()).log(Level.SEVERE, null, ex);
            }
  
        }else if (artType.equalsIgnoreCase(Arts[1])){
             
           arts.setArtName("Daydreamer");
           arts.setArtist("Leman Akpınar");
           arts.setPrice("6500$");
            
           try {
                readStory("Daydreamer.txt",arts);
            } catch (IOException ex) {
                Logger.getLogger(DefineArtInfos.class.getName()).log(Level.SEVERE, null, ex);
            }
                       
        }else if (artType.equalsIgnoreCase(Arts[2])){
             
           arts.setArtName("Oyunbozan");
           arts.setArtist("Göksu Gül");
           arts.setPrice("8000$");
           
           try {
                readStory("Oyunbozan.txt",arts);
            } catch (IOException ex) {
                Logger.getLogger(DefineArtInfos.class.getName()).log(Level.SEVERE, null, ex);
            }
                     
        }else if (artType.equalsIgnoreCase(Arts[3])){
            
           arts.setArtName("The Bear");
           arts.setArtist("Göksu Gül");
           arts.setPrice("4500$");
            
           try {
                readStory("The_Bear.txt",arts);
            } catch (IOException ex) {
                Logger.getLogger(DefineArtInfos.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }else if (artType.equalsIgnoreCase(Arts[4])){
            
           arts.setArtName("Purity");
           arts.setArtist("Ali Kabas");
           arts.setPrice("6000$");
           
           try {
                readStory("Purity.txt",arts);
            } catch (IOException ex) {
                Logger.getLogger(DefineArtInfos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if (artType.equalsIgnoreCase(Arts[5])){
            
           arts.setArtName("Skull");
           arts.setArtist("Seda Gazioglu");
           arts.setPrice("7000$");
         
           try {
                readStory("Skull.txt",arts);
            } catch (IOException ex) {
                Logger.getLogger(DefineArtInfos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }         
    }    
    
    // DOSYA YOLUMUZU,OBJEMİZİ VE TEXT AREAYA YERLESTIRELECEK STORY STRING'ININ BELIRLENMESI ICIN readStory FONKSIYONUNA YOLLUYORUZ.
    // HIKAYELER YOLLANAN DOSYA ADINA GÖRE OKUNUYOR VE ARDINDAN GUI'DE TEXT FIELD A YERLEŞTIRILIYOR.
  
    public void readStory(String fileName,Arts arts) throws IOException
    {
          
          String filePath = fileName ;
          File file = new File(fileName);

        try {
            
          FileReader fr = new FileReader(file);
          BufferedReader br = new BufferedReader(fr);
         
          String line ;
          String story_string ="";
          while((line = br.readLine()) != null ) { 
             story_string += line ;
           }       
            arts.setStory(story_string);
            
           } catch (FileNotFoundException ex) {
             System.out.println("FILE NOT FOUND!");
        }     
    }    
}
