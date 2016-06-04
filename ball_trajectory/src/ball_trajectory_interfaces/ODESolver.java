package ball_trajectory_interfaces;

public interface ODESolver {
	public void initialize (double stepSize);
	public double step();
	public void setStepSize(double stepSize);
	public double getStepSize();
}
