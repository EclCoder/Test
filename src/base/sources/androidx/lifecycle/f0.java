package androidx.lifecycle;

import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class f0 extends s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f4369k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f4371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y1 f4372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f4376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private s.b f4377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final hm.w f4378j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s.b f4379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y f4380b;

        public b(a0 a0Var, s.b initialState) {
            kotlin.jvm.internal.s.h(initialState, "initialState");
            this.f4379a = initialState;
            kotlin.jvm.internal.s.e(a0Var);
            this.f4380b = j0.f(a0Var);
        }

        public final void a(b0 b0Var, s.a event) {
            kotlin.jvm.internal.s.h(event, "event");
            s.b bVarG = event.g();
            this.f4379a = g0.d(this.f4379a, bVarG);
            y yVar = this.f4380b;
            kotlin.jvm.internal.s.e(b0Var);
            yVar.c(b0Var, event);
            this.f4379a = bVarG;
        }

        public final s.b b() {
            return this.f4379a;
        }
    }

    private f0(b0 b0Var, boolean z10) {
        this.f4370b = z10;
        this.f4371c = new o();
        this.f4372d = new y1(b0Var);
        this.f4376h = new ArrayList();
        s.b bVar = s.b.INITIALIZED;
        this.f4377i = bVar;
        this.f4378j = hm.k0.a(bVar);
    }

    private final void g(final b0 b0Var) {
        this.f4371c.d(new Function1() { // from class: androidx.lifecycle.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.h(this.f4356a, b0Var, (Map.Entry) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 h(f0 f0Var, b0 b0Var, Map.Entry entry) {
        kotlin.jvm.internal.s.h(entry, "<destruct>");
        a0 a0Var = (a0) entry.getKey();
        b bVar = (b) entry.getValue();
        while (bVar.b().compareTo(f0Var.f4377i) > 0 && !f0Var.f4375g && f0Var.f4371c.b(a0Var)) {
            s.a aVarA = s.a.Companion.a(bVar.b());
            if (aVarA == null) {
                throw new IllegalStateException(("no event down from " + bVar.b()).toString());
            }
            f0Var.f4376h.add(aVarA.g());
            bVar.a(b0Var, aVarA);
            gl.r.I(f0Var.f4376h);
        }
        return fl.g0.f38750a;
    }

    private final s.b i(a0 a0Var) {
        b bVar;
        Map.Entry entryA = this.f4371c.a(a0Var);
        s.b bVar2 = null;
        s.b bVarB = (entryA == null || (bVar = (b) entryA.getValue()) == null) ? null : bVar.b();
        if (!this.f4376h.isEmpty()) {
            List list = this.f4376h;
            bVar2 = (s.b) list.get(list.size() - 1);
        }
        return g0.d(g0.d(this.f4377i, bVarB), bVar2);
    }

    private final void j(String str) {
        if (!this.f4370b || h0.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void k(final b0 b0Var) {
        this.f4371c.e(new Function1() { // from class: androidx.lifecycle.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.l(this.f4365a, b0Var, (Map.Entry) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 l(f0 f0Var, b0 b0Var, Map.Entry entry) {
        kotlin.jvm.internal.s.h(entry, "<destruct>");
        a0 a0Var = (a0) entry.getKey();
        b bVar = (b) entry.getValue();
        while (bVar.b().compareTo(f0Var.f4377i) < 0 && !f0Var.f4375g && f0Var.f4371c.b(a0Var)) {
            f0Var.f4376h.add(bVar.b());
            s.a aVarB = s.a.Companion.b(bVar.b());
            if (aVarB == null) {
                throw new IllegalStateException(("no event up from " + bVar.b()).toString());
            }
            bVar.a(b0Var, aVarB);
            gl.r.I(f0Var.f4376h);
        }
        return fl.g0.f38750a;
    }

    private final boolean n() {
        if (this.f4371c.j() == 0) {
            return true;
        }
        s.b bVarB = ((b) this.f4371c.c().getValue()).b();
        s.b bVarB2 = ((b) this.f4371c.f().getValue()).b();
        return bVarB == bVarB2 && this.f4377i == bVarB2;
    }

    private final void o(s.b bVar) {
        if (this.f4377i == bVar) {
            return;
        }
        g0.c((b0) this.f4372d.a(), this.f4377i, bVar);
        this.f4377i = bVar;
        if (this.f4374f || this.f4373e != 0) {
            this.f4375g = true;
            return;
        }
        this.f4374f = true;
        q();
        this.f4374f = false;
        if (this.f4377i == s.b.DESTROYED) {
            this.f4371c = new o();
        }
    }

    private final void q() {
        Object objA = this.f4372d.a();
        if (objA == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        b0 b0Var = (b0) objA;
        while (!n()) {
            this.f4375g = false;
            if (this.f4377i.compareTo(((b) this.f4371c.c().getValue()).b()) < 0) {
                g(b0Var);
            }
            Map.Entry entryG = this.f4371c.g();
            if (!this.f4375g && entryG != null && this.f4377i.compareTo(((b) entryG.getValue()).b()) > 0) {
                k(b0Var);
            }
        }
        this.f4375g = false;
        this.f4378j.setValue(b());
    }

    @Override // androidx.lifecycle.s
    public s.b b() {
        return this.f4377i;
    }

    @Override // androidx.lifecycle.s
    public void d(a0 observer) {
        kotlin.jvm.internal.s.h(observer, "observer");
        j("removeObserver");
        this.f4371c.i(observer);
    }

    public void m(s.a event) {
        kotlin.jvm.internal.s.h(event, "event");
        j("handleLifecycleEvent");
        o(event.g());
    }

    public void p(s.b state) {
        kotlin.jvm.internal.s.h(state, "state");
        j("setCurrentState");
        o(state);
    }

    @Override // androidx.lifecycle.s
    public void a(a0 observer) {
        b0 b0Var;
        kotlin.jvm.internal.s.h(observer, "observer");
        j("addObserver");
        s.b bVar = this.f4377i;
        s.b bVar2 = s.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = s.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f4371c.h(observer, bVar3)) == null && (b0Var = (b0) this.f4372d.a()) != null) {
            boolean z10 = this.f4373e != 0 || this.f4374f;
            s.b bVarI = i(observer);
            this.f4373e++;
            while (bVar3.b().compareTo(bVarI) < 0 && this.f4371c.b(observer)) {
                this.f4376h.add(bVar3.b());
                s.a aVarB = s.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException(PAFNPq.vHeCljd + bVar3.b());
                }
                bVar3.a(b0Var, aVarB);
                gl.r.I(this.f4376h);
                bVarI = i(observer);
            }
            if (!z10) {
                q();
            }
            this.f4373e--;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(b0 provider) {
        this(provider, true);
        kotlin.jvm.internal.s.h(provider, "provider");
    }
}
