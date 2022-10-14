using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace function_overload
{
    public class Shape
    {
        public void Area(int side)
        {
            int SqArea = side * side;
            Console.WriteLine("The area of square is: " + SqArea);
        }
        public void Area(int l, int b)
        {
            int RectArea = l * b;
            Console.WriteLine("The area of rectangle is: " + RectArea);
        }
        public void Area(double r)
        {
            double CircArea = 3.14 * r * r;
            Console.WriteLine("The Area of circle is: " + CircArea);
        }
        public void Area(double b, double h)
        {
            double TriArea = (b * h) / 2;
            Console.WriteLine("The area of triangle is: " + TriArea); 
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Shape s = new Shape(); 
            s.Area(15);
            s.Area(12, 10);
            s.Area(10.5);
            s.Area(10.2, 10.2);
            Console.ReadLine();
        }
    }
}

