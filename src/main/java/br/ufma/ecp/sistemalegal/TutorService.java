package br.ufma.ecp.sistemalegal;



import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;
 

 
@Service
public class TutorService {
 
    private final KieContainer kieContainer;
 
    public TutorService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }
 
    public void applyRule(NaturezaCrime ob, Reclusao r) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(ob);
        kieSession.insert(r);
        kieSession.fireAllRules();
        
        kieSession.dispose();
    }
}