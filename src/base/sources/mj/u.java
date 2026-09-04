package mj;

import android.media.MediaCodec;
import android.util.Log;
import em.b2;
import em.c1;
import em.o0;
import em.p0;
import em.y0;
import em.z1;
import fl.g0;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f46435q = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ji.f f46436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mj.a f46437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fj.a f46438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private fj.a f46439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f46440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z1 f46442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o0 f46443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile BlockingQueue f46444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f46445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f46446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private uj.a f46447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f46448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f46449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ji.e f46450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f46451p;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46453b;

        static {
            int[] iArr = new int[ji.m.values().length];
            try {
                iArr[ji.m.H265.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ji.m.AV1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46452a = iArr;
            int[] iArr2 = new int[ji.a.values().length];
            try {
                iArr2[ji.a.G711.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ji.a.AAC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ji.a.OPUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f46453b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46454r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46455s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46456t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f46457u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f46458v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f46459w;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f46461r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ u f46462s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ j0 f46463t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, j0 j0Var, kl.f fVar) {
                super(2, fVar);
                this.f46462s = uVar;
                this.f46463t = j0Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f46462s, this.f46463t, fVar);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x001e  */
            /* JADX WARN: Code duplicated, block: B:13:0x002a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:11:0x001e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f46461r;
                if (i10 != 0) {
                    if (i10 == 1) {
                        fl.s.b(obj);
                    } else if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this.f46463t.f43595a = 0L;
                    this.f46461r = 2;
                    if (y0.a(1000L, this) != objF) {
                        if (p0.f(this.f46462s.f46443h) || !this.f46462s.f46440e) {
                            return g0.f38750a;
                        }
                        ji.e eVar = this.f46462s.f46450o;
                        long j10 = this.f46463t.f43595a * ((long) 8);
                        this.f46461r = 1;
                        if (eVar.b(j10, this) != objF) {
                            this.f46463t.f43595a = 0L;
                            this.f46461r = 2;
                            if (y0.a(1000L, this) != objF) {
                                if (p0.f(this.f46462s.f46443h)) {
                                }
                                return g0.f38750a;
                            }
                        }
                    }
                    return objF;
                }
                fl.s.b(obj);
                if (p0.f(this.f46462s.f46443h)) {
                }
                return g0.f38750a;
            }
        }

        c(kl.f fVar) {
            super(2, fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fj.b o(u uVar) {
            return (fj.b) uVar.f46444i.poll(1L, TimeUnit.SECONDS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 q(u uVar, Throwable th2) {
            uVar.f46436a.a("Error send packet, " + th2.getMessage());
            return g0.f38750a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            c cVar = u.this.new c(fVar);
            cVar.f46459w = obj;
            return cVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:11|12|13|75|56|(1:58)|49|60|61|64|(1:66)(2:24|(2:71|72)(3:28|29|(1:31)(3:22|32|(4:34|61|64|(1:66)(4:24|(1:26)|71|72))(2:35|(2:37|(2:39|(8:42|43|(1:45)|49|60|61|64|(1:66)(4:24|(1:26)|71|72)))(4:60|61|64|(1:66)(4:24|(1:26)|71|72)))(2:50|(2:52|(9:55|75|56|(1:58)|49|60|61|64|(1:66)(4:24|(1:26)|71|72)))(4:60|61|64|(1:66)(4:24|(1:26)|71|72)))))))|68) */
        /* JADX WARN: Code duplicated, block: B:24:0x009d A[PHI: r11 r12
          0x009d: PHI (r11v7 kotlin.jvm.internal.j0) = (r11v8 kotlin.jvm.internal.j0), (r11v16 kotlin.jvm.internal.j0) binds: [B:65:0x01af, B:23:0x0080] A[DONT_GENERATE, DONT_INLINE]
          0x009d: PHI (r12v6 em.o0) = (r12v7 em.o0), (r12v15 em.o0) binds: [B:65:0x01af, B:23:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d2 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x003e, B:60:0x0192, B:61:0x019c, B:29:0x00b3, B:32:0x00ce, B:34:0x00d2, B:35:0x00de, B:37:0x00ed, B:39:0x00fb, B:50:0x0144, B:52:0x0152, B:17:0x0060, B:20:0x0079), top: B:73:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00de A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x003e, B:60:0x0192, B:61:0x019c, B:29:0x00b3, B:32:0x00ce, B:34:0x00d2, B:35:0x00de, B:37:0x00ed, B:39:0x00fb, B:50:0x0144, B:52:0x0152, B:17:0x0060, B:20:0x0079), top: B:73:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00ed A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x003e, B:60:0x0192, B:61:0x019c, B:29:0x00b3, B:32:0x00ce, B:34:0x00d2, B:35:0x00de, B:37:0x00ed, B:39:0x00fb, B:50:0x0144, B:52:0x0152, B:17:0x0060, B:20:0x0079), top: B:73:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00fb A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x003e, B:60:0x0192, B:61:0x019c, B:29:0x00b3, B:32:0x00ce, B:34:0x00d2, B:35:0x00de, B:37:0x00ed, B:39:0x00fb, B:50:0x0144, B:52:0x0152, B:17:0x0060, B:20:0x0079), top: B:73:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0113  */
        /* JADX WARN: Code duplicated, block: B:45:0x0125 A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #1 {all -> 0x013c, blocks: (B:56:0x016d, B:43:0x0117, B:45:0x0125, B:58:0x017b), top: B:75:0x016d }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0144 A[Catch: all -> 0x0049, TRY_ENTER, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x003e, B:60:0x0192, B:61:0x019c, B:29:0x00b3, B:32:0x00ce, B:34:0x00d2, B:35:0x00de, B:37:0x00ed, B:39:0x00fb, B:50:0x0144, B:52:0x0152, B:17:0x0060, B:20:0x0079), top: B:73:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:52:0x0152 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x003e, B:60:0x0192, B:61:0x019c, B:29:0x00b3, B:32:0x00ce, B:34:0x00d2, B:35:0x00de, B:37:0x00ed, B:39:0x00fb, B:50:0x0144, B:52:0x0152, B:17:0x0060, B:20:0x0079), top: B:73:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0169  */
        /* JADX WARN: Code duplicated, block: B:58:0x017b A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #1 {all -> 0x013c, blocks: (B:56:0x016d, B:43:0x0117, B:45:0x0125, B:58:0x017b), top: B:75:0x016d }] */
        /* JADX WARN: Code duplicated, block: B:60:0x0192 A[Catch: all -> 0x0049, PHI: r0 r11 r12
          0x0192: PHI (r0v25 kotlin.jvm.internal.i0) = (r0v10 kotlin.jvm.internal.i0), (r0v10 kotlin.jvm.internal.i0), (r0v28 kotlin.jvm.internal.i0) binds: [B:51:0x0150, B:38:0x00f9, B:49:0x0140] A[DONT_GENERATE, DONT_INLINE]
          0x0192: PHI (r11v10 kotlin.jvm.internal.j0) = (r11v4 kotlin.jvm.internal.j0), (r11v4 kotlin.jvm.internal.j0), (r11v11 kotlin.jvm.internal.j0) binds: [B:51:0x0150, B:38:0x00f9, B:49:0x0140] A[DONT_GENERATE, DONT_INLINE]
          0x0192: PHI (r12v9 em.o0) = (r12v3 em.o0), (r12v3 em.o0), (r12v11 em.o0) binds: [B:51:0x0150, B:38:0x00f9, B:49:0x0140] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x003e, B:60:0x0192, B:61:0x019c, B:29:0x00b3, B:32:0x00ce, B:34:0x00d2, B:35:0x00de, B:37:0x00ed, B:39:0x00fb, B:50:0x0144, B:52:0x0152, B:17:0x0060, B:20:0x0079), top: B:73:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:66:0x01b1  */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x013c, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
        
            r11 = r12;
            r12 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x01c8, code lost:
        
            if (ji.i.j(r5, r17) == r2) goto L68;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:45:0x0125, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:58:0x017b, please report this as an issue */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d2 -> B:61:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f9 -> B:60:0x0192). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0123 -> B:49:0x0140). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0125 -> B:49:0x0140). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0150 -> B:60:0x0192). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0169 -> B:75:0x016d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 470
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mj.u.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tl.o
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46464r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f46465s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f46467u;

        d(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46465s = obj;
            this.f46467u |= Integer.MIN_VALUE;
            return u.this.A(false, this);
        }
    }

    public u(ji.f connectChecker, mj.a commandsManager) {
        kotlin.jvm.internal.s.h(connectChecker, "connectChecker");
        kotlin.jvm.internal.s.h(commandsManager, "commandsManager");
        this.f46436a = connectChecker;
        this.f46437b = commandsManager;
        this.f46438c = new ij.a();
        this.f46439d = new lj.b();
        this.f46441f = 200;
        this.f46443h = p0.a(c1.b());
        this.f46444i = new LinkedBlockingQueue(this.f46441f);
        this.f46450o = new ji.e(connectChecker);
        this.f46451p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 t(u uVar, fj.b flvPacket) {
        kotlin.jvm.internal.s.h(flvPacket, "flvPacket");
        try {
            uVar.f46444i.add(flvPacket);
        } catch (IllegalStateException unused) {
            Log.i("RtmpSender", "Audio frame discarded");
            uVar.f46448m++;
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 v(u uVar, fj.b flvPacket) {
        kotlin.jvm.internal.s.h(flvPacket, "flvPacket");
        try {
            uVar.f46444i.add(flvPacket);
        } catch (IllegalStateException unused) {
            Log.i("RtmpSender", "Video frame discarded");
            uVar.f46449n++;
        }
        return g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(boolean z10, kl.f fVar) {
        d dVar;
        u uVar;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.f46467u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f46467u = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar);
            }
        } else {
            dVar = new d(fVar);
        }
        Object obj = dVar.f46465s;
        Object objF = ll.b.f();
        int i11 = dVar.f46467u;
        if (i11 == 0) {
            fl.s.b(obj);
            this.f46440e = false;
            this.f46438c.b(z10);
            this.f46439d.b(z10);
            q();
            r();
            o();
            p();
            z1 z1Var = this.f46442g;
            if (z1Var != null) {
                dVar.f46464r = this;
                dVar.f46467u = 1;
                if (b2.e(z1Var, dVar) == objF) {
                    return objF;
                }
            }
            uVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (u) dVar.f46464r;
            fl.s.b(obj);
        }
        uVar.f46442g = null;
        uVar.f46444i.clear();
        return g0.f38750a;
    }

    public final uj.a n() {
        return this.f46447l;
    }

    public final void o() {
        this.f46448m = 0L;
    }

    public final void p() {
        this.f46449n = 0L;
    }

    public final void q() {
        this.f46445j = 0L;
    }

    public final void r() {
        this.f46446k = 0L;
    }

    public final void s(ByteBuffer aacBuffer, MediaCodec.BufferInfo info) {
        kotlin.jvm.internal.s.h(aacBuffer, "aacBuffer");
        kotlin.jvm.internal.s.h(info, "info");
        if (this.f46440e) {
            this.f46438c.a(aacBuffer, info, new Function1() { // from class: mj.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u.t(this.f46433a, (fj.b) obj);
                }
            });
        }
    }

    public final void u(ByteBuffer h264Buffer, MediaCodec.BufferInfo info) {
        kotlin.jvm.internal.s.h(h264Buffer, "h264Buffer");
        kotlin.jvm.internal.s.h(info, "info");
        if (this.f46440e) {
            this.f46439d.a(h264Buffer, info, new Function1() { // from class: mj.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u.v(this.f46434a, (fj.b) obj);
                }
            });
        }
    }

    public final void w(int i10, boolean z10) {
        int i11 = b.f46453b[this.f46437b.e().ordinal()];
        if (i11 == 1) {
            ij.b bVar = new ij.b();
            this.f46438c = bVar;
            kotlin.jvm.internal.s.f(bVar, "null cannot be cast to non-null type com.pedro.rtmp.flv.audio.packet.G711Packet");
            ij.b.d(bVar, null, 1, null);
            return;
        }
        if (i11 == 2) {
            ij.a aVar = new ij.a();
            this.f46438c = aVar;
            kotlin.jvm.internal.s.f(aVar, "null cannot be cast to non-null type com.pedro.rtmp.flv.audio.packet.AacPacket");
            ij.a.d(aVar, i10, z10, null, 4, null);
            return;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Unsupported codec: " + this.f46437b.e().name());
    }

    public final void x(uj.a aVar) {
        this.f46447l = aVar;
    }

    public final void y(ByteBuffer sps, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        kotlin.jvm.internal.s.h(sps, "sps");
        int i10 = b.f46452a[this.f46437b.w().ordinal()];
        if (i10 == 1) {
            if (byteBuffer2 == null || byteBuffer == null) {
                throw new IllegalArgumentException("pps or vps can't be null with h265");
            }
            lj.c cVar = new lj.c();
            this.f46439d = cVar;
            kotlin.jvm.internal.s.f(cVar, "null cannot be cast to non-null type com.pedro.rtmp.flv.video.packet.H265Packet");
            cVar.g(sps, byteBuffer, byteBuffer2);
            return;
        }
        if (i10 == 2) {
            lj.a aVar = new lj.a();
            this.f46439d = aVar;
            kotlin.jvm.internal.s.f(aVar, "null cannot be cast to non-null type com.pedro.rtmp.flv.video.packet.Av1Packet");
            aVar.c(sps);
            return;
        }
        if (byteBuffer == null) {
            throw new IllegalArgumentException("pps can't be null with h264");
        }
        lj.b bVar = new lj.b();
        this.f46439d = bVar;
        kotlin.jvm.internal.s.f(bVar, "null cannot be cast to non-null type com.pedro.rtmp.flv.video.packet.H264Packet");
        bVar.g(sps, byteBuffer);
    }

    public final void z() {
        this.f46450o.d();
        this.f46444i.clear();
        this.f46440e = true;
        this.f46442g = em.k.d(this.f46443h, null, null, new c(null), 3, null);
    }
}
