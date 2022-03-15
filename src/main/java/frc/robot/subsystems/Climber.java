// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


import frc.robot.Constants;
import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX; import com.ctre.phoenix.motorcontrol.NeutralMode;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Climber extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private WPI_TalonFX talonFXEnhanced6;
private WPI_TalonFX talonFXEnhanced7;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public Climber() {
        // _BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
talonFXEnhanced6 = new WPI_TalonFX(Constants.ClimberConstants.kMotor1Port);
 
    /* Factory default hardware to prevent unexpected behavior */
talonFXEnhanced6.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
talonFXEnhanced6.setInverted(false);
talonFXEnhanced6.setNeutralMode(NeutralMode.Brake);

        /* Set the peak and nominal outputs */
talonFXEnhanced6.configNominalOutputForward(0, 30);
talonFXEnhanced6.configNominalOutputReverse(0, 30);
talonFXEnhanced6.configPeakOutputForward(1, 30);
talonFXEnhanced6.configPeakOutputReverse(-1, 30);
        


talonFXEnhanced7 = new WPI_TalonFX(Constants.ClimberConstants.kMotor2Port);
 
    /* Factory default hardware to prevent unexpected behavior */
talonFXEnhanced7.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
talonFXEnhanced7.setInverted(true);
talonFXEnhanced7.setNeutralMode(NeutralMode.Brake);

        /* Set the peak and nominal outputs */
talonFXEnhanced7.configNominalOutputForward(0, 30);
talonFXEnhanced7.configNominalOutputReverse(0, 30);
talonFXEnhanced7.configPeakOutputForward(1, 30);
talonFXEnhanced7.configPeakOutputReverse(-1, 30);
        



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void my_set_Climber_speed(double speed){
        talonFXEnhanced6.set(speed);
        talonFXEnhanced7.set(speed);
    }
}

