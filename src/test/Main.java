package test;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CActioner theAction = new CActioner();
        int a = theAction.getTickets();
        Date date =theAction.getCampaignClose();
        System.out.println(a);
        System.out.println(date);
    }
}
