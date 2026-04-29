package POO.heranca.exemplo1;

public class Teacher extends People {
    private String course;

    public Teacher(String nome, String cpf, int idade, String course) {
        super(nome, cpf, idade);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void introduce(){
        System.out.println("Meu nome é " + super.getName() + " e sou professor!");
    }
}
