package xn;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f56925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f56927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReentrantLock f56928d = u0.b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f56929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f56930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f56931c;

        public a(j fileHandle, long j10) {
            kotlin.jvm.internal.s.h(fileHandle, "fileHandle");
            this.f56929a = fileHandle;
            this.f56930b = j10;
        }

        @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f56931c) {
                return;
            }
            this.f56931c = true;
            ReentrantLock reentrantLockK = this.f56929a.k();
            reentrantLockK.lock();
            try {
                this.f56929a.f56927c--;
                if (this.f56929a.f56927c == 0 && this.f56929a.f56926b) {
                    fl.g0 g0Var = fl.g0.f38750a;
                    reentrantLockK.unlock();
                    this.f56929a.l();
                    return;
                }
                reentrantLockK.unlock();
            } catch (Throwable th2) {
                reentrantLockK.unlock();
                throw th2;
            }
        }

        @Override // xn.q0
        public long read(e sink, long j10) {
            kotlin.jvm.internal.s.h(sink, "sink");
            if (this.f56931c) {
                throw new IllegalStateException("closed");
            }
            long jR = this.f56929a.r(this.f56930b, sink, j10);
            if (jR != -1) {
                this.f56930b += jR;
            }
            return jR;
        }

        @Override // xn.q0
        public r0 timeout() {
            return r0.f56980e;
        }
    }

    public j(boolean z10) {
        this.f56925a = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long r(long j10, e eVar, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (j13 < j12) {
            l0 l0VarC1 = eVar.c1(1);
            byte[] bArr = l0VarC1.f56952a;
            int i10 = l0VarC1.f56954c;
            int iM = m(j13, bArr, i10, (int) Math.min(j12 - j13, 8192 - i10));
            if (iM == -1) {
                if (l0VarC1.f56953b == l0VarC1.f56954c) {
                    eVar.f56903a = l0VarC1.b();
                    m0.b(l0VarC1);
                }
                if (j10 != j13) {
                    break;
                }
                return -1L;
            }
            l0VarC1.f56954c += iM;
            long j14 = iM;
            j13 += j14;
            eVar.Z0(eVar.size() + j14);
        }
        return j13 - j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f56928d;
        reentrantLock.lock();
        try {
            if (this.f56926b) {
                reentrantLock.unlock();
                return;
            }
            this.f56926b = true;
            if (this.f56927c != 0) {
                reentrantLock.unlock();
                return;
            }
            fl.g0 g0Var = fl.g0.f38750a;
            reentrantLock.unlock();
            l();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final ReentrantLock k() {
        return this.f56928d;
    }

    protected abstract void l();

    protected abstract int m(long j10, byte[] bArr, int i10, int i11);

    protected abstract long q();

    public final q0 s(long j10) {
        ReentrantLock reentrantLock = this.f56928d;
        reentrantLock.lock();
        try {
            if (this.f56926b) {
                throw new IllegalStateException("closed");
            }
            this.f56927c++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.f56928d;
        reentrantLock.lock();
        try {
            if (this.f56926b) {
                throw new IllegalStateException("closed");
            }
            fl.g0 g0Var = fl.g0.f38750a;
            reentrantLock.unlock();
            return q();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
