package org.javaassessment.implementation;



import org.javaassessment.models.Machine;
import org.javaassessment.exceptions.MachineNotCreatedException;
import org.javaassessment.exceptions.UserNotEntitledException;

import java.util.Map;
public interface VirtualMachineRequestor {

    void createNewRequest(Machine machine) throws UserNotEntitledException, MachineNotCreatedException;

    Map<String, Map<String, Integer>> totalBuildsForUserToday();

    int totalFailedBuildsForDay();
}

