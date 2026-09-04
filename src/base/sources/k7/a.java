package k7;

import fl.k;
import fl.l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42990a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f42991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k f42992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f42993d;

    /* JADX INFO: renamed from: k7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0653a extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0653a f42994a = new C0653a();

        C0653a() {
            super(0);
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newCachedThreadPool();
        }
    }

    static {
        String string = a.class.toString();
        s.g(string, "GpsTopicsManager::class.java.toString()");
        f42991b = string;
        f42992c = l.b(C0653a.f42994a);
        f42993d = new AtomicBoolean(false);
    }

    private a() {
    }

    public static final void a() {
        if (x7.a.c(a.class)) {
            return;
        }
        try {
            f42993d.set(true);
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
        }
    }
}
