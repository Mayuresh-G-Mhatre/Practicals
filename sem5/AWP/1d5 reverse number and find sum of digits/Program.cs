using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _1d5
{
    class Program
    {
        static void Main(string[] args)
        {
            int n, m;
            int sum = 0;
            int rev = 0;
            Console.Write("Enter any number: ");
            n = Convert.ToInt32(Console.ReadLine());

            while (n > 0)
            {
                m = n % 10;
                sum += m;
                rev = rev * 10 + m;
                n = n / 10;
            }

            Console.WriteLine("The reverse of number is: {0}", rev);
            Console.WriteLine("The sum of number is: {0}", sum);
            Console.ReadLine();
        }
    }
}
