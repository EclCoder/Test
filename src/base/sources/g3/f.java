package g3;

import com.inmobi.media.core.config.models.AdConfig;
import o2.q;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f38913a = new u(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38914b;

    private long a(q qVar) {
        int i10 = 0;
        qVar.peekFully(this.f38913a.e(), 0, 1);
        int i11 = this.f38913a.e()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        qVar.peekFully(this.f38913a.e(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f38913a.e()[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i14 << 8);
        }
        this.f38914b += i13 + 1;
        return i14;
    }

    public boolean b(q qVar) {
        long length = qVar.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        qVar.peekFully(this.f38913a.e(), 0, 4);
        long jI = this.f38913a.I();
        this.f38914b = 4;
        while (jI != 440786851) {
            int i11 = this.f38914b + 1;
            this.f38914b = i11;
            if (i11 == i10) {
                return false;
            }
            qVar.peekFully(this.f38913a.e(), 0, 1);
            jI = ((jI << 8) & (-256)) | ((long) (this.f38913a.e()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        long jA = a(qVar);
        long j11 = this.f38914b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f38914b;
                long j12 = j11 + jA;
                if (i12 < j12) {
                    if (a(qVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(qVar);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        return false;
                    }
                    if (jA2 != 0) {
                        int i13 = (int) jA2;
                        qVar.advancePeekPosition(i13);
                        this.f38914b += i13;
                    }
                } else if (i12 == j12) {
                    return true;
                }
            }
        }
        return false;
    }
}
