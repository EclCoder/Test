package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class j implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f3584a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3585a;

        static {
            int[] iArr = new int[n1.b.values().length];
            f3585a = iArr;
            try {
                iArr[n1.b.f3636j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3585a[n1.b.f3635i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3585a[n1.b.f3633g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3585a[n1.b.f3643q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3585a[n1.b.f3645s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3585a[n1.b.f3641o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3585a[n1.b.f3634h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3585a[n1.b.f3631e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3585a[n1.b.f3644r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3585a[n1.b.f3646t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3585a[n1.b.f3632f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3585a[n1.b.f3637k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private j(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) x.b(codedOutputStream, "output");
        this.f3584a = codedOutputStream2;
        codedOutputStream2.f3489a = this;
    }

    private void A(int i10, e0 e0Var, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.w0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += CodedOutputStream.x(((Long) list.get(i12)).longValue());
        }
        this.f3584a.O0(iX);
        while (i11 < list.size()) {
            this.f3584a.x0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void C(int i10, Object obj) {
        if (obj instanceof String) {
            this.f3584a.K0(i10, (String) obj);
        } else {
            this.f3584a.e0(i10, (g) obj);
        }
    }

    private void D(int i10, w wVar, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.C0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iF = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iF += CodedOutputStream.F(((Integer) list.get(i12)).intValue());
        }
        this.f3584a.O0(iF);
        while (i11 < list.size()) {
            this.f3584a.D0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void F(int i10, e0 e0Var, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.E0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iH = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iH += CodedOutputStream.H(((Long) list.get(i12)).longValue());
        }
        this.f3584a.O0(iH);
        while (i11 < list.size()) {
            this.f3584a.F0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void H(int i10, w wVar, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void J(int i10, e0 e0Var, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void K(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.I0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.L(((Long) list.get(i12)).longValue());
        }
        this.f3584a.O0(iL);
        while (i11 < list.size()) {
            this.f3584a.J0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void L(int i10, w wVar, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void N(int i10, e0 e0Var, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void O(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.P0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += CodedOutputStream.S(((Long) list.get(i12)).longValue());
        }
        this.f3584a.O0(iS);
        while (i11 < list.size()) {
            this.f3584a.Q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static j g(CodedOutputStream codedOutputStream) {
        j jVar = codedOutputStream.f3489a;
        return jVar != null ? jVar : new j(codedOutputStream);
    }

    private void h(int i10, e eVar, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.a0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iD = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iD += CodedOutputStream.d(((Boolean) list.get(i12)).booleanValue());
        }
        this.f3584a.O0(iD);
        while (i11 < list.size()) {
            this.f3584a.b0(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    private void j(int i10, boolean z10, Object obj, g0.a aVar) {
        this.f3584a.M0(i10, 2);
        this.f3584a.O0(g0.b(aVar, Boolean.valueOf(z10), obj));
        g0.e(this.f3584a, aVar, Boolean.valueOf(z10), obj);
    }

    private void k(int i10, g0.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            Object obj = map.get(Integer.valueOf(i13));
            this.f3584a.M0(i10, 2);
            this.f3584a.O0(g0.b(aVar, Integer.valueOf(i13), obj));
            g0.e(this.f3584a, aVar, Integer.valueOf(i13), obj);
        }
    }

    private void l(int i10, g0.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            Object obj = map.get(Long.valueOf(j10));
            this.f3584a.M0(i10, 2);
            this.f3584a.O0(g0.b(aVar, Long.valueOf(j10), obj));
            g0.e(this.f3584a, aVar, Long.valueOf(j10), obj);
        }
    }

    private void m(int i10, g0.a aVar, Map map) {
        switch (a.f3585a[aVar.f3548a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    j(i10, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    j(i10, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                k(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                l(i10, aVar, map);
                return;
            case 12:
                n(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f3548a);
        }
    }

    private void n(int i10, g0.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = (String) it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            Object obj = map.get(str);
            this.f3584a.M0(i10, 2);
            this.f3584a.O0(g0.b(aVar, str, obj));
            g0.e(this.f3584a, aVar, str, obj);
        }
    }

    private void o(int i10, k kVar, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void p(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.g0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += CodedOutputStream.i(((Double) list.get(i13)).doubleValue());
        }
        this.f3584a.O0(i12);
        while (i11 < list.size()) {
            this.f3584a.h0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    private void q(int i10, w wVar, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.i0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += CodedOutputStream.k(((Integer) list.get(i12)).intValue());
        }
        this.f3584a.O0(iK);
        while (i11 < list.size()) {
            this.f3584a.j0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void s(int i10, w wVar, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.k0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += CodedOutputStream.m(((Integer) list.get(i12)).intValue());
        }
        this.f3584a.O0(iM);
        while (i11 < list.size()) {
            this.f3584a.l0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void u(int i10, e0 e0Var, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void v(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.m0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += CodedOutputStream.o(((Long) list.get(i12)).longValue());
        }
        this.f3584a.O0(iO);
        while (i11 < list.size()) {
            this.f3584a.n0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void w(int i10, t tVar, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.o0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += CodedOutputStream.q(((Float) list.get(i12)).floatValue());
        }
        this.f3584a.O0(iQ);
        while (i11 < list.size()) {
            this.f3584a.p0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    private void y(int i10, w wVar, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f3584a.M0(i10, 2);
        throw null;
    }

    private void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.u0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += CodedOutputStream.v(((Integer) list.get(i12)).intValue());
        }
        this.f3584a.O0(iV);
        while (i11 < list.size()) {
            this.f3584a.v0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void I(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.G0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += CodedOutputStream.J(((Integer) list.get(i12)).intValue());
        }
        this.f3584a.O0(iJ);
        while (i11 < list.size()) {
            this.f3584a.H0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public void M(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f3584a.N0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f3584a.M0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += CodedOutputStream.Q(((Integer) list.get(i12)).intValue());
        }
        this.f3584a.O0(iQ);
        while (i11 < list.size()) {
            this.f3584a.O0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void a(int i10, List list, c1 c1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            e(i10, list.get(i11), c1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void b(int i10, g gVar) {
        this.f3584a.e0(i10, gVar);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void c(int i10, Object obj, c1 c1Var) {
        this.f3584a.y0(i10, (n0) obj, c1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void d(int i10, g0.a aVar, Map map) {
        if (this.f3584a.X()) {
            m(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f3584a.M0(i10, 2);
            this.f3584a.O0(g0.b(aVar, entry.getKey(), entry.getValue()));
            g0.e(this.f3584a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void e(int i10, Object obj, c1 c1Var) {
        this.f3584a.r0(i10, (n0) obj, c1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void f(int i10, List list, c1 c1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c(i10, list.get(i11), c1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public o1.a fieldOrder() {
        return o1.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeBool(int i10, boolean z10) {
        this.f3584a.a0(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeBoolList(int i10, List list, boolean z10) {
        if (!(list instanceof e)) {
            i(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            h(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeBytesList(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f3584a.e0(i10, (g) list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeDouble(int i10, double d10) {
        this.f3584a.g0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeDoubleList(int i10, List list, boolean z10) {
        if (!(list instanceof k)) {
            p(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            o(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeEndGroup(int i10) {
        this.f3584a.M0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeEnum(int i10, int i11) {
        this.f3584a.i0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeEnumList(int i10, List list, boolean z10) {
        if (!(list instanceof w)) {
            r(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            q(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeFixed32(int i10, int i11) {
        this.f3584a.k0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeFixed32List(int i10, List list, boolean z10) {
        if (!(list instanceof w)) {
            t(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            s(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeFixed64(int i10, long j10) {
        this.f3584a.m0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeFixed64List(int i10, List list, boolean z10) {
        if (!(list instanceof e0)) {
            v(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            u(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeFloat(int i10, float f10) {
        this.f3584a.o0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeFloatList(int i10, List list, boolean z10) {
        if (!(list instanceof t)) {
            x(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            w(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeInt32(int i10, int i11) {
        this.f3584a.u0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeInt32List(int i10, List list, boolean z10) {
        if (!(list instanceof w)) {
            z(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            y(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeInt64(int i10, long j10) {
        this.f3584a.w0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeInt64List(int i10, List list, boolean z10) {
        if (!(list instanceof e0)) {
            B(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            A(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final void writeMessageSetItem(int i10, Object obj) {
        if (obj instanceof g) {
            this.f3584a.B0(i10, (g) obj);
        } else {
            this.f3584a.A0(i10, (n0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeSFixed32(int i10, int i11) {
        this.f3584a.C0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeSFixed32List(int i10, List list, boolean z10) {
        if (!(list instanceof w)) {
            E(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            D(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeSFixed64(int i10, long j10) {
        this.f3584a.E0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeSFixed64List(int i10, List list, boolean z10) {
        if (!(list instanceof e0)) {
            G(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            F(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeSInt32(int i10, int i11) {
        this.f3584a.G0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeSInt32List(int i10, List list, boolean z10) {
        if (!(list instanceof w)) {
            I(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            H(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeSInt64(int i10, long j10) {
        this.f3584a.I0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeSInt64List(int i10, List list, boolean z10) {
        if (!(list instanceof e0)) {
            K(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            J(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeStartGroup(int i10) {
        this.f3584a.M0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeString(int i10, String str) {
        this.f3584a.K0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeStringList(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof a0)) {
            while (i11 < list.size()) {
                this.f3584a.K0(i10, (String) list.get(i11));
                i11++;
            }
        } else {
            a0 a0Var = (a0) list;
            while (i11 < list.size()) {
                C(i10, a0Var.getRaw(i11));
                i11++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeUInt32(int i10, int i11) {
        this.f3584a.N0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeUInt32List(int i10, List list, boolean z10) {
        if (!(list instanceof w)) {
            M(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            L(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeUInt64(int i10, long j10) {
        this.f3584a.P0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public void writeUInt64List(int i10, List list, boolean z10) {
        if (!(list instanceof e0)) {
            O(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            N(i10, null, z10);
        }
    }
}
