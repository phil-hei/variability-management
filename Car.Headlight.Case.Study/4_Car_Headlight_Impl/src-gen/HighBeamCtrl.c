#include <stdbool.h>
#include <HighBeamLED.h>

bool isHighBeamOn;

void initHighBeam(void) {
	//initialize the High Beam
	isHighBeamOn = false;
}

void turnHighBeamOnOff(void) {
	if(isHighBeamOn){
		turnHighBeamLEDOff();
		isHighBeamOn = false;
	}
	else{
		turnHighBeamLEDOn();
		isHighBeamOn = true;
	}
}

void turnHighBeamOff(void) {
	turnHighBeamLEDOff();
}
