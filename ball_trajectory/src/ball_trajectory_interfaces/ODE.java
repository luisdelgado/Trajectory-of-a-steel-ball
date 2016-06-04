package ball_trajectory_interfaces;

public interface ODE {
	public double[] getState();
	public void getRate(double[] state, double[] rate);
}
