package _04_builder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RecruitmentDirectorTest {

    @DisplayName("디렉터를 통해 백기선님의 디자인패턴 강의에 대한 Recruitment를 생성할 수 있다.")
    @Test
    void construct() {
        RecruitmentDirector recruitmentDirector = new RecruitmentDirector(
                DefaultRecruitmentBuilder.builder());
        Recruitment recruitment = recruitmentDirector.whiteshipStudy();

        assertThat(recruitment.category()).isEqualTo(Category.STUDY);
        assertThat(recruitment.field()).isEqualTo(Field.BACKEND_DEVELOPER);
        assertThat(recruitment.subject()).isEqualTo("백기선님의 디자인패턴 강의");
        assertThat(recruitment.duration()).isEqualTo(Duration.ofDays(20));
        assertThat(recruitment.numberOfRecruitments()).isEqualTo(5);
    }
}