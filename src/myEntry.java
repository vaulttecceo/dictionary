import java.util.Map;

public class myEntry implements Map.Entry {
    Object key, value;

    public myEntry() {
        key = null;
        value = null;
    }

    public myEntry(Object k, Object v) {
        key = k;
        value = v;
    }
    @Override
    public Object getKey() {
        return key;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public Object setValue(Object value) {
        return null;
    }
}
