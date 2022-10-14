using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConstructorOverloading
{
    class Program
    {
        public Program() 
        {
            Console.WriteLine("This is Default Constructor");
        }
        public Program(int a)
        {
            Console.WriteLine("This Constructor has One Parameter");
        }
        public Program(int b, double c)
        {
            Console.WriteLine("This Constructor has two Parameter");
        }
        
        static void Main(string [] args)
        {
            Program p = new Program();
            Program p1= new Program(10);
            Program p2= new Program(1,1.001);
            Console.ReadLine();
        }
    }
}
