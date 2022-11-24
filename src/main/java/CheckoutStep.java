import java.util.ArrayList;
import java.util.List;

public abstract class CheckoutStep {

  private List<Checkout> pendingCheckouts = new ArrayList<Checkout>();

  public void addPendingCheckout(Checkout checkout) {
    this.pendingCheckouts.add(checkout);
  }

  public boolean verifyPendingCheckout(Checkout checkout) {
    return this.pendingCheckouts.contains(checkout);
  }
}
