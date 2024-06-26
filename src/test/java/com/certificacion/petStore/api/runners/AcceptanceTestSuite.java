package com.certificacion.petStore.api.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/",
        glue="com.certificacion.petStore.api",
        tags = "@FindPetForIncorrectID",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AcceptanceTestSuite {}
