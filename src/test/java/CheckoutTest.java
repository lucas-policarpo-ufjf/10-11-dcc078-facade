import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckoutTest {
  @Test
  void shouldReturnPendingWithPackingMethod() {
    Checkout checkout = new Checkout();
    PackingMethod.getInstance().addPendingCheckout(checkout);

    assertEquals(false, checkout.complete());
  }

  @Test
  void shouldReturnPendingWithPaymentMethod() {
    Checkout checkout = new Checkout();
    PaymentMethod.getInstance().addPendingCheckout(checkout);

    assertEquals(false, checkout.complete());
  }

  @Test
  void shouldReturnPendingWithUserIdentification() {
    Checkout checkout = new Checkout();
    UserIdentification.getInstance().addPendingCheckout(checkout);

    assertEquals(false, checkout.complete());
  }

  @Test
  void shouldCompleteCheckoutCorrectlyWhenPendings() {
    Checkout checkout = new Checkout();

    assertEquals(true, checkout.complete());
  }

}
