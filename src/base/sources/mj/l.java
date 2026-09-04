package mj;

import android.media.MediaCodec;
import android.util.Log;
import em.c1;
import em.o0;
import em.p0;
import em.z1;
import fl.g0;
import java.nio.ByteBuffer;
import javax.net.ssl.TrustManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ji.f f46376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f46378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private uj.a f46379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o0 f46380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f46381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z1 f46382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private z1 f46383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private mj.a f46384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u f46385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f46386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f46387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f46388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TrustManager[] f46389n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f46390o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f46391p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f46392q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f46393r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f46394s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f46395t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f46398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f46399d;

        static {
            int[] iArr = new int[ji.a.values().length];
            try {
                iArr[ji.a.OPUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f46396a = iArr;
            int[] iArr2 = new int[cj.a.values().length];
            try {
                iArr2[cj.a.VERSION_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[cj.a.VERSION_3.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f46397b = iArr2;
            int[] iArr3 = new int[qj.b.values().length];
            try {
                iArr3[qj.b.PING_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f46398c = iArr3;
            int[] iArr4 = new int[oj.f.values().length];
            try {
                iArr4[oj.f.SET_CHUNK_SIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr4[oj.f.ACKNOWLEDGEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr4[oj.f.WINDOW_ACKNOWLEDGEMENT_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[oj.f.SET_PEER_BANDWIDTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[oj.f.f48934c.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[oj.f.AGGREGATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[oj.f.USER_CONTROL.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[oj.f.COMMAND_AMF0.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[oj.f.COMMAND_AMF3.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[oj.f.VIDEO.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[oj.f.AUDIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[oj.f.DATA_AMF0.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[oj.f.DATA_AMF3.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[oj.f.SHARED_OBJECT_AMF0.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[oj.f.SHARED_OBJECT_AMF3.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            f46399d = iArr4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46400r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f46401s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f46402t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f46403u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ l f46404v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, l lVar, kl.f fVar) {
            super(2, fVar);
            this.f46403u = str;
            this.f46404v = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 A(l lVar) {
            lVar.f46376a.a("Endpoint malformed, should be: rtmp://ip:port/appname/streamname");
            return g0.f38750a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 B(l lVar) {
            lVar.f46376a.a("Handshake failed");
            return g0.f38750a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 C(l lVar, Throwable th2) {
            lVar.f46376a.a("Error configure stream, " + th2.getMessage());
            return g0.f38750a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 t(l lVar) {
            lVar.f46376a.a("Endpoint malformed, should be: rtmp://ip:port/appname/streamname");
            return g0.f38750a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 w(l lVar, String str) {
            lVar.f46376a.b(str);
            return g0.f38750a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 y(l lVar) {
            lVar.f46376a.a("Endpoint malformed, should be: rtmp://ip:port/appname/streamname");
            return g0.f38750a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            b bVar = new b(this.f46403u, this.f46404v, fVar);
            bVar.f46402t = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:105:? A[PHI: r1
          PHI (r1v48 mj.l) = (r1v44 mj.l), (r1v50 mj.l) binds: [B:69:0x01a7, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:38:0x00df  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:45:0x012e  */
        /* JADX WARN: Code duplicated, block: B:50:0x014a  */
        /* JADX WARN: Code duplicated, block: B:57:0x0165 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:81:0x01d5, B:12:0x0025, B:71:0x01ab, B:73:0x01b5, B:75:0x01bb, B:78:0x01c8, B:15:0x0032, B:68:0x0196, B:16:0x0039, B:60:0x0177, B:55:0x015d, B:57:0x0165, B:62:0x017a, B:64:0x0180, B:82:0x01dc, B:83:0x01e3), top: B:101:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0175  */
        /* JADX WARN: Code duplicated, block: B:62:0x017a A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:81:0x01d5, B:12:0x0025, B:71:0x01ab, B:73:0x01b5, B:75:0x01bb, B:78:0x01c8, B:15:0x0032, B:68:0x0196, B:16:0x0039, B:60:0x0177, B:55:0x015d, B:57:0x0165, B:62:0x017a, B:64:0x0180, B:82:0x01dc, B:83:0x01e3), top: B:101:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0180 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:81:0x01d5, B:12:0x0025, B:71:0x01ab, B:73:0x01b5, B:75:0x01bb, B:78:0x01c8, B:15:0x0032, B:68:0x0196, B:16:0x0039, B:60:0x0177, B:55:0x015d, B:57:0x0165, B:62:0x017a, B:64:0x0180, B:82:0x01dc, B:83:0x01e3), top: B:101:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x0191  */
        /* JADX WARN: Code duplicated, block: B:67:0x0193  */
        /* JADX WARN: Code duplicated, block: B:70:0x01a9  */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:72:0x01b3
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 592
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mj.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tl.o
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f46405r;

        c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return l.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f46405r;
            if (i10 == 0) {
                fl.s.b(obj);
                l lVar = l.this;
                this.f46405r = 1;
                if (lVar.C(true, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46407r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f46408s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f46409t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f46411v;

        d(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46409t = obj;
            this.f46411v |= Integer.MIN_VALUE;
            return l.this.C(false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f46412r;

        e(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return l.this.new e(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f46412r;
            if (i10 == 0) {
                fl.s.b(obj);
                uj.a aVar = l.this.f46379d;
                if (aVar == null) {
                    return null;
                }
                mj.a aVar2 = l.this.f46384i;
                this.f46412r = 1;
                if (aVar2.E(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46414r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46415s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46416t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f46417u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f46419w;

        f(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46417u = obj;
            this.f46419w |= Integer.MIN_VALUE;
            return l.this.G(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46420r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46421s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f46422t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f46424v;

        g(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46422t = obj;
            this.f46424v |= Integer.MIN_VALUE;
            return l.this.N(this);
        }
    }

    public l(ji.f connectChecker) {
        kotlin.jvm.internal.s.h(connectChecker, "connectChecker");
        this.f46376a = connectChecker;
        this.f46377b = "RtmpClient";
        this.f46378c = new String[]{"rtmp", "rtmps", "rtmpt", "rtmpts"};
        this.f46380e = p0.a(c1.b());
        this.f46381f = p0.a(c1.b());
        this.f46384i = new mj.b();
        this.f46385j = new u(connectChecker, this.f46384i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r14.A(r13, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (em.b2.e(r14, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        if (em.b2.e(r14, r0) == r1) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(boolean r13, kl.f r14) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.l.C(boolean, kl.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 E(l lVar) {
        lVar.f46376a.e();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F() {
        uj.a dVar = this.f46390o ? new uj.d(this.f46384i.l(), this.f46384i.o(), this.f46388m) : new uj.b(this.f46384i.l(), this.f46384i.o(), this.f46388m, this.f46389n);
        this.f46379d = dVar;
        dVar.b();
        if (!dVar.h()) {
            return false;
        }
        long j10 = 1000;
        long jA = ji.k.a() / j10;
        if (!new mj.c().d(dVar)) {
            return false;
        }
        this.f46384i.c0((int) jA);
        this.f46384i.Y(ji.k.b() / j10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x020f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0222 A[Catch: ClassCastException -> 0x021e, TryCatch #5 {ClassCastException -> 0x021e, blocks: (B:96:0x01fd, B:119:0x024f, B:123:0x0255, B:103:0x0215, B:111:0x022b, B:108:0x0222, B:117:0x0247, B:124:0x0275), top: B:275:0x01fd }] */
    /* JADX WARN: Code duplicated, block: B:110:0x022a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0242  */
    /* JADX WARN: Code duplicated, block: B:117:0x0247 A[Catch: ClassCastException -> 0x021e, TRY_ENTER, TryCatch #5 {ClassCastException -> 0x021e, blocks: (B:96:0x01fd, B:119:0x024f, B:123:0x0255, B:103:0x0215, B:111:0x022b, B:108:0x0222, B:117:0x0247, B:124:0x0275), top: B:275:0x01fd }] */
    /* JADX WARN: Code duplicated, block: B:119:0x024f A[Catch: ClassCastException -> 0x021e, TryCatch #5 {ClassCastException -> 0x021e, blocks: (B:96:0x01fd, B:119:0x024f, B:123:0x0255, B:103:0x0215, B:111:0x022b, B:108:0x0222, B:117:0x0247, B:124:0x0275), top: B:275:0x01fd }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0253  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275 A[Catch: ClassCastException -> 0x021e, TRY_LEAVE, TryCatch #5 {ClassCastException -> 0x021e, blocks: (B:96:0x01fd, B:119:0x024f, B:123:0x0255, B:103:0x0215, B:111:0x022b, B:108:0x0222, B:117:0x0247, B:124:0x0275), top: B:275:0x01fd }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0289  */
    /* JADX WARN: Code duplicated, block: B:131:0x029f  */
    /* JADX WARN: Code duplicated, block: B:135:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f7 A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0300  */
    /* JADX WARN: Code duplicated, block: B:148:0x0305  */
    /* JADX WARN: Code duplicated, block: B:194:0x03b6 A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:199:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:200:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:203:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:206:0x03f1 A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x03fa A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0402 A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x040c A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x043a  */
    /* JADX WARN: Code duplicated, block: B:215:0x043c A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x0442 A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x044b A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x0479  */
    /* JADX WARN: Code duplicated, block: B:223:0x047d A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x0492  */
    /* JADX WARN: Code duplicated, block: B:226:0x0494 A[Catch: ClassCastException -> 0x034c, TRY_LEAVE, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x04ae A[Catch: ClassCastException -> 0x034c, TRY_ENTER, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:234:0x04b7 A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:237:0x04c0 A[Catch: ClassCastException -> 0x034c, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x04df A[Catch: ClassCastException -> 0x034c, TRY_LEAVE, TryCatch #3 {ClassCastException -> 0x034c, blocks: (B:142:0x02f1, B:144:0x02f7, B:151:0x030c, B:154:0x0314, B:156:0x031d, B:159:0x0327, B:162:0x0335, B:164:0x033d, B:166:0x0344, B:173:0x0356, B:175:0x0360, B:178:0x036f, B:180:0x0375, B:184:0x038e, B:188:0x0399, B:192:0x03b0, B:194:0x03b6, B:197:0x03c5, B:201:0x03cf, B:204:0x03eb, B:205:0x03f0, B:171:0x0350, B:206:0x03f1, B:208:0x03fa, B:210:0x0402, B:212:0x040c, B:215:0x043c, B:216:0x0441, B:217:0x0442, B:219:0x044b, B:223:0x047d, B:226:0x0494, B:231:0x04ae, B:237:0x04c0, B:234:0x04b7, B:238:0x04df), top: B:272:0x02f1 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:245:0x0508  */
    /* JADX WARN: Code duplicated, block: B:247:0x051e  */
    /* JADX WARN: Code duplicated, block: B:252:0x0537  */
    /* JADX WARN: Code duplicated, block: B:253:0x0557  */
    /* JADX WARN: Code duplicated, block: B:254:0x055f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0567  */
    /* JADX WARN: Code duplicated, block: B:260:0x0583  */
    /* JADX WARN: Code duplicated, block: B:261:0x0594  */
    /* JADX WARN: Code duplicated, block: B:262:0x059c  */
    /* JADX WARN: Code duplicated, block: B:269:0x01a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x013f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0144  */
    /* JADX WARN: Code duplicated, block: B:66:0x015b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0163  */
    /* JADX WARN: Code duplicated, block: B:71:0x0179  */
    /* JADX WARN: Code duplicated, block: B:73:0x0183  */
    /* JADX WARN: Code duplicated, block: B:77:0x0198  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:98:0x020a  */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0348, code lost:
    
        if (bm.r.T(r4, "salt=", false, 2, null) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04a6, code lost:
    
        if (ji.i.j(r0, r2) == r3) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0531, code lost:
    
        if (r5.K(r4, r0, r2) == r3) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x057d, code lost:
    
        if (r4.O(r0, r2) == r3) goto L257;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:212:0x040c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:219:0x044b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:237:0x04c0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:252:0x0537, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:262:0x059c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00f4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kl.f, mj.l$f] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(kl.f r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.l.G(kl.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 H(l lVar) {
        lVar.f46376a.g();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 I(l lVar) {
        lVar.f46376a.f();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 J(l lVar) {
        lVar.f46376a.f();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 K(l lVar, String str) {
        lVar.f46376a.a(str);
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 L(l lVar) {
        lVar.f46376a.c();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 M(l lVar, String str) {
        lVar.f46376a.a("onStatus: " + str);
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(4:52|27|(2:37|(1:40))(10:29|(2:31|(1:33)(1:36))(1:36)|42|43|45|(2:47|49)|23|(1:25)|50|51)|39) */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        r2 = fl.r.f38769b;
        r8 = fl.r.b(fl.s.a(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008e, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0088 -> B:41:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(kl.f r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof mj.l.g
            if (r0 == 0) goto L13
            r0 = r8
            mj.l$g r0 = (mj.l.g) r0
            int r1 = r0.f46424v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46424v = r1
            goto L18
        L13:
            mj.l$g r0 = new mj.l$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f46422t
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f46424v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.f46421s
            mj.l r2 = (mj.l) r2
            java.lang.Object r6 = r0.f46420r
            mj.l r6 = (mj.l) r6
            fl.s.b(r8)     // Catch: java.lang.Throwable -> L35
            goto L89
        L35:
            r8 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f46420r
            r6 = r2
            mj.l r6 = (mj.l) r6
            fl.s.b(r8)     // Catch: java.lang.Throwable -> L35
            goto L8e
        L48:
            fl.s.b(r8)
            r2 = r7
        L4c:
            em.o0 r8 = r2.f46380e
            boolean r8 = em.p0.f(r8)
            if (r8 == 0) goto Lb1
            boolean r8 = r2.f46386k
            if (r8 == 0) goto Lb1
            fl.r$a r8 = fl.r.f38769b     // Catch: java.lang.Throwable -> L71
            boolean r8 = r2.P()     // Catch: java.lang.Throwable -> L71
            if (r8 == 0) goto L76
            boolean r8 = r2.f46390o     // Catch: java.lang.Throwable -> L71
            if (r8 != 0) goto L74
            r0.f46420r = r2     // Catch: java.lang.Throwable -> L71
            r0.f46421s = r5     // Catch: java.lang.Throwable -> L71
            r0.f46424v = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Object r8 = r2.G(r0)     // Catch: java.lang.Throwable -> L71
            if (r8 != r1) goto L74
            goto L87
        L71:
            r8 = move-exception
            r6 = r2
            goto L96
        L74:
            r6 = r2
            goto L8e
        L76:
            mj.k r8 = new mj.k     // Catch: java.lang.Throwable -> L71
            r8.<init>()     // Catch: java.lang.Throwable -> L71
            r0.f46420r = r2     // Catch: java.lang.Throwable -> L71
            r0.f46421s = r2     // Catch: java.lang.Throwable -> L71
            r0.f46424v = r3     // Catch: java.lang.Throwable -> L71
            java.lang.Object r8 = ji.i.j(r8, r0)     // Catch: java.lang.Throwable -> L71
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            r6 = r2
        L89:
            em.o0 r8 = r2.f46380e     // Catch: java.lang.Throwable -> L35
            em.p0.c(r8, r5, r4, r5)     // Catch: java.lang.Throwable -> L35
        L8e:
            fl.g0 r8 = fl.g0.f38750a     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = fl.r.b(r8)     // Catch: java.lang.Throwable -> L35
        L94:
            r2 = r6
            goto La1
        L96:
            fl.r$a r2 = fl.r.f38769b
            java.lang.Object r8 = fl.s.a(r8)
            java.lang.Object r8 = fl.r.b(r8)
            goto L94
        La1:
            java.lang.Throwable r8 = fl.r.e(r8)
            if (r8 == 0) goto L4c
            boolean r8 = r8 instanceof java.net.SocketTimeoutException
            if (r8 != 0) goto L4c
            em.o0 r8 = r2.f46380e
            em.p0.c(r8, r5, r4, r5)
            goto L4c
        Lb1:
            fl.g0 r8 = fl.g0.f38750a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.l.N(kl.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 O(l lVar) {
        lVar.f46376a.a("No response from server");
        return g0.f38750a;
    }

    private final boolean P() {
        uj.a aVar = this.f46379d;
        boolean zH = aVar != null ? aVar.h() : false;
        if (this.f46394s) {
            uj.a aVar2 = this.f46379d;
            boolean zI = aVar2 != null ? aVar2.i() : false;
            if (zH && !zI) {
                return false;
            }
        }
        return zH;
    }

    public final void A(String str) {
        B(str, false);
    }

    public final void B(String str, boolean z10) {
        if (!z10) {
            this.f46391p = true;
        }
        if (!this.f46386k || z10) {
            this.f46386k = true;
            this.f46382g = em.k.d(this.f46380e, null, null, new b(str, this, null), 3, null);
        }
    }

    public final void D() {
        em.k.d(p0.a(c1.b()), null, null, new c(null), 3, null);
    }

    public final void Q(ByteBuffer aacBuffer, MediaCodec.BufferInfo info) {
        kotlin.jvm.internal.s.h(aacBuffer, "aacBuffer");
        kotlin.jvm.internal.s.h(info, "info");
        if (this.f46384i.f()) {
            return;
        }
        this.f46385j.s(aacBuffer, info);
    }

    public final void R(ByteBuffer h264Buffer, MediaCodec.BufferInfo info) {
        kotlin.jvm.internal.s.h(h264Buffer, "h264Buffer");
        kotlin.jvm.internal.s.h(info, "info");
        if (this.f46384i.x()) {
            return;
        }
        this.f46385j.u(h264Buffer, info);
    }

    public final void S(int i10, boolean z10) {
        this.f46384i.Q(i10, z10);
        this.f46385j.w(i10, z10);
    }

    public final void T(String str, String str2) {
        this.f46384i.R(str, str2);
    }

    public final void U(int i10) {
        this.f46384i.T(i10);
    }

    public final void V(ByteBuffer sps, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        kotlin.jvm.internal.s.h(sps, "sps");
        Log.i(this.f46377b, "send sps and pps");
        this.f46385j.y(sps, byteBuffer, byteBuffer2);
    }

    public final void W(int i10, int i11) {
        this.f46384i.d0(i10, i11);
    }

    public final void z() {
        uj.a aVar = this.f46379d;
        if (aVar != null) {
            aVar.a();
        }
        this.f46384i.B();
    }
}
