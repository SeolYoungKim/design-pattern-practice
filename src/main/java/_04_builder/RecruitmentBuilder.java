package _04_builder;

import java.time.Duration;

public interface RecruitmentBuilder {
    RecruitmentBuilder category(Category category);

    RecruitmentBuilder field(Field field);

    RecruitmentBuilder subject(String subject);

    RecruitmentBuilder duration(Duration duration);

    RecruitmentBuilder numberOfRecruits(int number);

    Recruitment build();
}
