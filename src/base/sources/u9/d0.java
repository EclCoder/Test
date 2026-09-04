package u9;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f54257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54260d;

    public d0(byte[] bArr) {
        this.f54257a = bArr;
        this.f54258b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f54259c;
        ob.a.g(i11 >= 0 && (i11 < (i10 = this.f54258b) || (i11 == i10 && this.f54260d == 0)));
    }

    public int b() {
        return (this.f54259c * 8) + this.f54260d;
    }

    public boolean c() {
        boolean z10 = (((this.f54257a[this.f54259c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f54260d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f54259c;
        int iMin = Math.min(i10, 8 - this.f54260d);
        int i12 = i11 + 1;
        int i13 = ((this.f54257a[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f54260d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f54257a[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f54259c + i11;
        this.f54259c = i12;
        int i13 = this.f54260d + (i10 - (i11 * 8));
        this.f54260d = i13;
        if (i13 > 7) {
            this.f54259c = i12 + 1;
            this.f54260d = i13 - 8;
        }
        a();
    }
}
