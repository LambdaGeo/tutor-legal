package br.ufma.ecp.sistemalegal;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 

 
@RestController
public class TutorController {
 
    private TutorService service;
 
    public TutorController(TutorService service) {
        this.service = service;
    }
 
    @PostMapping("/tutor")
    private Reclusao getDiscountPercent(@RequestBody NaturezaCrime natureza) {      
        Reclusao r = new Reclusao();
        this.service.applyRule(natureza, r);
        return r;
    }
}