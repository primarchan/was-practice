package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestLineTest {

    @DisplayName("")
    @Test
    void create() {
        RequestLine requestLIne = new RequestLine("GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1");

        assertThat(requestLIne).isNotNull();
        assertThat(requestLIne).isEqualTo(new RequestLine("GET", "/calculate", "operand1=11&operator=*&operand2=55"));
    }

}
