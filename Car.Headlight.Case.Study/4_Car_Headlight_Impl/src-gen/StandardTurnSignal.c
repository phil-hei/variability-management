#include <StandardLefTurnSignalLED.h>
#include <StandardRightTurnSignalLED.h>

bool isRightTurnSignalOn;
bool isLeftTurnSignalOn;

void initStandardTurnSignal(void){
	//initialize standard turn signal
	isRightTurnSignalOn = false;
	isLeftTurnSignalOn = false;
}

void turnStandardLeftTurnSignalLEDOnoFF(void){
	//...
	if(isLeftTurnSignalOn){
		turnStandardLeftTurnSignalLEDOff();
		isLeftTurnSignalOn = false;
	}else{
		turnStandardLeftTurnSignalLEDOn();
		isLeftTurnSignalOn = true;
	}
}

void turnStandardBothTurnSignalLEDOnOffComfort(void){
	//create timer...
	turnStandardLeftTurnSignalLEDOn(time_t);
	isLeftTurnSignalOn = true;
}

void turnStandardRightTurnSignalLEDOnoFF(void){
	//...
	if(isRightTurnSignalOn){
		turnStandardRightTurnSignalLEDOff();
		isRightTurnSignalOn = false;
	}else{
		turnStandardRightTurnSignalLEDOn();
		isRightTurnSignalOn = true;
	}
}

//in case of hazard light
void turnStandardBothTurnSignalLEDOnOff(void){
	if(isRightTurnSignalOn && isLeftTurnSignalOn){
		turnStandardLeftTurnSignalLEDOff();
		turnStandardRightTurnSignalLEDOff();
		isRightTurnSignalOn = false;
		isLeftTurnSignalOn = false;
	}else{
		turnStandardLeftTurnSignalLEDOn();
		turnStandardRightTurnSignalLEDOn();
		isRightTurnSignalOn = true;
		isLeftTurnSignalOn = true;
	}
}
