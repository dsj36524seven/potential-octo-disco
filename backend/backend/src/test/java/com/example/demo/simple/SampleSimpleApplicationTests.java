package com.example.demo.simple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.boot.test.system.CapturedOutput;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import static org.assertj.core.api.Assertions.assertThat;
@ExtendWith(OutputCaptureExtension.class)
class SampleSimpleApplicationTests {
    private String profiles;
    @BeforeEach
    void init() {
        profiles = System.getProperty("spring.profiles.active");
    }
    @AfterEach
    void cleanup() {
        if (profiles != null) {
            System.setProperty("spring.profiles.active", profiles);
        } else {
            System.clearProperty("spring.profiles.active");
        }
    }
    @Test
    void testDefaultSettings(CapturedOutput output) throws Exception {
        new SpringApplicationBuilder(SampleSimpleApplication.class)
            .web(WebApplicationType.NONE)   // ✅ no Tomcat
            .run();
        assertThat(output).asString().contains("Hello guest-user");
    }
    @Test
    void testCommandLineOverrides(CapturedOutput output) throws Exception {
        new SpringApplicationBuilder(SampleSimpleApplication.class)
            .web(WebApplicationType.NONE)   // ✅ no Tomcat
            .run("--name=power-user");
        assertThat(output).asString().contains("Hello power-user");
    }

}
