package hj;

import com.inmobi.media.core.config.models.AdConfig;
import gl.j;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f40415d = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40416e = 9;

    public a(int i10, int i11, int i12) {
        this.f40412a = i10;
        this.f40413b = i11;
        this.f40414c = i12;
    }

    private final int a() {
        int iA0 = j.a0(this.f40415d, this.f40413b);
        if (iA0 == -1) {
            return 4;
        }
        return iA0;
    }

    private final void d(byte[] bArr, int i10) {
        int iA = a();
        bArr[i10] = -1;
        bArr[i10 + 1] = -7;
        int i11 = (iA << 2) | ((this.f40412a - 1) << 6);
        int i12 = this.f40414c;
        bArr[i10 + 2] = (byte) (i11 | (i12 >> 2));
        bArr[i10 + 3] = (byte) (((i12 & 3) << 6) | (bArr.length >> 11));
        bArr[i10 + 4] = (byte) ((bArr.length & 2047) >> 3);
        bArr[i10 + 5] = (byte) (((byte) ((bArr.length & 7) << 5)) + 31);
        bArr[i10 + 6] = -4;
    }

    private final void e(byte[] bArr, int i10) {
        int iA = a();
        bArr[i10] = (byte) ((this.f40412a << 3) | (iA >> 1));
        bArr[i10 + 1] = (byte) (((iA << 7) & 128) + ((this.f40414c << 3) & AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
    }

    public final int b() {
        return this.f40416e;
    }

    public final void c(byte[] buffer, int i10) {
        s.h(buffer, "buffer");
        e(buffer, i10);
        d(buffer, i10 + 2);
    }
}
