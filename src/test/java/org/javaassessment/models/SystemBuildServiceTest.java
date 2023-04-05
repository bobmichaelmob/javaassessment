package org.javaassessment.models;
import static org.mockito.Mockito.*;
import org.javaassessment.build.SystemBuildService;
import org.junit.Test;
import org.mockito.Mockito;

public class SystemBuildServiceTest {

    @Test
    public void testBuildServiceShouldReturnHostName() {
        Machine machine = mock(Machine.class);
        SystemBuildService buildService = mock(SystemBuildService.class);
        when(buildService.createNewMachine(machine)).thenReturn("hostName");
    }
}