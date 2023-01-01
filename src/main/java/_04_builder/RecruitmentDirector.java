package _04_builder;

import java.time.Duration;

public class RecruitmentDirector {
    private final RecruitmentBuilder builder;

    public RecruitmentDirector(RecruitmentBuilder builder) {
        this.builder = builder;
    }

    public Recruitment whiteshipStudy() {
        return builder
                .category(Category.STUDY)
                .field(Field.BACKEND_DEVELOPER)
                .subject("백기선님의 디자인패턴 강의")
                .duration(Duration.ofDays(20))
                .numberOfRecruits(5)
                .build();
    }
}
