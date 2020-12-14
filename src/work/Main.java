package work;

import test.CActioner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        test.CActioner theAction = new CActioner();
        int a = theAction.getTickets();
        Date date =theAction.getCampaignClose();
        System.out.println(a);
        System.out.println(date);
    }
}
