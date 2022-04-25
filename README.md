# washimmachineapi

assignment for electrolux

###Installation and Run

$ gradle bootRun

###REST API description and test

http://localhost:8080/swagger-ui.html#/

GET /api/program/(index) - Set up appliance program: choose one and set by index

GET /api/programs - View all appliance programs: shows all programs descriptions

GET /api/start - Start appliance: execute chosen program

GET /api/state - View appliance state: show current state with timer to program end

GET /api/stop - Stop appliance: interrupt program execution

###NB

App creates database file at user home folder

~/washing-machine-db
