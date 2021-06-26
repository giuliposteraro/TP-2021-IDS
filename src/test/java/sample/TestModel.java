import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import sample.entity.Item;
import sample.model.Cart;

public class TestModel {

  @Test
  public void addItemToCartShouldIncrementItsSize() {
    Cart cart = new Cart();

    assertTrue(cart.isEmpty());

    Item itemToAdd = new Item();

    cart.addItem(itemToAdd, true);

    assertEquals(cart.getNumberOfItems(), 1);
  }
}
