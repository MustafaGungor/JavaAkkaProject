package javaAkka;

/**
 * Created by Gungor-Mebitech on 6.05.2017.
 */
public class SRequest {
    private final String key;
    private final Object valObject;

    public SRequest(String key, Object valObject) {
        this.key = key;
        this.valObject = valObject;
    }

    public String getKey() {
        return key;
    }

    public Object getValObject() {
        return valObject;
    }
}
