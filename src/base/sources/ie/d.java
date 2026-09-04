package ie;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f41329b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f41330a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar;
        d dVar2 = f41329b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f41329b;
                if (dVar == null) {
                    dVar = new d();
                    f41329b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f41330a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f41330a);
        }
        return setUnmodifiableSet;
    }
}
