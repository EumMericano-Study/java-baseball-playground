package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class StringTest {
    @Test
    void replace_학습_테스트() {
        String testWord = "abc".replace("b", "d");
        assertThat(testWord).isEqualTo("adc");
    }

    @Test
    void split_학습_테스트() {
        String[] splitList = "1,2".split(",");
        assertThat(splitList).containsExactly("1","2");

        String[] testWords = "1".split(",");
        assertThat(testWords).contains("1").hasSize(1);
    }

    @Test
    void substring_학습_테스트() {
        String testWord = "(1,2)";
        String subStringWord = testWord.substring(1, testWord.length()-1);
        assertThat(subStringWord).isEqualTo("1,2");
    }

    @DisplayName("charAt 학습 테스트")
    @Test
    void charAt_학습_테스트() {
        String testWord = "abc";
        assertThat(testWord.charAt(0)).isEqualTo('a');
        assertThat(testWord.charAt(1)).isEqualTo('b');
        assertThat(testWord.charAt(2)).isEqualTo('c');

        assertThatThrownBy(() -> {
            assertThat(testWord.charAt(3));
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("String index out of range: 3");
    }
}
