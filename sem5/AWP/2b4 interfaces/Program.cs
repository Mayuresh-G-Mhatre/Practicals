using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace interfaces
{
    public interface Channel
    {
        void Next(); 
        void Previous();
    }
    public interface Book
    {
        void Next(); 
        void Chapter();
    }
    class Program : Channel, Book
    {
        void Channel.Next()
        {
            Console.WriteLine("Channel Next");
        }
        void Book.Next()
        {
            Console.WriteLine("Book Next");
        }
        public void Previous()
        {
            Console.WriteLine("Previous");
        }
        public void Chapter()
        {
            Console.WriteLine("Chapter");
        }
        static void Main(string[] args)
        {
            Program p = new Program(); 
            ((Channel)p).Next();
            ((Book)p).Next(); 
            p.Previous();
            p.Chapter(); 
            Console.ReadLine();
        }
    }
}
