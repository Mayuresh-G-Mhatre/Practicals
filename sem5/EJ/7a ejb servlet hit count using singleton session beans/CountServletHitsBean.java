package p1;

import javax.ejb.Singleton;

@Singleton
public class CountServletHitsBean {

    private int hitCount;

    public synchronized int incrementAndGetHitCount() {
        return hitCount++;
    }
}
