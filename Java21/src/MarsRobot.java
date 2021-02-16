class MarsRobot {
			String status;
			int speed;
			float temperature;
			
// This is a method that triggers the status to "returning home" when temperature is set to less than -80
			
			void checkTemperature() {
				if (temperature < -80) {
					status = "returning home";
					speed = 5;
				}
			}

// This is a method that prints out the Status, Speed and Temperature when they are called by "showAttributes"			
			
			void showAttributes() {
				System.out.println("Status: " + status);
				System.out.println("Speed: " + speed);
				System.out.println("Temperature: " + temperature);
			}
}
