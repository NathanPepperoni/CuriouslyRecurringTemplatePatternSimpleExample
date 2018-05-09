package playground;

@SuppressWarnings("javadoc")
public class OriginalObject extends BaseObject
{
    public OriginalObject(Builder builder)
    {
        super(builder);
    }

    public static class Builder extends BaseObject.Builder<Builder>
    {       
        public OriginalObject build()
        {
            return new OriginalObject(this);
        }
    }
}
