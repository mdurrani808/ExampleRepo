// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Climber extends SubsystemBase {
  /** Creates a new Climber. */
  Spark climberMotor = new Spark(Constants.CLIMBER_ID);
  public Climber() {
    climberMotor.setInverted(Constants.CLIMBER_MOTOR_INVERTED);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void climberUp(double speed)
  {
    climberMotor.set(speed);
  }

  public void climberDown(double speed)
  {
    climberMotor.set(-speed);
  }
  public void stop()
  {
    climberMotor.set(0);
  }
}
