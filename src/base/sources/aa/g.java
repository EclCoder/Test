package aa;

import com.inmobi.media.core.config.models.AdConfig;
import u9.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f233d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f234a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f236c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f233d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f233d;
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
        return this.f236c;
    }

    public long d(l lVar, boolean z10, boolean z11, int i10) {
        if (this.f235b == 0) {
            if (!lVar.readFully(this.f234a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f234a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f236c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f235b = 1;
        }
        int i11 = this.f236c;
        if (i11 > i10) {
            this.f235b = 0;
            return -2L;
        }
        if (i11 != 1) {
            lVar.readFully(this.f234a, 1, i11 - 1);
        }
        this.f235b = 0;
        return a(this.f234a, this.f236c, z11);
    }

    public void e() {
        this.f235b = 0;
        this.f236c = 0;
    }
}
