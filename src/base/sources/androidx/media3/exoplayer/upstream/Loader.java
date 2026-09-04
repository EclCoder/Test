package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import w1.a0;
import w1.c0;
import w1.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class Loader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f6090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f6091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f6092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f6093g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f6094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f6095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f6096c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th2.getClass().getSimpleName());
            if (th2.getMessage() != null) {
                str = ": " + th2.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        c b(e eVar, long j10, long j11, IOException iOException, int i10);

        void h(e eVar, long j10, long j11);

        void i(e eVar, long j10, long j11, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f6098b;

        public boolean c() {
            int i10 = this.f6097a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f6097a = i10;
            this.f6098b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class d extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f6100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f6101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b f6102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IOException f6103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f6104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Thread f6105g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f6106h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f6107i;

        public d(Looper looper, e eVar, b bVar, int i10, long j10) {
            super(looper);
            this.f6100b = eVar;
            this.f6102d = bVar;
            this.f6099a = i10;
            this.f6101c = j10;
        }

        private void b() {
            this.f6103e = null;
            Loader.this.f6094a.execute((Runnable) w1.a.e(Loader.this.f6095b));
        }

        private void c() {
            Loader.this.f6095b = null;
        }

        private long d() {
            return Math.min((this.f6104f - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f6107i = z10;
            this.f6103e = null;
            if (hasMessages(1)) {
                this.f6106h = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f6106h = true;
                        this.f6100b.cancelLoad();
                        Thread thread = this.f6105g;
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
                ((b) w1.a.e(this.f6102d)).i(this.f6100b, jElapsedRealtime, jElapsedRealtime - this.f6101c, true);
                this.f6102d = null;
            }
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f6103e;
            if (iOException != null && this.f6104f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            w1.a.g(Loader.this.f6095b == null);
            Loader.this.f6095b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f6107i) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                b();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f6101c;
            b bVar = (b) w1.a.e(this.f6102d);
            if (this.f6106h) {
                bVar.i(this.f6100b, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    bVar.h(this.f6100b, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    n.d("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f6096c = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f6103e = iOException;
            int i12 = this.f6104f + 1;
            this.f6104f = i12;
            c cVarB = bVar.b(this.f6100b, jElapsedRealtime, j10, iOException, i12);
            if (cVarB.f6097a == 3) {
                Loader.this.f6096c = this.f6103e;
            } else if (cVarB.f6097a != 2) {
                if (cVarB.f6097a == 1) {
                    this.f6104f = 1;
                }
                f(cVarB.f6098b != C.TIME_UNSET ? cVarB.f6098b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f6106h;
                    this.f6105g = Thread.currentThread();
                }
                if (!z10) {
                    a0.a("load:" + this.f6100b.getClass().getSimpleName());
                    try {
                        this.f6100b.load();
                        a0.b();
                    } catch (Throwable th2) {
                        a0.b();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f6105g = null;
                    Thread.interrupted();
                }
                if (this.f6107i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f6107i) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f6107i) {
                    n.d("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f6107i) {
                    return;
                }
                n.d("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(3, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f6107i) {
                    return;
                }
                n.d("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(3, new UnexpectedLoaderException(e13)).sendToTarget();
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
        private final f f6109a;

        public g(f fVar) {
            this.f6109a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6109a.onLoaderReleased();
        }
    }

    static {
        long j10 = C.TIME_UNSET;
        f6090d = g(false, C.TIME_UNSET);
        f6091e = g(true, C.TIME_UNSET);
        f6092f = new c(2, j10);
        f6093g = new c(3, j10);
    }

    public Loader(String str) {
        this.f6094a = c0.F0("ExoPlayer:Loader:" + str);
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) w1.a.i(this.f6095b)).a(false);
    }

    public void f() {
        this.f6096c = null;
    }

    public boolean h() {
        return this.f6096c != null;
    }

    public boolean i() {
        return this.f6095b != null;
    }

    public void j() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f6096c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f6095b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f6099a;
            }
            dVar.e(i10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d dVar = this.f6095b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f6094a.execute(new g(fVar));
        }
        this.f6094a.shutdown();
    }

    public long n(e eVar, b bVar, int i10) {
        Looper looper = (Looper) w1.a.i(Looper.myLooper());
        this.f6096c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i10, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }
}
