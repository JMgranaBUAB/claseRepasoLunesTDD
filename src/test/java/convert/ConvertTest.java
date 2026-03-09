package convert;

import org.example.Convert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertTest {

//    @Test
//    void check_km1_to_miles(){
//        assertEquals(0.6213709712028503, new Convert().km_to_miles(1));
//    }
//
//    @Test
//    void check_km10_to_miles(){
//        assertEquals(6.213709831237793, new Convert().km_to_miles(10));
//    }

    @ParameterizedTest
    @CsvSource({
            "1, 0.6213709712028503",
            "10, 6.213709831237793",
            "0, 0",
            "-5, -3.106855",
    })
    void check_km_to_miles(int input, float expectedOutput){
        assertEquals(expectedOutput, new Convert().km_to_miles(input));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 33.8",
            "2, 35.6",
            "0, 32.0",
            "-5, 23.0",
            "-100, -148.0",
            "100, 212",
    })
    void check_celsius_to_farenheit(int input, float expectedOutput){
        assertEquals(expectedOutput, new Convert().celsius_to_farenheit(input));
    }

    @ParameterizedTest
    @CsvSource({
        "1, 2.20462",
        "2, 4.40924",
        "0, 0",
        "-5, -11.0231",
        "-100, -220.46199",
        "7, 15.432339",
    })
    void check_kg_to_pounds(int input, float expectedOutput){
        assertEquals(expectedOutput, new Convert().kg_to_pounds(input));
    }

}
