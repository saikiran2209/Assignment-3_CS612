package InheritanceLab;

public class Surgeon extends HospitalEmployee {
	private boolean isOperating;
	private String speciality;
	public Surgeon(String name, int number, String speciality, boolean isOperating) {
		super(name,number);
		this.isOperating=isOperating;
		this.speciality=speciality;
	}
@Override
public String toString()
{
	return super.toString() +" "+ speciality +"Operating:" + Boolean.toString(isOperating);
}
}