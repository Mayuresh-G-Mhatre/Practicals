using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _1d3
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter a character: ");
            char ch = Convert.ToChar(Console.ReadLine());
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
            {
                Console.WriteLine("{0} is a vowel!", ch);
            }
            else
            {
                Console.WriteLine("{0} is not a vowel!", ch);
            }
            Console.ReadLine();
        }
    }
}
