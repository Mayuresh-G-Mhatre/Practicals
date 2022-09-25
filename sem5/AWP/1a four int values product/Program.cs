using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p1a
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b, c, d, product;
            Console.WriteLine("Enter 4 numbers: ");
            a = Convert.ToInt32(Console.ReadLine());
            b = Convert.ToInt32(Console.ReadLine());
            c = Convert.ToInt32(Console.ReadLine());
            d = Convert.ToInt32(Console.ReadLine());
            product = a * b * c * d;
            Console.WriteLine("The product of 4 numbers is: " + product);
            Console.ReadLine();
        }
    }
}
