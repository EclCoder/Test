package y3;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class q extends p1 {
    public q() {
        super(false);
    }

    @Override // y3.p1
    public String b() {
        return "integer";
    }

    @Override // y3.p1
    public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
        m(bundle, str, ((Number) obj).intValue());
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer a(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        return Integer.valueOf(n4.c.j(n4.c.a(bundle), key));
    }

    @Override // y3.p1
    public Integer l(String value) {
        int i10;
        kotlin.jvm.internal.s.h(value, "value");
        if (bm.r.N(value, "0x", false, 2, null)) {
            String strSubstring = value.substring(2);
            kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
            i10 = Integer.parseInt(strSubstring, bm.a.a(16));
        } else {
            i10 = Integer.parseInt(value);
        }
        return Integer.valueOf(i10);
    }

    public void m(Bundle bundle, String key, int i10) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        n4.k.g(n4.k.a(bundle), key, i10);
    }
}
