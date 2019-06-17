import org.junit.Before;
import org.junit.Test;

import javax.security.auth.login.AccountNotFoundException;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    Account account;
    Repository repository;

    @Before
    public void before(){
        account = new Account("ru", "Ruairidh", AccountType.FREE);
        repository = new Repository("Github", "Java Github", RepoType.PRIVATE);
    }

    @Test
    public void getUserName(){
        assertEquals("ru", account.getUsername());
    }

    @Test
    public void getName(){
        assertEquals("Ruairidh", account.getName());
    }

    @Test
    public void getAccountType(){
        assertEquals("FREE", account.getAccountType());
    }

    @Test
    public void repositoryListStartsEmpty(){
        assertEquals(0, account.getRepoCount());
    }

    @Test
    public void canAddRepository(){
        account.addRepository(repository);
        assertEquals(1, account.getRepoCount());
    }

    @Test
    public void canUpgradeRepository(){
        account.upgradeAccount();
        assertEquals("PRO", account.getAccountType());
    }
}
