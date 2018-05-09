package playground;

@SuppressWarnings({"javadoc", "nls"})
public class Playground
{
    public static void main(String[] args)
    {      
        OriginalObject original = new OriginalObject.Builder().setString("test1").build();
        NewSubClass newSubClass = new NewSubClass.Builder().setString("test2").setBool(true).build();
        
        System.out.println(original.getString());
        System.out.println(newSubClass.getString());
        System.out.println(newSubClass.getDoesThisWork());
    }
}
