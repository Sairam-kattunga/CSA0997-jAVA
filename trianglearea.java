import java.util.Scanner;
class triangle
{
    double base,height;
    void getdata(double b,h);
    {
        base=b;
height=h;
    }
    double trianglearea()
    {
        double base,height;
        area = (0.5*base*height);
        return(area);
        
    }
}
class trianglearea
{
    public static void main(String[] args)
    {
        double b,h;
        triangle tri1=new triangle();
        tri1.getdata(5,4);
        a=tri1.trianglearea();
        System.out.println("Area: "+a);
    }
}
