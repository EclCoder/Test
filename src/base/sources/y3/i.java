package y3;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i extends p1 {
    public i() {
        super(false);
    }

    @Override // y3.p1
    public String b() {
        return "boolean";
    }

    @Override // y3.p1
    public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
        m(bundle, str, ((Boolean) obj).booleanValue());
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean a(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        Bundle bundleA = n4.c.a(bundle);
        if (!n4.c.b(bundleA, key) || n4.c.w(bundleA, key)) {
            return null;
        }
        return Boolean.valueOf(n4.c.e(bundleA, key));
    }

    @Override // y3.p1
    public Boolean l(String value) {
        boolean z10;
        kotlin.jvm.internal.s.h(value, "value");
        if (kotlin.jvm.internal.s.c(value, "true")) {
            z10 = true;
        } else {
            if (!kotlin.jvm.internal.s.c(value, "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public void m(Bundle bundle, String key, boolean z10) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        n4.k.c(n4.k.a(bundle), key, z10);
    }
}
