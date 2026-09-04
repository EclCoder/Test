package o2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f48176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f48178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f48179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f48180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f48181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t1.u f48182l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f48183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f48184b;

        public a(long[] jArr, long[] jArr2) {
            this.f48183a = jArr;
            this.f48184b = jArr2;
        }
    }

    public y(byte[] bArr, int i10) {
        w1.t tVar = new w1.t(bArr);
        tVar.p(i10 * 8);
        this.f48171a = tVar.h(16);
        this.f48172b = tVar.h(16);
        this.f48173c = tVar.h(24);
        this.f48174d = tVar.h(24);
        int iH = tVar.h(20);
        this.f48175e = iH;
        this.f48176f = j(iH);
        this.f48177g = tVar.h(3) + 1;
        int iH2 = tVar.h(5) + 1;
        this.f48178h = iH2;
        this.f48179i = e(iH2);
        this.f48180j = tVar.j(36);
        this.f48181k = null;
        this.f48182l = null;
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

    public y a(List list) {
        return new y(this.f48171a, this.f48172b, this.f48173c, this.f48174d, this.f48175e, this.f48177g, this.f48178h, this.f48180j, this.f48181k, h(new t1.u(list)));
    }

    public y b(a aVar) {
        return new y(this.f48171a, this.f48172b, this.f48173c, this.f48174d, this.f48175e, this.f48177g, this.f48178h, this.f48180j, aVar, this.f48182l);
    }

    public y c(List list) {
        return new y(this.f48171a, this.f48172b, this.f48173c, this.f48174d, this.f48175e, this.f48177g, this.f48178h, this.f48180j, this.f48181k, h(r0.d(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f48174d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f48173c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f48171a;
            j10 = ((((i11 != this.f48172b || i11 <= 0) ? 4096L : i11) * ((long) this.f48177g)) * ((long) this.f48178h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f48180j;
        return j10 == 0 ? C.TIME_UNSET : (j10 * 1000000) / ((long) this.f48175e);
    }

    public t1.o g(byte[] bArr, t1.u uVar) {
        bArr[4] = -128;
        int i10 = this.f48174d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new t1.o.b().o0(MimeTypes.AUDIO_FLAC).f0(i10).N(this.f48177g).p0(this.f48175e).i0(w1.c0.b0(this.f48178h)).b0(Collections.singletonList(bArr)).h0(h(uVar)).K();
    }

    public t1.u h(t1.u uVar) {
        t1.u uVar2 = this.f48182l;
        return uVar2 == null ? uVar : uVar2.b(uVar);
    }

    public long i(long j10) {
        return w1.c0.p((j10 * ((long) this.f48175e)) / 1000000, 0L, this.f48180j - 1);
    }

    private y(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, t1.u uVar) {
        this.f48171a = i10;
        this.f48172b = i11;
        this.f48173c = i12;
        this.f48174d = i13;
        this.f48175e = i14;
        this.f48176f = j(i14);
        this.f48177g = i15;
        this.f48178h = i16;
        this.f48179i = e(i16);
        this.f48180j = j10;
        this.f48181k = aVar;
        this.f48182l = uVar;
    }
}
