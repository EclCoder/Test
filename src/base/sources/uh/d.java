package uh;

import androidx.lifecycle.o1;
import androidx.lifecycle.p1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.lifecycle.p0 f54461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54462e;

    public d() {
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0(0L);
        this.f54459b = p0Var;
        this.f54460c = o1.d(p0Var, new Function1() { // from class: uh.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.p((Long) obj);
            }
        });
        androidx.lifecycle.p0 p0Var2 = new androidx.lifecycle.p0(0L);
        this.f54461d = p0Var2;
        this.f54462e = o1.d(p0Var2, new Function1() { // from class: uh.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.o((Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(Long l10) {
        kotlin.jvm.internal.s.e(l10);
        return nh.l0.c(l10.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(Long l10) {
        kotlin.jvm.internal.s.e(l10);
        return nh.l0.c(l10.longValue());
    }

    public final androidx.lifecycle.k0 l() {
        return this.f54461d;
    }

    public final androidx.lifecycle.k0 m() {
        return this.f54459b;
    }

    public final void n(long j10, long j11) {
        this.f54459b.q(Long.valueOf(j10));
        this.f54461d.q(Long.valueOf(j11));
    }
}
