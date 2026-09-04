package uh;

import androidx.lifecycle.o1;
import androidx.lifecycle.p1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.databinding.j f54528b = new androidx.databinding.j(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Long f54535i;

    public n() {
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0();
        this.f54529c = p0Var;
        this.f54530d = o1.d(p0Var, new Function1() { // from class: uh.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.o((Long) obj);
            }
        });
        androidx.lifecycle.p0 p0Var2 = new androidx.lifecycle.p0();
        this.f54531e = p0Var2;
        this.f54532f = o1.d(p0Var2, new Function1() { // from class: uh.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.n((Long) obj);
            }
        });
        androidx.lifecycle.p0 p0Var3 = new androidx.lifecycle.p0();
        this.f54533g = p0Var3;
        this.f54534h = o1.d(p0Var3, new Function1() { // from class: uh.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.m((Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(Long l10) {
        nh.l0 l0Var = nh.l0.f47742a;
        kotlin.jvm.internal.s.e(l10);
        return l0Var.d(l10.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(Long l10) {
        nh.l0 l0Var = nh.l0.f47742a;
        kotlin.jvm.internal.s.e(l10);
        return l0Var.d(l10.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(Long l10) {
        nh.l0 l0Var = nh.l0.f47742a;
        kotlin.jvm.internal.s.e(l10);
        return l0Var.d(l10.longValue());
    }

    public final Long p() {
        return this.f54535i;
    }

    public final androidx.lifecycle.k0 q() {
        return this.f54534h;
    }

    public final androidx.lifecycle.k0 r() {
        return this.f54531e;
    }

    public final androidx.lifecycle.k0 s() {
        return this.f54532f;
    }

    public final androidx.lifecycle.k0 t() {
        return this.f54529c;
    }

    public final androidx.lifecycle.k0 u() {
        return this.f54530d;
    }

    public final androidx.databinding.j v() {
        return this.f54528b;
    }

    public final void w(Long l10) {
        this.f54535i = l10;
    }

    public final void x(long j10, long j11) {
        this.f54529c.q(Long.valueOf(j10));
        this.f54531e.q(Long.valueOf(j11));
        this.f54533g.q(Long.valueOf(j11 - j10));
        wp.a.a("Start time: %s, end time: %s", Long.valueOf(j10), Long.valueOf(j11));
    }
}
