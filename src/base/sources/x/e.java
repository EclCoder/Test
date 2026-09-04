package x;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import y.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e {
    public static float U0 = 0.5f;
    int A0;
    int B0;
    boolean C0;
    boolean D0;
    boolean E0;
    public boolean F;
    boolean F0;
    public boolean G;
    boolean G0;
    boolean H0;
    boolean I0;
    int J0;
    int K0;
    boolean L0;
    private boolean M;
    boolean M0;
    public float[] N0;
    protected e[] O0;
    protected e[] P0;
    e Q0;
    e R0;
    public int S0;
    public int T0;
    public d X;
    public d[] Y;
    protected ArrayList Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean[] f56432a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public b[] f56434b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y.c f56435c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public e f56436c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y.c f56437d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    int f56438d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    int f56440e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f56442f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected int f56444g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    protected int f56446h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected int f56448i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    int f56450j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    int f56452k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    protected int f56454l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected int f56456m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    int f56458n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f56459o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    protected int f56460o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected int f56462p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    float f56464q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    float f56466r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private Object f56468s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f56470t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f56472u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f56474v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private String f56476w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private String f56478x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    int f56480y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    int f56482z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f56431a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p[] f56433b = new p[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y.l f56439e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.n f56441f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f56443g = {true, true};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f56445h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f56447i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f56449j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f56451k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f56453l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f56455m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w.a f56457n = new w.a(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f56461p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f56463q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f56465r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f56467s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f56469t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f56471u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f56473v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f56475w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f56477x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f56479y = new int[2];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f56481z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    int H = -1;
    float I = 1.0f;
    private int[] J = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float K = Float.NaN;
    private boolean L = false;
    private boolean N = false;
    private int O = 0;
    private int P = 0;
    public d Q = new d(this, d.a.LEFT);
    public d R = new d(this, d.a.TOP);
    public d S = new d(this, d.a.RIGHT);
    public d T = new d(this, d.a.BOTTOM);
    public d U = new d(this, d.a.BASELINE);
    d V = new d(this, d.a.CENTER_X);
    d W = new d(this, d.a.CENTER_Y);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56483a;

        static {
            int[] iArr = new int[d.a.values().length];
            f56483a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56483a[d.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56483a[d.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56483a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56483a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56483a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56483a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56483a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f56483a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.a.CENTER);
        this.X = dVar;
        this.Y = new d[]{this.Q, this.S, this.R, this.T, this.U, dVar};
        this.Z = new ArrayList();
        this.f56432a0 = new boolean[2];
        b bVar = b.FIXED;
        this.f56434b0 = new b[]{bVar, bVar};
        this.f56436c0 = null;
        this.f56438d0 = 0;
        this.f56440e0 = 0;
        this.f56442f0 = 0.0f;
        this.f56444g0 = -1;
        this.f56446h0 = 0;
        this.f56448i0 = 0;
        this.f56450j0 = 0;
        this.f56452k0 = 0;
        this.f56454l0 = 0;
        this.f56456m0 = 0;
        this.f56458n0 = 0;
        float f10 = U0;
        this.f56464q0 = f10;
        this.f56466r0 = f10;
        this.f56470t0 = 0;
        this.f56472u0 = 0;
        this.f56474v0 = false;
        this.f56476w0 = null;
        this.f56478x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new e[]{null, null};
        this.P0 = new e[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        d();
    }

    private void A0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private void B0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private void C0(StringBuilder sb2, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(str2);
        sb2.append(",\n");
    }

    private void D0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    private void R(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, b bVar, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        C0(sb2, "      behavior", bVar.toString(), b.FIXED.toString());
        B0(sb2, "      size", i10, 0);
        B0(sb2, "      min", i11, 0);
        B0(sb2, "      max", i12, Integer.MAX_VALUE);
        B0(sb2, "      matchMin", i14, 0);
        B0(sb2, "      matchDef", i15, 0);
        A0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    private void S(StringBuilder sb2, String str, d dVar) {
        if (dVar.f56417f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f56417f);
        sb2.append("'");
        if (dVar.f56419h != Integer.MIN_VALUE || dVar.f56418g != 0) {
            sb2.append(",");
            sb2.append(dVar.f56418g);
            if (dVar.f56419h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f56419h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    private void d() {
        this.Z.add(this.Q);
        this.Z.add(this.R);
        this.Z.add(this.S);
        this.Z.add(this.T);
        this.Z.add(this.V);
        this.Z.add(this.W);
        this.Z.add(this.X);
        this.Z.add(this.U);
    }

    private boolean h0(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.Y;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f56417f;
        return (dVar4 == null || dVar4.f56417f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f56417f) == null || dVar2.f56417f != dVar) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:362:0x0582  */
    private void i(u.d dVar, boolean z10, boolean z11, boolean z12, boolean z13, u.i iVar, u.i iVar2, b bVar, boolean z14, d dVar2, d dVar3, int i10, int i11, int i12, int i13, float f10, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f11, boolean z20) {
        boolean z21;
        int iMin;
        int i18;
        u.i iVar3;
        boolean z22;
        boolean z23;
        int i19;
        int i20;
        u.i iVarQ;
        u.i iVarQ2;
        int i21;
        char c10;
        char c11;
        d dVar4;
        boolean z24;
        u.i iVar4;
        boolean z25;
        boolean z26;
        int i22;
        int i23;
        boolean z27;
        boolean z28;
        u.i iVar5;
        e eVar;
        int i24;
        boolean z29;
        int iMin2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        e eVar2;
        int i32;
        e eVar3;
        dVar = dVar;
        u.i iVarQ3 = dVar.q(dVar2);
        u.i iVarQ4 = dVar.q(dVar3);
        u.i iVarQ5 = dVar.q(dVar2.j());
        u.i iVarQ6 = dVar.q(dVar3.j());
        u.d.x();
        boolean zO = dVar2.o();
        boolean zO2 = dVar3.o();
        boolean zO3 = this.X.o();
        int i33 = zO2 ? (zO ? 1 : 0) + 1 : zO ? 1 : 0;
        if (zO3) {
            i33++;
        }
        int i34 = z15 ? 3 : i14;
        u.i iVar6 = iVarQ6;
        int iOrdinal = bVar.ordinal();
        boolean z30 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i34 == 4) ? false : true;
        int i35 = this.f56453l;
        if (i35 != -1 && z10) {
            this.f56453l = -1;
            i11 = i35;
            z30 = false;
        }
        int i36 = this.f56455m;
        if (i36 == -1 || z10) {
            i36 = i11;
        } else {
            this.f56455m = -1;
            z30 = false;
        }
        int i37 = i36;
        if (this.f56472u0 == 8) {
            iMin = 0;
            z21 = false;
        } else {
            z21 = z30;
            iMin = i37;
        }
        if (z20) {
            if (!zO && !zO2 && !zO3) {
                dVar.f(iVarQ3, i10);
            } else if (zO && !zO2) {
                i18 = 8;
                dVar.e(iVarQ3, iVarQ5, dVar2.f(), 8);
            }
            i18 = 8;
        } else {
            i18 = 8;
        }
        if (z21 == 0) {
            if (z14) {
                dVar.e(iVarQ4, iVarQ3, 0, 3);
                if (i12 > 0) {
                    dVar.h(iVarQ4, iVarQ3, i12, 8);
                }
                if (i13 < Integer.MAX_VALUE) {
                    dVar.j(iVarQ4, iVarQ3, i13, 8);
                }
            } else {
                dVar.e(iVarQ4, iVarQ3, iMin, i18);
            }
            i20 = i17;
            iVar3 = iVarQ4;
            i33 = i33 == true ? 1 : 0;
            iVar6 = iVar6;
            z22 = z21;
            z23 = z13;
            i19 = i16;
        } else if (i33 == 2 || z15 || !(i34 == 1 || i34 == 0)) {
            int i38 = i16 == -2 ? iMin : i16;
            int i39 = i17 == -2 ? iMin : i17;
            if (iMin > 0 && i34 != 1) {
                iMin = 0;
            }
            if (i38 > 0) {
                dVar.h(iVarQ4, iVarQ3, i38, 8);
                iMin = Math.max(iMin, i38);
            }
            if (i39 > 0) {
                if (!z11 || i34 != 1) {
                    dVar.j(iVarQ4, iVarQ3, i39, 8);
                }
                iMin = Math.min(iMin, i39);
            }
            if (i34 == 1) {
                if (z11) {
                    dVar.e(iVarQ4, iVarQ3, iMin, 8);
                } else if (z17) {
                    dVar.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar.j(iVarQ4, iVarQ3, iMin, 8);
                } else {
                    dVar.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar.j(iVarQ4, iVarQ3, iMin, 8);
                }
                iVar3 = iVarQ4;
                iVar6 = iVar6;
                z22 = z21;
                z23 = z13;
                i19 = i38;
                i20 = i39;
                i33 = i33 == true ? 1 : 0;
            } else {
                if (i34 == 2) {
                    d.a aVarK = dVar2.k();
                    d.a aVar = d.a.TOP;
                    if (aVarK == aVar || dVar2.k() == d.a.BOTTOM) {
                        iVarQ = dVar.q(this.f56436c0.q(aVar));
                        iVarQ2 = dVar.q(this.f56436c0.q(d.a.BOTTOM));
                    } else {
                        iVarQ = dVar.q(this.f56436c0.q(d.a.LEFT));
                        iVarQ2 = dVar.q(this.f56436c0.q(d.a.RIGHT));
                    }
                    u.i iVar7 = iVarQ2;
                    iVar3 = iVarQ4;
                    dVar.d(dVar.r().k(iVar3, iVarQ3, iVar7, iVarQ, f11));
                    if (z11) {
                        z21 = false;
                    }
                    z23 = z13;
                    z22 = z21;
                } else {
                    iVar3 = iVarQ4;
                    z22 = z21;
                    z23 = true;
                }
                i19 = i38;
                i20 = i39;
            }
        } else {
            int iMax = Math.max(i16, iMin);
            if (i17 > 0) {
                iMax = Math.min(i17, iMax);
            }
            dVar.e(iVarQ4, iVarQ3, iMax, 8);
            i19 = i16;
            i20 = i17;
            iVar3 = iVarQ4;
            i33 = i33 == true ? 1 : 0;
            iVar6 = iVar6;
            z22 = false;
            z23 = z13;
        }
        if (!z20) {
            i21 = 8;
            c10 = 1;
            c11 = 2;
        } else {
            if (!z17) {
                if (!zO && !zO2 && !zO3) {
                    i26 = 5;
                    z29 = z11;
                    i32 = i26;
                } else if (!zO || zO2) {
                    if (zO || !zO2) {
                        if (zO && zO2) {
                            e eVar4 = dVar2.f56417f.f56415d;
                            e eVar5 = dVar3.f56417f.f56415d;
                            e eVarM = M();
                            int i40 = 6;
                            if (!z22) {
                                z24 = true;
                                if (iVarQ5.f53702g && iVar6.f53702g) {
                                    u.i iVar8 = iVar6;
                                    dVar.c(iVarQ3, iVarQ5, dVar2.f(), f10, iVar8, iVar3, dVar3.f(), 8);
                                    if (z11 && z23) {
                                        int iF = dVar3.f56417f != null ? dVar3.f() : 0;
                                        if (iVar8 != iVar2) {
                                            dVar.h(iVar2, iVar3, iF, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                u.i iVar9 = iVar6;
                                iVarQ3 = iVarQ3;
                                iVar4 = iVar9;
                                dVar = dVar;
                                iVarQ5 = iVarQ5;
                                z25 = true;
                                z26 = true;
                                i40 = 6;
                                i22 = 5;
                                i23 = 4;
                                z27 = false;
                            } else if (i34 == 0) {
                                if (i20 != 0 || i19 != 0) {
                                    i30 = 5;
                                    i31 = 5;
                                    z26 = true;
                                    z27 = false;
                                    z25 = true;
                                } else if (iVarQ5.f53702g && iVar6.f53702g) {
                                    dVar.e(iVarQ3, iVarQ5, dVar2.f(), 8);
                                    dVar.e(iVar3, iVar6, -dVar3.f(), 8);
                                    return;
                                } else {
                                    i30 = 8;
                                    i31 = 8;
                                    z26 = false;
                                    z27 = true;
                                    z25 = false;
                                }
                                if ((eVar4 instanceof x.a) || (eVar5 instanceof x.a)) {
                                    iVar4 = iVar6;
                                    z24 = true;
                                    i23 = 4;
                                } else {
                                    iVar4 = iVar6;
                                    i23 = i31;
                                    z24 = true;
                                }
                                i22 = i30;
                                iVarQ5 = iVarQ5;
                                i40 = 6;
                            } else {
                                if (i34 == 2) {
                                    if ((eVar4 instanceof x.a) || (eVar5 instanceof x.a)) {
                                        iVar4 = iVar6;
                                        z24 = true;
                                        i23 = 4;
                                    } else {
                                        iVar4 = iVar6;
                                        z24 = true;
                                        i23 = 5;
                                    }
                                    i22 = 5;
                                } else if (i34 == 1) {
                                    u.i iVar10 = iVar6;
                                    iVarQ3 = iVarQ3;
                                    iVar4 = iVar10;
                                    iVarQ5 = iVarQ5;
                                    i40 = 6;
                                    z24 = true;
                                    i23 = 4;
                                    i22 = 8;
                                } else if (i34 != 3) {
                                    z24 = true;
                                    u.i iVar11 = iVar6;
                                    iVarQ3 = iVarQ3;
                                    iVar4 = iVar11;
                                    dVar = dVar;
                                    iVarQ5 = iVarQ5;
                                    i40 = 6;
                                    i23 = 4;
                                    i22 = 5;
                                    z25 = false;
                                    z26 = false;
                                    z27 = false;
                                } else if (this.H == -1) {
                                    if (z18) {
                                        u.i iVar12 = iVar6;
                                        iVarQ3 = iVarQ3;
                                        iVar4 = iVar12;
                                        dVar = dVar;
                                        iVarQ5 = iVarQ5;
                                        z24 = true;
                                        i40 = z11 ? 5 : 4;
                                    } else {
                                        u.i iVar13 = iVar6;
                                        iVarQ3 = iVarQ3;
                                        iVar4 = iVar13;
                                        dVar = dVar;
                                        iVarQ5 = iVarQ5;
                                        z24 = true;
                                        i40 = 8;
                                    }
                                    i23 = 5;
                                    i22 = 8;
                                    z25 = true;
                                    z26 = true;
                                    z27 = true;
                                } else {
                                    if (z15) {
                                        if (i15 != 2) {
                                            z24 = true;
                                            if (i15 != 1) {
                                                i28 = 8;
                                                i29 = 5;
                                            }
                                            iVar4 = iVar6;
                                            i22 = i28;
                                            i23 = i29;
                                            z25 = z24;
                                            z26 = z25;
                                            z27 = z26;
                                        } else {
                                            z24 = true;
                                        }
                                        i28 = 5;
                                        i29 = 4;
                                        iVar4 = iVar6;
                                        i22 = i28;
                                        i23 = i29;
                                        z25 = z24;
                                        z26 = z25;
                                        z27 = z26;
                                    } else {
                                        z24 = true;
                                        if (i20 > 0) {
                                            iVar4 = iVar6;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 5;
                                        } else if (i20 != 0 || i19 != 0) {
                                            iVar4 = iVar6;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 4;
                                        } else if (z18) {
                                            iVar4 = iVar6;
                                            i22 = (eVar4 == eVarM || eVar5 == eVarM) ? 5 : 4;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 4;
                                        } else {
                                            iVar4 = iVar6;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                            i23 = 8;
                                        }
                                        i22 = 5;
                                    }
                                    dVar = dVar;
                                }
                                z25 = true;
                                z26 = true;
                                z27 = false;
                            }
                            if (z25 && iVarQ5 == iVar4 && eVar4 != eVarM) {
                                z25 = false;
                                z28 = false;
                            } else {
                                z28 = z24;
                            }
                            if (z26) {
                                if (z22 || z16 || z18 || iVarQ5 != iVar || iVar4 != iVar2) {
                                    i27 = i40;
                                    z29 = z11;
                                } else {
                                    i27 = 8;
                                    z29 = false;
                                    i22 = 8;
                                    z28 = false;
                                }
                                u.i iVar14 = iVarQ3;
                                eVar = eVarM;
                                i24 = 8;
                                u.i iVar15 = iVar3;
                                dVar.c(iVar14, iVarQ5, dVar2.f(), f10, iVar4, iVar15, dVar3.f(), i27);
                                u.i iVar16 = iVar4;
                                iVar5 = iVar14;
                                iVar6 = iVar16;
                                iVar3 = iVar15;
                            } else {
                                iVar6 = iVar4;
                                iVar5 = iVarQ3;
                                eVar = eVarM;
                                z24 = z24;
                                i24 = 8;
                                z29 = z11;
                            }
                            if (this.f56472u0 == i24 && !dVar3.m()) {
                                return;
                            }
                            if (z25) {
                                int i41 = (!z29 || iVarQ5 == iVar6 || z22 || !((eVar4 instanceof x.a) || (eVar5 instanceof x.a))) ? i22 : 6;
                                dVar.h(iVar5, iVarQ5, dVar2.f(), i41);
                                dVar.j(iVar3, iVar6, -dVar3.f(), i41);
                                i22 = i41;
                            }
                            if (!z29 || !z19 || (eVar4 instanceof x.a) || (eVar5 instanceof x.a) || eVar5 == eVar) {
                                iMin2 = i23;
                                i25 = i22;
                                z24 = z28;
                            } else {
                                iMin2 = 6;
                                i25 = 6;
                            }
                            if (z24) {
                                if (z27 && (!z18 || z12)) {
                                    if (eVar4 != eVar && eVar5 != eVar) {
                                        i40 = iMin2;
                                    }
                                    if ((eVar4 instanceof h) || (eVar5 instanceof h)) {
                                        i40 = 5;
                                    }
                                    if ((eVar4 instanceof x.a) || (eVar5 instanceof x.a)) {
                                        i40 = 5;
                                    }
                                    iMin2 = Math.max(z18 ? 5 : i40, iMin2);
                                }
                                if (z29) {
                                    iMin2 = Math.min(i25, iMin2);
                                    if (z15 && !z18 && (eVar4 == eVar || eVar5 == eVar)) {
                                        iMin2 = 4;
                                    }
                                }
                                dVar.e(iVar5, iVarQ5, dVar2.f(), iMin2);
                                dVar.e(iVar3, iVar6, -dVar3.f(), iMin2);
                            }
                            if (z29) {
                                int iF2 = iVar == iVarQ5 ? dVar2.f() : 0;
                                if (iVarQ5 != iVar) {
                                    dVar.h(iVar5, iVar, iF2, 5);
                                }
                            }
                            if (!z29 || !z22 || i12 != 0 || i19 != 0) {
                                i26 = 5;
                            } else if (z22 && i34 == 3) {
                                dVar.h(iVar3, iVar5, 0, i24);
                                i26 = 5;
                            } else {
                                i26 = 5;
                                dVar.h(iVar3, iVar5, 0, 5);
                            }
                        }
                        i32 = i26;
                    } else {
                        dVar.e(iVar3, iVar6, -dVar3.f(), 8);
                        if (z11) {
                            if (this.f56449j && iVarQ3.f53702g && (eVar2 = this.f56436c0) != null) {
                                f fVar = (f) eVar2;
                                if (z10) {
                                    fVar.E1(dVar2);
                                } else {
                                    fVar.J1(dVar2);
                                }
                            } else {
                                i26 = 5;
                                dVar.h(iVarQ3, iVar, 0, 5);
                            }
                        }
                        z29 = z11;
                        i32 = i26;
                    }
                    i26 = 5;
                    z29 = z11;
                    i32 = i26;
                } else {
                    i32 = (z11 && (dVar2.f56417f.f56415d instanceof x.a)) ? 8 : 5;
                    z29 = z11;
                    iVar6 = iVar6;
                }
                if (z29 && z23) {
                    int iF3 = dVar3.f56417f != null ? dVar3.f() : 0;
                    if (iVar6 != iVar2) {
                        if (!this.f56449j || !iVar3.f53702g || (eVar3 = this.f56436c0) == null) {
                            dVar.h(iVar2, iVar3, iF3, i32);
                            return;
                        }
                        f fVar2 = (f) eVar3;
                        if (z10) {
                            fVar2.D1(dVar3);
                            return;
                        } else {
                            fVar2.I1(dVar3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            c11 = 2;
            i21 = 8;
            c10 = 1;
        }
        if (i33 < c11 && z11 && z23) {
            dVar.h(iVarQ3, iVar, 0, i21);
            char c12 = (z10 || this.U.f56417f == null) ? c10 : (char) 0;
            if (!z10 && (dVar4 = this.U.f56417f) != null) {
                e eVar6 = dVar4.f56415d;
                if (eVar6.f56442f0 != 0.0f) {
                    b[] bVarArr = eVar6.f56434b0;
                    b bVar2 = bVarArr[0];
                    b bVar3 = b.MATCH_CONSTRAINT;
                    if (bVar2 == bVar3 && bVarArr[c10] == bVar3) {
                        c12 = c10;
                    } else {
                        c12 = 0;
                    }
                } else {
                    c12 = 0;
                }
            }
            if (c12 != 0) {
                dVar.h(iVar2, iVar3, 0, i21);
            }
        }
    }

    public float A() {
        return this.f56464q0;
    }

    public int B() {
        return this.J0;
    }

    public b C() {
        return this.f56434b0[0];
    }

    public int D() {
        d dVar = this.Q;
        int i10 = dVar != null ? dVar.f56418g : 0;
        d dVar2 = this.S;
        return dVar2 != null ? i10 + dVar2.f56418g : i10;
    }

    public int E() {
        return this.O;
    }

    public void E0(boolean z10) {
        this.f56474v0 = z10;
    }

    public int F() {
        return this.P;
    }

    public void F0(int i10) {
        this.f56458n0 = i10;
        this.L = i10 > 0;
    }

    public int G(int i10) {
        if (i10 == 0) {
            return Y();
        }
        if (i10 == 1) {
            return z();
        }
        return 0;
    }

    public void G0(Object obj) {
        this.f56468s0 = obj;
    }

    public int H() {
        return this.J[1];
    }

    public void H0(String str) {
        this.f56476w0 = str;
    }

    public int I() {
        return this.J[0];
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void I0(String str) {
        float fAbs;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f56442f0 = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i11 = 0;
        int i12 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i11 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i12 = i11;
            i11 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i11);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i10;
                }
            } else {
                String strSubstring3 = str.substring(i11, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i10;
                } else {
                    float f10 = Float.parseFloat(strSubstring3);
                    float f11 = Float.parseFloat(strSubstring4);
                    if (f10 <= 0.0f || f11 <= 0.0f) {
                        fAbs = i10;
                    } else {
                        fAbs = i12 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i10 = (fAbs > i10 ? 1 : (fAbs == i10 ? 0 : -1));
        if (i10 > 0) {
            this.f56442f0 = fAbs;
            this.f56444g0 = i12;
        }
    }

    public int J() {
        return this.f56462p0;
    }

    public void J0(int i10) {
        if (this.L) {
            int i11 = i10 - this.f56458n0;
            int i12 = this.f56440e0 + i11;
            this.f56448i0 = i11;
            this.R.t(i11);
            this.T.t(i12);
            this.U.t(i10);
            this.f56463q = true;
        }
    }

    public int K() {
        return this.f56460o0;
    }

    public void K0(int i10, int i11) {
        if (this.f56461p) {
            return;
        }
        this.Q.t(i10);
        this.S.t(i11);
        this.f56446h0 = i10;
        this.f56438d0 = i11 - i10;
        this.f56461p = true;
    }

    public e L(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.T).f56417f) != null && dVar2.f56417f == dVar) {
                return dVar2.f56415d;
            }
            return null;
        }
        d dVar3 = this.S;
        d dVar4 = dVar3.f56417f;
        if (dVar4 == null || dVar4.f56417f != dVar3) {
            return null;
        }
        return dVar4.f56415d;
    }

    public void L0(int i10) {
        this.Q.t(i10);
        this.f56446h0 = i10;
    }

    public e M() {
        return this.f56436c0;
    }

    public void M0(int i10) {
        this.R.t(i10);
        this.f56448i0 = i10;
    }

    public e N(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.R).f56417f) != null && dVar2.f56417f == dVar) {
                return dVar2.f56415d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f56417f;
        if (dVar4 == null || dVar4.f56417f != dVar3) {
            return null;
        }
        return dVar4.f56415d;
    }

    public void N0(int i10, int i11) {
        if (this.f56463q) {
            return;
        }
        this.R.t(i10);
        this.T.t(i11);
        this.f56448i0 = i10;
        this.f56440e0 = i11 - i10;
        if (this.L) {
            this.U.t(i10 + this.f56458n0);
        }
        this.f56463q = true;
    }

    public int O() {
        return Z() + this.f56438d0;
    }

    public void O0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f56446h0 = i10;
        this.f56448i0 = i11;
        if (this.f56472u0 == 8) {
            this.f56438d0 = 0;
            this.f56440e0 = 0;
            return;
        }
        b[] bVarArr = this.f56434b0;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f56438d0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f56440e0)) {
            i17 = i14;
        }
        this.f56438d0 = i16;
        this.f56440e0 = i17;
        int i18 = this.f56462p0;
        if (i17 < i18) {
            this.f56440e0 = i18;
        }
        int i19 = this.f56460o0;
        if (i16 < i19) {
            this.f56438d0 = i19;
        }
        int i20 = this.A;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f56438d0 = Math.min(this.f56438d0, i20);
        }
        int i21 = this.D;
        if (i21 > 0 && this.f56434b0[1] == b.MATCH_CONSTRAINT) {
            this.f56440e0 = Math.min(this.f56440e0, i21);
        }
        int i22 = this.f56438d0;
        if (i16 != i22) {
            this.f56453l = i22;
        }
        int i23 = this.f56440e0;
        if (i17 != i23) {
            this.f56455m = i23;
        }
    }

    public p P(int i10) {
        if (i10 == 0) {
            return this.f56439e;
        }
        if (i10 == 1) {
            return this.f56441f;
        }
        return null;
    }

    public void P0(boolean z10) {
        this.L = z10;
    }

    public void Q(StringBuilder sb2) {
        sb2.append("  " + this.f56459o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f56438d0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f56440e0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f56446h0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f56448i0);
        sb2.append("\n");
        S(sb2, TtmlNode.LEFT, this.Q);
        S(sb2, "top", this.R);
        S(sb2, TtmlNode.RIGHT, this.S);
        S(sb2, "bottom", this.T);
        S(sb2, "baseline", this.U);
        S(sb2, "centerX", this.V);
        S(sb2, "centerY", this.W);
        R(sb2, "    width", this.f56438d0, this.f56460o0, this.J[0], this.f56453l, this.f56481z, this.f56475w, this.B, this.f56434b0[0], this.N0[0]);
        R(sb2, "    height", this.f56440e0, this.f56462p0, this.J[1], this.f56455m, this.C, this.f56477x, this.E, this.f56434b0[1], this.N0[1]);
        D0(sb2, "    dimensionRatio", this.f56442f0, this.f56444g0);
        A0(sb2, "    horizontalBias", this.f56464q0, U0);
        A0(sb2, "    verticalBias", this.f56466r0, U0);
        B0(sb2, "    horizontalChainStyle", this.J0, 0);
        B0(sb2, "    verticalChainStyle", this.K0, 0);
        sb2.append("  }");
    }

    public void Q0(int i10) {
        this.f56440e0 = i10;
        int i11 = this.f56462p0;
        if (i10 < i11) {
            this.f56440e0 = i11;
        }
    }

    public void R0(float f10) {
        this.f56464q0 = f10;
    }

    public void S0(int i10) {
        this.J0 = i10;
    }

    public float T() {
        return this.f56466r0;
    }

    public void T0(int i10, int i11) {
        this.f56446h0 = i10;
        int i12 = i11 - i10;
        this.f56438d0 = i12;
        int i13 = this.f56460o0;
        if (i12 < i13) {
            this.f56438d0 = i13;
        }
    }

    public int U() {
        return this.K0;
    }

    public void U0(b bVar) {
        this.f56434b0[0] = bVar;
    }

    public b V() {
        return this.f56434b0[1];
    }

    public void V0(int i10, int i11, int i12, float f10) {
        this.f56475w = i10;
        this.f56481z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f56475w = 2;
    }

    public int W() {
        int i10 = this.Q != null ? this.R.f56418g : 0;
        return this.S != null ? i10 + this.T.f56418g : i10;
    }

    public void W0(float f10) {
        this.N0[0] = f10;
    }

    public int X() {
        return this.f56472u0;
    }

    protected void X0(int i10, boolean z10) {
        this.f56432a0[i10] = z10;
    }

    public int Y() {
        if (this.f56472u0 == 8) {
            return 0;
        }
        return this.f56438d0;
    }

    public void Y0(boolean z10) {
        this.M = z10;
    }

    public int Z() {
        e eVar = this.f56436c0;
        return (eVar == null || !(eVar instanceof f)) ? this.f56446h0 : ((f) eVar).f56491c1 + this.f56446h0;
    }

    public void Z0(boolean z10) {
        this.N = z10;
    }

    public int a0() {
        e eVar = this.f56436c0;
        return (eVar == null || !(eVar instanceof f)) ? this.f56448i0 : ((f) eVar).f56492d1 + this.f56448i0;
    }

    public void a1(int i10, int i11) {
        this.O = i10;
        this.P = i11;
        d1(false);
    }

    public boolean b0() {
        return this.L;
    }

    public void b1(int i10) {
        this.J[1] = i10;
    }

    public boolean c0(int i10) {
        if (i10 == 0) {
            return (this.Q.f56417f != null ? 1 : 0) + (this.S.f56417f != null ? 1 : 0) < 2;
        }
        return ((this.R.f56417f != null ? 1 : 0) + (this.T.f56417f != null ? 1 : 0)) + (this.U.f56417f != null ? 1 : 0) < 2;
    }

    public void c1(int i10) {
        this.J[0] = i10;
    }

    public boolean d0() {
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((d) this.Z.get(i10)).m()) {
                return true;
            }
        }
        return false;
    }

    public void d1(boolean z10) {
        this.f56447i = z10;
    }

    public void e(f fVar, u.d dVar, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.Z1(64));
        }
        if (i10 == 0) {
            HashSet hashSetD = this.Q.d();
            if (hashSetD != null) {
                Iterator it = hashSetD.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f56415d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet hashSetD2 = this.S.d();
            if (hashSetD2 != null) {
                Iterator it2 = hashSetD2.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f56415d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSetD3 = this.R.d();
        if (hashSetD3 != null) {
            Iterator it3 = hashSetD3.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f56415d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSetD4 = this.T.d();
        if (hashSetD4 != null) {
            Iterator it4 = hashSetD4.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f56415d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSetD5 = this.U.d();
        if (hashSetD5 != null) {
            Iterator it5 = hashSetD5.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f56415d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public boolean e0() {
        return (this.f56453l == -1 && this.f56455m == -1) ? false : true;
    }

    public void e1(int i10) {
        if (i10 < 0) {
            this.f56462p0 = 0;
        } else {
            this.f56462p0 = i10;
        }
    }

    boolean f() {
        return (this instanceof m) || (this instanceof h);
    }

    public boolean f0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.Q.f56417f;
            return dVar3 != null && dVar3.n() && (dVar2 = this.S.f56417f) != null && dVar2.n() && (this.S.f56417f.e() - this.S.f()) - (this.Q.f56417f.e() + this.Q.f()) >= i11;
        }
        d dVar4 = this.R.f56417f;
        if (dVar4 != null && dVar4.n() && (dVar = this.T.f56417f) != null && dVar.n() && (this.T.f56417f.e() - this.T.f()) - (this.R.f56417f.e() + this.R.f()) >= i11) {
            return true;
        }
        return false;
    }

    public void f1(int i10) {
        if (i10 < 0) {
            this.f56460o0 = 0;
        } else {
            this.f56460o0 = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02be  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:203:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:206:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:209:0x030b  */
    /* JADX WARN: Code duplicated, block: B:230:0x036a  */
    /* JADX WARN: Code duplicated, block: B:245:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:261:0x0449  */
    /* JADX WARN: Code duplicated, block: B:264:0x045b  */
    /* JADX WARN: Code duplicated, block: B:265:0x045d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0460  */
    /* JADX WARN: Code duplicated, block: B:304:0x0537  */
    /* JADX WARN: Code duplicated, block: B:306:0x053e  */
    /* JADX WARN: Code duplicated, block: B:308:0x0545  */
    /* JADX WARN: Code duplicated, block: B:309:0x0554  */
    /* JADX WARN: Code duplicated, block: B:310:0x0557  */
    /* JADX WARN: Code duplicated, block: B:313:0x056f  */
    /* JADX WARN: Multi-variable type inference failed */
    public void g(u.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        e eVar;
        e eVar2;
        boolean z13;
        boolean z14;
        int i10;
        u.i iVar;
        int i11;
        int i12;
        boolean z15;
        int i13;
        boolean z16;
        b bVar;
        b bVar2;
        boolean z17;
        int i14;
        int i15;
        boolean z18;
        u.i iVar2;
        u.i iVar3;
        u.i iVar4;
        int i16;
        int i17;
        char c10;
        int i18;
        int i19;
        u.d dVar2;
        boolean z19;
        y.n nVar;
        y.l lVar;
        int i20;
        int i21;
        boolean zK0;
        boolean zM0;
        y.l lVar2;
        y.n nVar2;
        u.d dVar3 = dVar;
        u.i iVarQ = dVar3.q(this.Q);
        u.i iVarQ2 = dVar3.q(this.S);
        u.i iVarQ3 = dVar3.q(this.R);
        u.i iVarQ4 = dVar3.q(this.T);
        u.i iVarQ5 = dVar3.q(this.U);
        e eVar3 = this.f56436c0;
        if (eVar3 == null) {
            z11 = false;
            z12 = false;
        } else {
            z12 = eVar3 != null && eVar3.f56434b0[0] == b.WRAP_CONTENT;
            z11 = eVar3 != null && eVar3.f56434b0[1] == b.WRAP_CONTENT;
            int i22 = this.f56473v;
            if (i22 == 1) {
                z11 = false;
            } else if (i22 == 2) {
                z12 = false;
            } else if (i22 == 3) {
                z11 = false;
                z12 = false;
            }
        }
        if (this.f56472u0 == 8 && !this.f56474v0 && !d0()) {
            boolean[] zArr = this.f56432a0;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z20 = this.f56461p;
        if (z20 || this.f56463q) {
            if (z20) {
                dVar3.f(iVarQ, this.f56446h0);
                dVar3.f(iVarQ2, this.f56446h0 + this.f56438d0);
                if (z12 && (eVar2 = this.f56436c0) != null) {
                    if (this.f56451k) {
                        f fVar = (f) eVar2;
                        fVar.E1(this.Q);
                        fVar.D1(this.S);
                    } else {
                        dVar3.h(dVar3.q(eVar2.S), iVarQ2, 0, 5);
                    }
                }
            }
            if (this.f56463q) {
                dVar3.f(iVarQ3, this.f56448i0);
                dVar3.f(iVarQ4, this.f56448i0 + this.f56440e0);
                if (this.U.m()) {
                    dVar3.f(iVarQ5, this.f56448i0 + this.f56458n0);
                }
                if (z11 && (eVar = this.f56436c0) != null) {
                    if (this.f56451k) {
                        f fVar2 = (f) eVar;
                        fVar2.J1(this.R);
                        fVar2.I1(this.T);
                    } else {
                        dVar3.h(dVar3.q(eVar.T), iVarQ4, 0, 5);
                    }
                }
            }
            if (this.f56461p && this.f56463q) {
                this.f56461p = false;
                this.f56463q = false;
                return;
            }
        }
        boolean z21 = u.d.f53658s;
        if (z10 && (lVar2 = this.f56439e) != null && (nVar2 = this.f56441f) != null) {
            y.f fVar3 = lVar2.f57131h;
            if (fVar3.f57081j && lVar2.f57132i.f57081j && nVar2.f57131h.f57081j && nVar2.f57132i.f57081j) {
                dVar3.f(iVarQ, fVar3.f57078g);
                dVar3.f(iVarQ2, this.f56439e.f57132i.f57078g);
                dVar3.f(iVarQ3, this.f56441f.f57131h.f57078g);
                dVar3.f(iVarQ4, this.f56441f.f57132i.f57078g);
                dVar3.f(iVarQ5, this.f56441f.f57107k.f57078g);
                if (this.f56436c0 != null) {
                    if (z12 && this.f56443g[0] && !k0()) {
                        dVar3.h(dVar3.q(this.f56436c0.S), iVarQ2, 0, 8);
                    }
                    if (z11 && this.f56443g[1] && !m0()) {
                        dVar3.h(dVar3.q(this.f56436c0.T), iVarQ4, 0, 8);
                    }
                }
                this.f56461p = false;
                this.f56463q = false;
                return;
            }
        }
        if (this.f56436c0 != null) {
            if (h0(0)) {
                ((f) this.f56436c0).A1(this, 0);
                zK0 = true;
            } else {
                zK0 = k0();
            }
            if (h0(1)) {
                ((f) this.f56436c0).A1(this, 1);
                zM0 = true;
            } else {
                zM0 = m0();
            }
            if (!zK0 && z12 && this.f56472u0 != 8 && this.Q.f56417f == null && this.S.f56417f == null) {
                dVar3.h(dVar3.q(this.f56436c0.S), iVarQ2, 0, 1);
            }
            if (!zM0 && z11 && this.f56472u0 != 8 && this.R.f56417f == null && this.T.f56417f == null && this.U == null) {
                dVar3.h(dVar3.q(this.f56436c0.T), iVarQ4, 0, 1);
            }
            z13 = zK0;
            z14 = zM0;
        } else {
            z13 = false;
            z14 = false;
        }
        int i23 = this.f56438d0;
        int i24 = this.f56460o0;
        if (i23 >= i24) {
            i24 = i23;
        }
        int i25 = this.f56440e0;
        int i26 = this.f56462p0;
        if (i25 >= i26) {
            i26 = i25;
        }
        b[] bVarArr = this.f56434b0;
        b bVar3 = bVarArr[0];
        b bVar4 = b.MATCH_CONSTRAINT;
        boolean z22 = bVar3 != bVar4;
        b bVar5 = bVarArr[1];
        boolean z23 = bVar5 != bVar4;
        int i27 = this.f56444g0;
        this.H = i27;
        int i28 = i24;
        float f10 = this.f56442f0;
        this.I = f10;
        int i29 = this.f56475w;
        int i30 = this.f56477x;
        if (f10 > 0.0f) {
            i10 = i26;
            if (this.f56472u0 != 8) {
                i11 = (bVar3 == bVar4 && i29 == 0) ? 3 : i29;
                int i31 = (bVar5 == bVar4 && i30 == 0) ? 3 : i30;
                if (bVar3 == bVar4 && bVar5 == bVar4) {
                    iVar = iVarQ2;
                    i21 = 3;
                    if (i11 == 3 && i31 == 3) {
                        t1(z12, z11, z22, z23);
                    }
                    i12 = i31;
                    z15 = true;
                    int[] iArr = this.f56479y;
                    iArr[0] = i11;
                    iArr[1] = i12;
                    this.f56445h = z15;
                    if (z15) {
                        int i32 = this.H;
                        i13 = -1;
                        boolean z24 = i32 != 0 || i32 == -1;
                        if (z15 || !((i20 = this.H) == 1 || i20 == i13)) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        bVar = this.f56434b0[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2 || !(this instanceof f)) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (z17) {
                            i14 = 0;
                        } else {
                            i14 = i28;
                        }
                        boolean z25 = !this.X.o();
                        boolean[] zArr2 = this.f56432a0;
                        boolean z26 = zArr2[0];
                        boolean z27 = zArr2[1];
                        if (this.f56469t != 2 || this.f56461p) {
                            i15 = i11;
                            z18 = z12;
                        } else {
                            if (z10 && (lVar = this.f56439e) != null) {
                                y.f fVar4 = lVar.f57131h;
                                if (fVar4.f57081j && lVar.f57132i.f57081j) {
                                    if (z10) {
                                        dVar3.f(iVarQ, fVar4.f57078g);
                                        u.i iVar5 = iVar;
                                        dVar3.f(iVar5, this.f56439e.f57132i.f57078g);
                                        if (this.f56436c0 != null && z12 && this.f56443g[0] && !k0()) {
                                            dVar3.h(dVar3.q(this.f56436c0.S), iVar5, 0, 8);
                                        }
                                        iVar = iVar5;
                                    }
                                    i15 = i11;
                                    z18 = z12;
                                }
                            }
                            u.i iVar6 = iVar;
                            e eVar4 = this.f56436c0;
                            u.i iVarQ6 = eVar4 != null ? dVar3.q(eVar4.S) : null;
                            e eVar5 = this.f56436c0;
                            u.i iVarQ7 = eVar5 != null ? dVar3.q(eVar5.Q) : null;
                            boolean z28 = this.f56443g[0];
                            b[] bVarArr2 = this.f56434b0;
                            iVar = iVar6;
                            b bVar6 = bVarArr2[0];
                            d dVar4 = this.Q;
                            u.i iVar7 = iVarQ7;
                            d dVar5 = this.S;
                            z15 = z15;
                            z18 = z12;
                            int i33 = this.f56446h0;
                            int i34 = this.f56460o0;
                            int i35 = this.J[0];
                            float f11 = this.f56464q0;
                            boolean z29 = bVarArr2[1] == bVar4;
                            iVarQ = iVarQ;
                            boolean z30 = z11;
                            u.i iVar8 = iVarQ6;
                            z11 = z30;
                            i15 = i11;
                            bVar2 = bVar2;
                            dVar3 = dVar;
                            i(dVar3, true, z18, z11, z28, iVar7, iVar8, bVar6, z17, dVar4, dVar5, i33, i14, i34, i35, f11, z24, z29, z13, z14, z26, i15, i12, this.f56481z, this.A, this.B, z25);
                        }
                        if (z10 || (nVar = this.f56441f) == null) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        } else {
                            y.f fVar5 = nVar.f57131h;
                            if (fVar5.f57081j && nVar.f57132i.f57081j) {
                                int i36 = fVar5.f57078g;
                                iVar2 = iVarQ3;
                                dVar3.f(iVar2, i36);
                                iVar3 = iVarQ4;
                                dVar3.f(iVar3, this.f56441f.f57132i.f57078g);
                                iVar4 = iVarQ5;
                                dVar3.f(iVar4, this.f56441f.f57107k.f57078g);
                                e eVar6 = this.f56436c0;
                                if (eVar6 == null || z14 || !z11) {
                                    i16 = 0;
                                    i17 = 8;
                                    c10 = 1;
                                } else {
                                    c10 = 1;
                                    if (this.f56443g[1]) {
                                        i16 = 0;
                                        i17 = 8;
                                        dVar3.h(dVar3.q(eVar6.T), iVar3, 0, 8);
                                    } else {
                                        i16 = 0;
                                        i17 = 8;
                                    }
                                }
                                i18 = i16;
                            } else {
                                iVar2 = r24;
                                iVar3 = r25;
                                iVar4 = r26;
                                i16 = 0;
                                i17 = 8;
                                c10 = 1;
                                i18 = 1;
                            }
                        }
                        if (this.f56471u == 2) {
                            i19 = i16;
                        } else {
                            i19 = i18;
                        }
                        if (i19 == 0 && !this.f56463q) {
                            boolean z31 = (this.f56434b0[c10] == bVar2 && (this instanceof f)) ? c10 : i16;
                            int i37 = z31 != 0 ? i16 : i10;
                            e eVar7 = this.f56436c0;
                            u.i iVarQ8 = eVar7 != null ? dVar3.q(eVar7.T) : null;
                            e eVar8 = this.f56436c0;
                            u.i iVarQ9 = eVar8 != null ? dVar3.q(eVar8.R) : null;
                            if (this.f56458n0 > 0 || this.f56472u0 == i17) {
                                z19 = z25;
                                d dVar6 = this.U;
                                if (dVar6.f56417f != null) {
                                    dVar3.e(iVar4, iVar2, r(), i17);
                                    dVar3.e(iVar4, dVar3.q(this.U.f56417f), this.U.f(), i17);
                                    if (z11) {
                                        dVar3.h(iVarQ8, dVar3.q(this.T), i16, 5);
                                    }
                                    z19 = i16;
                                } else if (this.f56472u0 == i17) {
                                    dVar3.e(iVar4, iVar2, dVar6.f(), i17);
                                    z19 = z25;
                                } else {
                                    dVar3.e(iVar4, iVar2, r(), i17);
                                    z19 = z25;
                                }
                            }
                            z19 = z25;
                            boolean z32 = this.f56443g[c10];
                            b[] bVarArr3 = this.f56434b0;
                            int i38 = i16;
                            i(dVar, false, z11, z18, z32, iVarQ9, iVarQ8, bVarArr3[c10], z31, this.R, this.T, this.f56448i0, i37, this.f56462p0, this.J[c10], this.f56466r0, z16, bVarArr3[i38] == bVar4 ? c10 : i38, z14, z13, z27, i12, i15, this.C, this.D, this.E, z19);
                        }
                        if (!z15) {
                            dVar2 = dVar;
                        } else if (this.H == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                            dVar2 = dVar;
                        }
                        if (this.X.o()) {
                            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                        }
                        this.f56461p = false;
                        this.f56463q = false;
                    }
                    i13 = -1;
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.f56434b0[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        i14 = 0;
                    } else {
                        i14 = i28;
                    }
                    boolean z210 = !this.X.o();
                    boolean[] zArr3 = this.f56432a0;
                    boolean z211 = zArr3[0];
                    boolean z212 = zArr3[1];
                    if (this.f56469t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f56471u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.f56461p = false;
                    this.f56463q = false;
                }
                iVar = iVarQ2;
                i21 = 3;
                if (bVar3 == bVar4 && i11 == i21) {
                    this.H = 0;
                    i28 = (int) (i25 * f10);
                    if (bVar5 != bVar4) {
                        i11 = 4;
                        i12 = i31;
                    } else {
                        i12 = i31;
                        z15 = true;
                    }
                    int[] iArr2 = this.f56479y;
                    iArr2[0] = i11;
                    iArr2[1] = i12;
                    this.f56445h = z15;
                    if (z15) {
                        int i39 = this.H;
                        i13 = -1;
                        if (i39 != 0) {
                        }
                        if (z15) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        bVar = this.f56434b0[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            i14 = 0;
                        } else {
                            i14 = i28;
                        }
                        boolean z213 = !this.X.o();
                        boolean[] zArr4 = this.f56432a0;
                        boolean z214 = zArr4[0];
                        boolean z215 = zArr4[1];
                        if (this.f56469t != 2) {
                            i15 = i11;
                            z18 = z12;
                        } else {
                            i15 = i11;
                            z18 = z12;
                        }
                        if (z10) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        } else {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        }
                        if (this.f56471u == 2) {
                            i19 = i16;
                        } else {
                            i19 = i18;
                        }
                        if (i19 == 0) {
                        }
                        if (!z15) {
                            dVar2 = dVar;
                        } else if (this.H == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                            dVar2 = dVar;
                        }
                        if (this.X.o()) {
                            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                        }
                        this.f56461p = false;
                        this.f56463q = false;
                    }
                    i13 = -1;
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.f56434b0[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        i14 = 0;
                    } else {
                        i14 = i28;
                    }
                    boolean z216 = !this.X.o();
                    boolean[] zArr5 = this.f56432a0;
                    boolean z217 = zArr5[0];
                    boolean z218 = zArr5[1];
                    if (this.f56469t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f56471u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.f56461p = false;
                    this.f56463q = false;
                }
                if (bVar5 == bVar4 && i31 == i21) {
                    this.H = 1;
                    if (i27 == -1) {
                        this.I = 1.0f / f10;
                    }
                    i10 = (int) (this.I * i23);
                    if (bVar3 != bVar4) {
                        i12 = 4;
                    }
                    int[] iArr3 = this.f56479y;
                    iArr3[0] = i11;
                    iArr3[1] = i12;
                    this.f56445h = z15;
                    if (z15) {
                        int i310 = this.H;
                        i13 = -1;
                        if (i310 != 0) {
                        }
                        if (z15) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        bVar = this.f56434b0[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            i14 = 0;
                        } else {
                            i14 = i28;
                        }
                        boolean z219 = !this.X.o();
                        boolean[] zArr6 = this.f56432a0;
                        boolean z2110 = zArr6[0];
                        boolean z2111 = zArr6[1];
                        if (this.f56469t != 2) {
                            i15 = i11;
                            z18 = z12;
                        } else {
                            i15 = i11;
                            z18 = z12;
                        }
                        if (z10) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        } else {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i16 = 0;
                            i17 = 8;
                            c10 = 1;
                            i18 = 1;
                        }
                        if (this.f56471u == 2) {
                            i19 = i16;
                        } else {
                            i19 = i18;
                        }
                        if (i19 == 0) {
                        }
                        if (!z15) {
                            dVar2 = dVar;
                        } else if (this.H == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                            dVar2 = dVar;
                        }
                        if (this.X.o()) {
                            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                        }
                        this.f56461p = false;
                        this.f56463q = false;
                    }
                    i13 = -1;
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.f56434b0[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        i14 = 0;
                    } else {
                        i14 = i28;
                    }
                    boolean z2112 = !this.X.o();
                    boolean[] zArr7 = this.f56432a0;
                    boolean z2113 = zArr7[0];
                    boolean z2114 = zArr7[1];
                    if (this.f56469t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f56471u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.f56461p = false;
                    this.f56463q = false;
                }
                i12 = i31;
                z15 = true;
                int[] iArr4 = this.f56479y;
                iArr4[0] = i11;
                iArr4[1] = i12;
                this.f56445h = z15;
                if (z15) {
                    int i311 = this.H;
                    i13 = -1;
                    if (i311 != 0) {
                    }
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar = this.f56434b0[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        i14 = 0;
                    } else {
                        i14 = i28;
                    }
                    boolean z2115 = !this.X.o();
                    boolean[] zArr8 = this.f56432a0;
                    boolean z2116 = zArr8[0];
                    boolean z2117 = zArr8[1];
                    if (this.f56469t != 2) {
                        i15 = i11;
                        z18 = z12;
                    } else {
                        i15 = i11;
                        z18 = z12;
                    }
                    if (z10) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i16 = 0;
                        i17 = 8;
                        c10 = 1;
                        i18 = 1;
                    }
                    if (this.f56471u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z15) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.f56461p = false;
                    this.f56463q = false;
                }
                i13 = -1;
                if (z15) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                bVar = this.f56434b0[0];
                bVar2 = b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i14 = 0;
                } else {
                    i14 = i28;
                }
                boolean z2118 = !this.X.o();
                boolean[] zArr9 = this.f56432a0;
                boolean z2119 = zArr9[0];
                boolean z21110 = zArr9[1];
                if (this.f56469t != 2) {
                    i15 = i11;
                    z18 = z12;
                } else {
                    i15 = i11;
                    z18 = z12;
                }
                if (z10) {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                } else {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                }
                if (this.f56471u == 2) {
                    i19 = i16;
                } else {
                    i19 = i18;
                }
                if (i19 == 0) {
                }
                if (!z15) {
                    dVar2 = dVar;
                } else if (this.H == 1) {
                    dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                    dVar2 = dVar;
                }
                if (this.X.o()) {
                    dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                }
                this.f56461p = false;
                this.f56463q = false;
            }
            z15 = false;
            int[] iArr5 = this.f56479y;
            iArr5[0] = i11;
            iArr5[1] = i12;
            this.f56445h = z15;
            if (z15) {
                int i312 = this.H;
                i13 = -1;
                if (i312 != 0) {
                }
                if (z15) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                bVar = this.f56434b0[0];
                bVar2 = b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i14 = 0;
                } else {
                    i14 = i28;
                }
                boolean z21111 = !this.X.o();
                boolean[] zArr10 = this.f56432a0;
                boolean z21112 = zArr10[0];
                boolean z21113 = zArr10[1];
                if (this.f56469t != 2) {
                    i15 = i11;
                    z18 = z12;
                } else {
                    i15 = i11;
                    z18 = z12;
                }
                if (z10) {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                } else {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i16 = 0;
                    i17 = 8;
                    c10 = 1;
                    i18 = 1;
                }
                if (this.f56471u == 2) {
                    i19 = i16;
                } else {
                    i19 = i18;
                }
                if (i19 == 0) {
                }
                if (!z15) {
                    dVar2 = dVar;
                } else if (this.H == 1) {
                    dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                    dVar2 = dVar;
                }
                if (this.X.o()) {
                    dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                }
                this.f56461p = false;
                this.f56463q = false;
            }
            i13 = -1;
            if (z15) {
                z16 = false;
            } else {
                z16 = false;
            }
            bVar = this.f56434b0[0];
            bVar2 = b.WRAP_CONTENT;
            if (bVar == bVar2) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (z17) {
                i14 = 0;
            } else {
                i14 = i28;
            }
            boolean z21114 = !this.X.o();
            boolean[] zArr11 = this.f56432a0;
            boolean z21115 = zArr11[0];
            boolean z21116 = zArr11[1];
            if (this.f56469t != 2) {
                i15 = i11;
                z18 = z12;
            } else {
                i15 = i11;
                z18 = z12;
            }
            if (z10) {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            } else {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            }
            if (this.f56471u == 2) {
                i19 = i16;
            } else {
                i19 = i18;
            }
            if (i19 == 0) {
            }
            if (!z15) {
                dVar2 = dVar;
            } else if (this.H == 1) {
                dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                dVar2 = dVar;
            } else {
                dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                dVar2 = dVar;
            }
            if (this.X.o()) {
                dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
            }
            this.f56461p = false;
            this.f56463q = false;
        }
        i10 = i26;
        iVar = iVarQ2;
        i11 = i29;
        i12 = i30;
        z15 = false;
        int[] iArr6 = this.f56479y;
        iArr6[0] = i11;
        iArr6[1] = i12;
        this.f56445h = z15;
        if (z15) {
            int i313 = this.H;
            i13 = -1;
            if (i313 != 0) {
            }
            if (z15) {
                z16 = false;
            } else {
                z16 = false;
            }
            bVar = this.f56434b0[0];
            bVar2 = b.WRAP_CONTENT;
            if (bVar == bVar2) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (z17) {
                i14 = 0;
            } else {
                i14 = i28;
            }
            boolean z21117 = !this.X.o();
            boolean[] zArr12 = this.f56432a0;
            boolean z21118 = zArr12[0];
            boolean z21119 = zArr12[1];
            if (this.f56469t != 2) {
                i15 = i11;
                z18 = z12;
            } else {
                i15 = i11;
                z18 = z12;
            }
            if (z10) {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            } else {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i16 = 0;
                i17 = 8;
                c10 = 1;
                i18 = 1;
            }
            if (this.f56471u == 2) {
                i19 = i16;
            } else {
                i19 = i18;
            }
            if (i19 == 0) {
            }
            if (!z15) {
                dVar2 = dVar;
            } else if (this.H == 1) {
                dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                dVar2 = dVar;
            } else {
                dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                dVar2 = dVar;
            }
            if (this.X.o()) {
                dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
            }
            this.f56461p = false;
            this.f56463q = false;
        }
        i13 = -1;
        if (z15) {
            z16 = false;
        } else {
            z16 = false;
        }
        bVar = this.f56434b0[0];
        bVar2 = b.WRAP_CONTENT;
        if (bVar == bVar2) {
            z17 = false;
        } else {
            z17 = false;
        }
        if (z17) {
            i14 = 0;
        } else {
            i14 = i28;
        }
        boolean z211110 = !this.X.o();
        boolean[] zArr13 = this.f56432a0;
        boolean z211111 = zArr13[0];
        boolean z211112 = zArr13[1];
        if (this.f56469t != 2) {
            i15 = i11;
            z18 = z12;
        } else {
            i15 = i11;
            z18 = z12;
        }
        if (z10) {
            iVar2 = r24;
            iVar3 = r25;
            iVar4 = r26;
            i16 = 0;
            i17 = 8;
            c10 = 1;
            i18 = 1;
        } else {
            iVar2 = r24;
            iVar3 = r25;
            iVar4 = r26;
            i16 = 0;
            i17 = 8;
            c10 = 1;
            i18 = 1;
        }
        if (this.f56471u == 2) {
            i19 = i16;
        } else {
            i19 = i18;
        }
        if (i19 == 0) {
        }
        if (!z15) {
            dVar2 = dVar;
        } else if (this.H == 1) {
            dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
            dVar2 = dVar;
        } else {
            dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
            dVar2 = dVar;
        }
        if (this.X.o()) {
            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
        }
        this.f56461p = false;
        this.f56463q = false;
    }

    public void g0(d.a aVar, e eVar, d.a aVar2, int i10, int i11) {
        q(aVar).b(eVar.q(aVar2), i10, i11, true);
    }

    public void g1(int i10, int i11) {
        this.f56446h0 = i10;
        this.f56448i0 = i11;
    }

    public boolean h() {
        return this.f56472u0 != 8;
    }

    public void h1(e eVar) {
        this.f56436c0 = eVar;
    }

    public boolean i0() {
        return this.f56465r;
    }

    public void i1(float f10) {
        this.f56466r0 = f10;
    }

    public void j(d.a aVar, e eVar, d.a aVar2) {
        k(aVar, eVar, aVar2, 0);
    }

    public boolean j0(int i10) {
        return this.f56432a0[i10];
    }

    public void j1(int i10) {
        this.K0 = i10;
    }

    public void k(d.a aVar, e eVar, d.a aVar2, int i10) {
        d.a aVar3;
        d.a aVar4;
        boolean z10;
        d.a aVar5 = d.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 != aVar5) {
                d.a aVar6 = d.a.LEFT;
                if (aVar2 == aVar6 || aVar2 == d.a.RIGHT) {
                    k(aVar6, eVar, aVar2, 0);
                    k(d.a.RIGHT, eVar, aVar2, 0);
                    q(aVar5).a(eVar.q(aVar2), 0);
                    return;
                }
                d.a aVar7 = d.a.TOP;
                if (aVar2 == aVar7 || aVar2 == d.a.BOTTOM) {
                    k(aVar7, eVar, aVar2, 0);
                    k(d.a.BOTTOM, eVar, aVar2, 0);
                    q(aVar5).a(eVar.q(aVar2), 0);
                    return;
                }
                return;
            }
            d.a aVar8 = d.a.LEFT;
            d dVarQ = q(aVar8);
            d.a aVar9 = d.a.RIGHT;
            d dVarQ2 = q(aVar9);
            d.a aVar10 = d.a.TOP;
            d dVarQ3 = q(aVar10);
            d.a aVar11 = d.a.BOTTOM;
            d dVarQ4 = q(aVar11);
            boolean z11 = true;
            if ((dVarQ == null || !dVarQ.o()) && (dVarQ2 == null || !dVarQ2.o())) {
                k(aVar8, eVar, aVar8, 0);
                k(aVar9, eVar, aVar9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((dVarQ3 == null || !dVarQ3.o()) && (dVarQ4 == null || !dVarQ4.o())) {
                k(aVar10, eVar, aVar10, 0);
                k(aVar11, eVar, aVar11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                q(aVar5).a(eVar.q(aVar5), 0);
                return;
            }
            if (z10) {
                d.a aVar12 = d.a.CENTER_X;
                q(aVar12).a(eVar.q(aVar12), 0);
                return;
            } else {
                if (z11) {
                    d.a aVar13 = d.a.CENTER_Y;
                    q(aVar13).a(eVar.q(aVar13), 0);
                    return;
                }
                return;
            }
        }
        d.a aVar14 = d.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = d.a.LEFT) || aVar2 == d.a.RIGHT)) {
            d dVarQ5 = q(aVar4);
            d dVarQ6 = eVar.q(aVar2);
            d dVarQ7 = q(d.a.RIGHT);
            dVarQ5.a(dVarQ6, 0);
            dVarQ7.a(dVarQ6, 0);
            q(aVar14).a(dVarQ6, 0);
            return;
        }
        d.a aVar15 = d.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = d.a.TOP) || aVar2 == d.a.BOTTOM)) {
            d dVarQ8 = eVar.q(aVar2);
            q(aVar3).a(dVarQ8, 0);
            q(d.a.BOTTOM).a(dVarQ8, 0);
            q(aVar15).a(dVarQ8, 0);
            return;
        }
        if (aVar == aVar14 && aVar2 == aVar14) {
            d.a aVar16 = d.a.LEFT;
            q(aVar16).a(eVar.q(aVar16), 0);
            d.a aVar17 = d.a.RIGHT;
            q(aVar17).a(eVar.q(aVar17), 0);
            q(aVar14).a(eVar.q(aVar2), 0);
            return;
        }
        if (aVar == aVar15 && aVar2 == aVar15) {
            d.a aVar18 = d.a.TOP;
            q(aVar18).a(eVar.q(aVar18), 0);
            d.a aVar19 = d.a.BOTTOM;
            q(aVar19).a(eVar.q(aVar19), 0);
            q(aVar15).a(eVar.q(aVar2), 0);
            return;
        }
        d dVarQ9 = q(aVar);
        d dVarQ10 = eVar.q(aVar2);
        if (dVarQ9.p(dVarQ10)) {
            d.a aVar20 = d.a.BASELINE;
            if (aVar == aVar20) {
                d dVarQ11 = q(d.a.TOP);
                d dVarQ12 = q(d.a.BOTTOM);
                if (dVarQ11 != null) {
                    dVarQ11.q();
                }
                if (dVarQ12 != null) {
                    dVarQ12.q();
                }
            } else if (aVar == d.a.TOP || aVar == d.a.BOTTOM) {
                d dVarQ13 = q(aVar20);
                if (dVarQ13 != null) {
                    dVarQ13.q();
                }
                d dVarQ14 = q(aVar5);
                if (dVarQ14.j() != dVarQ10) {
                    dVarQ14.q();
                }
                d dVarG = q(aVar).g();
                d dVarQ15 = q(aVar15);
                if (dVarQ15.o()) {
                    dVarG.q();
                    dVarQ15.q();
                }
            } else if (aVar == d.a.LEFT || aVar == d.a.RIGHT) {
                d dVarQ16 = q(aVar5);
                if (dVarQ16.j() != dVarQ10) {
                    dVarQ16.q();
                }
                d dVarG2 = q(aVar).g();
                d dVarQ17 = q(aVar14);
                if (dVarQ17.o()) {
                    dVarG2.q();
                    dVarQ17.q();
                }
            }
            dVarQ9.a(dVarQ10, i10);
        }
    }

    public boolean k0() {
        d dVar = this.Q;
        d dVar2 = dVar.f56417f;
        if (dVar2 != null && dVar2.f56417f == dVar) {
            return true;
        }
        d dVar3 = this.S;
        d dVar4 = dVar3.f56417f;
        return dVar4 != null && dVar4.f56417f == dVar3;
    }

    public void k1(int i10, int i11) {
        this.f56448i0 = i10;
        int i12 = i11 - i10;
        this.f56440e0 = i12;
        int i13 = this.f56462p0;
        if (i12 < i13) {
            this.f56440e0 = i13;
        }
    }

    public void l(d dVar, d dVar2, int i10) {
        if (dVar.h() == this) {
            k(dVar.k(), dVar2.h(), dVar2.k(), i10);
        }
    }

    public boolean l0() {
        return this.M;
    }

    public void l1(b bVar) {
        this.f56434b0[1] = bVar;
    }

    public void m(e eVar, float f10, int i10) {
        d.a aVar = d.a.CENTER;
        g0(aVar, eVar, aVar, i10, 0);
        this.K = f10;
    }

    public boolean m0() {
        d dVar = this.R;
        d dVar2 = dVar.f56417f;
        if (dVar2 != null && dVar2.f56417f == dVar) {
            return true;
        }
        d dVar3 = this.T;
        d dVar4 = dVar3.f56417f;
        return dVar4 != null && dVar4.f56417f == dVar3;
    }

    public void m1(int i10, int i11, int i12, float f10) {
        this.f56477x = i10;
        this.C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.D = i12;
        this.E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f56477x = 2;
    }

    public void n(e eVar, HashMap map) {
        this.f56469t = eVar.f56469t;
        this.f56471u = eVar.f56471u;
        this.f56475w = eVar.f56475w;
        this.f56477x = eVar.f56477x;
        int[] iArr = this.f56479y;
        int[] iArr2 = eVar.f56479y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f56481z = eVar.f56481z;
        this.A = eVar.A;
        this.C = eVar.C;
        this.D = eVar.D;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.I = eVar.I;
        int[] iArr3 = eVar.J;
        this.J = Arrays.copyOf(iArr3, iArr3.length);
        this.K = eVar.K;
        this.L = eVar.L;
        this.M = eVar.M;
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.X.q();
        this.f56434b0 = (b[]) Arrays.copyOf(this.f56434b0, 2);
        this.f56436c0 = this.f56436c0 == null ? null : (e) map.get(eVar.f56436c0);
        this.f56438d0 = eVar.f56438d0;
        this.f56440e0 = eVar.f56440e0;
        this.f56442f0 = eVar.f56442f0;
        this.f56444g0 = eVar.f56444g0;
        this.f56446h0 = eVar.f56446h0;
        this.f56448i0 = eVar.f56448i0;
        this.f56450j0 = eVar.f56450j0;
        this.f56452k0 = eVar.f56452k0;
        this.f56454l0 = eVar.f56454l0;
        this.f56456m0 = eVar.f56456m0;
        this.f56458n0 = eVar.f56458n0;
        this.f56460o0 = eVar.f56460o0;
        this.f56462p0 = eVar.f56462p0;
        this.f56464q0 = eVar.f56464q0;
        this.f56466r0 = eVar.f56466r0;
        this.f56468s0 = eVar.f56468s0;
        this.f56470t0 = eVar.f56470t0;
        this.f56472u0 = eVar.f56472u0;
        this.f56474v0 = eVar.f56474v0;
        this.f56476w0 = eVar.f56476w0;
        this.f56478x0 = eVar.f56478x0;
        this.f56480y0 = eVar.f56480y0;
        this.f56482z0 = eVar.f56482z0;
        this.A0 = eVar.A0;
        this.B0 = eVar.B0;
        this.C0 = eVar.C0;
        this.D0 = eVar.D0;
        this.E0 = eVar.E0;
        this.F0 = eVar.F0;
        this.G0 = eVar.G0;
        this.H0 = eVar.H0;
        this.J0 = eVar.J0;
        this.K0 = eVar.K0;
        this.L0 = eVar.L0;
        this.M0 = eVar.M0;
        float[] fArr = this.N0;
        float[] fArr2 = eVar.N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        e[] eVarArr = this.O0;
        e[] eVarArr2 = eVar.O0;
        eVarArr[0] = eVarArr2[0];
        eVarArr[1] = eVarArr2[1];
        e[] eVarArr3 = this.P0;
        e[] eVarArr4 = eVar.P0;
        eVarArr3[0] = eVarArr4[0];
        eVarArr3[1] = eVarArr4[1];
        e eVar2 = eVar.Q0;
        this.Q0 = eVar2 == null ? null : (e) map.get(eVar2);
        e eVar3 = eVar.R0;
        this.R0 = eVar3 != null ? (e) map.get(eVar3) : null;
    }

    public boolean n0() {
        return this.N;
    }

    public void n1(float f10) {
        this.N0[1] = f10;
    }

    public void o(u.d dVar) {
        dVar.q(this.Q);
        dVar.q(this.R);
        dVar.q(this.S);
        dVar.q(this.T);
        if (this.f56458n0 > 0) {
            dVar.q(this.U);
        }
    }

    public boolean o0() {
        return this.f56447i && this.f56472u0 != 8;
    }

    public void o1(int i10) {
        this.f56472u0 = i10;
    }

    public void p() {
        if (this.f56439e == null) {
            this.f56439e = new y.l(this);
        }
        if (this.f56441f == null) {
            this.f56441f = new y.n(this);
        }
    }

    public boolean p0() {
        if (this.f56461p) {
            return true;
        }
        return this.Q.n() && this.S.n();
    }

    public void p1(int i10) {
        this.f56438d0 = i10;
        int i11 = this.f56460o0;
        if (i10 < i11) {
            this.f56438d0 = i11;
        }
    }

    public d q(d.a aVar) {
        switch (a.f56483a[aVar.ordinal()]) {
            case 1:
                return this.Q;
            case 2:
                return this.R;
            case 3:
                return this.S;
            case 4:
                return this.T;
            case 5:
                return this.U;
            case 6:
                return this.X;
            case 7:
                return this.V;
            case 8:
                return this.W;
            case 9:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public boolean q0() {
        if (this.f56463q) {
            return true;
        }
        return this.R.n() && this.T.n();
    }

    public void q1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f56473v = i10;
    }

    public int r() {
        return this.f56458n0;
    }

    public boolean r0() {
        return this.f56467s;
    }

    public void r1(int i10) {
        this.f56446h0 = i10;
    }

    public float s(int i10) {
        if (i10 == 0) {
            return this.f56464q0;
        }
        if (i10 == 1) {
            return this.f56466r0;
        }
        return -1.0f;
    }

    public void s0() {
        this.f56465r = true;
    }

    public void s1(int i10) {
        this.f56448i0 = i10;
    }

    public int t() {
        return a0() + this.f56440e0;
    }

    public void t0() {
        this.f56467s = true;
    }

    public void t1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.H == -1) {
            if (z12 && !z13) {
                this.H = 0;
            } else if (!z12 && z13) {
                this.H = 1;
                if (this.f56444g0 == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if (this.H == 0 && (!this.R.o() || !this.T.o())) {
            this.H = 1;
        } else if (this.H == 1 && (!this.Q.o() || !this.S.o())) {
            this.H = 0;
        }
        if (this.H == -1 && (!this.R.o() || !this.T.o() || !this.Q.o() || !this.S.o())) {
            if (this.R.o() && this.T.o()) {
                this.H = 0;
            } else if (this.Q.o() && this.S.o()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            int i10 = this.f56481z;
            if (i10 > 0 && this.C == 0) {
                this.H = 0;
            } else {
                if (i10 != 0 || this.C <= 0) {
                    return;
                }
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f56478x0 != null) {
            str = "type: " + this.f56478x0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f56476w0 != null) {
            str2 = "id: " + this.f56476w0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f56446h0);
        sb2.append(", ");
        sb2.append(this.f56448i0);
        sb2.append(") - (");
        sb2.append(this.f56438d0);
        sb2.append(" x ");
        sb2.append(this.f56440e0);
        sb2.append(")");
        return sb2.toString();
    }

    public Object u() {
        return this.f56468s0;
    }

    public boolean u0() {
        b[] bVarArr = this.f56434b0;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public void u1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zK = z10 & this.f56439e.k();
        boolean zK2 = z11 & this.f56441f.k();
        y.l lVar = this.f56439e;
        int i12 = lVar.f57131h.f57078g;
        y.n nVar = this.f56441f;
        int i13 = nVar.f57131h.f57078g;
        int i14 = lVar.f57132i.f57078g;
        int i15 = nVar.f57132i.f57078g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zK) {
            this.f56446h0 = i12;
        }
        if (zK2) {
            this.f56448i0 = i13;
        }
        if (this.f56472u0 == 8) {
            this.f56438d0 = 0;
            this.f56440e0 = 0;
            return;
        }
        if (zK) {
            if (this.f56434b0[0] == b.FIXED && i17 < (i11 = this.f56438d0)) {
                i17 = i11;
            }
            this.f56438d0 = i17;
            int i19 = this.f56460o0;
            if (i17 < i19) {
                this.f56438d0 = i19;
            }
        }
        if (zK2) {
            if (this.f56434b0[1] == b.FIXED && i18 < (i10 = this.f56440e0)) {
                i18 = i10;
            }
            this.f56440e0 = i18;
            int i20 = this.f56462p0;
            if (i18 < i20) {
                this.f56440e0 = i20;
            }
        }
    }

    public String v() {
        return this.f56476w0;
    }

    public void v0() {
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.X.q();
        this.f56436c0 = null;
        this.K = Float.NaN;
        this.f56438d0 = 0;
        this.f56440e0 = 0;
        this.f56442f0 = 0.0f;
        this.f56444g0 = -1;
        this.f56446h0 = 0;
        this.f56448i0 = 0;
        this.f56454l0 = 0;
        this.f56456m0 = 0;
        this.f56458n0 = 0;
        this.f56460o0 = 0;
        this.f56462p0 = 0;
        float f10 = U0;
        this.f56464q0 = f10;
        this.f56466r0 = f10;
        b[] bVarArr = this.f56434b0;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f56468s0 = null;
        this.f56470t0 = 0;
        this.f56472u0 = 0;
        this.f56478x0 = null;
        this.G0 = false;
        this.H0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        float[] fArr = this.N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f56469t = -1;
        this.f56471u = -1;
        int[] iArr = this.J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f56475w = 0;
        this.f56477x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f56481z = 0;
        this.C = 0;
        this.f56445h = false;
        this.H = -1;
        this.I = 1.0f;
        this.I0 = false;
        boolean[] zArr = this.f56443g;
        zArr[0] = true;
        zArr[1] = true;
        this.N = false;
        boolean[] zArr2 = this.f56432a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f56447i = true;
        int[] iArr2 = this.f56479y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f56453l = -1;
        this.f56455m = -1;
    }

    public void v1(u.d dVar, boolean z10) {
        y.n nVar;
        y.l lVar;
        int iY = dVar.y(this.Q);
        int iY2 = dVar.y(this.R);
        int iY3 = dVar.y(this.S);
        int iY4 = dVar.y(this.T);
        if (z10 && (lVar = this.f56439e) != null) {
            y.f fVar = lVar.f57131h;
            if (fVar.f57081j) {
                y.f fVar2 = lVar.f57132i;
                if (fVar2.f57081j) {
                    iY = fVar.f57078g;
                    iY3 = fVar2.f57078g;
                }
            }
        }
        if (z10 && (nVar = this.f56441f) != null) {
            y.f fVar3 = nVar.f57131h;
            if (fVar3.f57081j) {
                y.f fVar4 = nVar.f57132i;
                if (fVar4.f57081j) {
                    iY2 = fVar3.f57078g;
                    iY4 = fVar4.f57078g;
                }
            }
        }
        int i10 = iY4 - iY2;
        if (iY3 - iY < 0 || i10 < 0 || iY == Integer.MIN_VALUE || iY == Integer.MAX_VALUE || iY2 == Integer.MIN_VALUE || iY2 == Integer.MAX_VALUE || iY3 == Integer.MIN_VALUE || iY3 == Integer.MAX_VALUE || iY4 == Integer.MIN_VALUE || iY4 == Integer.MAX_VALUE) {
            iY = 0;
            iY4 = 0;
            iY2 = 0;
            iY3 = 0;
        }
        O0(iY, iY2, iY3, iY4);
    }

    public b w(int i10) {
        if (i10 == 0) {
            return C();
        }
        if (i10 == 1) {
            return V();
        }
        return null;
    }

    public void w0() {
        x0();
        i1(U0);
        R0(U0);
    }

    public float x() {
        return this.f56442f0;
    }

    public void x0() {
        e eVarM = M();
        if (eVarM != null && (eVarM instanceof f) && ((f) M()).R1()) {
            return;
        }
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.Z.get(i10)).q();
        }
    }

    public int y() {
        return this.f56444g0;
    }

    public void y0() {
        this.f56461p = false;
        this.f56463q = false;
        this.f56465r = false;
        this.f56467s = false;
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.Z.get(i10)).r();
        }
    }

    public int z() {
        if (this.f56472u0 == 8) {
            return 0;
        }
        return this.f56440e0;
    }

    public void z0(u.c cVar) {
        this.Q.s(cVar);
        this.R.s(cVar);
        this.S.s(cVar);
        this.T.s(cVar);
        this.U.s(cVar);
        this.X.s(cVar);
        this.V.s(cVar);
        this.W.s(cVar);
    }
}
