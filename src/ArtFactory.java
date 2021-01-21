
import java.util.HashMap;


public class ArtFactory {
    
    private static final HashMap artMap = new HashMap();
    
    // GET ART FONKSİYONU BİR ART TYPE I ALIP HER FARKLI TYPE İÇİN YANINA YENİ BİR OBJE OLUŞTURUYOR. EĞER OBJE ZATEN VAR İSE YENİ BİR OBJE OLUŞTURMAYA GEREK DUYMUYOR.
    public static ArtInterface getArt(String artType)
    {
       Arts arts = (Arts)artMap.get(artType);
       
       if(arts==null)
       {
           arts = new Arts(artType);
           artMap.put(artType, arts);
       }
       return arts ;
    } 
}
