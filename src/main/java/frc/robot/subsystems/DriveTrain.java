// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.photonvision.PhotonCamera;
import org.photonvision.common.hardware.*;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private final SpeedControllerGroup leftMotors = new SpeedControllerGroup(new Talon(0), new Talon(1));
  private final SpeedControllerGroup rightMotors = new SpeedControllerGroup(new Talon(2), new Talon(3));
  private final DifferentialDrive driveTrain = new DifferentialDrive(leftMotors, rightMotors);
  public DriveTrain() {
    rightMotors.setInverted(true);
  }

  public void tankDrive(double leftStick, double rightStick)
  {
    driveTrain.tankDrive(leftStick, rightStick);
  }

  public void arcadeDrive(double leftStick, double rightStick)
  {
    driveTrain.arcadeDrive(leftStick, rightStick);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
