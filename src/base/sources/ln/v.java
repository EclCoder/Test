package ln;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class v implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f44861a;

    public v(t routePlanner) {
        kotlin.jvm.internal.s.h(routePlanner, "routePlanner");
        this.f44861a = routePlanner;
    }

    @Override // ln.i
    public n a() throws Throwable {
        IOException iOException = null;
        while (!b().isCanceled()) {
            try {
                t.b bVarC = b().c();
                if (!bVarC.isReady()) {
                    t.a aVarD = bVarC.d();
                    if (aVarD.f()) {
                        aVarD = bVarC.b();
                    }
                    t.b bVarA = aVarD.a();
                    Throwable thB = aVarD.b();
                    if (thB != null) {
                        throw thB;
                    }
                    if (bVarA != null) {
                        b().b().addFirst(bVarA);
                    }
                }
                return bVarC.a();
            } catch (IOException e10) {
                if (iOException == null) {
                    iOException = e10;
                } else {
                    fl.e.a(iOException, e10);
                }
                if (!t.d(b(), null, 1, null)) {
                    throw iOException;
                }
            }
        }
        throw new IOException("Canceled");
    }

    @Override // ln.i
    public t b() {
        return this.f44861a;
    }
}
