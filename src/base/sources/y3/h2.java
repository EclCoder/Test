package y3;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends p1 {
    public h2() {
        super(true);
    }

    @Override // y3.p1
    public String b() {
        return "string";
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String a(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.c.a(bundle);
        if (!n4.c.b(bundleA, key) || n4.c.w(bundleA, key)) {
            return null;
        }
        return n4.c.r(bundleA, key);
    }

    @Override // y3.p1
    public String l(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        if (kotlin.jvm.internal.s.c(value, "null")) {
            return null;
        }
        return value;
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void h(Bundle bundle, String key, String str) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.k.a(bundle);
        if (str != null) {
            n4.k.p(bundleA, key, str);
        } else {
            n4.k.k(bundleA, key);
        }
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public String i(String str) {
        String strC;
        return (str == null || (strC = s1.c(s1.f57297a, str, null, 2, null)) == null) ? "null" : strC;
    }
}
