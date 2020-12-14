package test;

import java.util.Calendar;
import java.util.Date;

public class ECampaign {
    Date dateClose =null;
    public Date getDateClose(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020,12,26,56,56,56);
        dateClose = calendar.getTime();
        Date cdate = dateClose;
        return cdate;
    }
    public int computeTicketSold(){
        int tnum;
        tnum=computeTicketsLeft();
        return tnum;
    }
    protected int computeTicketsLeft(){
        return 0;
    }
}
