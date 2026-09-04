package nb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f47057a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f47058b;

    public synchronized Map a() {
        try {
            if (this.f47058b == null) {
                this.f47058b = Collections.unmodifiableMap(new HashMap(this.f47057a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47058b;
    }
}
