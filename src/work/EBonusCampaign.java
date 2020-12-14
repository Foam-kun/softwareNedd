package work;

import java.util.Calendar;
import java.util.Date;

public class EBonusCampaign implements ECampaign{
    Date cdate,dateClose,dateClose_super;
    int numTickets,numTicketsSold;

    public EBonusCampaign(){
        Calendar calendar = Calendar.getInstance();
        //改编前子类截至时间
        calendar.set(2020,11,25,59,59,59);
        dateClose = calendar.getTime();

        //初始参数设置
        numTickets=10000;
        numTicketsSold=7500;

        //改编前父类截至时间
        Calendar calendar_super = Calendar.getInstance();
        calendar_super.set(2020,12,26,56,56,56);
        dateClose_super=calendar_super.getTime();
    }

    public Date getDateClose(){
        if (dateClose_super.compareTo(dateClose)<0)
            cdate=dateClose;
        else
            cdate=dateClose_super;
        return cdate;
    }

    //这个方法不用实现
    public int computeTicketSold() {
        return 0;
    }

    public int computeTicketsLeft() {
        int tnum;
        tnum = numTickets-numTicketsSold;  //返回剩余数目
        return tnum;
    }
}
