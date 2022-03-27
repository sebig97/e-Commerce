package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import testbase.BaseClass;

public class Hooks {

    @Before
    public void start() {
        BaseClass.setUp();
    }

    @After
    public void end() {
        BaseClass.tearDown();
    }
}
