import java.lang.reflect.Array;
import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepoType repoType;
    private ArrayList<Commit> commits;
    private ArrayList<Commit> foundCommits;

    public Repository(String name, String description, RepoType repoType){
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<Commit>();
        this.foundCommits = new ArrayList<Commit>();


    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }


    public RepoType getRepoType() {
        return this.repoType;
    }

    public int checkCommitsLength() {
        return this.commits.size();
    }

    public int checkFoundCommitsLength() {
        return this.foundCommits.size();
    }

    public void makeCommit(Commit commit) {
        this.commits.add(commit);
    }

    public Commit findCommit(int uniqueId){
        Commit foundCommit = null;
        for (Commit commit: this.commits) {
            if (commit.getUniqueID() == uniqueId) {
                foundCommit = commit;
            }
        }
        return foundCommit;
    }

    public ArrayList<Commit> findCommitsByType(String commitType){
        for (Commit commit: this.commits) {
            if (commit.getType() == commitType) {
                foundCommits.add(commit);
            }
        }
        return foundCommits;
    }
}
