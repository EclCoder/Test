package e4;

import kotlin.jvm.internal.s;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f37121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37122b;

    protected final void a() {
        c cVar = this.f37121a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f37122b) {
            cVar.i(this, -1, null);
        }
        cVar.f(this, -1);
        this.f37122b = false;
    }

    protected final void c(b event) {
        s.h(event, "event");
        c cVar = this.f37121a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (this.f37122b) {
            cVar.h(this, -1, event);
        }
    }

    protected final void d(b event) {
        s.h(event, "event");
        c cVar = this.f37121a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (this.f37122b) {
            return;
        }
        cVar.i(this, -1, event);
        this.f37122b = true;
    }

    public final void e(c dispatcher) {
        s.h(dispatcher, "dispatcher");
        i(dispatcher);
    }

    public final void f(boolean z10) {
        j(z10);
    }

    public final void g(f history) {
        s.h(history, "history");
        k(history);
    }

    public final c h() {
        return this.f37121a;
    }

    protected void i(c dispatcher) {
        s.h(dispatcher, "dispatcher");
    }

    protected void j(boolean z10) {
    }

    protected void k(f history) {
        s.h(history, "history");
    }

    public final void l(c cVar) {
        this.f37121a = cVar;
    }

    protected final void b() {
        c cVar = this.f37121a;
        if (cVar == null) {
            throw new IllegalStateException(UoyZyZEcGYBpIg.HGDYVq);
        }
        if (!this.f37122b) {
            cVar.i(this, -1, null);
        }
        cVar.g(this, -1);
        this.f37122b = false;
    }
}
