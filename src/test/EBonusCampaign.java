package test;

import java.util.Calendar;
import java.util.Date;

public class EBonusCampaign extends ECampaign {
    Date cdate,dateClose;
    int numTickets,numTicketsSold;
    public EBonusCampaign(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020,11,25,59,59,59);
        dateClose = calendar.getTime();
        numTickets=10000;
        numTicketsSold=7500;
    }
    protected int computeTicketsLeft(){
        int tnum;
        tnum = numTickets-numTicketsSold;  //返回剩余数目
        return tnum;
    }
    public Date getDateClose(){
        if (super.getDateClose().compareTo(dateClose)<0)
            cdate=dateClose;
        else
            cdate=super.getDateClose();
        return cdate;
    }

}
