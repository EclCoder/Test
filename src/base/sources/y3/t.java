package y3;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class t extends p1 {
    public t() {
        super(false);
    }

    @Override // y3.p1
    public String b() {
        return "long";
    }

    @Override // y3.p1
    public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
        m(bundle, str, ((Number) obj).longValue());
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Long a(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        return Long.valueOf(n4.c.l(n4.c.a(bundle), key));
    }

    @Override // y3.p1
    public Long l(String value) {
        String strSubstring;
        long j10;
        kotlin.jvm.internal.s.h(value, "value");
        if (bm.r.z(value, "L", false, 2, null)) {
            strSubstring = value.substring(0, value.length() - 1);
            kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        } else {
            strSubstring = value;
        }
        if (bm.r.N(value, "0x", false, 2, null)) {
            String strSubstring2 = strSubstring.substring(2);
            kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
            j10 = Long.parseLong(strSubstring2, bm.a.a(16));
        } else {
            j10 = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j10);
    }

    public void m(Bundle bundle, String key, long j10) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        n4.k.i(n4.k.a(bundle), key, j10);
    }
}
