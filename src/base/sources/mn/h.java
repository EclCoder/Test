package mn;

import gn.a0;
import gn.g0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f46509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xn.g f46510c;

    public h(String str, long j10, xn.g source) {
        s.h(source, "source");
        this.f46508a = str;
        this.f46509b = j10;
        this.f46510c = source;
    }

    @Override // gn.g0
    public long contentLength() {
        return this.f46509b;
    }

    @Override // gn.g0
    public a0 contentType() {
        String str = this.f46508a;
        if (str != null) {
            return a0.f39423e.b(str);
        }
        return null;
    }

    @Override // gn.g0
    public xn.g source() {
        return this.f46510c;
    }
}
