package uj;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54688a = 5000;

    public static /* synthetic */ void d(a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flush");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.c(z10);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(boolean z10);

    public abstract InputStream e();

    public abstract OutputStream f();

    protected final int g() {
        return this.f54688a;
    }

    public abstract boolean h();

    public abstract boolean i();
}
