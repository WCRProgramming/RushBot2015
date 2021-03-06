package org.usfirst.frc.team5492.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//CANs
	/* Practice Robot
	 * //DriveTrain
	public static int front_left_motor_CAN = 4;
	public static int back_left_motor_CAN = 0;
	public static int front_right_motor_CAN = 1;
	public static int back_right_motor_CAN = 2;
	//Elevator
	public static int Elevator_Motor1_CAN = 5;
	public static int Elevator_Motor2_CAN = 6;
	//Claw
	public static int Claw_Motor_CAN = 3;
	*/
	//DriveTrain
	public static int front_left_motor_CAN = 2;
	public static int back_left_motor_CAN = 1;
	public static int front_right_motor_CAN = 0;
	public static int back_right_motor_CAN = 3;
	//Elevator
	public static int Elevator_Motor1_CAN = 4;
	public static int Elevator_Motor2_CAN = 6;
	//Claw
	public static int Claw_Motor_CAN = 5;
	//Wheel Arm
	public static int Wheel_Motor1_CAN = 0;
	public static int Wheel_Motor2_CAN = 0;
	public static int Wheel_Motor3_CAN = 0;
	public static int Wheel_Motor4_CAN = 0;
	
	//Current IDs
	//DriveTrain
	public static int front_left_current = 2;
	public static int back_left_current = 3;
	public static int front_right_current =2;
	public static int back_right_current = 1;
	/*
	//Elevator
	public static int elevator_motor1_current =3;
	public static int elevator_motor2_current = 2;
	//Claw
	public static int claw_motor_current = 10;
	*/
	//Elevator
	public static int elevator_motor1_current =13;
	public static int elevator_motor2_current = 12;
	//Claw
	public static int claw_motor_current  = 0;;
	//Wheel Arm
	public static int wheel_motor1_current = 4;
	public static int wheel_motor2_current = 5;
	public static int wheel_motor3_current = 6;
	public static int wheel_motor4_current = 7;
	
	//Max/Min Currents
	//Claw
	public static double claw_max_current = 15;
	//Elevator
	public static double elevator_max_current = 25;
	
	//Digital Inputs
	//Claw
	public static int claw_max_LS = 0;
	public static int claw_min_LS = 0;
	//Elevator
	public static int elevator_max_LS = 0;
	public static int elevator_min_LS = 1;
	
	//Analog Inputs
	//DriveTrain
	public static int gyro = 0;
	//Elevator
    public static int Elevator_Pot_AI = 1;
    //Claw
    public static int Claw_Pot_AI = 0;
    //Wheel Arm
    public static int Wheel_Pot_AI = 3;
    public static int Whel_Pot_AI = 4;
    /* Setpoints for Practice Bot
    //Setpoints for Elevator
    public static double level_one = 10;
    public static double level_two = 420;
    public static double level_three = 850;
    public static double level_four = 1225;
    public static double level_five = 1660;
    public static double level_six = 1955;
    public static double player_station = 1285;
    public static double max_elevator = 1960;
    public static double min_elevator = 5;
    //635
    //Setpoints for Claw
    public static double can = 578;
    public static double tote = 578;
    public static double open_claw = 1630;
    public static double max_claw = 2000;
    public static double min_claw = 300;
    */
    
    //Setpoints for Elevator
    public static double level_one = 10;
    public static double level_two = 420;
    public static double level_three = 850;
    public static double level_four = 1225;
    public static double level_five = 1660;
    public static double level_six = 1955;
    public static double player_station = 1285;
    public static double max_elevator = 1960;
    public static double min_elevator = 5;
    //635
    //Setpoints for Claw
    public static double can = 578;
    public static double tote = 578;
    public static double open_claw = 1630;
    public static double max_claw = 2150;
    public static double min_claw = 120;
}