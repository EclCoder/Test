package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j extends e.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f3895k = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {
        public Typeface a(Context context, k0.i.b bVar) {
            return k0.i.a(context, null, new k0.i.b[]{bVar});
        }

        public k0.i.a b(Context context, k0.e eVar) {
            return k0.i.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k0.e f3897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f3898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f3899d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f3900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f3901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f3902g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e.i f3903h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ContentObserver f3904i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f3905j;

        b(Context context, k0.e eVar, a aVar) {
            m0.g.h(context, "Context cannot be null");
            m0.g.h(eVar, "FontRequest cannot be null");
            this.f3896a = context.getApplicationContext();
            this.f3897b = eVar;
            this.f3898c = aVar;
        }

        private void b() {
            synchronized (this.f3899d) {
                try {
                    this.f3903h = null;
                    ContentObserver contentObserver = this.f3904i;
                    if (contentObserver != null) {
                        this.f3898c.c(this.f3896a, contentObserver);
                        this.f3904i = null;
                    }
                    Handler handler = this.f3900e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f3905j);
                    }
                    this.f3900e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f3902g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f3901f = null;
                    this.f3902g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private k0.i.b e() {
            try {
                k0.i.a aVarB = this.f3898c.b(this.f3896a, this.f3897b);
                if (aVarB.e() == 0) {
                    k0.i.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.e.h
        public void a(e.i iVar) {
            m0.g.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f3899d) {
                this.f3903h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f3899d) {
                try {
                    if (this.f3903h == null) {
                        return;
                    }
                    try {
                        k0.i.b bVarE = e();
                        int iA = bVarE.a();
                        if (iA == 2) {
                            synchronized (this.f3899d) {
                            }
                        }
                        if (iA != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iA + ")");
                        }
                        try {
                            j0.o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f3898c.a(this.f3896a, bVarE);
                            ByteBuffer byteBufferF = e0.r.f(this.f3896a, null, bVarE.d());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            m mVarB = m.b(typefaceA, byteBufferF);
                            j0.o.b();
                            synchronized (this.f3899d) {
                                try {
                                    e.i iVar = this.f3903h;
                                    if (iVar != null) {
                                        iVar.b(mVarB);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            b();
                        } catch (Throwable th3) {
                            j0.o.b();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        synchronized (this.f3899d) {
                            try {
                                e.i iVar2 = this.f3903h;
                                if (iVar2 != null) {
                                    iVar2.a(th4);
                                }
                                b();
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }

        void d() {
            synchronized (this.f3899d) {
                try {
                    if (this.f3903h == null) {
                        return;
                    }
                    if (this.f3901f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                        this.f3902g = threadPoolExecutorB;
                        this.f3901f = threadPoolExecutorB;
                    }
                    this.f3901f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3906a.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f3899d) {
                this.f3901f = executor;
            }
        }
    }

    public j(Context context, k0.e eVar) {
        super(new b(context, eVar, f3895k));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
