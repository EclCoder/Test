package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f564b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f563a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f565c = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends e4.e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final d0 f566h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f567i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0 onBackPressedCallback, e4.g info) {
            super(info, onBackPressedCallback.g());
            kotlin.jvm.internal.s.h(onBackPressedCallback, "onBackPressedCallback");
            kotlin.jvm.internal.s.h(info, "info");
            this.f566h = onBackPressedCallback;
            this.f567i = true;
        }

        public final void A(boolean z10) {
            this.f567i = z10;
            x(z10 && this.f566h.g());
        }

        @Override // e4.e
        protected void o() {
            this.f566h.c();
        }

        @Override // e4.e
        protected void p() {
            this.f566h.d();
        }

        @Override // e4.e
        protected void q(e4.b event) {
            kotlin.jvm.internal.s.h(event, "event");
            this.f566h.e(new b(event));
        }

        @Override // e4.e
        protected void r(e4.b event) {
            kotlin.jvm.internal.s.h(event, "event");
            this.f566h.f(new b(event));
        }

        public final boolean z() {
            return this.f567i;
        }
    }

    public d0(boolean z10) {
        this.f564b = z10;
    }

    public final void a(AutoCloseable closeable) {
        kotlin.jvm.internal.s.h(closeable, "closeable");
        this.f565c.add(closeable);
    }

    public final a b(e4.g info) {
        kotlin.jvm.internal.s.h(info, "info");
        a aVar = new a(this, info);
        this.f563a.add(aVar);
        return aVar;
    }

    public abstract void d();

    public void e(b backEvent) {
        kotlin.jvm.internal.s.h(backEvent, "backEvent");
    }

    public void f(b backEvent) {
        kotlin.jvm.internal.s.h(backEvent, "backEvent");
    }

    public final boolean g() {
        return this.f564b;
    }

    public final void h() throws Exception {
        Iterator it = this.f565c.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            a0.a((AutoCloseable) it.next());
        }
        this.f565c.clear();
        Iterator it2 = this.f563a.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).w();
        }
        this.f563a.clear();
    }

    public final void i(boolean z10) {
        this.f564b = z10;
        for (a aVar : this.f563a) {
            aVar.x(aVar.z() && z10);
        }
    }

    public void c() {
    }
}
