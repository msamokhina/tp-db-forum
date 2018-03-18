package forum.models;

public class Forum {
    private String id;
    private String name;

    public Forum(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
