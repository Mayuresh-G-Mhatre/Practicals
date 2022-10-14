using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TrafficDelegateExample
{
    public delegate void TrafficDel();
    class TrafficSignal
    {
        public static void Yellow()
        {
            Console.WriteLine("Yellow light signals to get ready");
        }
        public static void Green()
        {
            Console.WriteLine("Green light signals to go");
        }
        public static void Red()
        {
            Console.WriteLine("Red light signals to stop");
        }
        
        TrafficDel[] td = new TrafficDel[3];
        
        public void IdentifySignal()
        {
            td[0] = new TrafficDel(Yellow);
            td[1] = new TrafficDel(Green);
            td[2] = new TrafficDel(Red);
        }
        public void display()
        {
            td[0]();
            td[1]();
            td[2]();
        }
    }
}
