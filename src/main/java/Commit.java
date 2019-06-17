import java.util.HashMap;

public class Commit {

    private String description;
    private CommitType commitType;
    private Integer uniqueId;


    public Commit(String description, CommitType commitType, Integer uniqueId){
        this.description = description;
        this.commitType = commitType;
        this.uniqueId = uniqueId;
    }

    public String getDescription() {
        return this.description;
    }

    public String getType() {
        return this.commitType.name();
    }

    public int getUniqueID() {
        return this.uniqueId;
    }
}
