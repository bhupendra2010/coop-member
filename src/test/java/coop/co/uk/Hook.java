package coop.co.uk;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void open() {
        driverFactory.openbrowser();

    }
   // @After
    public void close(){
        driverFactory.closebrowser();
    }
}