package androidx.media3.exoplayer.audio;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.math.RoundingMode;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class k implements DefaultAudioSink.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f5068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f5069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f5070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f5071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f5072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5074h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f5075a = 250000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5076b = 750000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f5077c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f5078d = 250000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f5079e = 50000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f5080f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f5081g = 4;

        public k h() {
            return new k(this);
        }
    }

    protected k(a aVar) {
        this.f5068b = aVar.f5075a;
        this.f5069c = aVar.f5076b;
        this.f5070d = aVar.f5077c;
        this.f5071e = aVar.f5078d;
        this.f5072f = aVar.f5079e;
        this.f5073g = aVar.f5080f;
        this.f5074h = aVar.f5081g;
    }

    protected static int b(int i10, int i11, int i12) {
        return com.google.common.primitives.g.d(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static int d(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
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
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.e
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
        return com.google.common.primitives.g.d((((long) this.f5072f) * ((long) d(i10))) / 1000000);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    protected int f(int i10, int i11) {
        int i12;
        int iD;
        int i13 = this.f5071e;
        if (i10 != 5) {
            if (i10 == 8) {
                i12 = this.f5074h;
            }
            if (i11 != -1) {
                iD = wc.d.b(i11, 8, RoundingMode.CEILING);
            } else {
                iD = d(i10);
            }
            return com.google.common.primitives.g.d((((long) i13) * ((long) iD)) / 1000000);
        }
        i12 = this.f5073g;
        i13 *= i12;
        if (i11 != -1) {
            iD = wc.d.b(i11, 8, RoundingMode.CEILING);
        } else {
            iD = d(i10);
        }
        return com.google.common.primitives.g.d((((long) i13) * ((long) iD)) / 1000000);
    }

    protected int g(int i10, int i11, int i12) {
        return c0.o(i10 * this.f5070d, b(this.f5068b, i11, i12), b(this.f5069c, i11, i12));
    }
}
