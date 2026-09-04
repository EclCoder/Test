package vp;

import java.lang.reflect.Field;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f55728a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f55729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f55730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f55731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f55732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f55733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f55734f;

        a(long j10, long j11, f fVar, long j12, f fVar2, long j13) {
            this.f55729a = j10;
            this.f55730b = j11;
            this.f55731c = fVar;
            this.f55732d = j12;
            this.f55733e = fVar2;
            this.f55734f = j13;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (long j10 = this.f55729a; j10 < this.f55730b; j10++) {
                this.f55731c.o(this.f55732d + j10, this.f55733e.n(this.f55734f + j10));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f55735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f55736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ vp.b f55737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f55738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ vp.b f55739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f55740f;

        b(long j10, long j11, vp.b bVar, long j12, vp.b bVar2, long j13) {
            this.f55735a = j10;
            this.f55736b = j11;
            this.f55737c = bVar;
            this.f55738d = j12;
            this.f55739e = bVar2;
            this.f55740f = j13;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (long j10 = this.f55735a; j10 < this.f55736b; j10++) {
                this.f55737c.r(this.f55738d + j10, this.f55739e.p(this.f55740f + j10));
            }
        }
    }

    static {
        Object obj = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(cls);
            e = null;
            obj = obj2;
        } catch (ClassNotFoundException e10) {
            e = e10;
        } catch (IllegalAccessException e11) {
            e = e11;
        } catch (IllegalArgumentException e12) {
            e = e12;
        } catch (NoSuchFieldException e13) {
            e = e13;
        } catch (SecurityException e14) {
            e = e14;
        }
        Unsafe unsafe = (Unsafe) obj;
        f55728a = unsafe;
        if (unsafe == null) {
            throw new Error("Could not obtain access to sun.misc.Unsafe", e);
        }
    }

    public static void a(vp.b bVar, long j10, vp.b bVar2, long j11, long j12) {
        if (j10 < 0 || j10 >= bVar.k()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (j11 < 0 || j11 >= bVar2.k()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (j12 < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        if (bVar2.i()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int iH = (int) bo.a.h(j12, vp.a.c());
        if (iH < 2 || j12 < vp.a.a()) {
            long j13 = j10;
            long j14 = j11;
            while (j13 < j10 + j12) {
                bVar2.r(j14, bVar.p(j13));
                j13++;
                j14++;
            }
            return;
        }
        long j15 = j12 / ((long) iH);
        Future[] futureArr = new Future[iH];
        int i10 = 0;
        while (i10 < iH) {
            long j16 = ((long) i10) * j15;
            Future[] futureArr2 = futureArr;
            int i11 = i10;
            futureArr2[i11] = vp.a.d(new b(j16, i10 == iH + (-1) ? j12 : j16 + j15, bVar2, j11, bVar, j10));
            i10 = i11 + 1;
            futureArr = futureArr2;
        }
        try {
            vp.a.e(futureArr);
        } catch (InterruptedException unused) {
            long j17 = j10;
            long j18 = j11;
            while (j17 < j10 + j12) {
                bVar2.r(j18, bVar.p(j17));
                j17++;
                j18++;
            }
        } catch (ExecutionException unused2) {
            long j19 = j10;
            long j20 = j11;
            while (j19 < j10 + j12) {
                bVar2.r(j20, bVar.p(j19));
                j19++;
                j20++;
            }
        }
    }

    public static void b(f fVar, long j10, f fVar2, long j11, long j12) {
        if (j10 < 0 || j10 >= fVar.k()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (j11 < 0 || j11 >= fVar2.k()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (j12 < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        if (fVar2.i()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int iH = (int) bo.a.h(j12, vp.a.c());
        if (iH < 2 || j12 < vp.a.a()) {
            long j13 = j10;
            long j14 = j11;
            while (j13 < j10 + j12) {
                fVar2.o(j14, fVar.n(j13));
                j13++;
                j14++;
            }
            return;
        }
        long j15 = j12 / ((long) iH);
        Future[] futureArr = new Future[iH];
        int i10 = 0;
        while (i10 < iH) {
            long j16 = ((long) i10) * j15;
            Future[] futureArr2 = futureArr;
            int i11 = i10;
            futureArr2[i11] = vp.a.d(new a(j16, i10 == iH + (-1) ? j12 : j16 + j15, fVar2, j11, fVar, j10));
            i10 = i11 + 1;
            futureArr = futureArr2;
        }
        try {
            vp.a.e(futureArr);
        } catch (InterruptedException unused) {
            long j17 = j10;
            long j18 = j11;
            while (j17 < j10 + j12) {
                fVar2.o(j18, fVar.n(j17));
                j17++;
                j18++;
            }
        } catch (ExecutionException unused2) {
            long j19 = j10;
            long j20 = j11;
            while (j19 < j10 + j12) {
                fVar2.o(j20, fVar.n(j19));
                j19++;
                j20++;
            }
        }
    }
}
