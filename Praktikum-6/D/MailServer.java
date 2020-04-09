// import java api jika diperlukan
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MailServer implements EventChannel {
  // tambahkan properties jika perlu
  private Map<String, Set<Subscriber>> subscriberTopicMap;

  public MailServer() {
    // menginisiasi daftar subscriber
    subscriberTopicMap = new HashMap<String, Set<Subscriber>>();
  }

  public void addSubscriber(String topic, Subscriber s) {
    // tambahkan s sebagai subscriber ke topic yang diberikan
    Set<Subscriber> subscribers;
    if (subscriberTopicMap.containsKey(topic)) {
      subscribers = subscriberTopicMap.get(topic);
    } else {
      subscribers = new HashSet<Subscriber>();
    }
    subscribers.add(s);
    subscriberTopicMap.put(topic, subscribers);
  }

  public void sendEvent(String topic, Event event) {
    // untuk setiap subscriber s yang sudah subscribe ke topic yang diberikan,
    // panggil s.onEvent(event)
    Set<Subscriber> subscribers;
    if (subscriberTopicMap.containsKey(topic)) {
      subscribers = subscriberTopicMap.get(topic);
      for (Subscriber s : subscribers) {
        s.onEvent(event);
      }
    }
  }
}
