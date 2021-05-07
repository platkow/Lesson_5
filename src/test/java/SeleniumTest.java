import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest extends SeleniumTestBase{

    @Test
    public void shouldOpenGoogleWebsite() {
        getDriver().get("https://www.google.com/");
        assertEquals(getDriver().getCurrentUrl(), "https://www.google.com/");
    }

    @Test
    public void shouldOpenGoogleWebsiteAndFail() {
        getDriver().get("https://stackoverflow.com/");
        assertEquals(2, 4);
    }
}
