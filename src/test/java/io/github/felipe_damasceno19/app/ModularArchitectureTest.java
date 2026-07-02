package io.github.felipe_damasceno19.app;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModularArchitectureTest {

    ApplicationModules modules = ApplicationModules.of(Application.class);

    @Test
    void verifyArchitecture() {
        modules.verify();
    }

}
