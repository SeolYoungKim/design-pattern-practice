package _04_builder;

import java.time.Duration;

public record Recruitment(Category category, Field field, String subject, Duration duration,
                          int numberOfRecruitments) {
}
