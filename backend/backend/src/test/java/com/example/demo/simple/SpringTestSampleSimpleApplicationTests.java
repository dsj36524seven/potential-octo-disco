package com.example.demo.simple;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Basic context‑load test for {@link SampleSimpleApplication}.
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(
    classes = SampleSimpleApplication.class,
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class SpringTestSampleSimpleApplicationTests {

    @Test
    void contextLoads() {
        // Context initialization test
    }
}
