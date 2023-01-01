package _04_builder;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DefaultRecruitmentBuilderTest {

    @DisplayName("DefaultRecruitmentBuilder를 통해 Recruitment를 생성할 수 있다.")
    @Test
    void construct() {
        Recruitment recruitment = DefaultRecruitmentBuilder.builder()
                .category(Category.STUDY)
                .field(Field.BACKEND_DEVELOPER)
                .subject("백기선님의 디자인패턴 강의")
                .duration(Duration.ofDays(20))
                .numberOfRecruits(5)
                .build();

        assertThat(recruitment.category()).isEqualTo(Category.STUDY);
        assertThat(recruitment.field()).isEqualTo(Field.BACKEND_DEVELOPER);
        assertThat(recruitment.subject()).isEqualTo("백기선님의 디자인패턴 강의");
        assertThat(recruitment.duration()).isEqualTo(Duration.ofDays(20));
        assertThat(recruitment.numberOfRecruitments()).isEqualTo(5);
    }
}