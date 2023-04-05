package org.javaassessment.build;

import org.javaassessment.models.Machine;

public interface SystemBuildService {

    public String createNewMachine(Machine machine);

    public  int totalDayMachine();
}
