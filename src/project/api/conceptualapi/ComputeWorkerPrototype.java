package project.api.conceptualapi;
import java.util.ArrayList;

import project.annotations.ConceptualAPI;
import project.annotations.ConceptualAPIPrototype;
@ConceptualAPI 
public class ComputeWorkerPrototype implements ComputeWorkerAPI {
    @ConceptualAPIPrototype
    public void prototype(ComputeWorkerAPI api) {
        api.computeFactors(84);
    }

    @Override 
    public ArrayList<Integer> computeFactors(int number) {
        //return a dummy list of factors
        ArrayList factors = new ArrayList<>();
        factors.add(1);
        factors.add(2);
        factors.add(3);
        factors.add(4);
        return factors;
    }

    
}
