package javaAkka;

import java.io.Serializable;

/**
 * Created by Gungor-Mebitech on 6.05.2017.
 */
public class MailObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String message;

    public MailObject(String message) {
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
