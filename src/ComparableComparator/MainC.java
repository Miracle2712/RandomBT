package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainC {
    public static void main(String[] args) {
        Student student = new Student("Son", 26, "HP");
        Student student1 = new Student("Lam", 23, "VP");
        Student student2 = new Student("Hoc", 26, "TP" );
        Student student3 = new Student("Hung", 24, "HN" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}

