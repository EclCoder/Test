package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class v implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f1937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f1938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f1939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f1940d;

    public v() {
        this(0, 1, null);
    }

    public void b(int i10, Object obj) {
        int i11 = this.f1940d;
        if (i11 != 0 && i10 <= this.f1938b[i11 - 1]) {
            l(i10, obj);
            return;
        }
        if (this.f1937a && i11 >= this.f1938b.length) {
            w.d(this);
        }
        int i12 = this.f1940d;
        if (i12 >= this.f1938b.length) {
            int iE = s.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f1938b, iE);
            kotlin.jvm.internal.s.g(iArrCopyOf, "copyOf(...)");
            this.f1938b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1939c, iE);
            kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
            this.f1939c = objArrCopyOf;
        }
        this.f1938b[i12] = i10;
        this.f1939c[i12] = obj;
        this.f1940d = i12 + 1;
    }

    public void c() {
        int i10 = this.f1940d;
        Object[] objArr = this.f1939c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1940d = 0;
        this.f1937a = false;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public v clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.s.f(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        v vVar = (v) objClone;
        vVar.f1938b = (int[]) this.f1938b.clone();
        vVar.f1939c = (Object[]) this.f1939c.clone();
        return vVar;
    }

    public Object f(int i10) {
        return w.c(this, i10);
    }

    public final boolean g() {
        return j();
    }

    public int h(int i10) {
        if (this.f1937a) {
            w.d(this);
        }
        return s.a.a(this.f1938b, this.f1940d, i10);
    }

    public int i(Object obj) {
        if (this.f1937a) {
            w.d(this);
        }
        int i10 = this.f1940d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f1939c[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public boolean j() {
        return o() == 0;
    }

    public int k(int i10) {
        if (this.f1937a) {
            w.d(this);
        }
        return this.f1938b[i10];
    }

    public void l(int i10, Object obj) {
        int iA = s.a.a(this.f1938b, this.f1940d, i10);
        if (iA >= 0) {
            this.f1939c[iA] = obj;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f1940d && this.f1939c[i11] == w.f1941a) {
            this.f1938b[i11] = i10;
            this.f1939c[i11] = obj;
            return;
        }
        if (this.f1937a && this.f1940d >= this.f1938b.length) {
            w.d(this);
            i11 = ~s.a.a(this.f1938b, this.f1940d, i10);
        }
        int i12 = this.f1940d;
        if (i12 >= this.f1938b.length) {
            int iE = s.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f1938b, iE);
            kotlin.jvm.internal.s.g(iArrCopyOf, "copyOf(...)");
            this.f1938b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1939c, iE);
            kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
            this.f1939c = objArrCopyOf;
        }
        int i13 = this.f1940d;
        if (i13 - i11 != 0) {
            int[] iArr = this.f1938b;
            int i14 = i11 + 1;
            gl.j.i(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f1939c;
            gl.j.k(objArr, objArr, i14, i11, this.f1940d);
        }
        this.f1938b[i11] = i10;
        this.f1939c[i11] = obj;
        this.f1940d++;
    }

    public void m(int i10) {
        if (this.f1939c[i10] != w.f1941a) {
            this.f1939c[i10] = w.f1941a;
            this.f1937a = true;
        }
    }

    public Object n(int i10, Object obj) {
        int iH = h(i10);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f1939c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public int o() {
        if (this.f1937a) {
            w.d(this);
        }
        return this.f1940d;
    }

    public Object p(int i10) {
        if (this.f1937a) {
            w.d(this);
        }
        Object[] objArr = this.f1939c;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        f fVar = f.f1907a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1940d * 28);
        sb2.append('{');
        int i10 = this.f1940d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(k(i11));
            sb2.append('=');
            Object objP = p(i11);
            if (objP != this) {
                sb2.append(objP);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public v(int i10) {
        if (i10 == 0) {
            this.f1938b = s.a.f51434a;
            this.f1939c = s.a.f51436c;
        } else {
            int iE = s.a.e(i10);
            this.f1938b = new int[iE];
            this.f1939c = new Object[iE];
        }
    }

    public /* synthetic */ v(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
