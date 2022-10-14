using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TrafficDelegateExample
{
    class Program
    {
        static void Main(string[] args)
        {
            TrafficSignal ts = new TrafficSignal();
            ts.IdentifySignal();
            ts.display();
            Console.ReadLine();
        }
    }
}
