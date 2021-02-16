class MarsApplication {
	public static void main(String[] arguments) {
// 1st Mars Rover added named "Spirit" Setting attributes
		MarsRobot spirit = new MarsRobot();
		spirit.status = "Exploring";
		spirit.speed = 2;
		spirit.temperature = -60;
		
// Showing attributes, sending messages to console, and then changing attributes
		
		spirit.showAttributes();
		System.out.println("Incresing speed to 3.");
		spirit.speed = 3;
		spirit.showAttributes();
		System.out.println("Changing temperature to -90.");
		
// this change will trigger the checkTemperature Method in MarsRobot Class
		
		spirit.temperature = -90;
		spirit.showAttributes();
		System.out.println("Checking the temperature.");
		spirit.checkTemperature();
		spirit.showAttributes();
		
// 2nd Mars Rover added named "opportunity" setting attributes and displaying on console
		
		MarsRobot opportunity = new MarsRobot();
		opportunity.status = "Idle";
		opportunity.speed = 0;
		opportunity.temperature = -60;
		
		opportunity.showAttributes();
	}
}