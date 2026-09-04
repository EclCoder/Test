package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class y implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator f21878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f21880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f21881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f21882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f21883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f21884g;

    private y(Comparator comparator, boolean z10, Object obj, j jVar, boolean z11, Object obj2, j jVar2) {
        this.f21878a = (Comparator) sc.p.o(comparator);
        this.f21879b = z10;
        this.f21882e = z11;
        this.f21880c = obj;
        this.f21881d = (j) sc.p.o(jVar);
        this.f21883f = obj2;
        this.f21884g = (j) sc.p.o(jVar2);
        if (z10) {
            comparator.compare(u0.a(obj), u0.a(obj));
        }
        if (z11) {
            comparator.compare(u0.a(obj2), u0.a(obj2));
        }
        if (z10 && z11) {
            int iCompare = comparator.compare(u0.a(obj), u0.a(obj2));
            sc.p.k(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (iCompare == 0) {
                j jVar3 = j.OPEN;
                sc.p.d((jVar == jVar3 && jVar2 == jVar3) ? false : true);
            }
        }
    }

    static y a(Comparator comparator) {
        j jVar = j.OPEN;
        return new y(comparator, false, null, jVar, false, null, jVar);
    }

    static y g(Comparator comparator, Object obj, j jVar) {
        return new y(comparator, true, obj, jVar, false, null, j.OPEN);
    }

    static y q(Comparator comparator, Object obj, j jVar) {
        return new y(comparator, false, null, j.OPEN, true, obj, jVar);
    }

    Comparator d() {
        return this.f21878a;
    }

    boolean e(Object obj) {
        return (p(obj) || o(obj)) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f21878a.equals(yVar.f21878a) && this.f21879b == yVar.f21879b && this.f21882e == yVar.f21882e && h().equals(yVar.h()) && j().equals(yVar.j()) && sc.l.a(i(), yVar.i()) && sc.l.a(k(), yVar.k())) {
                return true;
            }
        }
        return false;
    }

    j h() {
        return this.f21881d;
    }

    public int hashCode() {
        return sc.l.b(this.f21878a, i(), h(), k(), j());
    }

    Object i() {
        return this.f21880c;
    }

    j j() {
        return this.f21884g;
    }

    Object k() {
        return this.f21883f;
    }

    boolean l() {
        return this.f21879b;
    }

    boolean m() {
        return this.f21882e;
    }

    y n(y yVar) {
        int iCompare;
        int iCompare2;
        Object obj;
        int iCompare3;
        j jVar;
        sc.p.o(yVar);
        sc.p.d(this.f21878a.equals(yVar.f21878a));
        boolean z10 = this.f21879b;
        Object objI = i();
        j jVarH = h();
        if (!l()) {
            z10 = yVar.f21879b;
            objI = yVar.i();
            jVarH = yVar.h();
        } else if (yVar.l() && ((iCompare = this.f21878a.compare(i(), yVar.i())) < 0 || (iCompare == 0 && yVar.h() == j.OPEN))) {
            objI = yVar.i();
            jVarH = yVar.h();
        }
        boolean z11 = z10;
        boolean z12 = this.f21882e;
        Object objK = k();
        j jVarJ = j();
        if (!m()) {
            z12 = yVar.f21882e;
            objK = yVar.k();
            jVarJ = yVar.j();
        } else if (yVar.m() && ((iCompare2 = this.f21878a.compare(k(), yVar.k())) > 0 || (iCompare2 == 0 && yVar.j() == j.OPEN))) {
            objK = yVar.k();
            jVarJ = yVar.j();
        }
        boolean z13 = z12;
        Object obj2 = objK;
        if (z11 && z13 && ((iCompare3 = this.f21878a.compare(objI, obj2)) > 0 || (iCompare3 == 0 && jVarH == (jVar = j.OPEN) && jVarJ == jVar))) {
            jVarH = j.OPEN;
            jVarJ = j.CLOSED;
            obj = obj2;
        } else {
            obj = objI;
        }
        return new y(this.f21878a, z11, obj, jVarH, z13, obj2, jVarJ);
    }

    boolean o(Object obj) {
        if (!m()) {
            return false;
        }
        int iCompare = this.f21878a.compare(obj, u0.a(k()));
        return ((iCompare == 0) & (j() == j.OPEN)) | (iCompare > 0);
    }

    boolean p(Object obj) {
        if (!l()) {
            return false;
        }
        int iCompare = this.f21878a.compare(obj, u0.a(i()));
        return ((iCompare == 0) & (h() == j.OPEN)) | (iCompare < 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21878a);
        sb2.append(":");
        j jVar = this.f21881d;
        j jVar2 = j.CLOSED;
        sb2.append(jVar == jVar2 ? '[' : '(');
        sb2.append(this.f21879b ? this.f21880c : "-∞");
        sb2.append(',');
        sb2.append(this.f21882e ? this.f21883f : "∞");
        sb2.append(this.f21884g == jVar2 ? ']' : ')');
        return sb2.toString();
    }
}
