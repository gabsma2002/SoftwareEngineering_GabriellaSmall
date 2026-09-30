package project.api.ConceptualAPI;
import java.util.ArrayList;

public class ComputeWorkerPrototype implements ComputeWorkerAPI {
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
