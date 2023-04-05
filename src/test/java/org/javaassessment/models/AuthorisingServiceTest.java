package org.javaassessment.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.javaassessment.auth.AuthorisingService;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;


public class AuthorisingServiceTest {


    @Test
    public void testUserHasEntitlementForBuild() {
        AuthorisingService authorisingService = mock(AuthorisingService.class);
        when(authorisingService.isAuthorised(anyString())).thenReturn(true);

    }

    @Test
    public void testAuthorisingServiceWrongUser() {
        AuthorisingService authorisingService = mock(AuthorisingService.class);
        given(authorisingService.isAuthorised("Username")).willReturn(true);
    }

    @Test
    public void testUserNotEntitledToMakeRequest() {
        AuthorisingService authorisingService = mock(AuthorisingService.class);
        when(authorisingService.isAuthorised(anyString())).thenReturn(false);
    }

    @Test
    public void testMachineBuildNotSuccessful(){


    }


}