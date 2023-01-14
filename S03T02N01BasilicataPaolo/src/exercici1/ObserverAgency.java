package exercici1;

public class ObserverAgency implements Observer{
	private String name;

	public ObserverAgency(String agencyName) {
		this.name = agencyName;
	}
	@Override
	public void notifica(Object val) {
		// TODO Auto-generated method stub
		System.out.println(name + " notified, new value: " + (float)val);
	}

}