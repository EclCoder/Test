package lk;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AbstractC0679c f44638b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f44639a;

        static {
            Map map = Collections.EMPTY_MAP;
            f44638b = AbstractC0679c.a(map, map);
        }

        private b() {
            this.f44639a = new HashSet();
        }

        @Override // lk.c
        public void b(Collection collection) {
            jk.b.b(collection, "spanNames");
            synchronized (this.f44639a) {
                this.f44639a.addAll(collection);
            }
        }
    }

    /* JADX INFO: renamed from: lk.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class AbstractC0679c {
        AbstractC0679c() {
        }

        public static AbstractC0679c a(Map map, Map map2) {
            return new lk.a(Collections.unmodifiableMap(new HashMap((Map) jk.b.b(map, "numbersOfLatencySampledSpans"))), Collections.unmodifiableMap(new HashMap((Map) jk.b.b(map2, "numbersOfErrorSampledSpans"))));
        }

        public abstract Map b();

        public abstract Map c();
    }

    protected c() {
    }

    static c a() {
        return new b();
    }

    public abstract void b(Collection collection);
}
