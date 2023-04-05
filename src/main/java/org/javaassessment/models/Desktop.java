package org.javaassessment.models;

public class Desktop extends Machine{

   private String windowsVersion;

   private String buildNumber;

   public Desktop(String windowsVersion, String buildNumber) {
      this.windowsVersion = windowsVersion;
      this.buildNumber = buildNumber;
   }

   public Desktop(String hostName, String requestor, long numberOfCPU, long numberOfRAM, int hardDriveSize,String windowsVersion, String buildNumber) {
      super(hostName, requestor, numberOfCPU, numberOfRAM, hardDriveSize);
      this.windowsVersion = windowsVersion;
      this.buildNumber = buildNumber;
   }


   public String getWindowsVersion() {
      return windowsVersion;
   }

   public void setWindowsVersion(String windowsVersion) {
      this.windowsVersion = windowsVersion;
   }

   public String getBuildNumber() {
      return buildNumber;
   }

   public void setBuildNumber(String buildNumber) {
      this.buildNumber = buildNumber;
   }


   @Override
   public String toString() {
      return "Desktop{" +
              "windowsVersion='" + windowsVersion + '\'' +
              ", buildNumber='" + buildNumber + '\'' +
              '}';
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
