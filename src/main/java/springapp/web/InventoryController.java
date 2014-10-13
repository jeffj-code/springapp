package springapp.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import springapp.service.ProductManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *  Process the request and return a ModelAndView object which the DispatcherServlet
 *  will render. A {@code null} return value is not an error: It indicates that
 *  this object completed request processing itself, thus there is no ModelAndView
 *  to render.
 *
 *  Note: This {@code Controller} is invoked by a {@code DispatcherServlet} that should expect a
 *  {@code ModelAndView} to be returned by {@linkplain Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)}.
 *
 *  @see org.springframework.web.servlet.mvc.Controller
 *  @see Controller#handleRequest
 */
public class InventoryController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    // The collection of products.
    private ProductManager productManager;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String now = (new java.util.Date()).toString();
        logger.info("returning hello view with " + now);


        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("products", this.productManager.getProducts());

        ModelAndView modelAndView = new ModelAndView("hello", "model", myModel);
        return modelAndView;
    }

    public void setProductManager(ProductManager productManager) {this.productManager = productManager;}

}