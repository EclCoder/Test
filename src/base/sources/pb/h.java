package pb;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.GlUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f49910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f49911e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f49913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49914c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.exoplayer2.util.a f49915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f49916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Error f49917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RuntimeException f49918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private h f49919e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) throws GlUtil.GlException {
            ob.a.e(this.f49915a);
            this.f49915a.h(i10);
            this.f49919e = new h(this, this.f49915a.g(), i10 != 0);
        }

        private void d() {
            ob.a.e(this.f49915a);
            this.f49915a.i();
        }

        public h a(int i10) {
            boolean z10;
            start();
            this.f49916b = new Handler(getLooper(), this);
            this.f49915a = new com.google.android.exoplayer2.util.a(this.f49916b);
            synchronized (this) {
                z10 = false;
                this.f49916b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f49919e == null && this.f49918d == null && this.f49917c == null) {
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
            RuntimeException runtimeException = this.f49918d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f49917c;
            if (error == null) {
                return (h) ob.a.e(this.f49919e);
            }
            throw error;
        }

        public void c() {
            ob.a.e(this.f49916b);
            this.f49916b.sendEmptyMessage(2);
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
                            ob.u.d("PlaceholderSurface", "Failed to release placeholder surface", th2);
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
                    ob.u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f49918d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    ob.u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f49917c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    ob.u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f49918d = e12;
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
        if (GlUtil.h(context)) {
            return GlUtil.i() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f49911e) {
                f49910d = a(context);
                f49911e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f49910d != 0;
    }

    public static h c(Context context, boolean z10) {
        ob.a.g(!z10 || b(context));
        return new b().a(z10 ? f49910d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f49913b) {
            try {
                if (!this.f49914c) {
                    this.f49913b.c();
                    this.f49914c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private h(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f49913b = bVar;
        this.f49912a = z10;
    }
}
