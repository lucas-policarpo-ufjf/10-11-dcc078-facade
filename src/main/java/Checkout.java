public class Checkout {
  public boolean complete() {
    return CheckoutFacade.verifyCheckout(this);
  }
}
