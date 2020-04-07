#include <stdbool.h>
#include <FogLightLED.h>

bool isFogLightOn;

void initDimLight(void) {
	//initialize the Fog Light
	isFogLightOn = false;
}

void turnFogLightOnOff(void) {
	if(isFogLightOn){
		turnFogLightLEDOff();
		isFogLightOn = false;
	}
	else{
		turnFogLightLEDOn();
		isFogLightOn = true;
	}
}
