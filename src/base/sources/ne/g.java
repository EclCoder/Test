package ne;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47166b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.b f47167a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(ce.b transportFactoryProvider) {
        kotlin.jvm.internal.s.h(transportFactoryProvider, "transportFactoryProvider");
        this.f47167a = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(j0 j0Var) {
        String strB = k0.f47185a.c().b(j0Var);
        kotlin.jvm.internal.s.g(strB, "encode(...)");
        Log.d("FirebaseSessions", "Session Event Type: " + j0Var.b().name());
        byte[] bytes = strB.getBytes(bm.d.f9079b);
        kotlin.jvm.internal.s.g(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // ne.h
    public void a(j0 sessionEvent) {
        kotlin.jvm.internal.s.h(sessionEvent, "sessionEvent");
        ((a9.i) this.f47167a.get()).a("FIREBASE_APPQUALITY_SESSION", j0.class, a9.b.b("json"), new a9.g() { // from class: ne.f
            @Override // a9.g
            public final Object apply(Object obj) {
                return this.f47160a.c((j0) obj);
            }
        }).b(a9.c.f(sessionEvent));
    }
}
