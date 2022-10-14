using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CurrencyConversion
{
    class Program
    {
        static void Main(string[] args)
        {
            int choice;
            Console.WriteLine("Enter your Choice:\n1 - Dollar to Rupee\n2 - Euro to Rupee\n3 - Malaysian Ringgit to Rupee");
            choice = int.Parse(Console.ReadLine());
            switch (choice)
            {
                case 1:
                    Double dollar, rupee, val;
                    Console.WriteLine("Enter the Dollar Amount :");
                    dollar = Double.Parse(Console.ReadLine());
                    Console.WriteLine("Enter the Dollar Value :");
                    val = double.Parse(Console.ReadLine());
                    rupee = dollar * val;
                    Console.WriteLine("{0} Dollar Equals {1} Rupees", dollar, rupee);
                    break;
                case 2:
                    Double Euro, rupe, valu;
                    Console.WriteLine("Enter the Euro Amount :");
                    Euro = Double.Parse(Console.ReadLine());
                    Console.WriteLine("Enter the Euro Value :");
                    valu = double.Parse(Console.ReadLine());
                    rupe = Euro * valu;
                    Console.WriteLine("{0} Euro Equals {1} Rupees", Euro, rupe);
                    break;
                case 3:
                    Double ringit, rup, value;
                    Console.WriteLine("Enter the Ringgit Amount :");
                    ringit = Double.Parse(Console.ReadLine());
                    Console.WriteLine("Enter the Ringgit Value :");
                    value = double.Parse(Console.ReadLine());
                    rup = ringit * value;
                    Console.WriteLine("{0} Malaysian Ringgit Equals {1} Rupees", ringit, rup);
                    break;
            }
            Console.ReadLine();
        }
    }
}
