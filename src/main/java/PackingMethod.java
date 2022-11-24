public class PackingMethod extends CheckoutStep {

  private static PackingMethod packingMethod = new PackingMethod();

  private PackingMethod() {
  };

  public static PackingMethod getInstance() {
    return packingMethod;
  }

}
