class Student{

    private String name;
    private Integer age;
    private List<String> subject;
    private List<Integer> marks;

    public Student(String name, Integer age, List<String> subject, List<Integer> marks){
        this.name = name,
        this.age = age,
        this.subject = subject,
        this.marks = marks
    }

    public Student(){

    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSubject(List<String> subject){
        this.subject = subject;
    }
    public void setMarks(List<Integer> marks){
        this.marks = marks;
    }

   @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subjects=" + subjects +
                ", marks=" + marks +
                '}';
    }


}