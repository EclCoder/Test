package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import nb.v;
import ob.o0;
import ob.r0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Loader implements v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f18743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f18744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f18745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f18746g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f18747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f18748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f18749c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void e(e eVar, long j10, long j11, boolean z10);

        void i(e eVar, long j10, long j11);

        c n(e eVar, long j10, long j11, IOException iOException, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f18751b;

        public boolean c() {
            int i10 = this.f18750a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f18750a = i10;
            this.f18751b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class d extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f18753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f18754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b f18755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IOException f18756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f18757f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Thread f18758g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f18759h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f18760i;

        public d(Looper looper, e eVar, b bVar, int i10, long j10) {
            super(looper);
            this.f18753b = eVar;
            this.f18755d = bVar;
            this.f18752a = i10;
            this.f18754c = j10;
        }

        private void b() {
            this.f18756e = null;
            Loader.this.f18747a.execute((Runnable) ob.a.e(Loader.this.f18748b));
        }

        private void c() {
            Loader.this.f18748b = null;
        }

        private long d() {
            return Math.min((this.f18757f - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f18760i = z10;
            this.f18756e = null;
            if (hasMessages(0)) {
                this.f18759h = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f18759h = true;
                        this.f18753b.cancelLoad();
                        Thread thread = this.f18758g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z10) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) ob.a.e(this.f18755d)).e(this.f18753b, jElapsedRealtime, jElapsedRealtime - this.f18754c, true);
                this.f18755d = null;
            }
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f18756e;
            if (iOException != null && this.f18757f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            ob.a.g(Loader.this.f18748b == null);
            Loader.this.f18748b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f18760i) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                b();
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f18754c;
            b bVar = (b) ob.a.e(this.f18755d);
            if (this.f18759h) {
                bVar.e(this.f18753b, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    bVar.i(this.f18753b, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    u.d("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f18749c = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f18756e = iOException;
            int i12 = this.f18757f + 1;
            this.f18757f = i12;
            c cVarN = bVar.n(this.f18753b, jElapsedRealtime, j10, iOException, i12);
            if (cVarN.f18750a == 3) {
                Loader.this.f18749c = this.f18756e;
            } else if (cVarN.f18750a != 2) {
                if (cVarN.f18750a == 1) {
                    this.f18757f = 1;
                }
                f(cVarN.f18751b != C.TIME_UNSET ? cVarN.f18751b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f18759h;
                    this.f18758g = Thread.currentThread();
                }
                if (!z10) {
                    o0.a("load:" + this.f18753b.getClass().getSimpleName());
                    try {
                        this.f18753b.load();
                        o0.c();
                    } catch (Throwable th2) {
                        o0.c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f18758g = null;
                    Thread.interrupted();
                }
                if (this.f18760i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f18760i) {
                    return;
                }
                obtainMessage(2, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f18760i) {
                    u.d("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f18760i) {
                    return;
                }
                u.d("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(2, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f18760i) {
                    return;
                }
                u.d("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        void cancelLoad();

        void load();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
        void onLoaderReleased();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f18762a;

        public g(f fVar) {
            this.f18762a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18762a.onLoaderReleased();
        }
    }

    static {
        long j10 = C.TIME_UNSET;
        f18743d = g(false, C.TIME_UNSET);
        f18744e = g(true, C.TIME_UNSET);
        f18745f = new c(2, j10);
        f18746g = new c(3, j10);
    }

    public Loader(String str) {
        this.f18747a = r0.I0("ExoPlayer:Loader:" + str);
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) ob.a.i(this.f18748b)).a(false);
    }

    public void f() {
        this.f18749c = null;
    }

    public boolean h() {
        return this.f18749c != null;
    }

    public boolean i() {
        return this.f18748b != null;
    }

    public void j(int i10) throws IOException {
        IOException iOException = this.f18749c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f18748b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f18752a;
            }
            dVar.e(i10);
        }
    }

    public void k() {
        l(null);
    }

    public void l(f fVar) {
        d dVar = this.f18748b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f18747a.execute(new g(fVar));
        }
        this.f18747a.shutdown();
    }

    public long m(e eVar, b bVar, int i10) {
        Looper looper = (Looper) ob.a.i(Looper.myLooper());
        this.f18749c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i10, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }

    @Override // nb.v
    public void maybeThrowError() throws IOException {
        j(Integer.MIN_VALUE);
    }
}
