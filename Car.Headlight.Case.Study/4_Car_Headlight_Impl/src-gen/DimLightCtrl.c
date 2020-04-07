#include <stdbool.h>
#include <DimLightLED.h>
#include <DaytimeRunningLightCtrl.h>

bool isDimLightOn;

void initDimLight(void) {
	//initialize the Dim Light
	isDimLightOn = false;
}

void turnDimLightOnOff(void) {
	if(isDimLightOn){
		turnDimLightLEDOff();
		turnDaytimeRunningLightOnOff();
		isDimLightOn = false;
	}
	else{
		turnDimLightLEDOn();
		isDimLightOn = true;
	}
}
