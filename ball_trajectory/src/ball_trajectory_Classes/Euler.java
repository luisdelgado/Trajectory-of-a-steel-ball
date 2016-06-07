package ball_trajectory_Classes;

import org.opensourcephysics.numerics.ODE;
import org.opensourcephysics.numerics.ODESolver;

public class Euler extends Object implements ODESolver{

	private double stepSize = 0.1;
	private int numberOfEquations = 0;
	private double[] rate;
	private ODE ode;

	public Euler(ODE _ode){
		ode = _ode;
		numberOfEquations = ode.getState().length;
		rate = new double[numberOfEquations];
	}
	public double step(){
		double[] state = ode.getState();
		ode.getRate(state , rate );

		for (int i = 0; i< numberOfEquations; i++) {
			state [ i ] = state [ i ] + stepSize * rate[ i ];
		}
		return stepSize;
	}
	public void setStepSize(double _stepSize){
		stepSize = _stepSize ;
	}
	public void initialize (double stepSize){
		setStepSize(stepSize);
	}
	public double getStepSize() {
		return stepSize;
	}
}
