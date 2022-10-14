using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Inheritance
{
    public class BaseClass
    {
        public int DataMember;
        public void BaseClassMethod()
        {
            Console.WriteLine("This is a Base Class Method");
        }
    }

    public class DerivedClass : BaseClass
    {
        public void DerivedClassMethod()
        {
            Console.WriteLine("This Derived Class Method ");
        }
    }
    
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Accessing Base CLass Object:"); 
            BaseClass b = new BaseClass();
            b.DataMember = 1; 
            b.BaseClassMethod(); 
            Console.WriteLine(" ");
            Console.WriteLine("Accessing Derived CLass Object:"); 
            DerivedClass d = new DerivedClass(); 
            d.DataMember = 2;
            d.BaseClassMethod(); 
            d.DerivedClassMethod(); 
            Console.ReadLine();
        }
    }
}
