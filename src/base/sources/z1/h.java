package z1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f58565a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f58566b;

    public synchronized Map a() {
        try {
            if (this.f58566b == null) {
                this.f58566b = Collections.unmodifiableMap(new HashMap(this.f58565a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f58566b;
    }
}
