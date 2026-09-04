package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r f3686d = new r(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1 f3687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3689c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3691b;

        static {
            int[] iArr = new int[n1.b.values().length];
            f3691b = iArr;
            try {
                iArr[n1.b.f3629c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3691b[n1.b.f3630d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3691b[n1.b.f3631e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3691b[n1.b.f3632f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3691b[n1.b.f3633g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3691b[n1.b.f3634h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3691b[n1.b.f3635i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3691b[n1.b.f3636j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3691b[n1.b.f3638l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3691b[n1.b.f3639m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3691b[n1.b.f3637k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3691b[n1.b.f3640n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3691b[n1.b.f3641o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3691b[n1.b.f3643q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3691b[n1.b.f3644r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3691b[n1.b.f3645s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3691b[n1.b.f3646t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3691b[n1.b.f3642p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[n1.c.values().length];
            f3690a = iArr2;
            try {
                iArr2[n1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f3690a[n1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f3690a[n1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f3690a[n1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f3690a[n1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f3690a[n1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f3690a[n1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f3690a[n1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f3690a[n1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b extends Comparable {
        n1.b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private r() {
        this.f3687a = f1.t();
    }

    static int b(n1.b bVar, int i10, Object obj) {
        int iO = CodedOutputStream.O(i10);
        if (bVar == n1.b.f3638l) {
            iO *= 2;
        }
        return iO + c(bVar, obj);
    }

    static int c(n1.b bVar, Object obj) {
        switch (a.f3691b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.i(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.q(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.x(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.S(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.v(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.o(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.d(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.s((n0) obj);
            case 10:
                return CodedOutputStream.A((n0) obj);
            case 11:
                return obj instanceof g ? CodedOutputStream.g((g) obj) : CodedOutputStream.N((String) obj);
            case 12:
                return obj instanceof g ? CodedOutputStream.g((g) obj) : CodedOutputStream.e((byte[]) obj);
            case 13:
                return CodedOutputStream.Q(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.F(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.H(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.J(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.L(((Long) obj).longValue());
            case 18:
                return CodedOutputStream.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        n1.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return b(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.isPacked()) {
            int iB = 0;
            while (i10 < size) {
                iB += b(liteType, number, list.get(i10));
                i10++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC = 0;
        while (i10 < size) {
            iC += c(liteType, list.get(i10));
            i10++;
        }
        return CodedOutputStream.O(number) + iC + CodedOutputStream.Q(iC);
    }

    private int g(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(n1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.g();
    }

    private static boolean l(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        throw null;
    }

    private static boolean m(n1.b bVar, Object obj) {
        x.a(obj);
        switch (a.f3690a[bVar.d().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof g) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof n0;
            default:
                return false;
        }
    }

    private void q(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static r r() {
        return new r();
    }

    private void t(b bVar, Object obj) {
        if (!m(bVar.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.getNumber()), bVar.getLiteType().d(), obj.getClass().getName()));
        }
    }

    static void u(CodedOutputStream codedOutputStream, n1.b bVar, int i10, Object obj) {
        if (bVar == n1.b.f3638l) {
            codedOutputStream.q0(i10, (n0) obj);
        } else {
            codedOutputStream.M0(i10, i(bVar, false));
            v(codedOutputStream, bVar, obj);
        }
    }

    static void v(CodedOutputStream codedOutputStream, n1.b bVar, Object obj) {
        switch (a.f3691b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.h0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.p0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.x0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.Q0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.v0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.n0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.l0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.s0((n0) obj);
                break;
            case 10:
                codedOutputStream.z0((n0) obj);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    codedOutputStream.L0((String) obj);
                } else {
                    codedOutputStream.f0((g) obj);
                }
                break;
            case 12:
                if (!(obj instanceof g)) {
                    codedOutputStream.c0((byte[]) obj);
                } else {
                    codedOutputStream.f0((g) obj);
                }
                break;
            case 13:
                codedOutputStream.O0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.D0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.F0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.H0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.J0(((Long) obj).longValue());
                break;
            case 18:
                codedOutputStream.j0(((Integer) obj).intValue());
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r clone() {
        r rVarR = r();
        int iN = this.f3687a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            Map.Entry entryM = this.f3687a.m(i10);
            android.support.v4.media.session.b.a(entryM.getKey());
            rVarR.s(null, entryM.getValue());
        }
        for (Map.Entry entry : this.f3687a.p()) {
            android.support.v4.media.session.b.a(entry.getKey());
            rVarR.s(null, entry.getValue());
        }
        rVarR.f3689c = this.f3689c;
        return rVarR;
    }

    Iterator e() {
        if (j()) {
            return Collections.emptyIterator();
        }
        return this.f3689c ? new z(this.f3687a.k().iterator()) : this.f3687a.k().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f3687a.equals(((r) obj).f3687a);
        }
        return false;
    }

    public int f() {
        int iN = this.f3687a.n();
        int iG = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            iG += g(this.f3687a.m(i10));
        }
        Iterator it = this.f3687a.p().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public int h() {
        int iN = this.f3687a.n();
        int iD = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            Map.Entry entryM = this.f3687a.m(i10);
            android.support.v4.media.session.b.a(entryM.getKey());
            iD += d(null, entryM.getValue());
        }
        for (Map.Entry entry : this.f3687a.p()) {
            android.support.v4.media.session.b.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f3687a.hashCode();
    }

    boolean j() {
        return this.f3687a.isEmpty();
    }

    public boolean k() {
        int iN = this.f3687a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            if (!l(this.f3687a.m(i10))) {
                return false;
            }
        }
        Iterator it = this.f3687a.p().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        if (j()) {
            return Collections.emptyIterator();
        }
        return this.f3689c ? new z(this.f3687a.entrySet().iterator()) : this.f3687a.entrySet().iterator();
    }

    public void o() {
        if (this.f3688b) {
            return;
        }
        int iN = this.f3687a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            Map.Entry entryM = this.f3687a.m(i10);
            if (entryM.getValue() instanceof v) {
                ((v) entryM.getValue()).z();
            }
        }
        this.f3687a.s();
        this.f3688b = true;
    }

    public void p(r rVar) {
        int iN = rVar.f3687a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            q(rVar.f3687a.m(i10));
        }
        Iterator it = rVar.f3687a.p().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.isRepeated()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                t(bVar, obj2);
            }
            obj = arrayList;
        }
        this.f3687a.u(bVar, obj);
    }

    private r(boolean z10) {
        this(f1.t());
        o();
    }

    private r(f1 f1Var) {
        this.f3687a = f1Var;
        o();
    }
}
