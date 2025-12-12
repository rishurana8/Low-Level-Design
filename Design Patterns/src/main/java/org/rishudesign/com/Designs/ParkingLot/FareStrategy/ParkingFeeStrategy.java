package org.rishudesign.com.Designs.ParkingLot.FareStrategy;

import org.rishudesign.com.Designs.ParkingLot.CommonEnum.DurationType;

public interface ParkingFeeStrategy {
    double calculateFee(String vehicleType, int duration, DurationType durationType);
}
