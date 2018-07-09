public abstract class Person {
    private int id;
    private String name;
    private String username;
    private String password;
    private String email;

    public Person(int id, String name, String username, String password, String email){
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
