package n4;

import android.os.Bundle;
import fl.g0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46841c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o4.b f46842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f46843b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 c(j jVar) {
            jVar.getLifecycle().a(new b(jVar));
            return g0.f38750a;
        }

        public final i b(final j owner) {
            s.h(owner, "owner");
            return new i(new o4.b(owner, new tl.a() { // from class: n4.h
                @Override // tl.a
                public final Object invoke() {
                    return i.a.c(owner);
                }
            }), null);
        }

        private a() {
        }
    }

    public /* synthetic */ i(o4.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    public static final i a(j jVar) {
        return f46841c.b(jVar);
    }

    public final g b() {
        return this.f46843b;
    }

    public final void c() {
        this.f46842a.f();
    }

    public final void d(Bundle bundle) {
        this.f46842a.h(bundle);
    }

    public final void e(Bundle outBundle) {
        s.h(outBundle, "outBundle");
        this.f46842a.i(outBundle);
    }

    private i(o4.b bVar) {
        this.f46842a = bVar;
        this.f46843b = new g(bVar);
    }
}
