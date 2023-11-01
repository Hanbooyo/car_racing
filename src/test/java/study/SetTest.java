package study;

import org.assertj.core.util.Strings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현

    @Test
    @DisplayName("요구사항 1 : size method")
    void size() {
        assertThat(numbers.size());
        System.out.println("numbers의 사이즈는 : "+numbers.size());
    }


    @ParameterizedTest
    @DisplayName("요구사항 2 : contains method")
    @ValueSource(ints = {1,2,3})
    void contains(int num) {
        assertThat(numbers.contains(num)).isTrue();
    }

    @ParameterizedTest
    @DisplayName("요구사항 3 : contains return boolean method")
    @CsvSource(value = {"1,true", "2,true", "3,true", "4,false", "5,false"})
    void contains_boolean(int num, boolean expected) {
        assertThat(numbers.contains(num)).isEqualTo(expected);
    }
}
