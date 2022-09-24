package p1;

import java.util.*;
import javax.ejb.Stateful;

@Stateful
public class RmReg implements RmRegLocal   
{
    private Vector<Reg> regs = new Vector<Reg>();
    @Override
    public String addRoomReg(String uname, Date dt, int roomno)
    {
        for(Reg reg :regs)
        {
            if(reg.getRdate().equals(dt) && reg.getRoomno()==roomno)
            {
                return "ROOM NOT AVALIABLE FOR SELECTED DATE";
            }
        }
        Reg r1 = new Reg(uname,dt,roomno);
        regs.add(r1);
        return "ROOM BOOKED FOR SELECTED DATE";
    }
  }
    
class Reg
{
    private String uname;
    private Date rdate;
    private int roomno;

    public Reg(String uname, Date rdate, int roomno) {
        this.uname = uname;
        this.rdate = rdate;
        this.roomno = roomno;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public Date getRdate() {
        return rdate;
    }
    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }
    public int getRoomno() {
        return roomno;
    }
    public void setRoomno(int roomno) {
        this.roomno = roomno;
    }
}
