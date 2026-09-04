package tm;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f53454e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f53455f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rm.f f53456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tl.o f53457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f53458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f53459d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d0(rm.f descriptor, tl.o readIfAbsent) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        kotlin.jvm.internal.s.h(readIfAbsent, "readIfAbsent");
        this.f53456a = descriptor;
        this.f53457b = readIfAbsent;
        int iE = descriptor.e();
        if (iE <= 64) {
            this.f53458c = iE != 64 ? (-1) << iE : 0L;
            this.f53459d = f53455f;
        } else {
            this.f53458c = 0L;
            this.f53459d = e(iE);
        }
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f53459d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f53459d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f53459d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (((Boolean) this.f53457b.invoke(this.f53456a, Integer.valueOf(i13))).booleanValue()) {
                    this.f53459d[i10] = j10;
                    return i13;
                }
            }
            this.f53459d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[gl.j.V(jArr)] = (-1) << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f53458c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iE = this.f53456a.e();
        do {
            long j10 = this.f53458c;
            if (j10 == -1) {
                if (iE > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f53458c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f53457b.invoke(this.f53456a, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
