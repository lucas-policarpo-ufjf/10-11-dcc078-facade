public class PaymentMethod extends CheckoutStep {

  private static PaymentMethod paymentMethod = new PaymentMethod();

  private PaymentMethod() {
  };

  public static PaymentMethod getInstance() {
    return paymentMethod;
  }

}
