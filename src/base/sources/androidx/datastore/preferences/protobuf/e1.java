package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f3510a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i1 f3511b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i1 f3512c = new k1();

    private static Class A() {
        if (y0.f3776d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static i1 B() {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (i1) clsC.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        if (y0.f3776d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(o oVar, Object obj, Object obj2) {
        r rVarC = oVar.c(obj2);
        if (rVarC.j()) {
            return;
        }
        oVar.d(obj).p(rVarC);
    }

    static void E(i0 i0Var, Object obj, Object obj2, long j10) {
        l1.O(obj, j10, i0Var.mergeFrom(l1.z(obj, j10), l1.z(obj2, j10)));
    }

    static void F(i1 i1Var, Object obj, Object obj2) {
        i1Var.p(obj, i1Var.k(i1Var.g(obj), i1Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!v.class.isAssignableFrom(cls) && !y0.f3776d && (cls2 = f3510a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static Object I(Object obj, int i10, int i11, Object obj2, i1 i1Var) {
        if (obj2 == null) {
            obj2 = i1Var.f(obj);
        }
        i1Var.e(obj2, i10, i11);
        return obj2;
    }

    public static i1 J() {
        return f3511b;
    }

    public static i1 K() {
        return f3512c;
    }

    public static void L(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeBoolList(i10, list, z10);
    }

    public static void M(int i10, List list, o1 o1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeBytesList(i10, list);
    }

    public static void N(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeDoubleList(i10, list, z10);
    }

    public static void O(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeEnumList(i10, list, z10);
    }

    public static void P(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeFixed32List(i10, list, z10);
    }

    public static void Q(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeFixed64List(i10, list, z10);
    }

    public static void R(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeFloatList(i10, list, z10);
    }

    public static void S(int i10, List list, o1 o1Var, c1 c1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.a(i10, list, c1Var);
    }

    public static void T(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeInt32List(i10, list, z10);
    }

    public static void U(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeInt64List(i10, list, z10);
    }

    public static void V(int i10, List list, o1 o1Var, c1 c1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.f(i10, list, c1Var);
    }

    public static void W(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeSFixed32List(i10, list, z10);
    }

    public static void X(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeSFixed64List(i10, list, z10);
    }

    public static void Y(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeSInt32List(i10, list, z10);
    }

    public static void Z(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeSInt64List(i10, list, z10);
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.O(i10) + CodedOutputStream.y(size) : size * CodedOutputStream.c(i10, true);
    }

    public static void a0(int i10, List list, o1 o1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeStringList(i10, list);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeUInt32List(i10, list, z10);
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = size * CodedOutputStream.O(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iO += CodedOutputStream.g((g) list.get(i11));
        }
        return iO;
    }

    public static void c0(int i10, List list, o1 o1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o1Var.writeUInt64List(i10, list, z10);
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? CodedOutputStream.O(i10) + CodedOutputStream.y(iE) : iE + (size * CodedOutputStream.O(i10));
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iK = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iK += CodedOutputStream.k(((Integer) list.get(i10)).intValue());
        }
        return iK;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.O(i10) + CodedOutputStream.y(size * 4) : size * CodedOutputStream.l(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.O(i10) + CodedOutputStream.y(size * 8) : size * CodedOutputStream.n(i10, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, c1 c1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iR += CodedOutputStream.r(i10, (n0) list.get(i11), c1Var);
        }
        return iR;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? CodedOutputStream.O(i10) + CodedOutputStream.y(iL) : iL + (size * CodedOutputStream.O(i10));
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iV += CodedOutputStream.v(((Integer) list.get(i10)).intValue());
        }
        return iV;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? CodedOutputStream.O(i10) + CodedOutputStream.y(iN) : iN + (list.size() * CodedOutputStream.O(i10));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += CodedOutputStream.x(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    static int o(int i10, Object obj, c1 c1Var) {
        return CodedOutputStream.z(i10, (n0) obj, c1Var);
    }

    static int p(int i10, List list, c1 c1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = CodedOutputStream.O(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            iO += CodedOutputStream.B((n0) list.get(i11), c1Var);
        }
        return iO;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? CodedOutputStream.O(i10) + CodedOutputStream.y(iR) : iR + (size * CodedOutputStream.O(i10));
    }

    static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iJ += CodedOutputStream.J(((Integer) list.get(i10)).intValue());
        }
        return iJ;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? CodedOutputStream.O(i10) + CodedOutputStream.y(iT) : iT + (size * CodedOutputStream.O(i10));
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iL = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iL += CodedOutputStream.L(((Long) list.get(i10)).longValue());
        }
        return iL;
    }

    static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iO = CodedOutputStream.O(i10) * size;
        if (!(list instanceof a0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iO += obj instanceof g ? CodedOutputStream.g((g) obj) : CodedOutputStream.N((String) obj);
                i11++;
            }
            return iO;
        }
        a0 a0Var = (a0) list;
        while (i11 < size) {
            Object raw = a0Var.getRaw(i11);
            iO += raw instanceof g ? CodedOutputStream.g((g) raw) : CodedOutputStream.N((String) raw);
            i11++;
        }
        return iO;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? CodedOutputStream.O(i10) + CodedOutputStream.y(iW) : iW + (size * CodedOutputStream.O(i10));
    }

    static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iQ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iQ += CodedOutputStream.Q(((Integer) list.get(i10)).intValue());
        }
        return iQ;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? CodedOutputStream.O(i10) + CodedOutputStream.y(iY) : iY + (size * CodedOutputStream.O(i10));
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iS = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iS += CodedOutputStream.S(((Long) list.get(i10)).longValue());
        }
        return iS;
    }

    static Object z(Object obj, int i10, List list, x.a aVar, Object obj2, i1 i1Var) {
        if (aVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!aVar.isInRange(iIntValue)) {
                    obj2 = I(obj, i10, iIntValue, obj2, i1Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (aVar.isInRange(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = I(obj, i10, iIntValue2, obj2, i1Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }
}
