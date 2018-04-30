package Task01_School;


public class School {

    public static void main(String[] args) {
        Class classes = new Class();
        classes.setClassID("A");

        Student gosho = new Student("Gosho", 12);
        Student iva = new Student("Iva", 9);
        Student teo = new Student("Teo", 6);
        Teacher msIvanova = new Teacher("Ivanova", new Discipline[]{new Discipline("Math", 4),
                                                                          new Discipline("Science", 2)});
        Teacher mrPetrov = new Teacher("Petrov", new Discipline[]{new Discipline("Biology", 2),
                                                                      new Discipline("English", 4)});
        classes.setStudents(new Student[]{gosho, iva, teo});
        classes.setTeachers(new Teacher[]{msIvanova, mrPetrov});

        System.out.println(classes);
        
        System.out.println(gosho.introduction() + gosho.tellId());
        System.out.println(iva.introduction() + iva.tellId());
        System.out.println(teo.introduction() + teo.tellId());

        System.out.println(msIvanova.introduction() + msIvanova);
        System.out.println(mrPetrov.introduction() + mrPetrov);

    }
}
