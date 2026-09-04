package no;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f47886a = new HashMap();

    d() {
    }

    public static d b() {
        return new d();
    }

    public c a() {
        return new c(this.f47886a);
    }

    public d c(String str, Object obj) {
        ip.a.e(str, "ID");
        ip.a.h(obj, "Item");
        this.f47886a.put(str.toLowerCase(Locale.ROOT), obj);
        return this;
    }

    public String toString() {
        return this.f47886a.toString();
    }
}
