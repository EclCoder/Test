package m2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f45085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f45086e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f45088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45089c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media3.common.util.a f45090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f45091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Error f45092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RuntimeException f45093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f45094e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) throws GlUtil.GlException {
            w1.a.e(this.f45090a);
            this.f45090a.h(i10);
            this.f45094e = new e(this, this.f45090a.g(), i10 != 0);
        }

        private void d() {
            w1.a.e(this.f45090a);
            this.f45090a.i();
        }

        public e a(int i10) {
            boolean z10;
            start();
            this.f45091b = new Handler(getLooper(), this);
            this.f45090a = new androidx.media3.common.util.a(this.f45091b);
            synchronized (this) {
                z10 = false;
                this.f45091b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f45094e == null && this.f45093d == null && this.f45092c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f45093d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f45092c;
            if (error == null) {
                return (e) w1.a.e(this.f45094e);
            }
            throw error;
        }

        public void c() {
            w1.a.e(this.f45091b);
            this.f45091b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable th2) {
                        try {
                            w1.n.d("PlaceholderSurface", "Failed to release placeholder surface", th2);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e10) {
                    w1.n.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f45093d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    w1.n.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f45092c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    w1.n.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f45093d = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th3) {
                synchronized (this) {
                    notify();
                    throw th3;
                }
            }
        }
    }

    private static int a(Context context) {
        if (GlUtil.d(context)) {
            return GlUtil.e() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f45086e) {
                f45085d = a(context);
                f45086e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f45085d != 0;
    }

    public static e c(Context context, boolean z10) {
        w1.a.g(!z10 || b(context));
        return new b().a(z10 ? f45085d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f45088b) {
            try {
                if (!this.f45089c) {
                    this.f45088b.c();
                    this.f45089c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private e(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f45088b = bVar;
        this.f45087a = z10;
    }
}
