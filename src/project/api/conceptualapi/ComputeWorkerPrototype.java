package project.api.conceptualapi;
import project.annotations.ConceptualAPIPrototype;
public class ComputeWorkerPrototype {
    @ConceptualAPIPrototype 
    public void run(ComputeWorkerAPI worker) {
        ComputeResponse computeResponse = worker.computeFactors(new ComputeRequest() {
            public int getNumber() {
                return 12;
            }
        });
        System.out.println("Factors of 12: " + computeResponse.getFactors());
    }
    
}
