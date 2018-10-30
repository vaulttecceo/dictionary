import java.util.*;

public class tempMap implements Map {
    public ArrayList map;

    public tempMap() {
        map = new ArrayList<myEntry>();
    }


    public String getKey() {

        return null;
    }

    public String getValue() {
        return null;
    }

    public int size(){
        return map.size();
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public Object get(Object key) {
        if(map.contains(key))
          return map.get(map.indexOf(key));
        return null;
    }

    public Object put(Object key, Object value) {
        map.add(new myEntry(key, value));
        return null;
    }

    public Object remove(Object key) {
        return null;
    }

    public void putAll(Map m) {

    }

    public void clear() {

    }

    public Set keySet() {
        return null;
    }

    public Collection values() {
        return null;
    }

    public Set<Entry> entrySet() {
        return null;
    }
}
