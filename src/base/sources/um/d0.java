package um;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f54748a;

    public d0(InputStream stream) {
        kotlin.jvm.internal.s.h(stream, "stream");
        this.f54748a = new r(stream, bm.d.f9079b);
    }

    @Override // um.b0
    public int a(char[] buffer, int i10, int i11) {
        kotlin.jvm.internal.s.h(buffer, "buffer");
        return this.f54748a.d(buffer, i10, i11);
    }

    public final void b() {
        this.f54748a.e();
    }
}
