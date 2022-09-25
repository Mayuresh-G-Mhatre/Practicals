using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p1c
{
    class Program
    {
        public struct student
        {
            public String studentID, studentName, courseName, dob;
        }

        static void Main(string[] args)
        {
            student[] s = new student[5];

            for (int i = 0; i < 2; i++)
            {
                Console.Write("Enter Student ID: ");
                s[i].studentID = Console.ReadLine();
                Console.Write("Enter Student Name: ");
                s[i].studentName = Console.ReadLine();
                Console.Write("Enter Course Name: ");
                s[i].courseName = Console.ReadLine();
                Console.Write("Enter Date Of Birth: ");
                s[i].dob = Console.ReadLine();
                Console.WriteLine();
            }

            Console.WriteLine("\nStudent's List: \n");

            for (int i = 0; i < 2; i++)
            {
                Console.WriteLine("Student ID: " + s[i].studentID);
                Console.WriteLine("Student Name: " + s[i].studentName);
                Console.WriteLine("Course Name: " + s[i].courseName);
                Console.WriteLine("Enter Date Of Birth: " + s[i].dob);
                Console.WriteLine();
            }

            Console.ReadKey();
        }
    }
}
