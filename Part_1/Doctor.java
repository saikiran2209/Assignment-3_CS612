package InheritanceLab;

public class Doctor extends HospitalEmployee {
	private String speciality;
	public Doctor(String name, int number, String speciality) {
		super(name, number);
		this.speciality=speciality;
	}
@Override
public String toString()
{
	return super.toString() + " " +speciality +" ";
}
}
