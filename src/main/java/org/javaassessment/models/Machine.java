package org.javaassessment.models;

import org.javaassessment.auth.AuthorisingService;
import org.javaassessment.build.SystemBuildService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public abstract class Machine implements AuthorisingService , SystemBuildService {
    private String hostName;
    private String requestor;

    private long numberOfCPU;

    private long numberOfRAM;

    private int hardDriveSize;

    public Machine() {
    }

    public Machine(String hostName, String requestor, long numberOfCPU, long numberOfRAM, int hardDriveSize) {
        if(null == hostName || hostName == ""){
            throw new IllegalArgumentException("Host name is required to create a virtual machine");
        }
        this.hostName = hostName;
        this.requestor = requestor;
        this.numberOfCPU = numberOfCPU;
        this.numberOfRAM = numberOfRAM;
        this.hardDriveSize = hardDriveSize;
    }


    public void setHostName(String hostName) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyymmdd");
        String str = formatter.format(date);
        String newHostName = "host"  + str;
        this.hostName = newHostName;
    }

    public String getRequestor() {
        return requestor;
    }

    public void setRequestor(String requestor) {
        this.requestor = requestor;
    }

    public long getNumberOfCPU() {
        return numberOfCPU;
    }

    public void setNumberOfCPU(long numberOfCPU) {
        this.numberOfCPU = numberOfCPU;
    }

    public long getNumberOfRAM() {
        return numberOfRAM;
    }

    public void setNumberOfRAM(long numberOfRAM) {
        this.numberOfRAM = numberOfRAM;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }


    public void getHostName(){


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Machine machine)) return false;
        return numberOfCPU == machine.numberOfCPU && numberOfRAM == machine.numberOfRAM && hardDriveSize == machine.hardDriveSize && Objects.equals(hostName, machine.hostName) && Objects.equals(requestor, machine.requestor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName, requestor, numberOfCPU, numberOfRAM, hardDriveSize);
    }

    @Override
    public String toString() {
        return "Machine{" +
                "hostName='" + hostName + '\'' +
                ", requestor='" + requestor + '\'' +
                ", numberOfCPU=" + numberOfCPU +
                ", numberOfRAM=" + numberOfRAM +
                ", hardDriveSize=" + hardDriveSize +
                '}';
    }
}
