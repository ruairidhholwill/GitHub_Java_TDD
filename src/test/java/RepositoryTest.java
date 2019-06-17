import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Repository repository;
    Commit commit;

    @Before
    public void before(){
        repository = new Repository("Snowman", "Hangman but different...", RepoType.PRIVATE);
        commit = new Commit("Hello", CommitType.FEATURE, 132);
    }

    @Test
    public void canGetName(){
        assertEquals("Snowman", repository.getName());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Hangman but different...", repository.getDescription());
    }

    @Test
    public void canGetRepoType(){
        assertEquals(RepoType.PRIVATE, repository.getRepoType());
    }

    @Test
    public void commitsListStartsEmpty(){
        assertEquals(0, repository.checkCommitsLength());
    }

    @Test
    public void canAddCommit(){
        repository.makeCommit(commit);
        assertEquals(1, repository.checkCommitsLength());
    }

    @Test
    public void findCommitById(){
        repository.makeCommit(commit);
        assertEquals(commit, repository.findCommit(132));
    }

    @Test
    public void findCommitsByType(){
        repository.makeCommit(commit);
        repository.findCommitsByType("FEATURE");
        assertEquals(1, repository.checkFoundCommitsLength());
    }
}
