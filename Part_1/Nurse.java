package InheritanceLab;

public class Nurse extends HospitalEmployee {
	private int numOfpatients;
	public Nurse(String name, int number, int numOfpatients) {
		super(name, number);
		this.numOfpatients=numOfpatients;
	}
@Override
public String toString()
{
	return name + " has " + Integer.toString(numOfpatients) + " patients";
}
}
