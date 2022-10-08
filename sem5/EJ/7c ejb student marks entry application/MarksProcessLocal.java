package p2;

import javax.ejb.Local;

@Local
public interface MarksProcessLocal {

    String addMarks(String rollno, String sub1, String sub2, String sub3);
}