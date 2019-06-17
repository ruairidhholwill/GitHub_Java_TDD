import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.HashMap;

public class Account {

    private String username;
    private String name;
    private ArrayList<Repository> repositories;
    private AccountType accountType;

    public Account(String username, String name, AccountType accountType){
        this.username = username;
        this.name = name;
        this.accountType = AccountType.FREE;
        this.repositories = new ArrayList<Repository>();
    }

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public String getAccountType() {
        return this.accountType.name();
    }

    public int getRepoCount() {
        return this.repositories.size();
    }

    public void addRepository(Repository repository) {
        this.repositories.add(repository);
    }

    public void upgradeAccount() {
        this.accountType = AccountType.PRO;
    }
}
