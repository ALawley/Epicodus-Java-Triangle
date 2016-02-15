import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_initiatesCorrectly() {
    Triangle testTriangle = new Triangle (2, 3, 4);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void isEquilateral_whenNotaEquilateral_false() {
    Triangle testTriangle = new Triangle (2, 3, 4);
    assertEquals(false, testTriangle.isEquilateral());
  }

  @Test
  public void isEquilateral_whenAEquilateral_true() {
    Triangle testTriangle = new Triangle (2, 2, 2);
    assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
  public void isIscosceles_whenNotaIscosceles_false() {
    Triangle testTriangle = new Triangle (2, 3, 4);
    assertEquals(false, testTriangle.isIsosceles());
  }

  @Test
  public void isIscosceles_wheIscosceles_true() {
    Triangle testTriangle = new Triangle (3, 3, 4);
    assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
  public void isScalene_whenNotScalene_false() {
    Triangle testTriangle = new Triangle (3, 3, 4);
    assertEquals(false, testTriangle.isScalene());
  }

  @Test
  public void isScalene_whenScalene_true() {
    Triangle testTriangle = new Triangle (2, 3, 4);
    assertEquals(true, testTriangle.isScalene());
  }

  @Test
  public void isTriangle_whenNotTriangle_false() {
    Triangle testTriangle = new Triangle (2, 2, 8);
    assertEquals(false, testTriangle.isTriangle());
  }

  @Test
  public void isTriangle_whenTriangle_true() {
    Triangle testTriangle = new Triangle (2, 2, 3);
    assertEquals(true, testTriangle.isTriangle());
  }
}
