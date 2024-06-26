/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.certificacion.petStore.api.helpers;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.configuration.SystemPropertiesConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.Configuration;

public final class EnvironmentProperties {

    private static final Configuration<?> CONFIGURATION = new SystemPropertiesConfiguration(
        SystemEnvironmentVariables.createEnvironmentVariables());
    private static final EnvironmentVariables ENVIRONMENT_VARIABLES = CONFIGURATION
        .getEnvironmentVariables();
    private EnvironmentProperties() {
    }
    public static String getProperty(String nameProperty) {
        return EnvironmentSpecificConfiguration.from(ENVIRONMENT_VARIABLES).getProperty(nameProperty);
    }

}
