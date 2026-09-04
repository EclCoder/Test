package hn;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40709a = new a();

    private a() {
        super(null);
    }

    @Override // hn.f
    public Object a(zl.c key) {
        s.h(key, "key");
        return null;
    }

    @Override // hn.f
    public f b(zl.c key, Object obj) {
        s.h(key, "key");
        return obj != null ? new e(key, obj, this) : this;
    }

    public String toString() {
        return "{}";
    }
}
