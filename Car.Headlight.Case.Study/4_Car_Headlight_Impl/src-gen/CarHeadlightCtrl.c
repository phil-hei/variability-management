#include <stdio.h>
#include <DimLightCtrl.h>
#include <FogLightCtrl.h>
#include <HighBeamCtrl.h>
#include <HighBeamAssistant.h>
#include <StaticCorneringLightCtrl.h>
#include <ParkingLightCtrl.h>
#include <TurnSignalCtrl.h>
#include <CarHeadlightCtrl.h>

/*
 * This method is called on system start to initialize the connected components
 */
void initCarHeadlightCtrl(void){
	initDimLight();
	initFogLight();
	initHighBeam();
	initHighBeamAssistant();
	initParkingLight();
	initStaticCorneringLight();
	initDaytimeRunningLight();
	initTurnSignal();
}

void handleUserInputs(UserInput data){
	switch (state){
		case HIGH_BEAM :
			//user turns on the high beam
			turnHighBeamOnOff();
		#ifdef HIGH_BEAM_ASSISTANT
			case HIGH_BEAM_ASSISTANT
				//user turns on the high beam assistant
				turnHighBeamAssistantOnOff
        #endif
		#ifdef HIGH_BEAM_ASSISTANT
			case FOG_LIGHT :
				//user turns fog light on/off
				turnFogLightOnOff();
		#endif
		case DIM_LIGHT :
			//user turns dim light on/off. Depending on the state and brightness, daytime running light turns automatically on/off
			turnDimLightOnOff();
		#ifdef STATIC_CORNERING_LIGHT
			case STATIC_CORNERING_LIGHT :
				//user turns static cornering light on/off
				turnStaticCorneringLightOnOff
		#endif
		#ifdef DAYTIME_RUNNING_LIGHT
			case DAYTIME_RUNNING_LIGHT_ACTIVE :
				//user explicitly activate the daytime running light
				activateDaytimeRunningLight();
			case DAYTIME_RUNNING_LIGHT_INACTIVE :
				//user explicitly deactivate the daytime running light
				deactivateDaytimeRunningLight();
		#endif
		case TURN_SIGNAL_RIGHT :
			//user turns the right turn signal
			handleTurnSignal(true, false);
		case TURN_SIGNAL_LEFT :
			//user turns the left turn signal
			handleTurnSignal(false, true);
		case HAZARD
			//user turns hazard light
			//....
	}
}
