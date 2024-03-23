package nickniew.feedplayback.apigerencial.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Nickniew
 */
@Controller
public class CupomView {

    @GetMapping("/cupom")
    public String cupom() {
        return "cupom";
    }
}
