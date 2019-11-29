package naya.starter;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import static naya.starter.properties.ProfilesConstant.CUSTOM_PROFILE;

public class SetProfileApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext context) {
        String profile = context.getEnvironment().getProperty(CUSTOM_PROFILE);
        if(profile!=null){
            context.getEnvironment().setActiveProfiles(profile);
        }

    }
}
