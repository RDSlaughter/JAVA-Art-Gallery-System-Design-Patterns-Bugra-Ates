
/**
 *
 * @author bugra
 */
public class SingleGUIObject {
    
   //create an object of SingleLoginObject
   private static SingleGUIObject instance = new SingleGUIObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleGUIObject(){}

   //Get the only object available
   public static SingleGUIObject getInstance(){
      return instance;
   }

   public Object ArtInfosGUI(){
       return new ArtInfosGUI();
   }
  
   public Object AdminLoginGUI()
   {
       return new AdminLoginGUI();
   }
}
