#include TurnSignalCTRL.h
#ifdef STANDARD_TURNSIGNAL
	#include <StandardTurnSignal.h>
#endif
#ifdef DYNAMIC_TURNSIGNAL
	#include <DynamicTurnSignal.h>
#endif

void initTurnSignal(void){
	//initialize the Turn Signal
}

//returns the current position of the turn signal
TurnSignalPosition getTurnSignalPosition(void){
	//implement
}

void handleTurnSignal(bool right, bool left){
	#ifdef COMFORT_MODE
		//..
	#endif
	if(right && left){
		#ifdef STANDARD_TURNSIGNAL
			turnStandardBothTurnSignalLEDOnOff();
		#endif
		#ifdef DYNAMIC_TURNSIGNAL
			turnDynamicBothTurnSignalLEDOnOff();
		#endif
	}else if(left){
		#ifdef STANDARD_TURNSIGNAL
			turnStandardLeftTurnSignalLEDOnOff();
		#endif
		#ifdef DYNAMIC_TURNSIGNAL
			turnDynamicLeftTurnSignalLEDOnOff();
		#endif
	}else if(right){
		#ifdef STANDARD_TURNSIGNAL
			turnStandardRightTurnSignalLEDOnOff();
		#endif
		#ifdef DYNAMIC_TURNSIGNAL
			turnDynamicRightTurnSignalLEDOnOff();
		#endif
	}
}
