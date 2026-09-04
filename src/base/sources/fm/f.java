package fm;

import android.os.Handler;
import android.os.Looper;
import em.b2;
import em.c1;
import em.e1;
import em.l2;
import em.o;
import em.x0;
import fl.g0;
import java.util.concurrent.CancellationException;
import kl.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends g implements x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f38796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f38798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f38799f;

    private f(Handler handler, String str, boolean z10) {
        super(null);
        this.f38796c = handler;
        this.f38797d = str;
        this.f38798e = z10;
        this.f38799f = z10 ? this : new f(handler, str, true);
    }

    private final void c1(j jVar, Runnable runnable) {
        b2.c(jVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        c1.b().T0(jVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e1(f fVar, Runnable runnable) {
        fVar.f38796c.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f1(o oVar, f fVar) {
        oVar.u(fVar, g0.f38750a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 g1(f fVar, Runnable runnable, Throwable th2) {
        fVar.f38796c.removeCallbacks(runnable);
        return g0.f38750a;
    }

    @Override // em.k0
    public void T0(j jVar, Runnable runnable) {
        if (this.f38796c.post(runnable)) {
            return;
        }
        c1(jVar, runnable);
    }

    @Override // em.k0
    public boolean U0(j jVar) {
        return (this.f38798e && s.c(Looper.myLooper(), this.f38796c.getLooper())) ? false : true;
    }

    @Override // em.i2
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public f X0() {
        return this.f38799f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f38796c == this.f38796c && fVar.f38798e == this.f38798e;
    }

    public int hashCode() {
        return System.identityHashCode(this.f38796c) ^ (this.f38798e ? 1231 : 1237);
    }

    @Override // em.x0
    public e1 i(long j10, final Runnable runnable, j jVar) {
        if (this.f38796c.postDelayed(runnable, yl.g.g(j10, 4611686018427387903L))) {
            return new e1() { // from class: fm.c
                @Override // em.e1
                public final void d() {
                    f.e1(this.f38790a, runnable);
                }
            };
        }
        c1(jVar, runnable);
        return l2.f38029a;
    }

    @Override // em.x0
    public void i0(long j10, final o oVar) {
        final Runnable runnable = new Runnable() { // from class: fm.d
            @Override // java.lang.Runnable
            public final void run() {
                f.f1(oVar, this);
            }
        };
        if (this.f38796c.postDelayed(runnable, yl.g.g(j10, 4611686018427387903L))) {
            oVar.i(new Function1() { // from class: fm.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.g1(this.f38794a, runnable, (Throwable) obj);
                }
            });
        } else {
            c1(oVar.getContext(), runnable);
        }
    }

    @Override // em.k0
    public String toString() {
        String strY0 = Y0();
        if (strY0 != null) {
            return strY0;
        }
        String string = this.f38797d;
        if (string == null) {
            string = this.f38796c.toString();
        }
        if (!this.f38798e) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ f(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public f(Handler handler, String str) {
        this(handler, str, false);
    }
}
