package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class controladorInicio {

    @GetMapping("/index")
    public String inicio() {
        log.info("prueba 1");
        return "index";
    }

    @GetMapping("/registro")
    public String registro() {
        log.info("prueba 2");
        return "registro";
    }
    
    @GetMapping("/cliente")
    public String cliente() {
        log.info("prueba 3");
        return "cliente";
    }
    
    @GetMapping("/admin")
    public String admin() {
        log.info("prueba a");
        return "admin";
    }

}
