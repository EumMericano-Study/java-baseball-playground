package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String testWord = "abc".replace("b", "d");
        assertThat(testWord).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] splitList = "1,2".split(",");
        assertThat(splitList).containsExactly("1","2");

        String[] testWords = "1".split(",");
        assertThat(testWords).contains("1").hasSize(1);

    }
}
