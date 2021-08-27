package Week3.Day2;

public class DesktopAssignment extends StudentsAssignment implements HardwareAssignment,SoftwareAssignment {
	

	
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Keyboard");
		System.out.println("Mouse");
		System.out.println("CPU");
		
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Chrome");
		System.out.println("Google");
		System.out.println("VLC Player");
	}
	public void desktopModel()
	{
		System.out.println("Lenovo");
		System.out.println("HP");
		System.out.println("Dell");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesktopAssignment D=new DesktopAssignment();
		System.out.println("******HaedWare******");
		D.hardwareResources();
		System.out.println("******Software******");
		D.softwareResources();
		System.out.println("*******Desktop*****");
		D.desktopModel();

	}


}

