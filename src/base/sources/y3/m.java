package y3;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m extends p1 {
    public m() {
        super(false);
    }

    @Override // y3.p1
    public String b() {
        return "float";
    }

    @Override // y3.p1
    public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
        m(bundle, str, ((Number) obj).floatValue());
    }

    @Override // y3.p1
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Float a(Bundle bundle, String key) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        return Float.valueOf(n4.c.h(n4.c.a(bundle), key));
    }

    @Override // y3.p1
    public Float l(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        return Float.valueOf(Float.parseFloat(value));
    }

    public void m(Bundle bundle, String key, float f10) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(key, "key");
        n4.k.e(n4.k.a(bundle), key, f10);
    }
}
