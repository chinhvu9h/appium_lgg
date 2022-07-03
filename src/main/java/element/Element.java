package element;

import common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Element {
    private By by;

    public Element(By by) {
        this.by = by;
    }

    private Element findElement() {
        return Constant.DRIVER.findElement(this.by);

    }

    public void click() {
        findElement().click();
    }

    public void wait(int seconds) {
        WebDriverWait wait = new WebDriverWait(Constant.DRIVER, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.by));
    }
}
