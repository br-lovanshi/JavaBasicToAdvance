package CollectionFramework.miniProgram;

public class Employee {
    private int id;
    private String name;
    private String role;

    public Employee(){
    }

    public Employee(int id, String name, String role){
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return this.name;
    }
    public void setRole(String role){
        this.role = role;
    }
    public  String getRole(){
        return this.role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
