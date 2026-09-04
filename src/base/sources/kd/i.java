package kd;

import android.os.Looper;
import bm.r;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f43177e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f43178f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f43179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f43180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f43181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f43182d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: kd.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* synthetic */ class C0656a extends p implements tl.a {
            C0656a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // tl.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).p());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* synthetic */ class b extends p implements tl.a {
            b(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // tl.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).q());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* synthetic */ class c extends p implements tl.a {
            c(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // tl.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).r());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String h() {
            return "Must be called on a background thread, was called on " + i.f43177e.o() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String j() {
            return "Must be called on a blocking thread, was called on " + i.f43177e.o() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String l() {
            return "Must not be called on a main thread, was called on " + i.f43177e.o() + '.';
        }

        private final void m(tl.a aVar, tl.a aVar2) {
            if (((Boolean) aVar.invoke()).booleanValue()) {
                return;
            }
            gd.g.f().b((String) aVar2.invoke());
            n();
        }

        private final String o() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q() {
            String strO = o();
            s.g(strO, "<get-threadName>(...)");
            return r.T(strO, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void g() {
            m(new C0656a(this), new tl.a() { // from class: kd.f
                @Override // tl.a
                public final Object invoke() {
                    return i.a.h();
                }
            });
        }

        public final void i() {
            m(new b(this), new tl.a() { // from class: kd.h
                @Override // tl.a
                public final Object invoke() {
                    return i.a.j();
                }
            });
        }

        public final void k() {
            m(new c(this), new tl.a() { // from class: kd.g
                @Override // tl.a
                public final Object invoke() {
                    return i.a.l();
                }
            });
        }

        public final boolean n() {
            return i.f43178f;
        }

        public final void s(boolean z10) {
            i.f43178f = z10;
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p() {
            String strO = o();
            s.g(strO, mDXVAtwcaFMHJ.LDwIfAgxX);
            return r.T(strO, "Firebase Background Thread #", false, 2, null);
        }
    }

    public static final void c() {
        f43177e.g();
    }

    public static final void d() {
        f43177e.i();
    }

    public static final void e() {
        f43177e.k();
    }

    public static final void f(boolean z10) {
        f43177e.s(z10);
    }

    public i(ExecutorService backgroundExecutorService, ExecutorService executorService) {
        s.h(backgroundExecutorService, "backgroundExecutorService");
        s.h(executorService, lkCBSIFlvmyGX.KhHgOQp);
        this.f43179a = new e(backgroundExecutorService);
        this.f43180b = new e(backgroundExecutorService);
        this.f43181c = new e(backgroundExecutorService);
        this.f43182d = new e(executorService);
    }
}
