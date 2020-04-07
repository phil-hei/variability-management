typedef enum {
	TurnSignalRight,
	TurnSignalLeft,
	TurnSignalBoth
} TurnSignalPosition;

#define STANDARD_TURNSIGNAL
#define DYNAMIC_TURNSIGNAL
#define COMFORT_MODE

extern void turnLeftTurnSignalLEDOn(void);
extern void turnRightTurnSignalLEDOn(void);
extern void turnBothTurnSignalLEDOn(void);
