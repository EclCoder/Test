package u9;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f54315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f54318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f54319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f54320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ha.a f54321l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f54322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f54323b;

        public a(long[] jArr, long[] jArr2) {
            this.f54322a = jArr;
            this.f54323b = jArr2;
        }
    }

    public t(byte[] bArr, int i10) {
        ob.c0 c0Var = new ob.c0(bArr);
        c0Var.p(i10 * 8);
        this.f54310a = c0Var.h(16);
        this.f54311b = c0Var.h(16);
        this.f54312c = c0Var.h(24);
        this.f54313d = c0Var.h(24);
        int iH = c0Var.h(20);
        this.f54314e = iH;
        this.f54315f = j(iH);
        this.f54316g = c0Var.h(3) + 1;
        int iH2 = c0Var.h(5) + 1;
        this.f54317h = iH2;
        this.f54318i = e(iH2);
        this.f54319j = c0Var.j(36);
        this.f54320k = null;
        this.f54321l = null;
    }

    private static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public t a(List list) {
        return new t(this.f54310a, this.f54311b, this.f54312c, this.f54313d, this.f54314e, this.f54316g, this.f54317h, this.f54319j, this.f54320k, h(new ha.a(list)));
    }

    public t b(a aVar) {
        return new t(this.f54310a, this.f54311b, this.f54312c, this.f54313d, this.f54314e, this.f54316g, this.f54317h, this.f54319j, aVar, this.f54321l);
    }

    public t c(List list) {
        return new t(this.f54310a, this.f54311b, this.f54312c, this.f54313d, this.f54314e, this.f54316g, this.f54317h, this.f54319j, this.f54320k, h(e0.c(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f54313d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f54312c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f54310a;
            j10 = ((((i11 != this.f54311b || i11 <= 0) ? 4096L : i11) * ((long) this.f54316g)) * ((long) this.f54317h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f54319j;
        return j10 == 0 ? C.TIME_UNSET : (j10 * 1000000) / ((long) this.f54314e);
    }

    public v0 g(byte[] bArr, ha.a aVar) {
        bArr[4] = -128;
        int i10 = this.f54313d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new v0.b().g0(MimeTypes.AUDIO_FLAC).Y(i10).J(this.f54316g).h0(this.f54314e).V(Collections.singletonList(bArr)).Z(h(aVar)).G();
    }

    public ha.a h(ha.a aVar) {
        ha.a aVar2 = this.f54321l;
        return aVar2 == null ? aVar : aVar2.b(aVar);
    }

    public long i(long j10) {
        return r0.r((j10 * ((long) this.f54314e)) / 1000000, 0L, this.f54319j - 1);
    }

    private t(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, ha.a aVar2) {
        this.f54310a = i10;
        this.f54311b = i11;
        this.f54312c = i12;
        this.f54313d = i13;
        this.f54314e = i14;
        this.f54315f = j(i14);
        this.f54316g = i15;
        this.f54317h = i16;
        this.f54318i = e(i16);
        this.f54319j = j10;
        this.f54320k = aVar;
        this.f54321l = aVar2;
    }
}
