import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.HashMap;

public class Account {

    private String username;
    private String name;
    private ArrayList<Repository> repositories;
    private String accountType;

    public Account(String username, String name, String accountType){
        this.username = username;
        this.name = name;
        this.accountType = accountType;
        this.repositories = new ArrayList<Repository>();
    }
}
