package playground;

@SuppressWarnings("javadoc")
public class OriginalClass
{
    private String string;
    
    protected OriginalClass(BaseBuilder<?,?> builder)
    {
        this.string = builder.string;
    }
        
    public String getString()
    {
        return string;
    }
    
    protected abstract static class BaseBuilder<T extends BaseBuilder<T, S>, S>
    {        
        protected String string;
        
        public T setString(String string)
        {
            this.string = string;
            return getThis();
        }
        
        @SuppressWarnings("unchecked")
        private T getThis()
        {
            return (T) this;
        }
        
        public S build()
        {
            // validate base fields
            return buildImpl();
        }
        
        protected abstract S buildImpl();
    }
    
    public static class Builder extends BaseBuilder<Builder, OriginalClass>
    {
        @Override
        public OriginalClass buildImpl()
        {
            return new OriginalClass(this);
        }
    }
}
