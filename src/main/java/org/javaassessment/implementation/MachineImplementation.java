package org.javaassessment.implementation;

import org.javaassessment.models.Machine;

import java.util.HashMap;
import java.util.Map;

import org.javaassessment.exceptions.MachineNotCreatedException;
import org.javaassessment.exceptions.UserNotEntitledException;
import org.javaassessment.build.SystemBuildService;
import org.javaassessment.auth.AuthorisingService;
public class MachineImplementation implements VirtualMachineRequestor {


        private Map<String, Map<String, Integer>> dailyCreatedMachines;
        private AuthorisingService  authorisingService;
        private SystemBuildService systemBuildService;
        private int totalFailedBuilds;

        public MachineImplementation(AuthorisingService authorisingService, SystemBuildService systemBuildService) {
                this.authorisingService = authorisingService;
                this.systemBuildService = systemBuildService;
                dailyCreatedMachines = new HashMap<>();
                totalFailedBuilds = 0;
        }
        @Override
        public void createNewRequest(Machine machine) throws UserNotEntitledException, MachineNotCreatedException {
                if(!authorisingService.isAuthorised(machine.getRequestor())) {
                        //user is not entitled, and we do not anything with is just logged
                        throw new UserNotEntitledException();
                }
                if(systemBuildService.createNewMachine(machine) == null || systemBuildService.createNewMachine(machine) == "") {
                        ++totalFailedBuilds;
                        throw new MachineNotCreatedException();
                }

        }

        @Override
        public Map<String, Map<String, Integer>> totalBuildsForUserToday() {
                return null;
        }


        @Override
        public int totalFailedBuildsForDay() {
                return totalFailedBuilds;
        }

}


