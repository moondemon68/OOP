import java.lang.reflect.*;

public class AssistantDecoder {
    private Assistant a;
    AssistantDecoder(Assistant assistant) {
        a = assistant;
    }

    public void addPersonToRecommendations(String name) throws Exception {
        try {
            Class c = a.getClass();
            Method m = c.getDeclaredMethod("addPersonToRecommendations", String.class);
            m.setAccessible(true);
            m.invoke(a, name);
        } catch (Exception e) {

        }
    }

    public int getSalary() throws Exception {
        Class c = a.getClass();
        Field f = c.getDeclaredField("salary");
        f.setAccessible(true);
        int ans = (Integer) f.get(a);
        return ans;
    }
}