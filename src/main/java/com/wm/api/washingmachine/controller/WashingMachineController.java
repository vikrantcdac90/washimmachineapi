package com.wm.api.washingmachine.controller;

import com.wm.api.washingmachine.model.WashingMachine;
import com.wm.api.washingmachine.service.InitializeService;
import com.wm.api.washingmachine.service.Program;
import com.wm.api.washingmachine.service.ProgramExecutorService;
import com.wm.api.washingmachine.service.WashingMachineService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "Washing Machine REST Control", description = "Operations pertaining to Washing Machine")
public class WashingMachineController {
    private final Logger LOGGER = LoggerFactory.getLogger(WashingMachineController.class);

    private final ProgramExecutorService programExecutorService;
    private final WashingMachineService washingMachineService;
    private final InitializeService initializeService;

    private WashingMachine washingMachine;

    @Autowired
    public WashingMachineController(ProgramExecutorService programExecutorService, WashingMachineService washingMachineService, InitializeService initializeService) {
        this.programExecutorService = programExecutorService;
        this.washingMachineService = washingMachineService;
        this.initializeService = initializeService;
        this.washingMachine = initializeService.getWashingMachine();
    }



    @ApiOperation(value = "View appliance state", response = String.class)
    @RequestMapping(value = "/state", method = RequestMethod.GET)
    public String getState() {
        LOGGER.info("State request");
        return programExecutorService.getStatus();
    }

    @ApiOperation(value = "Start appliance", response = String.class)
    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public String start() throws InterruptedException {
        try {
            programExecutorService.startProgram();
        } catch (NullPointerException e) {
            return "Set up program first";
        }
        return "Started";
    }

    @ApiOperation(value = "Stop appliance", response = String.class)
    @RequestMapping(value = "/stop", method = RequestMethod.GET)
    public String stop() {
        programExecutorService.stopProgram();
        return "Stopped";
    }

    @ApiOperation(value = "Set up appliance program", response = String.class)
    @RequestMapping(value = "/program/(index)", method = RequestMethod.GET)
    public String selectProgramme(@RequestParam Integer index) {

        try {
            List<Program> programs = washingMachine.getPrograms();
            programExecutorService.setProgram(programs.get(index));

        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("No such program");
        }

        return "Program " + index + "is set";
    }

    @ApiOperation(value = "View all appliance programs", response = String.class)
    @RequestMapping(value = "/programs", method = RequestMethod.GET)
    public String getAllProgrammes() {
        List<Program> programs = washingMachine.getPrograms();

        if (programs.isEmpty()) return "Programs are empty";

        StringBuilder programsDescription = new StringBuilder();
        int index = 0;

        for (Program program : programs) {
            programsDescription
                    .append("\n").append(index++).append(": ")
                    .append(program.toString());
        }

        return programsDescription.toString();
    }
}
