package model;
import java.util.*;

public class Client {
    private final Long id;
    private String name;
    private final List<Account> accounts;

    public Client(Long id, String name) {
        try {
            if(name == "" || name == null) throw new IllegalArgumentException("Недопустимое имя");
            if(id == null) throw new IllegalArgumentException("Недопустимый id");
            this.name = name;
            this.id = id;
            
        } catch(IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<Account> getAccount() {
        return accounts;
    }
    public void setName(String name) {
        this.name = name;
    }

}
