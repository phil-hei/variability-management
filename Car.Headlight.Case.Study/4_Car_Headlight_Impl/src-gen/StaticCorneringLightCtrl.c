#include <stdbool.h>
#include <StaticCorneringLightLED.h>

bool isStaticCorneringLightOn;

void initStaticCorneringLight(void) {
	//initialize the Static Cornering Light
	isStaticCorneringLightOn = false;
}

void turnStaticCorneringLightOnOff(void) {
	if(isStaticCorneringLightOn){
		turnStaticCorneringLightLEDOff();
		isStaticCorneringLightOn = false;
	}
	else{
		turnStaticCorneringLightLEDOn();
		isStaticCorneringLightOn = true;
	}
}
