package v5;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f55168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f55169c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p5.a f55171e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f55170d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f55167a = new j();

    protected e(File file, long j10) {
        this.f55168b = file;
        this.f55169c = j10;
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized p5.a d() {
        try {
            if (this.f55171e == null) {
                this.f55171e = p5.a.p0(this.f55168b, 1, 1, this.f55169c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f55171e;
    }

    @Override // v5.a
    public void a(r5.e eVar, a.b bVar) {
        String strB = this.f55167a.b(eVar);
        this.f55170d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + eVar);
            }
            try {
                p5.a aVarD = d();
                if (aVarD.i0(strB) == null) {
                    p5.a.c cVarC0 = aVarD.c0(strB);
                    if (cVarC0 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                    }
                    try {
                        if (bVar.a(cVarC0.f(0))) {
                            cVarC0.e();
                        }
                        cVarC0.b();
                    } catch (Throwable th2) {
                        cVarC0.b();
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            this.f55170d.b(strB);
        } catch (Throwable th3) {
            this.f55170d.b(strB);
            throw th3;
        }
    }

    @Override // v5.a
    public File b(r5.e eVar) throws Throwable {
        String strB = this.f55167a.b(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + eVar);
        }
        try {
            p5.a.e eVarI0 = d().i0(strB);
            if (eVarI0 != null) {
                return eVarI0.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }
}
