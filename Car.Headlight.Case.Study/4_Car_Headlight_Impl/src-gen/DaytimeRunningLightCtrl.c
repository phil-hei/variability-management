#include <stdbool.h>
#include <DaytimeRunningLightLED.h>

static const float requiredLux = 15000;
bool isActivated;

void initDaytimeRunningLight(void) {
	//initialize the Daytime Running Light
	isActivated = true;
}

void turnDaytimeRunningLightOnOff(void) {
	if(isActivated){
		if(getBrightnessInLux < requiredLux){
			turnDaytimeRunningLightLEDOn(void);
		}
		else{
			turnDaytimeRunningLightLEDOff(void);
		}
	}
}

void deactivateDaytimeRunningLight(void){
	isActivated = false;
}

void activateDaytimeRunningLight(void){
	isActivated = true;
}

