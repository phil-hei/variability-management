#include <DynamicRightTurnSignalLED.h>
#include <DynamicLeftTurnSignalLED.h>

bool isRightTurnSignalOn;
bool isLeftTurnSignalOn;

void initStandardTurnSignal(void){
	//initialize dynamic turn signal
	isRightTurnSignalOn = false;
	isLeftTurnSignalOn = false;
}

void turnDynamicLeftTurnSignalLEDOnoFF(void){
	//...
	if(isLeftTurnSignalOn){
		turnDynamicLeftTurnSignalLEDOff();
		isLeftTurnSignalOn = false;
	}else{
		turnDynamicLeftTurnSignalLEDOn();
		isLeftTurnSignalOn = true;
	}
}

void turnDynamicRightTurnSignalLEDOnoFF(void){
	//...
	if(isRightTurnSignalOn){
		turnDynamicRightTurnSignalLEDOff();
		isRightTurnSignalOn = false;
	}else{
		turnDynamicRightTurnSignalLEDOn();
		isRightTurnSignalOn = true;
	}
}

//in case of hazard light
void turnDynamicBothTurnSignalLEDOnOff(void){
	if(isRightTurnSignalOn && isLeftTurnSignalOn){
		turnDynamicLeftTurnSignalLEDOff();
		turnDynamicRightTurnSignalLEDOff();
		isRightTurnSignalOn = false;
		isLeftTurnSignalOn = false;
	}else{
		turnDynamicLeftTurnSignalLEDOn();
		turnDynamicRightTurnSignalLEDOn();
		isRightTurnSignalOn = true;
		isLeftTurnSignalOn = true;
	}
}
