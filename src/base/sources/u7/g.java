package u7;

import com.facebook.h0;
import com.facebook.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f54205a = new g();

    private g() {
    }

    public static final void d() {
        if (h0.q()) {
            s.a(s.b.CrashReport, new s.a() { // from class: u7.d
                @Override // com.facebook.internal.s.a
                public final void a(boolean z10) {
                    g.e(z10);
                }
            });
            s.a(s.b.ErrorReport, new s.a() { // from class: u7.e
                @Override // com.facebook.internal.s.a
                public final void a(boolean z10) {
                    g.f(z10);
                }
            });
            s.a(s.b.AnrReport, new s.a() { // from class: u7.f
                @Override // com.facebook.internal.s.a
                public final void a(boolean z10) {
                    g.g(z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z10) {
        if (z10) {
            w7.c.f55948b.c();
            if (s.g(s.b.CrashShield)) {
                b.b();
                x7.a.a();
            }
            if (s.g(s.b.ThreadCheck)) {
                z7.a.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(boolean z10) {
        if (z10) {
            y7.e.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z10) {
        if (z10) {
            v7.e.c();
        }
    }
}
