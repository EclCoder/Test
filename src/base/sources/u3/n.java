package u3;

import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Collections;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final double[] f53923q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0 f53925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0 f53926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.u f53927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f53928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f53929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f53930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f53931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f53934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f53935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f53936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f53937n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f53938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f53939p;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f53940e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f53941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f53942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f53943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f53944d;

        public a(int i10) {
            this.f53944d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f53941a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f53944d;
                int length = bArr2.length;
                int i13 = this.f53942b;
                if (length < i13 + i12) {
                    this.f53944d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f53944d, this.f53942b, i12);
                this.f53942b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f53941a) {
                int i12 = this.f53942b - i11;
                this.f53942b = i12;
                if (this.f53943c != 0 || i10 != 181) {
                    this.f53941a = false;
                    return true;
                }
                this.f53943c = i12;
            } else if (i10 == 179) {
                this.f53941a = true;
            }
            byte[] bArr = f53940e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f53941a = false;
            this.f53942b = 0;
            this.f53943c = 0;
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
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f53944d, aVar.f53942b);
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
                t1.o oVarK = new t1.o.b().a0(str).o0(MimeTypes.VIDEO_MPEG2).t0(i15).Y(i16).k0(f11).b0(Collections.singletonList(bArrCopyOf)).K();
                i11 = (bArrCopyOf[7] & 15) - 1;
                if (i11 >= 0) {
                    dArr = f53923q;
                    if (i11 < dArr.length) {
                        d10 = dArr[i11];
                        byte b11 = bArrCopyOf[aVar.f53943c + 9];
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
                return Pair.create(oVarK, Long.valueOf(j10));
            }
            f10 = i16 * 16;
            i10 = i15 * 9;
        }
        f11 = f10 / i10;
        t1.o oVarK2 = new t1.o.b().a0(str).o0(MimeTypes.VIDEO_MPEG2).t0(i15).Y(i16).k0(f11).b0(Collections.singletonList(bArrCopyOf)).K();
        i11 = (bArrCopyOf[7] & 15) - 1;
        if (i11 >= 0) {
            dArr = f53923q;
            if (i11 < dArr.length) {
                d10 = dArr[i11];
                byte b12 = bArrCopyOf[aVar.f53943c + 9];
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
        return Pair.create(oVarK2, Long.valueOf(j10));
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
    @Override // u3.m
    public void b(w1.u uVar) {
        boolean z10;
        int i10;
        w1.a.i(this.f53925b);
        int iF = uVar.f();
        int iG = uVar.g();
        byte[] bArrE = uVar.e();
        this.f53931h += (long) uVar.a();
        this.f53925b.c(uVar, uVar.a());
        while (true) {
            int iC = x1.d.c(bArrE, iF, iG, this.f53929f);
            if (iC == iG) {
                break;
            }
            int i11 = iC + 3;
            int i12 = uVar.e()[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i13 = iC - iF;
            if (!this.f53933j) {
                if (i13 > 0) {
                    this.f53930g.a(bArrE, iF, iC);
                }
                if (this.f53930g.b(i12, i13 < 0 ? -i13 : 0)) {
                    Pair pairA = a(this.f53930g, (String) w1.a.e(this.f53924a));
                    this.f53925b.b((t1.o) pairA.first);
                    this.f53934k = ((Long) pairA.second).longValue();
                    this.f53933j = true;
                }
            }
            w wVar = this.f53928e;
            if (wVar != null) {
                if (i13 > 0) {
                    wVar.a(bArrE, iF, iC);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f53928e.b(i10)) {
                    w wVar2 = this.f53928e;
                    ((w1.u) w1.c0.h(this.f53927d)).R(this.f53928e.f54120d, x1.d.r(wVar2.f54120d, wVar2.f54121e));
                    ((m0) w1.c0.h(this.f53926c)).a(this.f53937n, this.f53927d);
                }
                if (i12 == 178 && uVar.e()[iC + 2] == 1) {
                    this.f53928e.e(i12);
                }
            }
            if (i12 == 0 || i12 == 179) {
                int i14 = iG - iC;
                if (this.f53939p && this.f53933j) {
                    long j10 = this.f53937n;
                    if (j10 != C.TIME_UNSET) {
                        this.f53925b.e(j10, this.f53938o ? 1 : 0, ((int) (this.f53931h - this.f53936m)) - i14, i14, null);
                    }
                }
                if (!this.f53932i || this.f53939p) {
                    this.f53936m = this.f53931h - ((long) i14);
                    long j11 = this.f53935l;
                    if (j11 == C.TIME_UNSET) {
                        long j12 = this.f53937n;
                        j11 = j12 != C.TIME_UNSET ? j12 + this.f53934k : -9223372036854775807L;
                    }
                    this.f53937n = j11;
                    this.f53938o = false;
                    this.f53935l = C.TIME_UNSET;
                    z10 = true;
                    this.f53932i = true;
                } else {
                    z10 = true;
                }
                this.f53939p = i12 == 0 ? z10 : false;
            } else {
                if (i12 == 184) {
                    this.f53938o = true;
                }
                iG = iG;
            }
            iG = iG;
            iF = i11;
        }
        if (!this.f53933j) {
            this.f53930g.a(bArrE, iF, iG);
        }
        w wVar3 = this.f53928e;
        if (wVar3 != null) {
            wVar3.a(bArrE, iF, iG);
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        this.f53935l = j10;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        this.f53924a = dVar.b();
        this.f53925b = rVar.track(dVar.c(), 2);
        m0 m0Var = this.f53926c;
        if (m0Var != null) {
            m0Var.b(rVar, dVar);
        }
    }

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
    @Override // u3.m
    public void e(boolean z10) {
        w1.a.i(this.f53925b);
        if (z10) {
            boolean z11 = this.f53938o;
            this.f53925b.e(this.f53937n, z11 ? 1 : 0, (int) (this.f53931h - this.f53936m), 0, null);
        }
    }

    @Override // u3.m
    public void seek() {
        x1.d.a(this.f53929f);
        this.f53930g.c();
        w wVar = this.f53928e;
        if (wVar != null) {
            wVar.d();
        }
        this.f53931h = 0L;
        this.f53932i = false;
        this.f53935l = C.TIME_UNSET;
        this.f53937n = C.TIME_UNSET;
    }

    n(m0 m0Var) {
        this.f53926c = m0Var;
        this.f53929f = new boolean[4];
        this.f53930g = new a(128);
        if (m0Var != null) {
            this.f53928e = new w(178, 128);
            this.f53927d = new w1.u();
        } else {
            this.f53928e = null;
            this.f53927d = null;
        }
        this.f53935l = C.TIME_UNSET;
        this.f53937n = C.TIME_UNSET;
    }
}
