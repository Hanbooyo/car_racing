package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class StringTest {
    @Test
    void split() {
        String[] result = "1,2".split(",");
        assertThat(result).contains("1");
        assertThat(result).containsExactly("1","2"); // 정확한 순서까지
    }

    @Test
    void subString() {
        String result = "(1,2)".substring(1, 4);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("요구사항3 : charAt Method")
    void charAt() {

        String abc = "abc";

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    abc.charAt(4);
                }).withMessageMatching("Index: "+4+", Size: "+abc.length());

        assertThatThrownBy(() -> {
            abc.charAt(2);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("Index: 2, Size: 2");
    }



}
