package ball_trajectory_Classes;

import org.opensourcephysics.numerics.ODE;

public class Decay implements ODE {
	double k; // decay constant
	public double[] state = new double[2]; // [ particle number, time]
	
	public Decay() {
		k = 1; // decay constant
		state [0] = 1.0; // particle number
		state [1] = 0; // time
	}
	public double[] getState() {
		return state;
	}
	public void getRate(double[] state, double[] rate) {
		rate[0] = -k * state [0]; // dN/dt = −kN
		rate [1] = 1; // dt/dt = 1
	}
}
