package android.csulb.edu.gymnasia4;

/**
 * Created by Mayankkasturia on 12/4/2015.
 */
public class Calculator {
    public double Male_Cal_Calculator(int age,double height,double weight)
    {
        double result;
        result=  66.47+ (13.75 * weight) + (5.0 * height) - (6.75 * age);

        return result;

    }
    public double Female_Cal_Calculator(int age,double height,double weight)
    {
        double result;

        result= 665.09 + (9.56 * weight) + (1.84 * height) - (4.67 * age);
        return result;

    }}
