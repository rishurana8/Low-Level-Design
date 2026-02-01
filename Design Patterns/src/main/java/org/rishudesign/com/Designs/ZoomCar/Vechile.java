package org.rishudesign.com.Designs.ZoomCar;

public class Vechile {
    Long vechileId;
    VechileType vechileType;
    Double cost;
    VechileStatus status;

    public Vechile(Long vechileId, VechileType vechileType, Double cost, VechileStatus status) {
        this.vechileId = vechileId;
        this.vechileType = vechileType;
        this.cost = cost;
        this.status = status;
    }
}
