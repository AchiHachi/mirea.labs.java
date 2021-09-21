package lab1.mirea;

import java.util.Scanner;

public class Ball {
    private int size;
    private String color = new String();

    private Scanner input = new Scanner(System.in);

    public Ball(String n, int y)
    {
        size = y;
        sizeControl();
        color = n;
    }

    public Ball(int y)
    {
        size = y;
        sizeControl();
        color = "White";
    }
    public Ball()
    {
        size = 0;
        color = "White";
    }

    public void getInfo()
    {
        System.out.print(color+ " ");
        System.out.print(size + " \n");
    }

    public void setSize()
    {
        size = input.nextInt();
        sizeControl();
    }
    
    private void sizeControl()
    {
        if (size > 25)
            size = 25;
        else if (size < 2)
            size = 2;
    }
}
