package p1;

import java.util.Date;
import javax.ejb.Local;

@Local
public interface RmRegLocal 
{
    String addRoomReg(String uname,Date dt, int roomno);
}
