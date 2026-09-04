package ea;

import com.google.android.exoplayer2.v0;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f37489l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f37490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ob.d0 f37491b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f37494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f37495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f37496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f37497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u9.b0 f37498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37499j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f37492c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f37493d = new a(128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f37500k = C.TIME_UNSET;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f37501f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f37502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f37503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f37506e;

        public a(int i10) {
            this.f37506e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f37502a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f37506e;
                int length = bArr2.length;
                int i13 = this.f37504c;
                if (length < i13 + i12) {
                    this.f37506e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f37506e, this.f37504c, i12);
                this.f37504c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f37503b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f37504c -= i11;
                                this.f37502a = false;
                                return true;
                            }
                        } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            ob.u.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f37505d = this.f37504c;
                            this.f37503b = 4;
                        }
                    } else if (i10 > 31) {
                        ob.u.i("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f37503b = 3;
                    }
                } else if (i10 != 181) {
                    ob.u.i("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f37503b = 2;
                }
            } else if (i10 == 176) {
                this.f37503b = 1;
                this.f37502a = true;
            }
            byte[] bArr = f37501f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f37502a = false;
            this.f37504c = 0;
            this.f37503b = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u9.b0 f37507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f37508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f37509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f37510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f37511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f37512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f37513g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f37514h;

        public b(u9.b0 b0Var) {
            this.f37507a = b0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f37509c) {
                int i12 = this.f37512f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f37512f = i12 + (i11 - i10);
                } else {
                    this.f37510d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f37509c = false;
                }
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
        public void b(long j10, int i10, boolean z10) {
            if (this.f37511e == 182 && z10 && this.f37508b) {
                long j11 = this.f37514h;
                if (j11 != C.TIME_UNSET) {
                    this.f37507a.f(j11, this.f37510d ? 1 : 0, (int) (j10 - this.f37513g), i10, null);
                }
            }
            if (this.f37511e != 179) {
                this.f37513g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f37511e = i10;
            this.f37510d = false;
            this.f37508b = i10 == 182 || i10 == 179;
            this.f37509c = i10 == 182;
            this.f37512f = 0;
            this.f37514h = j10;
        }

        public void d() {
            this.f37508b = false;
            this.f37509c = false;
            this.f37510d = false;
            this.f37511e = -1;
        }
    }

    o(k0 k0Var) {
        this.f37490a = k0Var;
        if (k0Var != null) {
            this.f37494e = new u(178, 128);
            this.f37491b = new ob.d0();
        } else {
            this.f37494e = null;
            this.f37491b = null;
        }
    }

    private static v0 a(a aVar, int i10, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f37506e, aVar.f37504c);
        ob.c0 c0Var = new ob.c0(bArrCopyOf);
        c0Var.s(i10);
        c0Var.s(4);
        c0Var.q();
        c0Var.r(8);
        if (c0Var.g()) {
            c0Var.r(4);
            c0Var.r(3);
        }
        int iH = c0Var.h(4);
        float f10 = 1.0f;
        if (iH == 15) {
            int iH2 = c0Var.h(8);
            int iH3 = c0Var.h(8);
            if (iH3 == 0) {
                ob.u.i("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = iH2 / iH3;
            }
        } else {
            float[] fArr = f37489l;
            if (iH < fArr.length) {
                f10 = fArr[iH];
            } else {
                ob.u.i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (c0Var.g()) {
            c0Var.r(2);
            c0Var.r(1);
            if (c0Var.g()) {
                c0Var.r(15);
                c0Var.q();
                c0Var.r(15);
                c0Var.q();
                c0Var.r(15);
                c0Var.q();
                c0Var.r(3);
                c0Var.r(11);
                c0Var.q();
                c0Var.r(15);
                c0Var.q();
            }
        }
        if (c0Var.h(2) != 0) {
            ob.u.i("H263Reader", "Unhandled video object layer shape");
        }
        c0Var.q();
        int iH4 = c0Var.h(16);
        c0Var.q();
        if (c0Var.g()) {
            if (iH4 == 0) {
                ob.u.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iH4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                c0Var.r(i11);
            }
        }
        c0Var.q();
        int iH5 = c0Var.h(13);
        c0Var.q();
        int iH6 = c0Var.h(13);
        c0Var.q();
        c0Var.q();
        return new v0.b().U(str).g0(MimeTypes.VIDEO_MP4V).n0(iH5).S(iH6).c0(f10).V(Collections.singletonList(bArrCopyOf)).G();
    }

    @Override // ea.m
    public void b(ob.d0 d0Var) {
        ob.a.i(this.f37495f);
        ob.a.i(this.f37498i);
        int iF = d0Var.f();
        int iG = d0Var.g();
        byte[] bArrE = d0Var.e();
        this.f37496g += (long) d0Var.a();
        this.f37498i.c(d0Var, d0Var.a());
        while (true) {
            int iC = ob.z.c(bArrE, iF, iG, this.f37492c);
            if (iC == iG) {
                break;
            }
            int i10 = iC + 3;
            int i11 = d0Var.e()[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i12 = iC - iF;
            int i13 = 0;
            if (!this.f37499j) {
                if (i12 > 0) {
                    this.f37493d.a(bArrE, iF, iC);
                }
                if (this.f37493d.b(i11, i12 < 0 ? -i12 : 0)) {
                    u9.b0 b0Var = this.f37498i;
                    a aVar = this.f37493d;
                    b0Var.e(a(aVar, aVar.f37505d, (String) ob.a.e(this.f37497h)));
                    this.f37499j = true;
                }
            }
            this.f37495f.a(bArrE, iF, iC);
            u uVar = this.f37494e;
            if (uVar != null) {
                if (i12 > 0) {
                    uVar.a(bArrE, iF, iC);
                } else {
                    i13 = -i12;
                }
                if (this.f37494e.b(i13)) {
                    u uVar2 = this.f37494e;
                    ((ob.d0) r0.j(this.f37491b)).S(this.f37494e.f37633d, ob.z.q(uVar2.f37633d, uVar2.f37634e));
                    ((k0) r0.j(this.f37490a)).a(this.f37500k, this.f37491b);
                }
                if (i11 == 178 && d0Var.e()[iC + 2] == 1) {
                    this.f37494e.e(i11);
                }
            }
            int i14 = iG - iC;
            this.f37495f.b(this.f37496g - ((long) i14), i14, this.f37499j);
            this.f37495f.c(i11, this.f37500k);
            iF = i10;
        }
        if (!this.f37499j) {
            this.f37493d.a(bArrE, iF, iG);
        }
        this.f37495f.a(bArrE, iF, iG);
        u uVar3 = this.f37494e;
        if (uVar3 != null) {
            uVar3.a(bArrE, iF, iG);
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f37500k = j10;
        }
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        dVar.a();
        this.f37497h = dVar.b();
        u9.b0 b0VarTrack = mVar.track(dVar.c(), 2);
        this.f37498i = b0VarTrack;
        this.f37495f = new b(b0VarTrack);
        k0 k0Var = this.f37490a;
        if (k0Var != null) {
            k0Var.b(mVar, dVar);
        }
    }

    @Override // ea.m
    public void seek() {
        ob.z.a(this.f37492c);
        this.f37493d.c();
        b bVar = this.f37495f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f37494e;
        if (uVar != null) {
            uVar.d();
        }
        this.f37496g = 0L;
        this.f37500k = C.TIME_UNSET;
    }

    @Override // ea.m
    public void packetFinished() {
    }
}
