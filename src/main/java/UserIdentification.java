public class UserIdentification extends CheckoutStep {
  private static UserIdentification userIdentification = new UserIdentification();

  private UserIdentification() {
  };

  public static UserIdentification getInstance() {
    return userIdentification;
  }
}
