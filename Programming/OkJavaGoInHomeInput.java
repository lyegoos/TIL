import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {
	
	// args = parameter, 매개변수
	public static void main(String[] args) {
		
		//String id = JOptionPane.showInputDialog("Enter a ID");	// 사용자의 입력을 받아 String으로 저장
		//String bright = JOptionPane.showInputDialog("Enter a bright level");
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator call myElevator는 Elevator 타입에 해당되는 데이터만 올 수 있는 변수
		Elevator myElevator = new Elevator(id);
				
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floor Lamp");
		floorLamp.on();

		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	}

}
