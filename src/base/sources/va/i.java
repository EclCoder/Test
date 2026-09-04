package va;

import android.net.Uri;
import ob.p0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f55350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55351d;

    public i(String str, long j10, long j11) {
        this.f55350c = str == null ? "" : str;
        this.f55348a = j10;
        this.f55349b = j11;
    }

    public i a(i iVar, String str) {
        String strC = c(str);
        i iVar2 = null;
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j10 = this.f55349b;
            if (j10 != -1) {
                long j11 = this.f55348a;
                if (j11 + j10 == iVar.f55348a) {
                    long j12 = iVar.f55349b;
                    return new i(strC, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f55349b;
            if (j13 != -1) {
                long j14 = iVar.f55348a;
                if (j14 + j13 == this.f55348a) {
                    iVar2 = new i(strC, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return iVar2;
    }

    public Uri b(String str) {
        return p0.e(str, this.f55350c);
    }

    public String c(String str) {
        return p0.d(str, this.f55350c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f55348a == iVar.f55348a && this.f55349b == iVar.f55349b && this.f55350c.equals(iVar.f55350c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f55351d == 0) {
            this.f55351d = ((((527 + ((int) this.f55348a)) * 31) + ((int) this.f55349b)) * 31) + this.f55350c.hashCode();
        }
        return this.f55351d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f55350c + ", start=" + this.f55348a + ", length=" + this.f55349b + ")";
    }
}
