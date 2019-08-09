
import java.util.ListResourceBundle;
public class Example_En extends ListResourceBundle 
{
   public Object[][] getContents() 
   {
      return contents;
   }
   static final Object[][] contents = {
      {"count.one", "CRICKET"},
      {"count.two", "FOOTBALL"},
      {"count.three", "HOCKEY"},
   };
}