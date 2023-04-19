package _16_observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TechBlogPublisher {
    private final Map<String, List<Subscriber>> channelAndSubscribers = new HashMap<>();

    public void registerSubscriber(final String channel, final Subscriber subscriber) {
        channelAndSubscribers.computeIfAbsent(channel, ch -> new ArrayList<>())
                .add(subscriber);
    }

    public void unregisterSubscriber(final String channel, final Subscriber subscriber) {
        if (channelAndSubscribers.containsKey(channel)) {
            channelAndSubscribers.get(channel).remove(subscriber);
        }
    }

    public void publishTechBlog(final String channel, final String techBlog) {
        if (channelAndSubscribers.containsKey(channel)) {
            channelAndSubscribers.get(channel)
                    .forEach(subscriber -> subscriber.printContent(techBlog));
        }
    }
}
