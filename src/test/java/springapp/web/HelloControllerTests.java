package springapp.web;

import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;

public class HelloControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception {
        InventoryController controller = new InventoryController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}