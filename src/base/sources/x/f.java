package x;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f extends n {
    private int Y0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    int f56491c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    int f56492d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    int f56493e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    int f56494f1;
    y.b W0 = new y.b(this);
    public y.e X0 = new y.e(this);
    protected y.b.InterfaceC0875b Z0 = null;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private boolean f56489a1 = false;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    protected u.d f56490b1 = new u.d();

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f56495g1 = 0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f56496h1 = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    c[] f56497i1 = new c[4];

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    c[] f56498j1 = new c[4];

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f56499k1 = false;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f56500l1 = false;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f56501m1 = false;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f56502n1 = 0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f56503o1 = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f56504p1 = 257;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f56505q1 = false;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private boolean f56506r1 = false;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private boolean f56507s1 = false;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    int f56508t1 = 0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private WeakReference f56509u1 = null;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private WeakReference f56510v1 = null;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private WeakReference f56511w1 = null;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private WeakReference f56512x1 = null;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    HashSet f56513y1 = new HashSet();

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public y.b.a f56514z1 = new y.b.a();

    private void C1(e eVar) {
        int i10 = this.f56495g1 + 1;
        c[] cVarArr = this.f56498j1;
        if (i10 >= cVarArr.length) {
            this.f56498j1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f56498j1[this.f56495g1] = new c(eVar, 0, V1());
        this.f56495g1++;
    }

    private void F1(d dVar, u.i iVar) {
        this.f56490b1.h(iVar, this.f56490b1.q(dVar), 0, 5);
    }

    private void G1(d dVar, u.i iVar) {
        this.f56490b1.h(this.f56490b1.q(dVar), iVar, 0, 5);
    }

    private void H1(e eVar) {
        int i10 = this.f56496h1 + 1;
        c[] cVarArr = this.f56497i1;
        if (i10 >= cVarArr.length) {
            this.f56497i1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f56497i1[this.f56496h1] = new c(eVar, 1, V1());
        this.f56496h1++;
    }

    public static boolean Y1(int i10, e eVar, y.b.InterfaceC0875b interfaceC0875b, y.b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0875b == null) {
            return false;
        }
        if (eVar.X() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f57055e = 0;
            aVar.f57056f = 0;
            return false;
        }
        aVar.f57051a = eVar.C();
        aVar.f57052b = eVar.V();
        aVar.f57053c = eVar.Y();
        aVar.f57054d = eVar.z();
        aVar.f57059i = false;
        aVar.f57060j = i11;
        e.b bVar = aVar.f57051a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f57052b == bVar2;
        boolean z12 = z10 && eVar.f56442f0 > 0.0f;
        boolean z13 = z11 && eVar.f56442f0 > 0.0f;
        if (z10 && eVar.c0(0) && eVar.f56475w == 0 && !z12) {
            aVar.f57051a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f56477x == 0) {
                aVar.f57051a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.c0(1) && eVar.f56477x == 0 && !z13) {
            aVar.f57052b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f56475w == 0) {
                aVar.f57052b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.p0()) {
            aVar.f57051a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.q0()) {
            aVar.f57052b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f56479y[0] == 4) {
                aVar.f57051a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f57052b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f57054d;
                } else {
                    aVar.f57051a = e.b.WRAP_CONTENT;
                    interfaceC0875b.b(eVar, aVar);
                    i13 = aVar.f57056f;
                }
                aVar.f57051a = bVar4;
                aVar.f57053c = (int) (eVar.x() * i13);
            }
        }
        if (z13) {
            if (eVar.f56479y[1] == 4) {
                aVar.f57052b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f57051a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f57053c;
                } else {
                    aVar.f57052b = e.b.WRAP_CONTENT;
                    interfaceC0875b.b(eVar, aVar);
                    i12 = aVar.f57055e;
                }
                aVar.f57052b = bVar6;
                if (eVar.y() == -1) {
                    aVar.f57054d = (int) (i12 / eVar.x());
                } else {
                    aVar.f57054d = (int) (eVar.x() * i12);
                }
            }
        }
        interfaceC0875b.b(eVar, aVar);
        eVar.p1(aVar.f57055e);
        eVar.Q0(aVar.f57056f);
        eVar.P0(aVar.f57058h);
        eVar.F0(aVar.f57057g);
        aVar.f57060j = y.b.a.f57048k;
        return aVar.f57059i;
    }

    private void a2() {
        this.f56495g1 = 0;
        this.f56496h1 = 0;
    }

    void A1(e eVar, int i10) {
        if (i10 == 0) {
            C1(eVar);
        } else if (i10 == 1) {
            H1(eVar);
        }
    }

    public boolean B1(u.d dVar) {
        f fVar;
        u.d dVar2;
        boolean zZ1 = Z1(64);
        g(dVar, zZ1);
        int size = this.V0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.V0.get(i10);
            eVar.X0(0, false);
            eVar.X0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.V0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).D1();
                }
            }
        }
        this.f56513y1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = (e) this.V0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof m) {
                    this.f56513y1.add(eVar3);
                } else {
                    eVar3.g(dVar, zZ1);
                }
            }
        }
        while (this.f56513y1.size() > 0) {
            int size2 = this.f56513y1.size();
            Iterator it = this.f56513y1.iterator();
            while (it.hasNext()) {
                m mVar = (m) ((e) it.next());
                if (mVar.A1(this.f56513y1)) {
                    mVar.g(dVar, zZ1);
                    this.f56513y1.remove(mVar);
                    break;
                }
            }
            if (size2 == this.f56513y1.size()) {
                Iterator it2 = this.f56513y1.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).g(dVar, zZ1);
                }
                this.f56513y1.clear();
            }
        }
        if (u.d.f53658s) {
            HashSet<e> hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = (e) this.V0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            fVar = this;
            dVar2 = dVar;
            fVar.e(this, dVar2, hashSet, C() == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar5 : hashSet) {
                k.a(this, dVar2, eVar5);
                eVar5.g(dVar2, zZ1);
            }
        } else {
            fVar = this;
            dVar2 = dVar;
            for (int i14 = 0; i14 < size; i14++) {
                e eVar6 = (e) fVar.V0.get(i14);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.f56434b0;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.U0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.l1(e.b.FIXED);
                    }
                    eVar6.g(dVar2, zZ1);
                    if (bVar == bVar3) {
                        eVar6.U0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.l1(bVar2);
                    }
                } else {
                    k.a(this, dVar2, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar2, zZ1);
                    }
                }
            }
        }
        if (fVar.f56495g1 > 0) {
            b.b(this, dVar2, null, 0);
        }
        if (fVar.f56496h1 > 0) {
            b.b(this, dVar2, null, 1);
        }
        return true;
    }

    public void D1(d dVar) {
        WeakReference weakReference = this.f56512x1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f56512x1.get()).e()) {
            this.f56512x1 = new WeakReference(dVar);
        }
    }

    public void E1(d dVar) {
        WeakReference weakReference = this.f56510v1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f56510v1.get()).e()) {
            this.f56510v1 = new WeakReference(dVar);
        }
    }

    void I1(d dVar) {
        WeakReference weakReference = this.f56511w1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f56511w1.get()).e()) {
            this.f56511w1 = new WeakReference(dVar);
        }
    }

    void J1(d dVar) {
        WeakReference weakReference = this.f56509u1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f56509u1.get()).e()) {
            this.f56509u1 = new WeakReference(dVar);
        }
    }

    public boolean K1(boolean z10) {
        return this.X0.f(z10);
    }

    public boolean L1(boolean z10) {
        return this.X0.g(z10);
    }

    public boolean M1(boolean z10, int i10) {
        return this.X0.h(z10, i10);
    }

    public void N1(u.e eVar) {
        this.f56490b1.v(eVar);
    }

    public y.b.InterfaceC0875b O1() {
        return this.Z0;
    }

    public int P1() {
        return this.f56504p1;
    }

    @Override // x.e
    public void Q(StringBuilder sb2) {
        sb2.append(this.f56459o + ":{\n");
        sb2.append("  actualWidth:" + this.f56438d0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f56440e0);
        sb2.append("\n");
        ArrayList arrayListW1 = w1();
        int size = arrayListW1.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListW1.get(i10);
            i10++;
            ((e) obj).Q(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public u.d Q1() {
        return this.f56490b1;
    }

    public boolean R1() {
        return false;
    }

    public void S1() {
        this.X0.j();
    }

    public void T1() {
        this.X0.k();
    }

    public boolean U1() {
        return this.f56507s1;
    }

    public boolean V1() {
        return this.f56489a1;
    }

    public boolean W1() {
        return this.f56506r1;
    }

    public long X1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f56491c1 = i17;
        this.f56492d1 = i18;
        return this.W0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean Z1(int i10) {
        return (this.f56504p1 & i10) == i10;
    }

    public void b2(y.b.InterfaceC0875b interfaceC0875b) {
        this.Z0 = interfaceC0875b;
        this.X0.n(interfaceC0875b);
    }

    public void c2(int i10) {
        this.f56504p1 = i10;
        u.d.f53658s = Z1(512);
    }

    public void d2(int i10) {
        this.Y0 = i10;
    }

    public void e2(boolean z10) {
        this.f56489a1 = z10;
    }

    public boolean f2(u.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zZ1 = Z1(64);
        v1(dVar, zZ1);
        int size = this.V0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.V0.get(i10);
            eVar.v1(dVar, zZ1);
            if (eVar.e0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void g2() {
        this.W0.e(this);
    }

    @Override // x.e
    public void u1(boolean z10, boolean z11) {
        super.u1(z10, z11);
        int size = this.V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.V0.get(i10)).u1(z10, z11);
        }
    }

    @Override // x.n, x.e
    public void v0() {
        this.f56490b1.E();
        this.f56491c1 = 0;
        this.f56493e1 = 0;
        this.f56492d1 = 0;
        this.f56494f1 = 0;
        this.f56505q1 = false;
        super.v0();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0214  */
    /* JADX WARN: Code duplicated, block: B:122:0x021d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0226 A[LOOP:5: B:123:0x0224->B:124:0x0226, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:157:0x0308  */
    /* JADX WARN: Code duplicated, block: B:164:0x0329 A[PHI: r13 r19
      0x0329: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x0329: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x032d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0330  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // x.n
    public void x1() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        ?? r18;
        char c10;
        ?? B1;
        int i13;
        ?? F2;
        ?? r19;
        int iMax;
        ?? r110;
        ?? r13;
        int iMax2;
        ?? r111;
        ?? r14;
        int i14;
        ?? r112;
        ?? r15;
        ?? r16;
        e.b bVar;
        e.b bVar2;
        ?? r10;
        ?? r17;
        ?? r11;
        e.b bVar3;
        int i15 = 0;
        this.f56446h0 = 0;
        this.f56448i0 = 0;
        this.f56506r1 = false;
        this.f56507s1 = false;
        int size = this.V0.size();
        int iMax3 = Math.max(0, Y());
        int iMax4 = Math.max(0, z());
        e.b[] bVarArr = this.f56434b0;
        boolean z11 = true;
        e.b bVar4 = bVarArr[1];
        e.b bVar5 = bVarArr[0];
        if (this.Y0 == 0 && k.b(this.f56504p1, 1)) {
            y.h.h(this, O1());
            for (int i16 = 0; i16 < size; i16++) {
                e eVar = (e) this.V0.get(i16);
                if (eVar.o0() && !(eVar instanceof h) && !(eVar instanceof a) && !(eVar instanceof m) && !eVar.n0()) {
                    e.b bVarW = eVar.w(0);
                    e.b bVarW2 = eVar.w(1);
                    e.b bVar6 = e.b.MATCH_CONSTRAINT;
                    if (bVarW != bVar6 || eVar.f56475w == 1 || bVarW2 != bVar6 || eVar.f56477x == 1) {
                        Y1(0, eVar, this.Z0, new y.b.a(), y.b.a.f57048k);
                    }
                }
            }
        }
        char c11 = 2;
        if (size <= 2 || !((bVar5 == (bVar3 = e.b.WRAP_CONTENT) || bVar4 == bVar3) && k.b(this.f56504p1, UserVerificationMethods.USER_VERIFY_ALL) && y.i.c(this, O1()))) {
            i10 = iMax4;
            i11 = iMax3;
            z10 = false;
        } else {
            if (bVar5 == bVar3) {
                if (iMax3 >= Y() || iMax3 <= 0) {
                    iMax3 = Y();
                } else {
                    p1(iMax3);
                    this.f56506r1 = true;
                }
            }
            if (bVar4 == bVar3) {
                if (iMax4 >= z() || iMax4 <= 0) {
                    iMax4 = z();
                } else {
                    Q0(iMax4);
                    this.f56507s1 = true;
                }
            }
            i10 = iMax4;
            i11 = iMax3;
            z10 = true;
        }
        boolean z12 = Z1(64) || Z1(128);
        u.d dVar = this.f56490b1;
        dVar.f53673i = false;
        dVar.f53674j = false;
        if (this.f56504p1 != 0 && z12) {
            dVar.f53674j = true;
        }
        ArrayList arrayList = this.V0;
        e.b bVarC = C();
        e.b bVar7 = e.b.WRAP_CONTENT;
        boolean z13 = bVarC == bVar7 || V() == bVar7;
        a2();
        for (int i17 = 0; i17 < size; i17++) {
            e eVar2 = (e) this.V0.get(i17);
            if (eVar2 instanceof n) {
                ((n) eVar2).x1();
            }
        }
        boolean zZ1 = Z1(64);
        ?? r113 = z10;
        int i18 = 0;
        ?? r114 = 1;
        while (r114 != 0) {
            int i19 = i18 + 1;
            try {
                this.f56490b1.E();
                a2();
                o(this.f56490b1);
                int i20 = i15;
                while (i20 < size) {
                    i12 = i15;
                    try {
                        c10 = c11;
                        try {
                            ((e) this.V0.get(i20)).o(this.f56490b1);
                            i20++;
                            i15 = i12;
                            c11 = c10;
                        } catch (Exception e10) {
                            e = e10;
                            r18 = z11;
                            B1 = r114;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            if (B1 != 0) {
                                F2 = f2(this.f56490b1, k.f56553a);
                            } else {
                                v1(this.f56490b1, zZ1);
                                for (i13 = i12; i13 < size; i13++) {
                                    ((e) this.V0.get(i13)).v1(this.f56490b1, zZ1);
                                }
                                F2 = i12;
                            }
                            if (z13) {
                                r19 = F2 == true ? 1 : 0;
                            } else {
                                r19 = F2 == true ? 1 : 0;
                            }
                            iMax = Math.max(this.f56460o0, Y());
                            r13 = r113;
                            r110 = r19;
                            if (iMax > Y()) {
                                p1(iMax);
                                this.f56434b0[i12] = e.b.FIXED;
                                ?? r115 = r18;
                                r110 = r115 == true ? 1 : 0;
                                r13 = r115;
                            }
                            iMax2 = Math.max(this.f56462p0, z());
                            r14 = r13;
                            r111 = r110;
                            if (iMax2 > z()) {
                                Q0(iMax2);
                                this.f56434b0[r18] = e.b.FIXED;
                                r17 = r18;
                                r111 = r17 == true ? 1 : 0;
                            }
                            if (r14 == 0) {
                                bVar = this.f56434b0[i12];
                                bVar2 = e.b.WRAP_CONTENT;
                                if (bVar == bVar2) {
                                    r14 = r17;
                                    r10 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                } else {
                                    r14 = r17;
                                    r10 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                }
                                if (this.f56434b0[r10] == bVar2) {
                                    r14 = r17;
                                    i14 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                } else {
                                    r14 = r17;
                                    i14 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                }
                            } else {
                                r14 = r17;
                                i14 = 8;
                                r15 = r14;
                                r112 = r111;
                            }
                            if (i19 > i14) {
                                r16 = i12;
                            } else {
                                r16 = r112;
                            }
                            i18 = i19;
                            i15 = i12;
                            c11 = c10;
                            z11 = true;
                            r113 = r15;
                            r114 = r16;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        c10 = c11;
                    }
                }
                i12 = i15;
                c10 = c11;
                B1 = B1(this.f56490b1);
                WeakReference weakReference = this.f56509u1;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z11;
                } else {
                    boolean z14 = z11;
                    try {
                        G1((d) this.f56509u1.get(), this.f56490b1.q(this.R));
                        this.f56509u1 = null;
                        r18 = z14;
                    } catch (Exception e12) {
                        e = e12;
                        B1 = B1;
                        r18 = z14;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference weakReference2 = this.f56511w1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    F1((d) this.f56511w1.get(), this.f56490b1.q(this.T));
                    this.f56511w1 = null;
                }
                WeakReference weakReference3 = this.f56510v1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    G1((d) this.f56510v1.get(), this.f56490b1.q(this.Q));
                    this.f56510v1 = null;
                }
                WeakReference weakReference4 = this.f56512x1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    F1((d) this.f56512x1.get(), this.f56490b1.q(this.S));
                    this.f56512x1 = null;
                }
                if (B1 != 0) {
                    this.f56490b1.A();
                }
            } catch (Exception e13) {
                e = e13;
                i12 = i15;
                r18 = z11;
                c10 = c11;
                B1 = r114;
            }
            if (B1 != 0) {
                F2 = f2(this.f56490b1, k.f56553a);
            } else {
                v1(this.f56490b1, zZ1);
                while (i13 < size) {
                    ((e) this.V0.get(i13)).v1(this.f56490b1, zZ1);
                }
                F2 = i12;
            }
            if (z13 || i19 >= 8 || !k.f56553a[c10]) {
                r19 = F2 == true ? 1 : 0;
            } else {
                int i21 = i12;
                int iMax5 = i21;
                int iMax6 = iMax5;
                while (i21 < size) {
                    r11 = F2;
                    e eVar3 = (e) this.V0.get(i21);
                    iMax5 = Math.max(iMax5, eVar3.f56446h0 + eVar3.Y());
                    iMax6 = Math.max(iMax6, eVar3.f56448i0 + eVar3.z());
                    i21++;
                    r11 = r11 == true ? 1 : 0;
                }
                r11 = F2;
                ?? r116 = r11;
                int iMax7 = Math.max(this.f56460o0, iMax5);
                int iMax8 = Math.max(this.f56462p0, iMax6);
                e.b bVar8 = e.b.WRAP_CONTENT;
                r113 = r113;
                r19 = r116;
                if (bVar5 == bVar8 && Y() < iMax7) {
                    r113 = r113;
                    r19 = r116;
                    p1(iMax7);
                    this.f56434b0[i12] = bVar8;
                    ?? r117 = r18;
                    r19 = r117 == true ? 1 : 0;
                    r113 = r117;
                }
                if (bVar4 == bVar8 && z() < iMax8) {
                    Q0(iMax8);
                    this.f56434b0[r18] = bVar8;
                    r113 = r18;
                    r19 = r113 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.f56460o0, Y());
            r13 = r113;
            r110 = r19;
            if (iMax > Y()) {
                p1(iMax);
                this.f56434b0[i12] = e.b.FIXED;
                ?? r118 = r18;
                r110 = r118 == true ? 1 : 0;
                r13 = r118;
            }
            iMax2 = Math.max(this.f56462p0, z());
            r14 = r13;
            r111 = r110;
            if (iMax2 > z()) {
                Q0(iMax2);
                this.f56434b0[r18] = e.b.FIXED;
                r17 = r18;
                r111 = r17 == true ? 1 : 0;
            }
            if (r14 == 0) {
                bVar = this.f56434b0[i12];
                bVar2 = e.b.WRAP_CONTENT;
                if (bVar == bVar2 || i11 <= 0 || Y() <= i11) {
                    r14 = r17;
                    r10 = r18;
                    r14 = r14;
                    r111 = r111;
                } else {
                    ?? r12 = r18;
                    this.f56506r1 = r12;
                    this.f56434b0[i12] = e.b.FIXED;
                    p1(i11);
                    boolean z15 = r12 == true ? 1 : 0;
                    r111 = z15 ? 1 : 0;
                    r10 = r12;
                    r14 = z15;
                }
                if (this.f56434b0[r10] == bVar2 || i10 <= 0 || z() <= i10) {
                    r14 = r17;
                    i14 = 8;
                    r15 = r14;
                    r112 = r111;
                } else {
                    this.f56507s1 = r10;
                    this.f56434b0[r10] = e.b.FIXED;
                    Q0(i10);
                    i14 = 8;
                    r15 = 1;
                    r112 = 1;
                }
            } else {
                r14 = r17;
                i14 = 8;
                r15 = r14;
                r112 = r111;
            }
            if (i19 > i14) {
                r16 = i12;
            } else {
                r16 = r112;
            }
            i18 = i19;
            i15 = i12;
            c11 = c10;
            z11 = true;
            r113 = r15;
            r114 = r16;
        }
        int i22 = i15;
        this.V0 = arrayList;
        if (r113 != 0) {
            e.b[] bVarArr2 = this.f56434b0;
            bVarArr2[i22] = bVar5;
            bVarArr2[1] = bVar4;
        }
        z0(this.f56490b1.w());
    }
}
