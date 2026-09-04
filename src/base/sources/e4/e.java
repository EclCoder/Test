package e4;

import java.util.List;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f37112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f37113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f37114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f37115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f37118g;

    public e(g initialInfo, boolean z10, boolean z11) {
        s.h(initialInfo, "initialInfo");
        this.f37112a = initialInfo;
        this.f37113b = gl.r.l();
        this.f37114c = gl.r.l();
        this.f37115d = j.b.f37139b;
        this.f37116e = z10;
        this.f37117f = z11;
    }

    public final void a() {
        this.f37115d = j.b.f37139b;
        o();
    }

    public final void b() {
        this.f37115d = j.b.f37139b;
        p();
    }

    public final void c(b event) {
        s.h(event, "event");
        this.f37115d = new j.c(event, -1);
        q(event);
    }

    public final void d(b event) {
        s.h(event, "event");
        this.f37115d = new j.c(event, -1);
        r(event);
    }

    public final void e() {
        this.f37115d = j.b.f37139b;
        s();
    }

    public final void f() {
        this.f37115d = j.b.f37139b;
        t();
    }

    public final void g(b event) {
        s.h(event, "event");
        this.f37115d = new j.c(event, 1);
        u(event);
    }

    public final void h(b event) {
        s.h(event, "event");
        this.f37115d = new j.c(event, 1);
        v(event);
    }

    public final List i() {
        return this.f37113b;
    }

    public final g j() {
        return this.f37112a;
    }

    public final c k() {
        return this.f37118g;
    }

    public final List l() {
        return this.f37114c;
    }

    public final boolean m() {
        c cVar = this.f37118g;
        if (cVar == null || cVar.l()) {
            return this.f37116e;
        }
        return false;
    }

    public final boolean n() {
        c cVar = this.f37118g;
        if (cVar == null || cVar.l()) {
            return this.f37117f;
        }
        return false;
    }

    protected abstract void o();

    protected abstract void p();

    protected abstract void q(b bVar);

    protected abstract void r(b bVar);

    protected void t() {
        throw new UnsupportedOperationException("A handler that receives a 'forwardCompleted' event must override 'onForwardCompleted()' to handle the callback.");
    }

    protected void u(b event) {
        s.h(event, "event");
    }

    protected void v(b event) {
        s.h(event, "event");
    }

    public final void w() {
        c cVar = this.f37118g;
        if (cVar != null) {
            cVar.m(this);
        }
    }

    public final void x(boolean z10) {
        i iVarJ;
        if (this.f37116e == z10) {
            return;
        }
        this.f37116e = z10;
        c cVar = this.f37118g;
        if (cVar == null || (iVarJ = cVar.j()) == null) {
            return;
        }
        iVarJ.g();
    }

    public final void y(c cVar) {
        this.f37118g = cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(g initialInfo, boolean z10) {
        this(initialInfo, z10, false);
        s.h(initialInfo, "initialInfo");
    }

    protected void s() {
    }
}
