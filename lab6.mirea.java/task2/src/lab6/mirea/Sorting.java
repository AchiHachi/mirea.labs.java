package lab6.mirea;

public class Sorting {
    public void quickSort(Student[] array, int low, int high) {
        SortingStudentsByGPA GPA = new SortingStudentsByGPA();
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student value = array[middle];

        int i = low;
        int j = high;

        while (i <= j) {
            while (GPA.compare(array[i], value) > 0) {
                i++;
            }

            while (GPA.compare(array[j],  value) < 0) {
                j--;
            }

            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
