package no;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f47885a;

    c(Map map) {
        this.f47885a = new ConcurrentHashMap(map);
    }

    @Override // no.b
    public Object a(String str) {
        if (str == null) {
            return null;
        }
        return this.f47885a.get(str.toLowerCase(Locale.ROOT));
    }

    public String toString() {
        return this.f47885a.toString();
    }
}
