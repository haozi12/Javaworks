package com.haozi12;

public class Vector {
    double x;
    double y;
    double z;
    void createVector(double x,double y, double z)//initialize the vector
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector add (Vector vector1,Vector vector2)
    {
        Vector vector = new Vector();
        double x = vector1.x + vector2.x;
        double y = vector1.y + vector2.y;
        double z = vector1.z + vector2.z;
        vector.createVector(x,y,z);//initialize the result
        return vector;
    }

    public static double dotProduct(Vector vector1, Vector vector2)
    {
        double a = vector1.x * vector2.x;
        double b = vector1.y * vector2.y;
        double c = vector1.z * vector2.z;
        return a + b + c;
    }

    double getModule()
    {
        return Math.pow(Math.pow(this.x,2) + Math.pow(this.y,2) + Math.pow(this.z,2),0.5);
    }

    public static double getAngle(Vector vector1 , Vector vector2)
    {
        double dotProduct = dotProduct(vector1, vector2);
        double cosValue = dotProduct / (vector1.getModule() * vector2.getModule());
        if (cosValue == 1.0000000000000002)
            return Math.acos((float) cosValue);
        else
            return Math.acos(cosValue);
    }

    public static Vector multipliedByReal(double real, Vector vector)
    {
        double a = real * vector.x;
        double b = real * vector.y;
        double c = real * vector.z;
        Vector vector1 = new Vector();
        vector1.createVector(a,b,c);
        return vector1;
    }

    public static void showVector(Vector vector)
    {
        System.out.println(vector.x + " " + vector.y + " " + vector.z );
    }

    public static Vector crossProduct(Vector vector1, Vector vector2)
    {
        double a = vector1.y * vector2.z - vector1.z * vector2.y;
        double b = vector1.z * vector2.x - vector1.x * vector2.z;
        double c = vector1.x * vector2.y - vector1.y * vector2.x;
        Vector vector = new Vector();
        vector.createVector(a,b,c);
        return vector;
    }
}
