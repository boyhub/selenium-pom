package uk.sponte.automation.seleniumpom;

import org.openqa.selenium.SearchContext;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by n450777 on 07/04/15.
 */
public class ElementListImpl {

    public ElementListImpl(
            SearchContext searchContext,
            List webElementListProxy) {
    }

    public boolean canHandle(Method method) {
        return false;
    }
}
