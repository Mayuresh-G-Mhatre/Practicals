using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _2a1
{
    class Program
    {
        static void Main(string[] args)
        {
            int i, number, fact;
            Console.Write("Enter a number: ");
            number = int.Parse(Console.ReadLine());
            fact = 1;
            for (i = 1; i <= number; i++)
            {
                fact = fact * i;
            }
            Console.WriteLine("\nFactorial of given number is: " + fact);
            Console.ReadLine();
        }
    }
}
