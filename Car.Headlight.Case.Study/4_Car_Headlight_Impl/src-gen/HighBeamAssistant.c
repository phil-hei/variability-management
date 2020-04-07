#include <stdbool.h>
#include <HighBeamCtrl.h>

bool isHighBeamAssistantOn;

void initHighBeamAssistant(void) {
	//initialize the High Beam Assistant
	isHighBeamAssistantOn = false;
}

void turnHighBeamAssistantOnOff(void) {
	if(isHighBeamOn){
		isHighBeamAssistantOn = false;
	}
	else{
		isHighBeamAssistantOn = true;
	}
}


void handleHighBeam(void){
	if(isVehicleDetected()){
		turnHighBeamOff();
	}
}
