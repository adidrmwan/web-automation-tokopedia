package test.automation.hooks;

import io.cucumber.java.After;
import org.springframework.beans.factory.annotation.Autowired;
import test.automation.driver.DriverPool;

import java.util.Optional;

public class BaseDriverHooks {
    @Autowired
    DriverPool driverPool;

    @After
    public void afterTest() {
        quitWebdrivers(driverPool);
    }

    public void quitWebdrivers(DriverPool drivers) {
        Optional.ofNullable(drivers.getWebDriver())
                .ifPresent(
                        driver -> {
                            driver.quit();
                            drivers.setWebDriver(null);
                        });
    }


}