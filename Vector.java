public class Vector {
    double x;
    double y;
    double z;
    void creatVector(double x,double y, double z)//initialize the vector
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
        vector.creatVector(x,y,z);//initialize the result
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
        double dotProduct = dotProduct(vector1,vector2);
        double cosValue = dotProduct / (vector1.getModule() * vector2.getModule());
        if (cosValue == 1.0000000000000002)
        {   //the value of cosValue somehow larger than 1.0
            //while using var / (Math.pow(var,0.5)*Math.pow(var,0.5))
            return Math.acos((float)cosValue);
        }
        else
            return Math.acos(cosValue);
    }

    public static void main(String[] args) //test class Vector and the commands in it
    {
        Vector a = new Vector();
        Vector b = new Vector();
        a.creatVector(0, 0, 1);
        b.creatVector(1, 0, 0);
        Vector c = Vector.add(a, b);
        double d = Vector.dotProduct(a, b);
        double A = Vector.getAngle(a, b);
        double B = a.getModule();
        System.out.println(c.x + " " + c.y + " " + c.z + " " + d + " " + A + " " + B + " ");
    }
}
