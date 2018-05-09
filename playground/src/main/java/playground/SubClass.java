package playground;

@SuppressWarnings("javadoc")
public class SubClass extends OriginalClass
{
    private boolean doesThisWork;
    
    private SubClass(Builder builder)
    {
        super(builder);
        this.doesThisWork = builder.bool;       
    }
    
    public boolean getBool()
    {
        return doesThisWork;
    }
    
    public static class Builder extends OriginalClass.BaseBuilder<Builder, SubClass>
    {
        private boolean bool;
        
        public Builder setBool(boolean bool)
        {
            this.bool = bool;
            return this;
        }
        
        @Override
        public SubClass buildImpl()
        {
            // validate new fields
            return new SubClass(this);
        }
    }
}
