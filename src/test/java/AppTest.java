import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Triangle Finder");
  }

  @Test
  public void triangleTestisAnIsosceles() {
    goTo("http://localhost:4567/");
    fill("#sideA").with("2");
    fill("#sideB").with("2");
    fill("#sideC").with("3");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is an isosceles!");
  }
  @Test
  public void triangleTestisAnEquilateral() {
    goTo("http://localhost:4567/");
    fill("#sideA").with("3");
    fill("#sideB").with("3");
    fill("#sideC").with("3");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is an equilateral!");
  }
  @Test
  public void triangleTestisAScalene() {
    goTo("http://localhost:4567/");
    fill("#sideA").with("2");
    fill("#sideB").with("4");
    fill("#sideC").with("3");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is a scalene!");
  }
  @Test
  public void triangleTestisNotATriangle() {
    goTo("http://localhost:4567/");
    fill("#sideA").with("2");
    fill("#sideB").with("2");
    fill("#sideC").with("7");
    submit(".btn");
    assertThat(pageSource()).contains("That's not a triangle!");
  }
}
