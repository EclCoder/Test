package ea;

import android.util.Pair;
import com.google.android.exoplayer2.v0;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Collections;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final double[] f37467q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u9.b0 f37469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0 f37470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ob.d0 f37471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f37472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f37473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f37474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f37478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f37479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f37480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f37481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f37483p;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f37484e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f37485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f37486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f37488d;

        public a(int i10) {
            this.f37488d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f37485a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f37488d;
                int length = bArr2.length;
                int i13 = this.f37486b;
                if (length < i13 + i12) {
                    this.f37488d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f37488d, this.f37486b, i12);
                this.f37486b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f37485a) {
                int i12 = this.f37486b - i11;
                this.f37486b = i12;
                if (this.f37487c != 0 || i10 != 181) {
                    this.f37485a = false;
                    return true;
                }
                this.f37487c = i12;
            } else if (i10 == 179) {
                this.f37485a = true;
            }
            byte[] bArr = f37484e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f37485a = false;
            this.f37486b = 0;
            this.f37487c = 0;
        }
    }

    public n() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    private static Pair a(a aVar, String str) {
        float f10;
        int i10;
        float f11;
        int i11;
        long j10;
        double[] dArr;
        double d10;
        int i12;
        int i13;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f37488d, aVar.f37486b);
        int i14 = bArrCopyOf[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte b10 = bArrCopyOf[5];
        int i15 = (i14 << 4) | ((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4);
        int i16 = ((b10 & 15) << 8) | (bArrCopyOf[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int i17 = (bArrCopyOf[7] & 240) >> 4;
        if (i17 == 2) {
            f10 = i16 * 4;
            i10 = i15 * 3;
        } else {
            if (i17 != 3) {
                if (i17 != 4) {
                    f11 = 1.0f;
                } else {
                    f10 = i16 * Sdk$SDKError.b.TPAT_ERROR_VALUE;
                    i10 = i15 * 100;
                }
                v0 v0VarG = new v0.b().U(str).g0(MimeTypes.VIDEO_MPEG2).n0(i15).S(i16).c0(f11).V(Collections.singletonList(bArrCopyOf)).G();
                i11 = (bArrCopyOf[7] & 15) - 1;
                if (i11 >= 0) {
                    dArr = f37467q;
                    if (i11 < dArr.length) {
                        d10 = dArr[i11];
                        byte b11 = bArrCopyOf[aVar.f37487c + 9];
                        i12 = (b11 & 96) >> 5;
                        i13 = b11 & 31;
                        if (i12 != i13) {
                            d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    } else {
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                return Pair.create(v0VarG, Long.valueOf(j10));
            }
            f10 = i16 * 16;
            i10 = i15 * 9;
        }
        f11 = f10 / i10;
        v0 v0VarG2 = new v0.b().U(str).g0(MimeTypes.VIDEO_MPEG2).n0(i15).S(i16).c0(f11).V(Collections.singletonList(bArrCopyOf)).G();
        i11 = (bArrCopyOf[7] & 15) - 1;
        if (i11 >= 0) {
            dArr = f37467q;
            if (i11 < dArr.length) {
                d10 = dArr[i11];
                byte b12 = bArrCopyOf[aVar.f37487c + 9];
                i12 = (b12 & 96) >> 5;
                i13 = b12 & 31;
                if (i12 != i13) {
                    d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            } else {
                j10 = 0;
            }
        } else {
            j10 = 0;
        }
        return Pair.create(v0VarG2, Long.valueOf(j10));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ea.m
    public void b(ob.d0 d0Var) {
        boolean z10;
        int i10;
        ob.a.i(this.f37469b);
        int iF = d0Var.f();
        int iG = d0Var.g();
        byte[] bArrE = d0Var.e();
        this.f37475h += (long) d0Var.a();
        this.f37469b.c(d0Var, d0Var.a());
        while (true) {
            int iC = ob.z.c(bArrE, iF, iG, this.f37473f);
            if (iC == iG) {
                break;
            }
            int i11 = iC + 3;
            int i12 = d0Var.e()[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i13 = iC - iF;
            if (!this.f37477j) {
                if (i13 > 0) {
                    this.f37474g.a(bArrE, iF, iC);
                }
                if (this.f37474g.b(i12, i13 < 0 ? -i13 : 0)) {
                    Pair pairA = a(this.f37474g, (String) ob.a.e(this.f37468a));
                    this.f37469b.e((v0) pairA.first);
                    this.f37478k = ((Long) pairA.second).longValue();
                    this.f37477j = true;
                }
            }
            u uVar = this.f37472e;
            if (uVar != null) {
                if (i13 > 0) {
                    uVar.a(bArrE, iF, iC);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f37472e.b(i10)) {
                    u uVar2 = this.f37472e;
                    ((ob.d0) r0.j(this.f37471d)).S(this.f37472e.f37633d, ob.z.q(uVar2.f37633d, uVar2.f37634e));
                    ((k0) r0.j(this.f37470c)).a(this.f37481n, this.f37471d);
                }
                if (i12 == 178 && d0Var.e()[iC + 2] == 1) {
                    this.f37472e.e(i12);
                }
            }
            if (i12 == 0 || i12 == 179) {
                int i14 = iG - iC;
                if (this.f37483p && this.f37477j) {
                    long j10 = this.f37481n;
                    if (j10 != C.TIME_UNSET) {
                        this.f37469b.f(j10, this.f37482o ? 1 : 0, ((int) (this.f37475h - this.f37480m)) - i14, i14, null);
                    }
                }
                if (!this.f37476i || this.f37483p) {
                    this.f37480m = this.f37475h - ((long) i14);
                    long j11 = this.f37479l;
                    if (j11 == C.TIME_UNSET) {
                        long j12 = this.f37481n;
                        j11 = j12 != C.TIME_UNSET ? j12 + this.f37478k : -9223372036854775807L;
                    }
                    this.f37481n = j11;
                    this.f37482o = false;
                    this.f37479l = C.TIME_UNSET;
                    z10 = true;
                    this.f37476i = true;
                } else {
                    z10 = true;
                }
                this.f37483p = i12 == 0 ? z10 : false;
            } else {
                if (i12 == 184) {
                    this.f37482o = true;
                }
                iG = iG;
            }
            iG = iG;
            iF = i11;
        }
        if (!this.f37477j) {
            this.f37474g.a(bArrE, iF, iG);
        }
        u uVar3 = this.f37472e;
        if (uVar3 != null) {
            uVar3.a(bArrE, iF, iG);
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        this.f37479l = j10;
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        dVar.a();
        this.f37468a = dVar.b();
        this.f37469b = mVar.track(dVar.c(), 2);
        k0 k0Var = this.f37470c;
        if (k0Var != null) {
            k0Var.b(mVar, dVar);
        }
    }

    @Override // ea.m
    public void seek() {
        ob.z.a(this.f37473f);
        this.f37474g.c();
        u uVar = this.f37472e;
        if (uVar != null) {
            uVar.d();
        }
        this.f37475h = 0L;
        this.f37476i = false;
        this.f37479l = C.TIME_UNSET;
        this.f37481n = C.TIME_UNSET;
    }

    n(k0 k0Var) {
        this.f37470c = k0Var;
        this.f37473f = new boolean[4];
        this.f37474g = new a(128);
        if (k0Var != null) {
            this.f37472e = new u(178, 128);
            this.f37471d = new ob.d0();
        } else {
            this.f37472e = null;
            this.f37471d = null;
        }
        this.f37479l = C.TIME_UNSET;
        this.f37481n = C.TIME_UNSET;
    }

    @Override // ea.m
    public void packetFinished() {
    }
}
