package vk;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.Comparator;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final tk.d f55662a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f55663b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tk.a f55664c = new C0843a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final tk.c f55665d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tk.c f55666e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final tk.c f55667f = new k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final tk.e f55668g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final tk.f f55669h = new l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final tk.f f55670i = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Callable f55671j = new j();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Comparator f55672k = new i();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final tk.c f55673l = new h();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c implements tk.e {
        c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e implements tk.c {
        e() {
        }

        @Override // tk.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            cl.a.k(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f implements tk.f {
        f() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class h implements tk.c {
        h() {
        }

        public void a(rp.a aVar) {
            aVar.request(Long.MAX_VALUE);
        }

        @Override // tk.c
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            android.support.v4.media.session.b.a(obj);
            a(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class j implements Callable {
        j() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class k implements tk.c {
        k() {
        }

        @Override // tk.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            cl.a.k(new OnErrorNotImplementedException(th2));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class l implements tk.f {
        l() {
        }
    }

    public static tk.c a() {
        return f55665d;
    }

    /* JADX INFO: renamed from: vk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0843a implements tk.a {
        C0843a() {
        }

        public String toString() {
            return "EmptyAction";
        }

        @Override // tk.a
        public void run() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d implements Runnable {
        d() {
        }

        public String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements tk.c {
        b() {
        }

        public String toString() {
            return "EmptyConsumer";
        }

        @Override // tk.c
        public void accept(Object obj) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g implements tk.d {
        g() {
        }

        public String toString() {
            return "IdentityFunction";
        }

        @Override // tk.d
        public Object apply(Object obj) {
            return obj;
        }
    }
}
