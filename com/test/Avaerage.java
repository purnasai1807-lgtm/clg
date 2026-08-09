package com.test;
public class Avaerage {

public static double   avg (int...a) {
double sum=0.0;
for(int i=0;i<a.length;i++)
{
sum+=a[i];
}
        return(double)sum/a.length;
    }

    public static void main(String[] args) {
        System.out.println("The average is:"+avg(5, 10) );
    }
}

