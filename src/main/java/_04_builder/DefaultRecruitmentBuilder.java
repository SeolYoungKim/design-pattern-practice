package _04_builder;

import java.time.Duration;

public class DefaultRecruitmentBuilder implements RecruitmentBuilder {
    public static DefaultRecruitmentBuilder builder() {
        return new DefaultRecruitmentBuilder();
    }

    private Category category;
    private Field field;
    private String subject;
    private Duration duration;
    private int numberOfRecruits;

    private DefaultRecruitmentBuilder() {
    }

    @Override
    public RecruitmentBuilder category(Category category) {
        this.category = category;
        return this;
    }

    @Override
    public RecruitmentBuilder field(Field field) {
        this.field = field;
        return this;
    }

    @Override
    public RecruitmentBuilder subject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public RecruitmentBuilder duration(Duration duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public RecruitmentBuilder numberOfRecruits(int number) {
        this.numberOfRecruits = number;
        return this;
    }

    @Override
    public Recruitment build() {
        return new Recruitment(category, field, subject, duration, numberOfRecruits);
    }
}
