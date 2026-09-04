package e4;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f37103i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f37104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f37105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f37108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f37109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f37110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f37111h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private c(c cVar, l lVar) {
        i iVar;
        this.f37104a = cVar;
        this.f37105b = lVar;
        this.f37107d = true;
        this.f37108e = (cVar == null || (iVar = cVar.f37108e) == null) ? new i() : iVar;
        this.f37109f = new LinkedHashSet();
        this.f37110g = new LinkedHashSet();
        this.f37111h = new LinkedHashSet();
        c cVar2 = this.f37104a;
        if (cVar2 != null) {
            cVar2.f37109f.add(this);
        }
    }

    public static /* synthetic */ void b(c cVar, e eVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        cVar.a(eVar, i10);
    }

    private final void e() {
        if (k()) {
            throw new IllegalStateException("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    private final boolean k() {
        c cVar = this.f37104a;
        if (cVar == null || !cVar.k()) {
            return this.f37106c;
        }
        return true;
    }

    public final void a(e handler, int i10) {
        s.h(handler, "handler");
        e();
        if (this.f37110g.add(handler)) {
            this.f37108e.a(this, handler, i10);
        }
    }

    public final void c(h input) {
        s.h(input, "input");
        e();
        if (this.f37111h.add(input)) {
            this.f37108e.b(this, input, -1);
        }
    }

    public final void d(h input, int i10) {
        s.h(input, "input");
        e();
        if (i10 == 1 || i10 == 0) {
            if (this.f37111h.add(input)) {
                this.f37108e.b(this, input, i10);
            }
        } else {
            throw new IllegalArgumentException(("Unsupported priority value: " + i10).toString());
        }
    }

    public final void f(h input, int i10) {
        s.h(input, "input");
        e();
        if (l()) {
            this.f37108e.c(input, i10);
        }
    }

    public final void g(h input, int i10) {
        s.h(input, "input");
        e();
        if (l()) {
            this.f37108e.d(input, i10, this.f37105b);
        }
    }

    public final void h(h input, int i10, b event) {
        s.h(input, "input");
        s.h(event, "event");
        e();
        if (l()) {
            this.f37108e.e(input, i10, event);
        }
    }

    public final void i(h input, int i10, b bVar) {
        s.h(input, "input");
        e();
        if (l()) {
            this.f37108e.f(input, i10, bVar);
        }
    }

    public final i j() {
        return this.f37108e;
    }

    public final boolean l() {
        c cVar = this.f37104a;
        if (cVar == null || cVar.l()) {
            return this.f37107d;
        }
        return false;
    }

    public final void m(e handler) {
        s.h(handler, "handler");
        if (this.f37110g.remove(handler)) {
            this.f37108e.h(handler);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(l onBackCompletedFallback) {
        this(null, onBackCompletedFallback);
        s.h(onBackCompletedFallback, "onBackCompletedFallback");
    }
}
