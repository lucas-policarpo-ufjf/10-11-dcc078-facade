public class CheckoutFacade {
  public static boolean verifyCheckout(Checkout checkout) {
    if (PaymentMethod.getInstance().verifyPendingCheckout(checkout)) {
      return false;
    }
    if (PackingMethod.getInstance().verifyPendingCheckout(checkout)) {
      return false;
    }
    if (UserIdentification.getInstance().verifyPendingCheckout(checkout)) {
      return false;
    }

    return true;
  }
}
