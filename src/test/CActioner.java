package test;

import java.util.Date;

public class CActioner {
    private ECampaign theCampaign;
    public  CActioner(){
        theCampaign = new EBonusCampaign();
    }
    public int getTickets(){
        int tnum;
        tnum = theCampaign.computeTicketSold();
        return tnum;
    }

    public Date getCampaignClose(){
        Date cdate;
        cdate = theCampaign.getDateClose();
        return cdate;
    }

}
