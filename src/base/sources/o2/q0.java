package o2;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f48145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48148d;

    public q0(byte[] bArr) {
        this.f48145a = bArr;
        this.f48146b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f48147c;
        w1.a.g(i11 >= 0 && (i11 < (i10 = this.f48146b) || (i11 == i10 && this.f48148d == 0)));
    }

    public int b() {
        return (this.f48147c * 8) + this.f48148d;
    }

    public boolean c() {
        boolean z10 = (((this.f48145a[this.f48147c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f48148d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f48147c;
        int iMin = Math.min(i10, 8 - this.f48148d);
        int i12 = i11 + 1;
        int i13 = ((this.f48145a[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f48148d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f48145a[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f48147c + i11;
        this.f48147c = i12;
        int i13 = this.f48148d + (i10 - (i11 * 8));
        this.f48148d = i13;
        if (i13 > 7) {
            this.f48147c = i12 + 1;
            this.f48148d = i13 - 8;
        }
        a();
    }
}
