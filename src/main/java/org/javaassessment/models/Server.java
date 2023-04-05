package org.javaassessment.models;

public class Server extends Machine {
 private String distributionName;

 private String distributionNumber;

 private String kernelVersion;

 private String administrativeTeam;

    public Server(String distributionName, String distributionNumber, String kernelVersion, String administrativeTeam) {
        this.distributionName = distributionName;
        this.distributionNumber = distributionNumber;
        this.kernelVersion = kernelVersion;
        this.administrativeTeam = administrativeTeam;
    }

    public Server(String hostName, String requestor, long numberOfCPU, long numberOfRAM, int hardDriveSize, String distributionName, String distributionNumber, String kernelVersion, String administrativeTeam) {
        super(hostName, requestor, numberOfCPU, numberOfRAM, hardDriveSize);
        this.distributionName = distributionName;
        this.distributionNumber = distributionNumber;
        this.kernelVersion = kernelVersion;
        this.administrativeTeam = administrativeTeam;
    }


    @Override
    public boolean isAuthorised(String user) {

        return false;
    }

    @Override
    public String createNewMachine(Machine machine) {

        return null;
    }

    @Override
    public int totalDayMachine() {

        return 0;
    }
}
