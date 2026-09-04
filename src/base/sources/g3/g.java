package g3;

import com.inmobi.media.core.config.models.AdConfig;
import o2.q;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f38915d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f38916a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38918c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f38915d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f38915d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f38918c;
    }

    public long d(q qVar, boolean z10, boolean z11, int i10) {
        if (this.f38917b == 0) {
            if (!qVar.readFully(this.f38916a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f38916a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f38918c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f38917b = 1;
        }
        int i11 = this.f38918c;
        if (i11 > i10) {
            this.f38917b = 0;
            return -2L;
        }
        if (i11 != 1) {
            qVar.readFully(this.f38916a, 1, i11 - 1);
        }
        this.f38917b = 0;
        return a(this.f38916a, this.f38918c, z11);
    }

    public void e() {
        this.f38917b = 0;
        this.f38918c = 0;
    }
}
