package s;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f51437a;

    public c(int i10, float f10) {
        this.f51437a = new LinkedHashMap(i10, f10, true);
    }

    public final Object a(Object key) {
        s.h(key, "key");
        return this.f51437a.get(key);
    }

    public final Set b() {
        Set setEntrySet = this.f51437a.entrySet();
        s.g(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f51437a.isEmpty();
    }

    public final Object d(Object key, Object value) {
        s.h(key, "key");
        s.h(value, "value");
        return this.f51437a.put(key, value);
    }

    public final Object e(Object key) {
        s.h(key, "key");
        return this.f51437a.remove(key);
    }
}
