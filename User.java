public abstract class User {
    private String Id;
    private String name;
    private String role;

    public User(String id, String name, String role) {
        Id = id;
        this.name = name;
        this.role = role;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
