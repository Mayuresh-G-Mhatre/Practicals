using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TemperatureConversion
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter Fahrenheit temperature : ");
            double fahrenheit = Convert.ToDouble(Console.ReadLine()); 
            double celsius = (fahrenheit - 32) * 5 / 9;
            Console.WriteLine("The converted Fahrenheit to Celsius temperature is : " + celsius); 
            Console.WriteLine("\n");
            Console.Write("Enter Celsius temperature : "); 
            celsius = Convert.ToDouble(Console.ReadLine()); 
            fahrenheit = (celsius * 9) / 5 + 32;
            Console.WriteLine("The converted Celsius to Fahrenheit temperature is : " + fahrenheit); 
            Console.ReadLine();
        }
    }
}
