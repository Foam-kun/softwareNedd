package work;

import java.util.Date;

public interface ECampaign {

    public Date getDateClose();
    public int computeTicketSold();
    public int computeTicketsLeft();
}
