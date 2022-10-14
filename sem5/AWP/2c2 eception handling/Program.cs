using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace prac2c
{
    class Program
    {
        static void Main(string[] args)
        {
            int num;
            Console.WriteLine("Enter a number: "); 
            num = int.Parse(Console.ReadLine()); 
            int div = 0;
            try
            {
                div = 100 / num;
            }
            catch (DivideByZeroException)
            {
                Console.WriteLine("Exception occured");
            }
            Console.WriteLine("Result is: " + div); 
            Console.WriteLine("press enter to quit!!"); 
            Console.ReadLine();
        }
    }
}

