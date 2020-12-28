import java.util.ArrayList;

public class Guardian {
    String id;
    ArrayList<Visitor>visitors;
    BillingAccount billingAccount;

    private void updateTotalAmount(int deltaAmount){
        billingAccount.updateTotalAmount(deltaAmount);
    }

}

