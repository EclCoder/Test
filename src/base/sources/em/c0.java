package em;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f37963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f37964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f37965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f37966e;

    public c0(Object obj, n nVar, Function3 function3, Object obj2, Throwable th2) {
        this.f37962a = obj;
        this.f37963b = nVar;
        this.f37964c = function3;
        this.f37965d = obj2;
        this.f37966e = th2;
    }

    public static /* synthetic */ c0 b(c0 c0Var, Object obj, n nVar, Function3 function3, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c0Var.f37962a;
        }
        if ((i10 & 2) != 0) {
            nVar = c0Var.f37963b;
        }
        if ((i10 & 4) != 0) {
            function3 = c0Var.f37964c;
        }
        if ((i10 & 8) != 0) {
            obj2 = c0Var.f37965d;
        }
        if ((i10 & 16) != 0) {
            th2 = c0Var.f37966e;
        }
        Throwable th3 = th2;
        Function3 function4 = function3;
        return c0Var.a(obj, nVar, function4, obj2, th3);
    }

    public final c0 a(Object obj, n nVar, Function3 function3, Object obj2, Throwable th2) {
        return new c0(obj, nVar, function3, obj2, th2);
    }

    public final boolean c() {
        return this.f37966e != null;
    }

    public final void d(q qVar, Throwable th2) {
        n nVar = this.f37963b;
        if (nVar != null) {
            qVar.l(nVar, th2);
        }
        Function3 function3 = this.f37964c;
        if (function3 != null) {
            qVar.o(function3, th2, this.f37962a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.s.c(this.f37962a, c0Var.f37962a) && kotlin.jvm.internal.s.c(this.f37963b, c0Var.f37963b) && kotlin.jvm.internal.s.c(this.f37964c, c0Var.f37964c) && kotlin.jvm.internal.s.c(this.f37965d, c0Var.f37965d) && kotlin.jvm.internal.s.c(this.f37966e, c0Var.f37966e);
    }

    public int hashCode() {
        Object obj = this.f37962a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        n nVar = this.f37963b;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Function3 function3 = this.f37964c;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.f37965d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f37966e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f37962a + ", cancelHandler=" + this.f37963b + ", onCancellation=" + this.f37964c + ", idempotentResume=" + this.f37965d + ", cancelCause=" + this.f37966e + ')';
    }

    public /* synthetic */ c0(Object obj, n nVar, Function3 function3, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : nVar, (i10 & 4) != 0 ? null : function3, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
