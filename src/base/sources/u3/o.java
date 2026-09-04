package u3;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o implements m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f53945l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f53946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.u f53947b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f53950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f53951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f53952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f53953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o0 f53954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53955j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f53948c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f53949d = new a(128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f53956k = C.TIME_UNSET;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f53957f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f53958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f53959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f53960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f53961d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f53962e;

        public a(int i10) {
            this.f53962e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f53958a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f53962e;
                int length = bArr2.length;
                int i13 = this.f53960c;
                if (length < i13 + i12) {
                    this.f53962e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f53962e, this.f53960c, i12);
                this.f53960c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f53959b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f53960c -= i11;
                                this.f53958a = false;
                                return true;
                            }
                        } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            w1.n.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f53961d = this.f53960c;
                            this.f53959b = 4;
                        }
                    } else if (i10 > 31) {
                        w1.n.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f53959b = 3;
                    }
                } else if (i10 != 181) {
                    w1.n.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f53959b = 2;
                }
            } else if (i10 == 176) {
                this.f53959b = 1;
                this.f53958a = true;
            }
            byte[] bArr = f53957f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f53958a = false;
            this.f53960c = 0;
            this.f53959b = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0 f53963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f53964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f53965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f53966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f53967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f53968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f53969g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f53970h;

        public b(o0 o0Var) {
            this.f53963a = o0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f53965c) {
                int i12 = this.f53968f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f53968f = i12 + (i11 - i10);
                } else {
                    this.f53966d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f53965c = false;
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
            w1.a.g(this.f53970h != C.TIME_UNSET);
            if (this.f53967e == 182 && z10 && this.f53964b) {
                this.f53963a.e(this.f53970h, this.f53966d ? 1 : 0, (int) (j10 - this.f53969g), i10, null);
            }
            if (this.f53967e != 179) {
                this.f53969g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f53967e = i10;
            this.f53966d = false;
            this.f53964b = i10 == 182 || i10 == 179;
            this.f53965c = i10 == 182;
            this.f53968f = 0;
            this.f53970h = j10;
        }

        public void d() {
            this.f53964b = false;
            this.f53965c = false;
            this.f53966d = false;
            this.f53967e = -1;
        }
    }

    o(m0 m0Var) {
        this.f53946a = m0Var;
        if (m0Var != null) {
            this.f53950e = new w(178, 128);
            this.f53947b = new w1.u();
        } else {
            this.f53950e = null;
            this.f53947b = null;
        }
    }

    private static t1.o a(a aVar, int i10, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f53962e, aVar.f53960c);
        w1.t tVar = new w1.t(bArrCopyOf);
        tVar.s(i10);
        tVar.s(4);
        tVar.q();
        tVar.r(8);
        if (tVar.g()) {
            tVar.r(4);
            tVar.r(3);
        }
        int iH = tVar.h(4);
        float f10 = 1.0f;
        if (iH == 15) {
            int iH2 = tVar.h(8);
            int iH3 = tVar.h(8);
            if (iH3 == 0) {
                w1.n.h("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = iH2 / iH3;
            }
        } else {
            float[] fArr = f53945l;
            if (iH < fArr.length) {
                f10 = fArr[iH];
            } else {
                w1.n.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (tVar.g()) {
            tVar.r(2);
            tVar.r(1);
            if (tVar.g()) {
                tVar.r(15);
                tVar.q();
                tVar.r(15);
                tVar.q();
                tVar.r(15);
                tVar.q();
                tVar.r(3);
                tVar.r(11);
                tVar.q();
                tVar.r(15);
                tVar.q();
            }
        }
        if (tVar.h(2) != 0) {
            w1.n.h("H263Reader", "Unhandled video object layer shape");
        }
        tVar.q();
        int iH4 = tVar.h(16);
        tVar.q();
        if (tVar.g()) {
            if (iH4 == 0) {
                w1.n.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iH4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                tVar.r(i11);
            }
        }
        tVar.q();
        int iH5 = tVar.h(13);
        tVar.q();
        int iH6 = tVar.h(13);
        tVar.q();
        tVar.q();
        return new t1.o.b().a0(str).o0(MimeTypes.VIDEO_MP4V).t0(iH5).Y(iH6).k0(f10).b0(Collections.singletonList(bArrCopyOf)).K();
    }

    @Override // u3.m
    public void b(w1.u uVar) {
        w1.a.i(this.f53951f);
        w1.a.i(this.f53954i);
        int iF = uVar.f();
        int iG = uVar.g();
        byte[] bArrE = uVar.e();
        this.f53952g += (long) uVar.a();
        this.f53954i.c(uVar, uVar.a());
        while (true) {
            int iC = x1.d.c(bArrE, iF, iG, this.f53948c);
            if (iC == iG) {
                break;
            }
            int i10 = iC + 3;
            int i11 = uVar.e()[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i12 = iC - iF;
            int i13 = 0;
            if (!this.f53955j) {
                if (i12 > 0) {
                    this.f53949d.a(bArrE, iF, iC);
                }
                if (this.f53949d.b(i11, i12 < 0 ? -i12 : 0)) {
                    o0 o0Var = this.f53954i;
                    a aVar = this.f53949d;
                    o0Var.b(a(aVar, aVar.f53961d, (String) w1.a.e(this.f53953h)));
                    this.f53955j = true;
                }
            }
            this.f53951f.a(bArrE, iF, iC);
            w wVar = this.f53950e;
            if (wVar != null) {
                if (i12 > 0) {
                    wVar.a(bArrE, iF, iC);
                } else {
                    i13 = -i12;
                }
                if (this.f53950e.b(i13)) {
                    w wVar2 = this.f53950e;
                    ((w1.u) w1.c0.h(this.f53947b)).R(this.f53950e.f54120d, x1.d.r(wVar2.f54120d, wVar2.f54121e));
                    ((m0) w1.c0.h(this.f53946a)).a(this.f53956k, this.f53947b);
                }
                if (i11 == 178 && uVar.e()[iC + 2] == 1) {
                    this.f53950e.e(i11);
                }
            }
            int i14 = iG - iC;
            this.f53951f.b(this.f53952g - ((long) i14), i14, this.f53955j);
            this.f53951f.c(i11, this.f53956k);
            iF = i10;
        }
        if (!this.f53955j) {
            this.f53949d.a(bArrE, iF, iG);
        }
        this.f53951f.a(bArrE, iF, iG);
        w wVar3 = this.f53950e;
        if (wVar3 != null) {
            wVar3.a(bArrE, iF, iG);
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        this.f53956k = j10;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        this.f53953h = dVar.b();
        o0 o0VarTrack = rVar.track(dVar.c(), 2);
        this.f53954i = o0VarTrack;
        this.f53951f = new b(o0VarTrack);
        m0 m0Var = this.f53946a;
        if (m0Var != null) {
            m0Var.b(rVar, dVar);
        }
    }

    @Override // u3.m
    public void e(boolean z10) {
        w1.a.i(this.f53951f);
        if (z10) {
            this.f53951f.b(this.f53952g, 0, this.f53955j);
            this.f53951f.d();
        }
    }

    @Override // u3.m
    public void seek() {
        x1.d.a(this.f53948c);
        this.f53949d.c();
        b bVar = this.f53951f;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f53950e;
        if (wVar != null) {
            wVar.d();
        }
        this.f53952g = 0L;
        this.f53956k = C.TIME_UNSET;
    }
}
