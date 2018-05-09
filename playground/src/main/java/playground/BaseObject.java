package playground;

@SuppressWarnings("javadoc")
public class BaseObject
{
    private String string;
    
    protected BaseObject(Builder<?> builder)
    {
        this.string = builder.string;
    }
        
    public String getString()
    {
        return string;
    }
    
    public static class Builder<T extends Builder<T>>
    {
        private String string;
        
        @SuppressWarnings("unchecked")
        public T setString(String string)
        {
            this.string = string;
            return (T) this;
        }
    }
    
    @SuppressWarnings("rawtypes")
    public static BaseObject.Builder<?> Builder()
    {
        return new BaseObject.Builder();
    }
}
