package playground;

@SuppressWarnings("javadoc")
public class NewSubClass extends BaseObject
{
    private boolean doesThisWork;
    
    private NewSubClass(Builder builder)
    {
        super(builder);
        this.doesThisWork = builder.doesThisWork;       
    }
    
    public boolean getDoesThisWork()
    {
        return doesThisWork;
    }
    
    public static class Builder extends BaseObject.Builder<Builder>
    {
        private boolean doesThisWork;
        
        public Builder setBool(boolean b)
        {
            doesThisWork = b;
            return this;
        }
        
        public NewSubClass build()
        {
            return new NewSubClass(this);
        }
    }
}
