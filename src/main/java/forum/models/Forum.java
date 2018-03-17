package forum.models;

public class Forum {
    private long id;
    private String name;

    public Forum(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
