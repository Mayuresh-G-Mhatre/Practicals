using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p1b
{
    class Program
    {
        static void Main(string[] args)
        {
            int rollNo;
            String name;

            Console.Write("Name: ");
            name = Console.ReadLine();
            Console.Write("Roll No.: ");
            rollNo = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine();
            Console.WriteLine("Your name is: " + name);
            Console.WriteLine("Your roll no. is: " + rollNo);
            Console.ReadKey();
        }
    }
}
