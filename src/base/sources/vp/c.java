package vp;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c implements Serializable, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f55700g = 1073741824;
    private static final long serialVersionUID = 7921589398878016801L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected d f55701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f55702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f55703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f55704d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Object f55705e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected long f55706f = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f55707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f55708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f55709c;

        a(long j10, long j11, long j12) {
            this.f55707a = j10;
            this.f55708b = j11;
            this.f55709c = j12;
        }

        @Override // java.lang.Runnable
        public void run() {
            switch (b.f55711a[c.this.f55701a.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    for (long j10 = this.f55707a; j10 < this.f55708b; j10++) {
                        e.f55728a.putByte(this.f55709c + (c.this.f55703c * j10), (byte) 0);
                    }
                    return;
                case 6:
                    for (long j11 = this.f55707a; j11 < this.f55708b; j11++) {
                        e.f55728a.putShort(this.f55709c + (c.this.f55703c * j11), (short) 0);
                    }
                    return;
                case 7:
                    for (long j12 = this.f55707a; j12 < this.f55708b; j12++) {
                        e.f55728a.putInt(this.f55709c + (c.this.f55703c * j12), 0);
                    }
                    return;
                case 8:
                    for (long j13 = this.f55707a; j13 < this.f55708b; j13++) {
                        e.f55728a.putLong(this.f55709c + (c.this.f55703c * j13), 0L);
                    }
                    return;
                case 9:
                    for (long j14 = this.f55707a; j14 < this.f55708b; j14++) {
                        e.f55728a.putFloat(this.f55709c + (c.this.f55703c * j14), 0.0f);
                    }
                    return;
                case 10:
                    for (long j15 = this.f55707a; j15 < this.f55708b; j15++) {
                        e.f55728a.putDouble(this.f55709c + (c.this.f55703c * j15), 0.0d);
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Invalid array type.");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55711a;

        static {
            int[] iArr = new int[d.values().length];
            f55711a = iArr;
            try {
                iArr[d.f55715a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55711a[d.f55716b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55711a[d.f55717c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55711a[d.f55725k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55711a[d.f55726l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55711a[d.f55718d.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55711a[d.f55719e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55711a[d.f55720f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55711a[d.f55721g.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55711a[d.f55722h.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: vp.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class RunnableC0846c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f55712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f55713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f55714c;

        public RunnableC0846c(long j10, long j11, long j12) {
            this.f55712a = j10;
            this.f55713b = j11;
            this.f55714c = j12;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j10 = this.f55712a;
            if (j10 != 0) {
                e.f55728a.freeMemory(j10);
                this.f55712a = 0L;
                g.a(this.f55713b * this.f55714c);
            }
        }
    }

    protected c() {
    }

    public static int g() {
        return f55700g;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            boolean z10 = this.f55701a == cVar.f55701a && this.f55702b == cVar.f55702b && this.f55703c == cVar.f55703c && this.f55704d == cVar.f55704d && this.f55706f == cVar.f55706f;
            Object obj3 = this.f55705e;
            if (obj3 != null && (obj2 = cVar.f55705e) != null) {
                return z10 && obj3.equals(obj2);
            }
            if (obj3 == null && cVar.f55705e == null) {
                return z10;
            }
        }
        return false;
    }

    public int hashCode() {
        d dVar = this.f55701a;
        int iHashCode = (Sdk$SDKError.b.AD_IS_LOADING_VALUE + (dVar != null ? dVar.hashCode() : 0)) * 29;
        long j10 = this.f55702b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 29;
        long j11 = this.f55703c;
        int i11 = (((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 29) + (this.f55704d ? 1 : 0)) * 29;
        Object obj = this.f55705e;
        int iHashCode2 = obj != null ? obj.hashCode() : 0;
        long j12 = this.f55706f;
        return ((i11 + iHashCode2) * 29) + ((int) ((j12 >>> 32) ^ j12));
    }

    public boolean i() {
        return this.f55704d;
    }

    public boolean j() {
        return this.f55706f != 0;
    }

    public long k() {
        return this.f55702b;
    }

    protected void l(long j10) {
        if (this.f55706f != 0) {
            int iH = (int) bo.a.h(j10, vp.a.c());
            if (iH <= 2 || j10 < vp.a.a()) {
                e.f55728a.setMemory(this.f55706f, j10 * this.f55703c, (byte) 0);
                return;
            }
            long j11 = j10 / ((long) iH);
            Future[] futureArr = new Future[iH];
            long j12 = this.f55706f;
            int i10 = 0;
            while (i10 < iH) {
                long j13 = ((long) i10) * j11;
                futureArr[i10] = vp.a.d(new a(j13, i10 == iH + (-1) ? j10 : j13 + j11, j12));
                i10++;
            }
            try {
                vp.a.e(futureArr);
            } catch (InterruptedException unused) {
                e.f55728a.setMemory(this.f55706f, j10 * this.f55703c, (byte) 0);
            } catch (ExecutionException unused2) {
                e.f55728a.setMemory(this.f55706f, j10 * this.f55703c, (byte) 0);
            }
        }
    }
}
