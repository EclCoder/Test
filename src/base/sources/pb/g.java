package pb;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.c2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.c0;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.googlecode.mp4parser.boxes.microsoft.XtraBox;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import ob.g0;
import ob.j0;
import ob.o0;
import ob.r0;
import ob.s0;
import qd.qPi.SVWsZyNSAChGIA;
import r7.pgx.XTkUEXuiK;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g extends MediaCodecRenderer {

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private static final int[] f49865o1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static boolean f49866p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private static boolean f49867q1;
    private final Context G0;
    private final m H0;
    private final x.a I0;
    private final d J0;
    private final long K0;
    private final int L0;
    private final boolean M0;
    private b N0;
    private boolean O0;
    private boolean P0;
    private Surface Q0;
    private h R0;
    private boolean S0;
    private int T0;
    private boolean U0;
    private boolean V0;
    private boolean W0;
    private long X0;
    private long Y0;
    private long Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f49868a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f49869b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f49870c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private long f49871d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private long f49872e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private long f49873f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f49874g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private long f49875h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private z f49876i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private z f49877j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private boolean f49878k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private int f49879l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    c f49880m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private k f49881n1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i10 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49884c;

        public b(int i10, int i11, int i12) {
            this.f49882a = i10;
            this.f49883b = i11;
            this.f49884c = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements com.google.android.exoplayer2.mediacodec.j.c, Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f49885a;

        public c(com.google.android.exoplayer2.mediacodec.j jVar) {
            Handler handlerX = r0.x(this);
            this.f49885a = handlerX;
            jVar.j(this, handlerX);
        }

        private void b(long j10) {
            g gVar = g.this;
            if (this != gVar.f49880m1 || gVar.j0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                g.this.Z1();
                return;
            }
            try {
                g.this.Y1(j10);
            } catch (ExoPlaybackException e10) {
                g.this.b1(e10);
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.j.c
        public void a(com.google.android.exoplayer2.mediacodec.j jVar, long j10, long j11) {
            if (r0.f48425a >= 30) {
                b(j10);
            } else {
                this.f49885a.sendMessageAtFrontOfQueue(Message.obtain(this.f49885a, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(r0.g1(message.arg1, message.arg2));
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f49887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f49888b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f49891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CopyOnWriteArrayList f49892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Pair f49893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Pair f49894h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f49897k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f49898l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayDeque f49889c = new ArrayDeque();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayDeque f49890d = new ArrayDeque();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f49895i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f49896j = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f49899m = C.TIME_UNSET;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private z f49900n = z.f49991e;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f49901o = C.TIME_UNSET;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f49902p = C.TIME_UNSET;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ v0 f49903a;

            a(v0 v0Var) {
                this.f49903a = v0Var;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static Constructor f49905a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static Method f49906b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static Method f49907c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static Constructor f49908d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static Method f49909e;

            public static ob.l a(float f10) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
                c();
                Object objNewInstance = f49905a.newInstance(null);
                f49906b.invoke(objNewInstance, Float.valueOf(f10));
                android.support.v4.media.session.b.a(ob.a.e(f49907c.invoke(objNewInstance, null)));
                return null;
            }

            public static s0 b() throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
                c();
                android.support.v4.media.session.b.a(ob.a.e(f49909e.invoke(f49908d.newInstance(null), null)));
                return null;
            }

            private static void c() throws ClassNotFoundException {
                if (f49905a == null || f49906b == null || f49907c == null) {
                    Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
                    f49905a = cls.getConstructor(null);
                    f49906b = cls.getMethod("setRotationDegrees", Float.TYPE);
                    f49907c = cls.getMethod("build", null);
                }
                if (f49908d == null || f49909e == null) {
                    Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    f49908d = cls2.getConstructor(null);
                    f49909e = cls2.getMethod("build", null);
                }
            }
        }

        public d(m mVar, g gVar) {
            this.f49887a = mVar;
            this.f49888b = gVar;
        }

        private void k(long j10, boolean z10) {
            ob.a.i(null);
            throw null;
        }

        public MediaFormat a(MediaFormat mediaFormat) {
            if (r0.f48425a >= 29 && this.f49888b.G0.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
            return mediaFormat;
        }

        public void b() {
            android.support.v4.media.session.b.a(ob.a.e(null));
            throw null;
        }

        public void c() {
            ob.a.i(null);
            throw null;
        }

        public long d(long j10, long j11) {
            ob.a.g(this.f49902p != C.TIME_UNSET);
            return (j10 + j11) - this.f49902p;
        }

        public Surface e() {
            android.support.v4.media.session.b.a(ob.a.e(null));
            throw null;
        }

        public boolean f() {
            return false;
        }

        public boolean g() {
            Pair pair = this.f49894h;
            return pair == null || !((g0) pair.second).equals(g0.f48376c);
        }

        public boolean h(v0 v0Var, long j10) throws ExoPlaybackException {
            int i10;
            ob.a.g(!f());
            if (!this.f49896j) {
                return false;
            }
            if (this.f49892f == null) {
                this.f49896j = false;
                return false;
            }
            this.f49891e = r0.w();
            Pair pairG1 = this.f49888b.G1(v0Var.f18880x);
            try {
                if (!g.A1() && (i10 = v0Var.f18876t) != 0) {
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f49892f;
                    b.a(i10);
                    copyOnWriteArrayList.add(0, null);
                }
                b.b();
                Context unused = this.f49888b.G0;
                ob.k kVar = ob.k.f48399a;
                Handler handler = this.f49891e;
                Objects.requireNonNull(handler);
                new d2.r(handler);
                new a(v0Var);
                throw null;
            } catch (Exception e10) {
                throw this.f49888b.r(e10, v0Var, 7000);
            }
        }

        public boolean i(v0 v0Var, long j10, boolean z10) {
            ob.a.i(null);
            ob.a.g(this.f49895i != -1);
            throw null;
        }

        public void j(String str) {
            this.f49895i = r0.c0(this.f49888b.G0, str, false);
        }

        public void l(long j10, long j11) {
            ob.a.i(null);
            while (!this.f49889c.isEmpty()) {
                boolean z10 = false;
                boolean z11 = this.f49888b.getState() == 2;
                long jLongValue = ((Long) ob.a.e((Long) this.f49889c.peek())).longValue();
                long j12 = jLongValue + this.f49902p;
                long jX1 = this.f49888b.x1(j10, j11, SystemClock.elapsedRealtime() * 1000, j12, z11);
                if (this.f49897k && this.f49889c.size() == 1) {
                    z10 = true;
                }
                if (this.f49888b.k2(j10, jX1)) {
                    k(-1L, z10);
                    return;
                }
                if (!z11 || j10 == this.f49888b.X0 || jX1 > 50000) {
                    return;
                }
                this.f49887a.h(j12);
                long jB = this.f49887a.b(System.nanoTime() + (jX1 * 1000));
                if (this.f49888b.j2((jB - System.nanoTime()) / 1000, j11, z10)) {
                    k(-2L, z10);
                } else {
                    if (!this.f49890d.isEmpty() && j12 > ((Long) ((Pair) this.f49890d.peek()).first).longValue()) {
                        this.f49893g = (Pair) this.f49890d.remove();
                    }
                    this.f49888b.X1(jLongValue, jB, (v0) this.f49893g.second);
                    if (this.f49901o >= j12) {
                        this.f49901o = C.TIME_UNSET;
                        this.f49888b.U1(this.f49900n);
                    }
                    k(jB, z10);
                }
            }
        }

        public boolean m() {
            return this.f49898l;
        }

        public void n() {
            android.support.v4.media.session.b.a(ob.a.e(null));
            throw null;
        }

        public void o(v0 v0Var) {
            android.support.v4.media.session.b.a(ob.a.e(null));
            new ob.p.b(v0Var.f18873q, v0Var.f18874r).b(v0Var.f18877u).a();
            throw null;
        }

        public void p(Surface surface, g0 g0Var) {
            Pair pair = this.f49894h;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((g0) this.f49894h.second).equals(g0Var)) {
                return;
            }
            this.f49894h = Pair.create(surface, g0Var);
            if (f()) {
                android.support.v4.media.session.b.a(ob.a.e(null));
                new j0(surface, g0Var.b(), g0Var.a());
                throw null;
            }
        }

        public void q(List list) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f49892f;
            if (copyOnWriteArrayList == null) {
                this.f49892f = new CopyOnWriteArrayList(list);
            } else {
                copyOnWriteArrayList.clear();
                this.f49892f.addAll(list);
            }
        }
    }

    public g(Context context, com.google.android.exoplayer2.mediacodec.j.b bVar, com.google.android.exoplayer2.mediacodec.l lVar, long j10, boolean z10, Handler handler, x xVar, int i10) {
        this(context, bVar, lVar, j10, z10, handler, xVar, i10, 30.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean A1() {
        return r0.f48425a >= 21;
    }

    private static void C1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean D1() {
        return "NVIDIA".equals(r0.f48427c);
    }

    private static boolean F1() {
        int i10 = r0.f48425a;
        byte b10 = 7;
        if (i10 <= 28) {
            String str = r0.f48426b;
            str.getClass();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i10 <= 27 && "HWEML".equals(r0.f48426b)) {
            return true;
        }
        String str2 = r0.f48428d;
        str2.getClass();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i10 <= 26) {
                    String str3 = r0.f48426b;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b10 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b10 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b10 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b10 = !str3.equals(KPtaxpyICj.yZJYOpOpc) ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b10 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b10 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b10 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b10 = -1;
                            }
                            break;
                        case -1936688066:
                            b10 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b10 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b10 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b10 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b10 = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b10 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b10 = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b10 = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b10 = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b10 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b10 = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b10 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b10 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b10 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b10 = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b10 = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b10 = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b10 = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b10 = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b10 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b10 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b10 = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b10 = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b10 = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b10 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b10 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b10 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b10 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b10 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b10 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b10 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b10 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b10 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b10 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b10 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b10 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b10 = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b10 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b10 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b10 = !str3.equals(dOIDCKnIR.FrceNLvWwdc) ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b10 = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b10 = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b10 = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b10 = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b10 = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b10 = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b10 = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b10 = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b10 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b10 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b10 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b10 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b10 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b10 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b10 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b10 = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b10 = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b10 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b10 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b10 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b10 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b10 = !str3.equals(XTkUEXuiK.NmOyAotXr) ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b10 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b10 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b10 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b10 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b10 = !str3.equals(CIdIVqKnNZ.iNtmJyErWcpUj) ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b10 = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b10 = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b10 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b10 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b10 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b10 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b10 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b10 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b10 = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b10 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b10 = !str3.equals(dmHT.rYoAJGfreiZSl) ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b10 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b10 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b10 = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b10 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b10 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b10 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b10 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b10 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b10 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b10 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b10 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b10 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b10 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b10 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b10 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b10 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b10 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b10 = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b10 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b10 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b10 = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b10 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b10 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b10 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b10 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b10 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b10 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b10 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b10 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b10 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b10 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b10 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b10 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b10 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b10 = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b10 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b10 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b10 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b10 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b10 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b10 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b10 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b10 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b10 = !str3.equals(jyeoXJ.lehryxphDu) ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b10 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b10 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b10 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b10 = !str3.equals(SVWsZyNSAChGIA.QmIH) ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b10 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b10 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b10 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b10 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b10 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b10 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case SDK_INIT_API_VALUE:
                        case AD_START_EVENT_VALUE:
                        case AD_CLICK_EVENT_VALUE:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case AD_VISIBILITY_VALUE:
                        case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                        case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                        case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                        case 60:
                        case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                        case DEPRECATED_API_USED_VALUE:
                        case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                        case 64:
                        case 65:
                        case BLACK_SCREEN_IS_DETECTED_VALUE:
                        case NATIVE_PLAY_ASSET_TYPE_VALUE:
                        case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                        case NATIVE_AD_DISPLAY_DURATION_VALUE:
                        case ASSET_DOWNLOAD_RETRY_STATUS_VALUE:
                        case AD_VISIBLE_DURATION_MS_VALUE:
                        case XtraBox.MP4_XTRA_BT_GUID /* 72 */:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case ASSET_REQUEST_ERROR_VALUE:
                        case ASSET_RESPONSE_DATA_ERROR_VALUE:
                        case ASSET_WRITE_ERROR_VALUE:
                        case INVALID_INDEX_URL_VALUE:
                        case GZIP_ENCODE_ERROR_VALUE:
                        case ASSET_FAILED_STATUS_CODE_VALUE:
                        case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                        case JSON_ENCODE_ERROR_VALUE:
                        case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                        case TPAT_ERROR_VALUE:
                        case INVALID_ADS_ENDPOINT_VALUE:
                        case INVALID_RI_ENDPOINT_VALUE:
                        case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                        case INVALID_METRICS_ENDPOINT_VALUE:
                        case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                        case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                        case 128:
                        case 129:
                        case 130:
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                        case OMSDK_JS_WRITE_FAILED_VALUE:
                        case 134:
                        case 135:
                        case PRIVACY_URL_ERROR_VALUE:
                        case TPAT_RETRY_FAILED_VALUE:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                return false;
        }
    }

    public static int H1(com.google.android.exoplayer2.mediacodec.k kVar, v0 v0Var) {
        int iIntValue;
        int i10 = v0Var.f18873q;
        int i11 = v0Var.f18874r;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        String str = v0Var.f18868l;
        if ("video/dolby-vision".equals(str)) {
            Pair pairR = MediaCodecUtil.r(v0Var);
            str = (pairR == null || !((iIntValue = ((Integer) pairR.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? MimeTypes.VIDEO_H265 : MimeTypes.VIDEO_H264;
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return M1(i10 * i11, 2);
            case "video/hevc":
                return Math.max(2097152, M1(i10 * i11, 2));
            case "video/avc":
                String str2 = r0.f48428d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(r0.f48427c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && kVar.f17299g)))) {
                    return -1;
                }
                return M1(r0.l(i10, 16) * r0.l(i11, 16) * 256, 2);
            case "video/x-vnd.on2.vp9":
                return M1(i10 * i11, 4);
            default:
                return -1;
        }
    }

    private static Point I1(com.google.android.exoplayer2.mediacodec.k kVar, v0 v0Var) {
        int i10 = v0Var.f18874r;
        int i11 = v0Var.f18873q;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f49865o1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (r0.f48425a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point pointC = kVar.c(i15, i13);
                if (kVar.w(pointC.x, pointC.y, v0Var.f18875s)) {
                    return pointC;
                }
            } else {
                try {
                    int iL = r0.l(i13, 16) * 16;
                    int iL2 = r0.l(i14, 16) * 16;
                    if (iL * iL2 <= MediaCodecUtil.L()) {
                        int i16 = z10 ? iL2 : iL;
                        if (!z10) {
                            iL = iL2;
                        }
                        return new Point(i16, iL);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    private static List K1(Context context, com.google.android.exoplayer2.mediacodec.l lVar, v0 v0Var, boolean z10, boolean z11) {
        String str = v0Var.f18868l;
        if (str == null) {
            return c0.C();
        }
        if (r0.f48425a >= 26 && "video/dolby-vision".equals(str) && !a.a(context)) {
            List listN = MediaCodecUtil.n(lVar, v0Var, z10, z11);
            if (!listN.isEmpty()) {
                return listN;
            }
        }
        return MediaCodecUtil.v(lVar, v0Var, z10, z11);
    }

    protected static int L1(com.google.android.exoplayer2.mediacodec.k kVar, v0 v0Var) {
        if (v0Var.f18869m == -1) {
            return H1(kVar, v0Var);
        }
        int size = v0Var.f18870n.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) v0Var.f18870n.get(i10)).length;
        }
        return v0Var.f18869m + length;
    }

    private static int M1(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private static boolean O1(long j10) {
        return j10 < -30000;
    }

    private static boolean P1(long j10) {
        return j10 < -500000;
    }

    private void R1() {
        if (this.f49868a1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.I0.n(this.f49868a1, jElapsedRealtime - this.Z0);
            this.f49868a1 = 0;
            this.Z0 = jElapsedRealtime;
        }
    }

    private void T1() {
        int i10 = this.f49874g1;
        if (i10 != 0) {
            this.I0.r(this.f49873f1, i10);
            this.f49873f1 = 0L;
            this.f49874g1 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1(z zVar) {
        if (zVar.equals(z.f49991e) || zVar.equals(this.f49877j1)) {
            return;
        }
        this.f49877j1 = zVar;
        this.I0.t(zVar);
    }

    private void V1() {
        if (this.S0) {
            this.I0.q(this.Q0);
        }
    }

    private void W1() {
        z zVar = this.f49877j1;
        if (zVar != null) {
            this.I0.t(zVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X1(long j10, long j11, v0 v0Var) {
        k kVar = this.f49881n1;
        if (kVar != null) {
            kVar.b(j10, j11, v0Var, n0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z1() {
        a1();
    }

    private void a2() {
        Surface surface = this.Q0;
        h hVar = this.R0;
        if (surface == hVar) {
            this.Q0 = null;
        }
        hVar.release();
        this.R0 = null;
    }

    private void c2(com.google.android.exoplayer2.mediacodec.j jVar, v0 v0Var, int i10, long j10, boolean z10) {
        long j11;
        long jD = this.J0.f() ? this.J0.d(j10, q0()) * 1000 : System.nanoTime();
        if (z10) {
            j11 = j10;
            X1(j11, jD, v0Var);
        } else {
            j11 = j10;
        }
        if (r0.f48425a >= 21) {
            d2(jVar, i10, j11, jD);
        } else {
            b2(jVar, i10, j11);
        }
    }

    private static void e2(com.google.android.exoplayer2.mediacodec.j jVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        jVar.b(bundle);
    }

    private void f2() {
        this.Y0 = this.K0 > 0 ? SystemClock.elapsedRealtime() + this.K0 : C.TIME_UNSET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [pb.m] */
    /* JADX WARN: Type inference failed for: r0v8, types: [pb.g$d] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.f, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, pb.g] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v8, types: [pb.h] */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    private void g2(Object obj) throws ExoPlaybackException {
        ?? C;
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            C = 0;
        }
        if (C == 0) {
            h hVar = this.R0;
            if (hVar != null) {
                C = surface;
                C = hVar;
            } else {
                com.google.android.exoplayer2.mediacodec.k kVarK0 = k0();
                if (kVarK0 != null && m2(kVarK0)) {
                    C = surface;
                    C = h.c(this.G0, kVarK0.f17299g);
                    this.R0 = C;
                }
            }
        }
        C = surface;
        C = surface;
        C = surface;
        if (this.Q0 == C) {
            if (C == 0 || C == this.R0) {
                return;
            }
            W1();
            V1();
            return;
        }
        this.Q0 = C;
        this.H0.m(C);
        this.S0 = false;
        int state = getState();
        com.google.android.exoplayer2.mediacodec.j jVarJ0 = j0();
        if (jVarJ0 != null && !this.J0.f()) {
            if (r0.f48425a < 23 || C == 0 || this.O0) {
                S0();
                B0();
            } else {
                h2(jVarJ0, C);
            }
        }
        if (C == 0 || C == this.R0) {
            z1();
            y1();
            if (this.J0.f()) {
                this.J0.b();
                return;
            }
            return;
        }
        W1();
        y1();
        if (state == 2) {
            f2();
        }
        if (this.J0.f()) {
            this.J0.p(C, g0.f48376c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k2(long j10, long j11) {
        boolean z10 = getState() == 2;
        return this.Y0 == C.TIME_UNSET && j10 >= q0() && ((this.W0 ? !this.U0 : !(!z10 && !this.V0)) || (z10 && l2(j11, (SystemClock.elapsedRealtime() * 1000) - this.f49872e1)));
    }

    private boolean m2(com.google.android.exoplayer2.mediacodec.k kVar) {
        if (r0.f48425a < 23 || this.f49878k1 || B1(kVar.f17293a)) {
            return false;
        }
        return !kVar.f17299g || h.b(this.G0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long x1(long j10, long j11, long j12, long j13, boolean z10) {
        long jR0 = (long) ((j13 - j10) / ((double) r0()));
        return z10 ? jR0 - (j12 - j11) : jR0;
    }

    private void y1() {
        com.google.android.exoplayer2.mediacodec.j jVarJ0;
        this.U0 = false;
        if (r0.f48425a < 23 || !this.f49878k1 || (jVarJ0 = j0()) == null) {
            return;
        }
        this.f49880m1 = new c(jVarJ0);
    }

    private void z1() {
        this.f49877j1 = null;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void A(boolean z10, boolean z11) {
        super.A(z10, z11);
        boolean z12 = t().f48290a;
        ob.a.g((z12 && this.f49879l1 == 0) ? false : true);
        if (this.f49878k1 != z12) {
            this.f49878k1 = z12;
            S0();
        }
        this.I0.o(this.B0);
        this.V0 = z11;
        this.W0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void B(long j10, boolean z10) throws ExoPlaybackException {
        super.B(j10, z10);
        if (this.J0.f()) {
            this.J0.c();
        }
        y1();
        this.H0.j();
        this.f49871d1 = C.TIME_UNSET;
        this.X0 = C.TIME_UNSET;
        this.f49869b1 = 0;
        if (z10) {
            f2();
        } else {
            this.Y0 = C.TIME_UNSET;
        }
    }

    protected boolean B1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (g.class) {
            try {
                if (!f49866p1) {
                    f49867q1 = F1();
                    f49866p1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f49867q1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void D0(Exception exc) {
        ob.u.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.I0.s(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void E() {
        try {
            super.E();
        } finally {
            if (this.J0.f()) {
                this.J0.n();
            }
            if (this.R0 != null) {
                a2();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void E0(String str, com.google.android.exoplayer2.mediacodec.j.a aVar, long j10, long j11) {
        this.I0.k(str, j10, j11);
        this.O0 = B1(str);
        this.P0 = ((com.google.android.exoplayer2.mediacodec.k) ob.a.e(k0())).p();
        if (r0.f48425a >= 23 && this.f49878k1) {
            this.f49880m1 = new c((com.google.android.exoplayer2.mediacodec.j) ob.a.e(j0()));
        }
        this.J0.j(str);
    }

    protected void E1(com.google.android.exoplayer2.mediacodec.j jVar, int i10, long j10) {
        o0.a("dropVideoBuffer");
        jVar.k(i10, false);
        o0.c();
        o2(0, 1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void F() {
        super.F();
        this.f49868a1 = 0;
        this.Z0 = SystemClock.elapsedRealtime();
        this.f49872e1 = SystemClock.elapsedRealtime() * 1000;
        this.f49873f1 = 0L;
        this.f49874g1 = 0;
        this.H0.k();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void F0(String str) {
        this.I0.l(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void G() {
        this.Y0 = C.TIME_UNSET;
        R1();
        T1();
        this.H0.l();
        super.G();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected s9.g G0(o9.p pVar) throws ExoPlaybackException {
        s9.g gVarG0 = super.G0(pVar);
        this.I0.p(pVar.f48303b, gVarG0);
        return gVarG0;
    }

    protected Pair G1(pb.c cVar) {
        if (pb.c.f(cVar)) {
            return cVar.f49832c == 7 ? Pair.create(cVar, cVar.b().d(6).a()) : Pair.create(cVar, cVar);
        }
        pb.c cVar2 = pb.c.f49823f;
        return Pair.create(cVar2, cVar2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void H0(v0 v0Var, MediaFormat mediaFormat) {
        int integer;
        int i10;
        com.google.android.exoplayer2.mediacodec.j jVarJ0 = j0();
        if (jVarJ0 != null) {
            jVarJ0.setVideoScalingMode(this.T0);
        }
        int i11 = 0;
        if (this.f49878k1) {
            i10 = v0Var.f18873q;
            integer = v0Var.f18874r;
        } else {
            ob.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = v0Var.f18877u;
        if (A1()) {
            int i12 = v0Var.f18876t;
            if (i12 == 90 || i12 == 270) {
                f10 = 1.0f / f10;
                int i13 = integer;
                integer = i10;
                i10 = i13;
            }
        } else if (!this.J0.f()) {
            i11 = v0Var.f18876t;
        }
        this.f49876i1 = new z(i10, integer, i11, f10);
        this.H0.g(v0Var.f18875s);
        if (this.J0.f()) {
            this.J0.o(v0Var.b().n0(i10).S(integer).f0(i11).c0(f10).G());
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void J0(long j10) {
        super.J0(j10);
        if (this.f49878k1) {
            return;
        }
        this.f49870c1--;
    }

    protected b J1(com.google.android.exoplayer2.mediacodec.k kVar, v0 v0Var, v0[] v0VarArr) {
        int iH1;
        int iMax = v0Var.f18873q;
        int iMax2 = v0Var.f18874r;
        int iL1 = L1(kVar, v0Var);
        if (v0VarArr.length == 1) {
            if (iL1 != -1 && (iH1 = H1(kVar, v0Var)) != -1) {
                iL1 = Math.min((int) (iL1 * 1.5f), iH1);
            }
            return new b(iMax, iMax2, iL1);
        }
        int length = v0VarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            v0 v0VarG = v0VarArr[i10];
            if (v0Var.f18880x != null && v0VarG.f18880x == null) {
                v0VarG = v0VarG.b().L(v0Var.f18880x).G();
            }
            if (kVar.f(v0Var, v0VarG).f51538d != 0) {
                int i11 = v0VarG.f18873q;
                z10 |= i11 == -1 || v0VarG.f18874r == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, v0VarG.f18874r);
                iL1 = Math.max(iL1, L1(kVar, v0VarG));
            }
        }
        if (z10) {
            ob.u.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointI1 = I1(kVar, v0Var);
            if (pointI1 != null) {
                iMax = Math.max(iMax, pointI1.x);
                iMax2 = Math.max(iMax2, pointI1.y);
                iL1 = Math.max(iL1, H1(kVar, v0Var.b().n0(iMax).S(iMax2).G()));
                ob.u.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new b(iMax, iMax2, iL1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void K0() {
        super.K0();
        y1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void L0(DecoderInputBuffer decoderInputBuffer) {
        boolean z10 = this.f49878k1;
        if (!z10) {
            this.f49870c1++;
        }
        if (r0.f48425a >= 23 || !z10) {
            return;
        }
        Y1(decoderInputBuffer.f16756e);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void M0(v0 v0Var) throws ExoPlaybackException {
        if (this.J0.f()) {
            return;
        }
        this.J0.h(v0Var, q0());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected s9.g N(com.google.android.exoplayer2.mediacodec.k kVar, v0 v0Var, v0 v0Var2) {
        s9.g gVarF = kVar.f(v0Var, v0Var2);
        int i10 = gVarF.f51539e;
        int i11 = v0Var2.f18873q;
        b bVar = this.N0;
        if (i11 > bVar.f49882a || v0Var2.f18874r > bVar.f49883b) {
            i10 |= 256;
        }
        if (L1(kVar, v0Var2) > this.N0.f49884c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new s9.g(kVar.f17293a, v0Var, v0Var2, i12 != 0 ? 0 : gVarF.f51538d, i12);
    }

    protected MediaFormat N1(v0 v0Var, String str, b bVar, float f10, boolean z10, int i10) {
        Pair pairR;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", v0Var.f18873q);
        mediaFormat.setInteger("height", v0Var.f18874r);
        ob.x.e(mediaFormat, v0Var.f18870n);
        ob.x.c(mediaFormat, "frame-rate", v0Var.f18875s);
        ob.x.d(mediaFormat, "rotation-degrees", v0Var.f18876t);
        ob.x.b(mediaFormat, v0Var.f18880x);
        if ("video/dolby-vision".equals(v0Var.f18868l) && (pairR = MediaCodecUtil.r(v0Var)) != null) {
            ob.x.d(mediaFormat, Scopes.PROFILE, ((Integer) pairR.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f49882a);
        mediaFormat.setInteger("max-height", bVar.f49883b);
        ob.x.d(mediaFormat, "max-input-size", bVar.f49884c);
        if (r0.f48425a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            C1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean O0(long j10, long j11, com.google.android.exoplayer2.mediacodec.j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, v0 v0Var) {
        long j13;
        boolean z12;
        ob.a.e(jVar);
        if (this.X0 == C.TIME_UNSET) {
            this.X0 = j10;
        }
        if (j12 != this.f49871d1) {
            if (!this.J0.f()) {
                this.H0.h(j12);
            }
            this.f49871d1 = j12;
        }
        long jQ0 = j12 - q0();
        if (z10 && !z11) {
            n2(jVar, i10, jQ0);
            return true;
        }
        boolean z13 = getState() == 2;
        long jX1 = x1(j10, j11, SystemClock.elapsedRealtime() * 1000, j12, z13);
        if (this.Q0 == this.R0) {
            if (!O1(jX1)) {
                return false;
            }
            n2(jVar, i10, jQ0);
            p2(jX1);
            return true;
        }
        if (k2(j10, jX1)) {
            if (!this.J0.f()) {
                z12 = true;
            } else {
                if (!this.J0.i(v0Var, jQ0, z11)) {
                    return false;
                }
                z12 = false;
            }
            c2(jVar, v0Var, i10, jQ0, z12);
            p2(jX1);
            return true;
        }
        if (z13 && j10 != this.X0) {
            long jNanoTime = System.nanoTime();
            long jB = this.H0.b((jX1 * 1000) + jNanoTime);
            if (!this.J0.f()) {
                jX1 = (jB - jNanoTime) / 1000;
            }
            boolean z14 = this.Y0 != C.TIME_UNSET;
            long j14 = jX1;
            if (i2(j14, j11, z11) && Q1(j10, z14)) {
                return false;
            }
            if (j2(j14, j11, z11)) {
                if (z14) {
                    n2(jVar, i10, jQ0);
                } else {
                    E1(jVar, i10, jQ0);
                }
                p2(j14);
                return true;
            }
            if (this.J0.f()) {
                this.J0.l(j10, j11);
                if (!this.J0.i(v0Var, jQ0, z11)) {
                    return false;
                }
                c2(jVar, v0Var, i10, jQ0, false);
                return true;
            }
            if (r0.f48425a >= 21) {
                if (j14 < 50000) {
                    if (jB == this.f49875h1) {
                        n2(jVar, i10, jQ0);
                        j13 = jB;
                    } else {
                        X1(jQ0, jB, v0Var);
                        d2(jVar, i10, jQ0, jB);
                        j13 = jB;
                    }
                    p2(j14);
                    this.f49875h1 = j13;
                    return true;
                }
            } else if (j14 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                if (j14 > 11000) {
                    try {
                        Thread.sleep((j14 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                X1(jQ0, jB, v0Var);
                b2(jVar, i10, jQ0);
                p2(j14);
                return true;
            }
        }
        return false;
    }

    protected boolean Q1(long j10, boolean z10) throws ExoPlaybackException {
        int iK = K(j10);
        if (iK == 0) {
            return false;
        }
        if (z10) {
            s9.e eVar = this.B0;
            eVar.f51524d += iK;
            eVar.f51526f += this.f49870c1;
        } else {
            this.B0.f51530j++;
            o2(iK, this.f49870c1);
        }
        g0();
        if (this.J0.f()) {
            this.J0.c();
        }
        return true;
    }

    void S1() {
        this.W0 = true;
        if (this.U0) {
            return;
        }
        this.U0 = true;
        this.I0.q(this.Q0);
        this.S0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void U0() {
        super.U0();
        this.f49870c1 = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException X(Throwable th2, com.google.android.exoplayer2.mediacodec.k kVar) {
        return new MediaCodecVideoDecoderException(th2, kVar, this.Q0);
    }

    protected void Y1(long j10) {
        l1(j10);
        U1(this.f49876i1);
        this.B0.f51525e++;
        S1();
        J0(j10);
    }

    protected void b2(com.google.android.exoplayer2.mediacodec.j jVar, int i10, long j10) {
        o0.a("releaseOutputBuffer");
        jVar.k(i10, true);
        o0.c();
        this.B0.f51525e++;
        this.f49869b1 = 0;
        if (this.J0.f()) {
            return;
        }
        this.f49872e1 = SystemClock.elapsedRealtime() * 1000;
        U1(this.f49876i1);
        S1();
    }

    protected void d2(com.google.android.exoplayer2.mediacodec.j jVar, int i10, long j10, long j11) {
        o0.a("releaseOutputBuffer");
        jVar.g(i10, j11);
        o0.c();
        this.B0.f51525e++;
        this.f49869b1 = 0;
        if (this.J0.f()) {
            return;
        }
        this.f49872e1 = SystemClock.elapsedRealtime() * 1000;
        U1(this.f49876i1);
        S1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean e1(com.google.android.exoplayer2.mediacodec.k kVar) {
        return this.Q0 != null || m2(kVar);
    }

    @Override // com.google.android.exoplayer2.b2, com.google.android.exoplayer2.c2
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int h1(com.google.android.exoplayer2.mediacodec.l lVar, v0 v0Var) {
        boolean z10;
        int i10 = 0;
        if (!ob.y.s(v0Var.f18868l)) {
            return c2.h(0);
        }
        boolean z11 = v0Var.f18871o != null;
        List listK1 = K1(this.G0, lVar, v0Var, z11, false);
        if (z11 && listK1.isEmpty()) {
            listK1 = K1(this.G0, lVar, v0Var, false, false);
        }
        if (listK1.isEmpty()) {
            return c2.h(1);
        }
        if (!MediaCodecRenderer.i1(v0Var)) {
            return c2.h(2);
        }
        com.google.android.exoplayer2.mediacodec.k kVar = (com.google.android.exoplayer2.mediacodec.k) listK1.get(0);
        boolean zO = kVar.o(v0Var);
        if (!zO) {
            int i11 = 1;
            while (true) {
                if (i11 >= listK1.size()) {
                    z10 = true;
                    break;
                }
                com.google.android.exoplayer2.mediacodec.k kVar2 = (com.google.android.exoplayer2.mediacodec.k) listK1.get(i11);
                if (kVar2.o(v0Var)) {
                    z10 = false;
                    zO = true;
                    kVar = kVar2;
                    break;
                }
                i11++;
            }
        } else {
            z10 = true;
            break;
        }
        int i12 = zO ? 4 : 3;
        int i13 = kVar.r(v0Var) ? 16 : 8;
        int i14 = kVar.f17300h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (r0.f48425a >= 26 && "video/dolby-vision".equals(v0Var.f18868l) && !a.a(this.G0)) {
            i15 = 256;
        }
        if (zO) {
            List listK2 = K1(this.G0, lVar, v0Var, z11, true);
            if (!listK2.isEmpty()) {
                com.google.android.exoplayer2.mediacodec.k kVar3 = (com.google.android.exoplayer2.mediacodec.k) MediaCodecUtil.w(listK2, v0Var).get(0);
                if (kVar3.o(v0Var) && kVar3.r(v0Var)) {
                    i10 = 32;
                }
            }
        }
        return c2.e(i12, i13, i10, i14, i15);
    }

    protected void h2(com.google.android.exoplayer2.mediacodec.j jVar, Surface surface) {
        jVar.e(surface);
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.y1.b
    public void handleMessage(int i10, Object obj) throws ExoPlaybackException {
        Surface surface;
        if (i10 == 1) {
            g2(obj);
            return;
        }
        if (i10 == 7) {
            this.f49881n1 = (k) obj;
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.f49879l1 != iIntValue) {
                this.f49879l1 = iIntValue;
                if (this.f49878k1) {
                    S0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            this.T0 = ((Integer) obj).intValue();
            com.google.android.exoplayer2.mediacodec.j jVarJ0 = j0();
            if (jVarJ0 != null) {
                jVarJ0.setVideoScalingMode(this.T0);
                return;
            }
            return;
        }
        if (i10 == 5) {
            this.H0.o(((Integer) obj).intValue());
            return;
        }
        if (i10 == 13) {
            this.J0.q((List) ob.a.e(obj));
            return;
        }
        if (i10 != 14) {
            super.handleMessage(i10, obj);
            return;
        }
        g0 g0Var = (g0) ob.a.e(obj);
        if (g0Var.b() == 0 || g0Var.a() == 0 || (surface = this.Q0) == null) {
            return;
        }
        this.J0.p(surface, g0Var);
    }

    protected boolean i2(long j10, long j11, boolean z10) {
        return P1(j10) && !z10;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.b2
    public boolean isEnded() {
        boolean zIsEnded = super.isEnded();
        return this.J0.f() ? zIsEnded & this.J0.m() : zIsEnded;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.b2
    public boolean isReady() {
        h hVar;
        if (super.isReady() && ((!this.J0.f() || this.J0.g()) && (this.U0 || (((hVar = this.R0) != null && this.Q0 == hVar) || j0() == null || this.f49878k1)))) {
            this.Y0 = C.TIME_UNSET;
            return true;
        }
        if (this.Y0 == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Y0) {
            return true;
        }
        this.Y0 = C.TIME_UNSET;
        return false;
    }

    protected boolean j2(long j10, long j11, boolean z10) {
        return O1(j10) && !z10;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.b2
    public void k(float f10, float f11) throws ExoPlaybackException {
        super.k(f10, f11);
        this.H0.i(f10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean l0() {
        return this.f49878k1 && r0.f48425a < 23;
    }

    protected boolean l2(long j10, long j11) {
        return O1(j10) && j11 > 100000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float m0(float f10, v0 v0Var, v0[] v0VarArr) {
        float fMax = -1.0f;
        for (v0 v0Var2 : v0VarArr) {
            float f11 = v0Var2.f18875s;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    protected void n2(com.google.android.exoplayer2.mediacodec.j jVar, int i10, long j10) {
        o0.a("skipVideoBuffer");
        jVar.k(i10, false);
        o0.c();
        this.B0.f51526f++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List o0(com.google.android.exoplayer2.mediacodec.l lVar, v0 v0Var, boolean z10) {
        return MediaCodecUtil.w(K1(this.G0, lVar, v0Var, z10, this.f49878k1), v0Var);
    }

    protected void o2(int i10, int i11) {
        s9.e eVar = this.B0;
        eVar.f51528h += i10;
        int i12 = i10 + i11;
        eVar.f51527g += i12;
        this.f49868a1 += i12;
        int i13 = this.f49869b1 + i12;
        this.f49869b1 = i13;
        eVar.f51529i = Math.max(i13, eVar.f51529i);
        int i14 = this.L0;
        if (i14 <= 0 || this.f49868a1 < i14) {
            return;
        }
        R1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected com.google.android.exoplayer2.mediacodec.j.a p0(com.google.android.exoplayer2.mediacodec.k kVar, v0 v0Var, MediaCrypto mediaCrypto, float f10) {
        h hVar = this.R0;
        if (hVar != null && hVar.f49912a != kVar.f17299g) {
            a2();
        }
        String str = kVar.f17295c;
        b bVarJ1 = J1(kVar, v0Var, x());
        this.N0 = bVarJ1;
        MediaFormat mediaFormatN1 = N1(v0Var, str, bVarJ1, f10, this.M0, this.f49878k1 ? this.f49879l1 : 0);
        if (this.Q0 == null) {
            if (!m2(kVar)) {
                throw new IllegalStateException();
            }
            if (this.R0 == null) {
                this.R0 = h.c(this.G0, kVar.f17299g);
            }
            this.Q0 = this.R0;
        }
        if (this.J0.f()) {
            mediaFormatN1 = this.J0.a(mediaFormatN1);
        }
        return com.google.android.exoplayer2.mediacodec.j.a.b(kVar, mediaFormatN1, v0Var, this.J0.f() ? this.J0.e() : this.Q0, mediaCrypto);
    }

    protected void p2(long j10) {
        this.B0.a(j10);
        this.f49873f1 += j10;
        this.f49874g1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.b2
    public void render(long j10, long j11) throws ExoPlaybackException {
        super.render(j10, j11);
        if (this.J0.f()) {
            this.J0.l(j10, j11);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void s0(DecoderInputBuffer decoderInputBuffer) {
        if (this.P0) {
            ByteBuffer byteBuffer = (ByteBuffer) ob.a.e(decoderInputBuffer.f16757f);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        e2(j0(), bArr);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void z() {
        z1();
        y1();
        this.S0 = false;
        this.f49880m1 = null;
        try {
            super.z();
        } finally {
            this.I0.m(this.B0);
            this.I0.t(z.f49991e);
        }
    }

    public g(Context context, com.google.android.exoplayer2.mediacodec.j.b bVar, com.google.android.exoplayer2.mediacodec.l lVar, long j10, boolean z10, Handler handler, x xVar, int i10, float f10) {
        super(2, bVar, lVar, z10, f10);
        this.K0 = j10;
        this.L0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.G0 = applicationContext;
        m mVar = new m(applicationContext);
        this.H0 = mVar;
        this.I0 = new x.a(handler, xVar);
        this.J0 = new d(mVar, this);
        this.M0 = D1();
        this.Y0 = C.TIME_UNSET;
        this.T0 = 1;
        this.f49876i1 = z.f49991e;
        this.f49879l1 = 0;
        z1();
    }
}
