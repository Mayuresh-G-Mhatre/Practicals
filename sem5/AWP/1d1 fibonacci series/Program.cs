using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p1d1
{
    class Program
    {
        static void Main(string[] args)
        {
            int first=1, second=1, total, n;
            Console.Write("Enter the no.of terms: ");
            n = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Fibonacci Series: ");
            if (n == 1)
            {
                Console.WriteLine(1);
            }
            else if (n == 2)
            {
                Console.WriteLine(1);
                Console.WriteLine(2);
            }
            else
            {
                Console.WriteLine(1);
                Console.WriteLine(2);
                for (int i = 0; i < (n - 2); i++)
                {
                    total = first + second;
                    Console.WriteLine(total);
                    first = second;
                    second = total;
                }
            }

            Console.ReadLine();
        }
    }
}
