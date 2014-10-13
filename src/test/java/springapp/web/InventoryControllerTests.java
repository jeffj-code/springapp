package springapp.web;

import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;
import springapp.service.SimpleProductManager;

import java.util.Map;

/** InventoryControllerTests
 *
 *@author Jeffrey Johnson
 */
public class InventoryControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception {

        // Get an empty InventoryController, a List container for <Product>
        InventoryController controller = new InventoryController();
        controller.setProductManager(new SimpleProductManager());
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}