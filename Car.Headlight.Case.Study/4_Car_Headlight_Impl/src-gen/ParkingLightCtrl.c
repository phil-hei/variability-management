#include <stdbool.h>
#include <ParkingLightLeftLED.h>
#include <ParkingLightRightLED.h>
#include <TurnSignalCtrl.h>

bool isParkingLightOn;

void initParkingLight(void) {
	//initialize the Parking Light
	isFParkingLightOn = false;
}

void turnParkingLightOnOff(void) {
	if(isParkingLightOn){
		turnParkingLightLEDOff();
		isParkingLightOn = false;
	}
	else{
		if(getTurnSignalPosition() == TurnSignalLeft){
			turnLeftParkingLightLEDOn();
		} else if(getTurnSignalPosition() == TurnSignalRight){
			turnRightParkingLightLEDOn();
		} else{
			turnParkingLightLEDOn();
			isParkingLightOn = true;
		}
	}
}
