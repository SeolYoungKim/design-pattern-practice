package _16_observer;

public class App {
    public static void main(String[] args) {
        final DefaultSubscriber kim = new DefaultSubscriber("kim");
        final DefaultSubscriber lee = new DefaultSubscriber("lee");
        final DefaultSubscriber park = new DefaultSubscriber("park");
        final DefaultSubscriber choi = new DefaultSubscriber("choi");

        final TechBlogPublisher techBlogPublisher = new TechBlogPublisher();
        techBlogPublisher.registerSubscriber("java", kim);
        techBlogPublisher.registerSubscriber("java", lee);
        techBlogPublisher.registerSubscriber("c#", park);
        techBlogPublisher.registerSubscriber("c#", choi);

        techBlogPublisher.publishTechBlog("java", "자바최고");

        techBlogPublisher.unregisterSubscriber("java", lee);
        techBlogPublisher.publishTechBlog("java", "코틀린이 대세라던데...");

        techBlogPublisher.publishTechBlog("c#", "C#은 어려워");

        techBlogPublisher.unregisterSubscriber("c#", choi);
        techBlogPublisher.publishTechBlog("c#", "으아악");
    }
}
