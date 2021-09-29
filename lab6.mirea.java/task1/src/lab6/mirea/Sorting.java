package lab6.mirea;

import java.util.Arrays;

public class Sorting {
    public void insertionSort(Student[] list){
        for (int i = 0; i < list.length; i++){
            Student value = list[i];
            int j = i - 1;
            for(; j >= 0; j--){
                if (value.compareTo(list[j]) < 0){
                    list[j+1] = list[j];
                }
                else{
                    break;
                }
            }
            list[j+1] = value;
        }
        System.out.println(Arrays.toString(list));
    }

}
