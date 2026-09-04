package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f1934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f1935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1936c;

    public u() {
        this(0, 1, null);
    }

    private final int f(Object obj, int i10) {
        int i11 = this.f1936c;
        if (i11 == 0) {
            return -1;
        }
        int iA = s.a.a(this.f1934a, i11, i10);
        if (iA < 0 || kotlin.jvm.internal.s.c(obj, this.f1935b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f1934a[i12] == i10) {
            if (kotlin.jvm.internal.s.c(obj, this.f1935b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f1934a[i13] == i10; i13--) {
            if (kotlin.jvm.internal.s.c(obj, this.f1935b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    private final int h() {
        int i10 = this.f1936c;
        if (i10 == 0) {
            return -1;
        }
        int iA = s.a.a(this.f1934a, i10, 0);
        if (iA < 0 || this.f1935b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f1934a[i11] == 0) {
            if (this.f1935b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f1934a[i12] == 0; i12--) {
            if (this.f1935b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int a(Object obj) {
        int i10 = this.f1936c * 2;
        Object[] objArr = this.f1935b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (kotlin.jvm.internal.s.c(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void c(int i10) {
        int i11 = this.f1936c;
        int[] iArr = this.f1934a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.s.g(iArrCopyOf, "copyOf(...)");
            this.f1934a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1935b, i10 * 2);
            kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
            this.f1935b = objArrCopyOf;
        }
        if (this.f1936c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f1936c > 0) {
            this.f1934a = s.a.f51434a;
            this.f1935b = s.a.f51436c;
            this.f1936c = 0;
        }
        if (this.f1936c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof u) {
                if (size() != ((u) obj).size()) {
                    return false;
                }
                u uVar = (u) obj;
                int i10 = this.f1936c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objI = i(i11);
                    Object objM = m(i11);
                    Object obj2 = uVar.get(objI);
                    if (objM == null) {
                        if (obj2 != null || !uVar.containsKey(objI)) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.s.c(objM, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f1936c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objI2 = i(i13);
                Object objM2 = m(i13);
                Object obj3 = ((Map) obj).get(objI2);
                if (objM2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objI2)) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.s.c(objM2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int g(Object obj) {
        return obj == null ? h() : f(obj, obj.hashCode());
    }

    public Object get(Object obj) {
        int iG = g(obj);
        if (iG >= 0) {
            return this.f1935b[(iG << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iG = g(obj);
        return iG >= 0 ? this.f1935b[(iG << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f1934a;
        Object[] objArr = this.f1935b;
        int i10 = this.f1936c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public Object i(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f1936c) {
            z10 = true;
        }
        if (!z10) {
            s.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f1935b[i10 << 1];
    }

    public boolean isEmpty() {
        return this.f1936c <= 0;
    }

    public void j(u map) {
        kotlin.jvm.internal.s.h(map, "map");
        int i10 = map.f1936c;
        c(this.f1936c + i10);
        if (this.f1936c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.i(i11), map.m(i11));
            }
        } else if (i10 > 0) {
            gl.j.i(map.f1934a, this.f1934a, 0, 0, i10);
            gl.j.k(map.f1935b, this.f1935b, 0, 0, i10 << 1);
            this.f1936c = i10;
        }
    }

    public Object k(int i10) {
        if (!(i10 >= 0 && i10 < this.f1936c)) {
            s.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        Object[] objArr = this.f1935b;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f1936c;
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f1934a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                gl.j.i(iArr, iArr, i10, i14, i12);
                Object[] objArr2 = this.f1935b;
                gl.j.k(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.f1935b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            kotlin.jvm.internal.s.g(iArrCopyOf, "copyOf(...)");
            this.f1934a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1935b, i16 << 1);
            kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
            this.f1935b = objArrCopyOf;
            if (i12 != this.f1936c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                gl.j.i(iArr, this.f1934a, 0, 0, i10);
                gl.j.k(objArr, this.f1935b, 0, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                gl.j.i(iArr, this.f1934a, i10, i17, i12);
                gl.j.k(objArr, this.f1935b, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.f1936c) {
            throw new ConcurrentModificationException();
        }
        this.f1936c = i13;
        return obj;
    }

    public Object l(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f1936c) {
            z10 = true;
        }
        if (!z10) {
            s.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f1935b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object m(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f1936c) {
            z10 = true;
        }
        if (!z10) {
            s.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f1935b[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f1936c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iF = obj != null ? f(obj, iHashCode) : h();
        if (iF >= 0) {
            int i11 = (iF << 1) + 1;
            Object[] objArr = this.f1935b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iF;
        int[] iArr = this.f1934a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.s.g(iArrCopyOf, "copyOf(...)");
            this.f1934a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1935b, i13 << 1);
            kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
            this.f1935b = objArrCopyOf;
            if (i10 != this.f1936c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f1934a;
            int i14 = i12 + 1;
            gl.j.i(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f1935b;
            gl.j.k(objArr2, objArr2, i14 << 1, i12 << 1, this.f1936c << 1);
        }
        int i15 = this.f1936c;
        if (i10 == i15) {
            int[] iArr3 = this.f1934a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f1935b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f1936c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iG = g(obj);
        if (iG >= 0) {
            return k(iG);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iG = g(obj);
        if (iG >= 0) {
            return l(iG, obj2);
        }
        return null;
    }

    public int size() {
        return this.f1936c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1936c * 28);
        sb2.append('{');
        int i10 = this.f1936c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objI = i(i11);
            if (objI != sb2) {
                sb2.append(objI);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objM = m(i11);
            if (objM != sb2) {
                sb2.append(objM);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public u(int i10) {
        this.f1934a = i10 == 0 ? s.a.f51434a : new int[i10];
        this.f1935b = i10 == 0 ? s.a.f51436c : new Object[i10 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iG = g(obj);
        if (iG < 0 || !kotlin.jvm.internal.s.c(obj2, m(iG))) {
            return false;
        }
        k(iG);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iG = g(obj);
        if (iG < 0 || !kotlin.jvm.internal.s.c(obj2, m(iG))) {
            return false;
        }
        l(iG, obj3);
        return true;
    }

    public /* synthetic */ u(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public u(u uVar) {
        this(0, 1, null);
        if (uVar != null) {
            j(uVar);
        }
    }
}
