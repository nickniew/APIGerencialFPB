package nickniew.feedplayback.apigerencial.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Nickniew
 */
@Controller
public class HomeView {

    @GetMapping("/hello")
    @ResponseBody
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView("index.xhtml");
        return modelAndView;
    }

}
