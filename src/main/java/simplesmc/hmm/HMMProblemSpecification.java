package simplesmc.hmm;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.tuple.Pair;

import simplesmc.ProblemSpecification;
import simplesmc.pmcmc.WithSignature;


/**
 * The specification of an SMC algorithm based on an HMM.
 * 
 * More precisely, this builds the so called 'bootstrap sampler'
 * which consists in sampling from the transition probability, and
 * updating the weights with the emission probability.
 * 
 * Note that it does not requires the HMMParams' state space to 
 * be finite.
 * 
 * @author Alexandre Bouchard (alexandre.bouchard@gmail.com)
 *
 */
public class HMMProblemSpecification
  
{
  private final HMMParams parameters;
  private final List<Integer> observations;
  
  public HMMProblemSpecification(HMMParams parameters, List<Integer> observations)
  {
    this.parameters = parameters;
    this.observations = observations;
  }
  
  
}
