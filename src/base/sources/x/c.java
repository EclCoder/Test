package x;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f56390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f56391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f56392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f56393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f56394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f56395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f56396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList f56397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f56398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f56399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f56400k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f56401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f56402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f56403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f56404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f56405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f56406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f56407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f56408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f56409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f56410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f56411v;

    public c(e eVar, int i10, boolean z10) {
        this.f56390a = eVar;
        this.f56405p = i10;
        this.f56406q = z10;
    }

    private void b() {
        int i10 = this.f56405p * 2;
        e eVar = this.f56390a;
        this.f56404o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f56398i++;
            e[] eVarArr = eVar.P0;
            int i11 = this.f56405p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.O0[i11] = null;
            if (eVar.X() != 8) {
                this.f56401l++;
                e.b bVarW = eVar.w(this.f56405p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarW != bVar) {
                    this.f56402m += eVar.G(this.f56405p);
                }
                int iF = this.f56402m + eVar.Y[i10].f();
                this.f56402m = iF;
                int i12 = i10 + 1;
                this.f56402m = iF + eVar.Y[i12].f();
                int iF2 = this.f56403n + eVar.Y[i10].f();
                this.f56403n = iF2;
                this.f56403n = iF2 + eVar.Y[i12].f();
                if (this.f56391b == null) {
                    this.f56391b = eVar;
                }
                this.f56393d = eVar;
                e.b[] bVarArr = eVar.f56434b0;
                int i13 = this.f56405p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f56479y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f56399j++;
                        float f10 = eVar.N0[i13];
                        if (f10 > 0.0f) {
                            this.f56400k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f56407r = true;
                            } else {
                                this.f56408s = true;
                            }
                            if (this.f56397h == null) {
                                this.f56397h = new ArrayList();
                            }
                            this.f56397h.add(eVar);
                        }
                        if (this.f56395f == null) {
                            this.f56395f = eVar;
                        }
                        e eVar4 = this.f56396g;
                        if (eVar4 != null) {
                            eVar4.O0[this.f56405p] = eVar;
                        }
                        this.f56396g = eVar;
                    }
                    if (this.f56405p == 0) {
                        if (eVar.f56475w != 0 || eVar.f56481z != 0 || eVar.A != 0) {
                            this.f56404o = false;
                        }
                    } else if (eVar.f56477x != 0 || eVar.C != 0 || eVar.D != 0) {
                        this.f56404o = false;
                    }
                    if (eVar.f56442f0 != 0.0f) {
                        this.f56404o = false;
                        this.f56410u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.P0[this.f56405p] = eVar;
            }
            d dVar = eVar.Y[i10 + 1].f56417f;
            if (dVar != null) {
                e eVar5 = dVar.f56415d;
                d dVar2 = eVar5.Y[i10].f56417f;
                if (dVar2 != null && dVar2.f56415d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f56391b;
        if (eVar6 != null) {
            this.f56402m -= eVar6.Y[i10].f();
        }
        e eVar7 = this.f56393d;
        if (eVar7 != null) {
            this.f56402m -= eVar7.Y[i10 + 1].f();
        }
        this.f56392c = eVar;
        if (this.f56405p == 0 && this.f56406q) {
            this.f56394e = eVar;
        } else {
            this.f56394e = this.f56390a;
        }
        this.f56409t = this.f56408s && this.f56407r;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.X() == 8 || eVar.f56434b0[i10] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = eVar.f56479y[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f56411v) {
            b();
        }
        this.f56411v = true;
    }
}
