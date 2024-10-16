package com.jpmc.midascore;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class TaskOneTests {
    static final Logger logger = LoggerFactory.getLogger(TaskOneTests.class);

    // this test class crashes if no implementation of kafka is provided,
    // since this test class does not need to talk to a kafka server we can just use a mock connection
    @MockBean
    private KafkaProducer kafkaProducer;

    @Test
    void task_one_verifier() throws InterruptedException {
        Thread.sleep(2000);
        logger.info("----------------------------------------------------------");
        logger.info("----------------------------------------------------------");
        logger.info("----------------------------------------------------------");
        logger.info("Congrats! It looks like your application booted without issue");
        logger.info("submit the following output to complete the task (include begin and end output denotations)");
        StringBuilder output = new StringBuilder("\n").append("---begin output ---").append("\n");
        for (int i = 0; i < 10; i++) {
            output.append(String.valueOf((int) Math.floor(Math.pow(i, i))));
        }
        output.append("\n").append("---end output ---");
        logger.info(output.toString());

    }

}
