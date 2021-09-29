package lab6.mirea;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Sorting sort = new Sorting();
        StudentRTS[] studArr1 = new StudentRTS[5];

        studArr1[0] = new StudentRTS(65, "Vanya");
        studArr1[1] = new StudentRTS(78, "Boris");
        studArr1[2] = new StudentRTS(29, "Anna");
        studArr1[3] = new StudentRTS(12, "Nikita");
        studArr1[4] = new StudentRTS(97, "Oleg");

        StudentIT[] studArr2 = new StudentIT[5];

        studArr2[0] = new StudentIT(35, "Ira");
        studArr2[1] = new StudentIT(73, "Anton");
        studArr2[2] = new StudentIT(19, "Ola");
        studArr2[3] = new StudentIT(25, "Alex");
        studArr2[4] = new StudentIT(100, "Ibrahim");

        Student[] studArr = new Student[studArr1.length + studArr2.length];
        int i = 0;
        for (Student students: studArr1){
            studArr[i] = students;
            i++;
        }
        for (Student students: studArr2){
            studArr[i] = students;
            i++;
        }

        Student[] result = sort.mergeSort(studArr);
        System.out.println(Arrays.toString(result));

    }
}
