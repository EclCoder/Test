package qh;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f50825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f50826e;

    public h(int i10, int i11, String label, Integer num, boolean z10) {
        s.h(label, "label");
        this.f50822a = i10;
        this.f50823b = i11;
        this.f50824c = label;
        this.f50825d = num;
        this.f50826e = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable d(h it) {
        s.h(it, "it");
        return Integer.valueOf(it.f50822a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable e(h it) {
        s.h(it, "it");
        return Integer.valueOf(it.f50823b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(h other) {
        s.h(other, "other");
        return jl.a.b(this, other, new Function1() { // from class: qh.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.d((h) obj);
            }
        }, new Function1() { // from class: qh.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.e((h) obj);
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f50822a == hVar.f50822a && this.f50823b == hVar.f50823b && s.c(this.f50824c, hVar.f50824c) && s.c(this.f50825d, hVar.f50825d) && this.f50826e == hVar.f50826e;
    }

    public final String f(float f10) {
        return sh.b.n(this.f50822a, this.f50823b, f10);
    }

    public final int g() {
        return this.f50823b;
    }

    public final Integer h() {
        return this.f50825d;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f50822a) * 31) + Integer.hashCode(this.f50823b)) * 31) + this.f50824c.hashCode()) * 31;
        Integer num = this.f50825d;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f50826e);
    }

    public final String i() {
        return this.f50824c;
    }

    public final float j() {
        int i10 = this.f50823b;
        return i10 != 0 ? this.f50822a / i10 : this.f50822a;
    }

    public final int k() {
        return this.f50822a;
    }

    public final boolean l() {
        return this.f50826e;
    }

    public final void m(int i10) {
        this.f50823b = i10;
    }

    public final void n(int i10) {
        this.f50822a = i10;
    }

    public String toString() {
        return "RatioItem(width=" + this.f50822a + ", height=" + this.f50823b + ", label=" + this.f50824c + ", imageId=" + this.f50825d + ", isDefault=" + this.f50826e + ')';
    }

    public /* synthetic */ h(int i10, int i11, String str, Integer num, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, str, num, (i12 & 16) != 0 ? false : z10);
    }
}
