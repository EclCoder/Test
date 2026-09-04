package com.google.android.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.math.RoundingMode;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class j implements DefaultAudioSink.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f16631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f16632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f16633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f16634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f16635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16636g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16637a = 250000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16638b = 750000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16639c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16640d = 250000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f16641e = 50000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f16642f = 2;

        public j g() {
            return new j(this);
        }
    }

    protected j(a aVar) {
        this.f16631b = aVar.f16637a;
        this.f16632c = aVar.f16638b;
        this.f16633d = aVar.f16639c;
        this.f16634e = aVar.f16640d;
        this.f16635f = aVar.f16641e;
        this.f16636g = aVar.f16642f;
    }

    protected static int b(int i10, int i11, int i12) {
        return com.google.common.primitives.g.d(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return DefaultOggSeeker.MATCH_BYTE_RANGE;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.e
    public int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (((double) c(i10, i11, i12, i13, i14, i15)) * d10)) + i13) - 1) / i13) * i13;
    }

    protected int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    protected int e(int i10) {
        return com.google.common.primitives.g.d((((long) this.f16635f) * ((long) d(i10))) / 1000000);
    }

    protected int f(int i10, int i11) {
        int i12 = this.f16634e;
        if (i10 == 5) {
            i12 *= this.f16636g;
        }
        return com.google.common.primitives.g.d((((long) i12) * ((long) (i11 != -1 ? wc.d.b(i11, 8, RoundingMode.CEILING) : d(i10)))) / 1000000);
    }

    protected int g(int i10, int i11, int i12) {
        return r0.q(i10 * this.f16633d, b(this.f16631b, i11, i12), b(this.f16632c, i11, i12));
    }
}
