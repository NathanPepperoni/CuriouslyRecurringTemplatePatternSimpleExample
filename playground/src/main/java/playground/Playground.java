package playground;

@SuppressWarnings({"javadoc", "nls"})
public class Playground
{
    public static void main(String[] args)
    {      
        OriginalClass originalClass = new OriginalClass.Builder().setString("test1").build();
        SubClass subClass = new SubClass.Builder().setString("test2").setBool(true).build();
        
        System.out.println(originalClass.getString());
        System.out.println(subClass.getString());
        System.out.println(subClass.getBool());
    }
}
