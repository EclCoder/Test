package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.f1;
import androidx.media3.exoplayer.f2;
import c2.x1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import d2.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import o2.h0;
import w1.a0;
import w1.c0;
import w1.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class MediaCodecRenderer extends androidx.media3.exoplayer.h {
    private static final byte[] G0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final ArrayDeque A;
    private boolean A0;
    private final s B;
    private ExoPlaybackException B0;
    private t1.o C;
    protected androidx.media3.exoplayer.i C0;
    private t1.o D;
    private e D0;
    private DrmSession E;
    private long E0;
    private DrmSession F;
    private boolean F0;
    private f2.a G;
    private MediaCrypto H;
    private long I;
    private float J;
    private float K;
    private h L;
    private t1.o M;
    private MediaFormat N;
    private boolean O;
    private float P;
    private ArrayDeque Q;
    private DecoderInitializationException R;
    private j S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f5510a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f5511b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f5512c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f5513d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f5514e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private long f5515f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f5516g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f5517h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private ByteBuffer f5518i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f5519j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f5520k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f5521l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f5522m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f5523n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f5524o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f5525p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f5526q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h.b f5527r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f5528r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final l f5529s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f5530s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f5531t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f5532t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f5533u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f5534u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final DecoderInputBuffer f5535v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f5536v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final DecoderInputBuffer f5537w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private long f5538w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final DecoderInputBuffer f5539x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f5540x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final f f5541y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f5542y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final MediaCodec.BufferInfo f5543z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f5544z0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public static boolean a(h hVar, d dVar) {
            return hVar.m(dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {
        public static void a(h.a aVar, x1 x1Var) {
            LogSessionId logSessionIdA = x1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f5612b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class d implements h.c {
        private d() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.c
        public void a() {
            if (MediaCodecRenderer.this.G != null) {
                MediaCodecRenderer.this.G.b();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.c
        public void b() {
            if (MediaCodecRenderer.this.G != null) {
                MediaCodecRenderer.this.G.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f5551e = new e(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final y f5555d = new y();

        public e(long j10, long j11, long j12) {
            this.f5552a = j10;
            this.f5553b = j11;
            this.f5554c = j12;
        }
    }

    public MediaCodecRenderer(int i10, h.b bVar, l lVar, boolean z10, float f10) {
        super(i10);
        this.f5527r = bVar;
        this.f5529s = (l) w1.a.e(lVar);
        this.f5531t = z10;
        this.f5533u = f10;
        this.f5535v = DecoderInputBuffer.n();
        this.f5537w = new DecoderInputBuffer(0);
        this.f5539x = new DecoderInputBuffer(2);
        f fVar = new f();
        this.f5541y = fVar;
        this.f5543z = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = C.TIME_UNSET;
        this.A = new ArrayDeque();
        this.D0 = e.f5551e;
        fVar.k(0);
        fVar.f4864d.order(ByteOrder.nativeOrder());
        this.B = new s();
        this.P = -1.0f;
        this.T = 0;
        this.f5525p0 = 0;
        this.f5516g0 = -1;
        this.f5517h0 = -1;
        this.f5515f0 = C.TIME_UNSET;
        this.f5536v0 = C.TIME_UNSET;
        this.f5538w0 = C.TIME_UNSET;
        this.E0 = C.TIME_UNSET;
        this.f5526q0 = 0;
        this.f5528r0 = 0;
        this.C0 = new androidx.media3.exoplayer.i();
    }

    protected static boolean E1(t1.o oVar) {
        int i10 = oVar.K;
        return i10 == 0 || i10 == 2;
    }

    private boolean F1(t1.o oVar) throws ExoPlaybackException {
        if (c0.f55769a >= 23 && this.L != null && this.f5528r0 != 3 && getState() != 0) {
            float fB0 = B0(this.K, (t1.o) w1.a.e(oVar), J());
            float f10 = this.P;
            if (f10 == fB0) {
                return true;
            }
            if (fB0 == -1.0f) {
                o0();
                return false;
            }
            if (f10 == -1.0f && fB0 <= this.f5533u) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fB0);
            ((h) w1.a.e(this.L)).b(bundle);
            this.P = fB0;
        }
        return true;
    }

    private void G1() throws ExoPlaybackException {
        b2.b bVarC = ((DrmSession) w1.a.e(this.F)).c();
        if (bVarC instanceof e2.l) {
            try {
                ((MediaCrypto) w1.a.e(this.H)).setMediaDrmSession(((e2.l) bVarC).f37055b);
            } catch (MediaCryptoException e10) {
                throw B(e10, this.C, 6006);
            }
        }
        u1(this.F);
        this.f5526q0 = 0;
        this.f5528r0 = 0;
    }

    private boolean M0() {
        return this.f5517h0 >= 0;
    }

    private boolean N0() {
        if (!this.f5541y.u()) {
            return true;
        }
        long jH = H();
        return T0(jH, this.f5541y.s()) == T0(jH, this.f5539x.f4866f);
    }

    private void O0(t1.o oVar) {
        m0();
        String str = oVar.f52757n;
        if (MimeTypes.AUDIO_AAC.equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
            this.f5541y.v(32);
        } else {
            this.f5541y.v(1);
        }
        this.f5521l0 = true;
    }

    private void P0(j jVar, MediaCrypto mediaCrypto) {
        t1.o oVar = (t1.o) w1.a.e(this.C);
        String str = jVar.f5617a;
        int i10 = c0.f55769a;
        float fB0 = i10 < 23 ? -1.0f : B0(this.K, oVar, J());
        float f10 = fB0 > this.f5533u ? fB0 : -1.0f;
        i1(oVar);
        long jElapsedRealtime = D().elapsedRealtime();
        h.a aVarG0 = G0(jVar, oVar, mediaCrypto, f10);
        if (i10 >= 31) {
            c.a(aVarG0, I());
        }
        try {
            a0.a("createCodec:" + str);
            h hVarA = this.f5527r.a(aVarG0);
            this.L = hVarA;
            this.f5514e0 = i10 >= 21 && b.a(hVarA, new d());
            a0.b();
            long jElapsedRealtime2 = D().elapsedRealtime();
            if (!jVar.m(oVar)) {
                w1.n.h("MediaCodecRenderer", c0.F("Format exceeds selected codec's capabilities [%s, %s]", t1.o.g(oVar), str));
            }
            this.S = jVar;
            this.P = f10;
            this.M = oVar;
            this.T = d0(str);
            this.U = e0(str, (t1.o) w1.a.e(this.M));
            this.V = j0(str);
            this.W = k0(str);
            this.X = g0(str);
            this.Y = h0(str);
            this.Z = f0(str);
            this.f5510a0 = false;
            this.f5513d0 = i0(jVar) || A0();
            if (((h) w1.a.e(this.L)).f()) {
                this.f5524o0 = true;
                this.f5525p0 = 1;
                this.f5511b0 = this.T != 0;
            }
            if (getState() == 2) {
                this.f5515f0 = D().elapsedRealtime() + 1000;
            }
            this.C0.f5382a++;
            a1(str, aVarG0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th2) {
            a0.b();
            throw th2;
        }
    }

    private boolean Q0() throws ExoPlaybackException {
        w1.a.g(this.H == null);
        DrmSession drmSession = this.E;
        b2.b bVarC = drmSession.c();
        if (e2.l.f37053d && (bVarC instanceof e2.l)) {
            int state = drmSession.getState();
            if (state == 1) {
                DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) w1.a.e(drmSession.getError());
                throw B(drmSessionException, this.C, drmSessionException.f5236a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (bVarC == null) {
            return drmSession.getError() != null;
        }
        if (bVarC instanceof e2.l) {
            e2.l lVar = (e2.l) bVarC;
            try {
                this.H = new MediaCrypto(lVar.f37054a, lVar.f37055b);
            } catch (MediaCryptoException e10) {
                throw B(e10, this.C, 6006);
            }
        }
        return true;
    }

    private boolean T0(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        t1.o oVar = this.D;
        return (oVar != null && Objects.equals(oVar.f52757n, MimeTypes.AUDIO_OPUS) && h0.g(j10, j11)) ? false : true;
    }

    private static boolean U0(IllegalStateException illegalStateException) {
        if (c0.f55769a >= 21 && V0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean V0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean W0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void Y0(MediaCrypto mediaCrypto, boolean z10) throws DecoderInitializationException {
        t1.o oVar = (t1.o) w1.a.e(this.C);
        if (this.Q == null) {
            try {
                List listW0 = w0(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.Q = arrayDeque;
                if (this.f5531t) {
                    arrayDeque.addAll(listW0);
                } else if (!listW0.isEmpty()) {
                    this.Q.add((j) listW0.get(0));
                }
                this.R = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(oVar, e10, z10, -49998);
            }
        }
        if (this.Q.isEmpty()) {
            throw new DecoderInitializationException(oVar, (Throwable) null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) w1.a.e(this.Q);
        while (this.L == null) {
            j jVar = (j) w1.a.e((j) arrayDeque2.peekFirst());
            if (!A1(jVar)) {
                return;
            }
            try {
                P0(jVar, mediaCrypto);
            } catch (Exception e11) {
                w1.n.i("MediaCodecRenderer", "Failed to initialize decoder: " + jVar, e11);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(oVar, e11, z10, jVar);
                Z0(decoderInitializationException);
                if (this.R == null) {
                    this.R = decoderInitializationException;
                } else {
                    this.R = this.R.c(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.R;
                }
            }
        }
        this.Q = null;
    }

    private void a0() throws ExoPlaybackException {
        w1.a.g(!this.f5540x0);
        f1 f1VarF = F();
        this.f5539x.b();
        do {
            this.f5539x.b();
            int iW = W(f1VarF, this.f5539x, 0);
            if (iW == -5) {
                c1(f1VarF);
                return;
            }
            if (iW == -4) {
                if (!this.f5539x.e()) {
                    this.f5536v0 = Math.max(this.f5536v0, this.f5539x.f4866f);
                    if (hasReadStreamToEnd() || this.f5537w.h()) {
                        this.f5538w0 = this.f5536v0;
                    }
                    if (this.f5544z0) {
                        t1.o oVar = (t1.o) w1.a.e(this.C);
                        this.D = oVar;
                        if (Objects.equals(oVar.f52757n, MimeTypes.AUDIO_OPUS) && !this.D.f52760q.isEmpty()) {
                            this.D = ((t1.o) w1.a.e(this.D)).a().V(h0.f((byte[]) this.D.f52760q.get(0))).K();
                        }
                        d1(this.D, null);
                        this.f5544z0 = false;
                    }
                    this.f5539x.l();
                    t1.o oVar2 = this.D;
                    if (oVar2 != null && Objects.equals(oVar2.f52757n, MimeTypes.AUDIO_OPUS)) {
                        if (this.f5539x.d()) {
                            DecoderInputBuffer decoderInputBuffer = this.f5539x;
                            decoderInputBuffer.f4862b = this.D;
                            L0(decoderInputBuffer);
                        }
                        if (h0.g(H(), this.f5539x.f4866f)) {
                            this.B.a(this.f5539x, ((t1.o) w1.a.e(this.D)).f52760q);
                        }
                    }
                    if (!N0()) {
                        break;
                    }
                } else {
                    this.f5540x0 = true;
                    this.f5538w0 = this.f5536v0;
                    return;
                }
            } else {
                if (iW != -3) {
                    throw new IllegalStateException();
                }
                if (hasReadStreamToEnd()) {
                    this.f5538w0 = this.f5536v0;
                    return;
                }
                return;
            }
        } while (this.f5541y.p(this.f5539x));
        this.f5522m0 = true;
    }

    private boolean b0(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        w1.a.g(!this.f5542y0);
        if (this.f5541y.u()) {
            f fVar = this.f5541y;
            z10 = false;
            if (!k1(j10, j11, null, fVar.f4864d, this.f5517h0, 0, fVar.t(), this.f5541y.r(), T0(H(), this.f5541y.s()), this.f5541y.e(), (t1.o) w1.a.e(this.D))) {
                return false;
            }
            f1(this.f5541y.s());
            this.f5541y.b();
        } else {
            z10 = false;
        }
        if (this.f5540x0) {
            this.f5542y0 = true;
            return z10;
        }
        if (this.f5522m0) {
            w1.a.g(this.f5541y.p(this.f5539x));
            this.f5522m0 = z10;
        }
        if (this.f5523n0) {
            if (this.f5541y.u()) {
                return true;
            }
            m0();
            this.f5523n0 = z10;
            X0();
            if (!this.f5521l0) {
                return z10;
            }
        }
        a0();
        if (this.f5541y.u()) {
            this.f5541y.l();
        }
        if (this.f5541y.u() || this.f5540x0 || this.f5523n0) {
            return true;
        }
        return z10;
    }

    private int d0(String str) {
        int i10 = c0.f55769a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = c0.f55772d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = c0.f55770b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean e0(String str, t1.o oVar) {
        return c0.f55769a < 21 && oVar.f52760q.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean f0(String str) {
        if (c0.f55769a >= 21 || !"OMX.SEC.mp3.dec".equals(str) || !"samsung".equals(c0.f55771c)) {
            return false;
        }
        String str2 = c0.f55770b;
        return str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01");
    }

    private static boolean g0(String str) {
        int i10 = c0.f55769a;
        if (i10 <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i10 != 19) {
            return false;
        }
        String str2 = c0.f55770b;
        if ("hb2000".equals(str2) || "stvm8".equals(str2)) {
            return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
        }
        return false;
    }

    private static boolean h0(String str) {
        return c0.f55769a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean i0(j jVar) {
        String str = jVar.f5617a;
        int i10 = c0.f55769a;
        if (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i10 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(c0.f55771c) && "AFTS".equals(c0.f55772d) && jVar.f5623g;
        }
        return true;
    }

    private static boolean j0(String str) {
        if (c0.f55769a == 19 && c0.f55772d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    private void j1() throws ExoPlaybackException {
        int i10 = this.f5528r0;
        if (i10 == 1) {
            t0();
            return;
        }
        if (i10 == 2) {
            t0();
            G1();
        } else if (i10 == 3) {
            n1();
        } else {
            this.f5542y0 = true;
            p1();
        }
    }

    private static boolean k0(String str) {
        return c0.f55769a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void l1() {
        this.f5534u0 = true;
        MediaFormat mediaFormatC = ((h) w1.a.e(this.L)).c();
        if (this.T != 0 && mediaFormatC.getInteger("width") == 32 && mediaFormatC.getInteger("height") == 32) {
            this.f5512c0 = true;
            return;
        }
        if (this.f5510a0) {
            mediaFormatC.setInteger("channel-count", 1);
        }
        this.N = mediaFormatC;
        this.O = true;
    }

    private void m0() {
        this.f5523n0 = false;
        this.f5541y.b();
        this.f5539x.b();
        this.f5522m0 = false;
        this.f5521l0 = false;
        this.B.d();
    }

    private boolean m1(int i10) throws ExoPlaybackException {
        f1 f1VarF = F();
        this.f5535v.b();
        int iW = W(f1VarF, this.f5535v, i10 | 4);
        if (iW == -5) {
            c1(f1VarF);
            return true;
        }
        if (iW != -4 || !this.f5535v.e()) {
            return false;
        }
        this.f5540x0 = true;
        j1();
        return false;
    }

    private boolean n0() {
        if (this.f5530s0) {
            this.f5526q0 = 1;
            if (this.V || this.X) {
                this.f5528r0 = 3;
                return false;
            }
            this.f5528r0 = 1;
        }
        return true;
    }

    private void n1() throws ExoPlaybackException {
        o1();
        X0();
    }

    private void o0() throws ExoPlaybackException {
        if (!this.f5530s0) {
            n1();
        } else {
            this.f5526q0 = 1;
            this.f5528r0 = 3;
        }
    }

    private boolean p0() throws ExoPlaybackException {
        if (this.f5530s0) {
            this.f5526q0 = 1;
            if (this.V || this.X) {
                this.f5528r0 = 3;
                return false;
            }
            this.f5528r0 = 2;
        } else {
            G1();
        }
        return true;
    }

    private boolean q0(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        boolean zK1;
        int i10;
        h hVar = (h) w1.a.e(this.L);
        if (!M0()) {
            if (this.Y && this.f5532t0) {
                try {
                    i10 = hVar.i(this.f5543z);
                } catch (IllegalStateException unused) {
                    j1();
                    if (this.f5542y0) {
                        o1();
                    }
                    return false;
                }
            } else {
                i10 = hVar.i(this.f5543z);
            }
            if (i10 < 0) {
                if (i10 == -2) {
                    l1();
                    return true;
                }
                if (this.f5513d0 && (this.f5540x0 || this.f5526q0 == 2)) {
                    j1();
                }
                return false;
            }
            if (this.f5512c0) {
                this.f5512c0 = false;
                hVar.k(i10, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f5543z;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                j1();
                return false;
            }
            this.f5517h0 = i10;
            ByteBuffer byteBufferL = hVar.l(i10);
            this.f5518i0 = byteBufferL;
            if (byteBufferL != null) {
                byteBufferL.position(this.f5543z.offset);
                ByteBuffer byteBuffer = this.f5518i0;
                MediaCodec.BufferInfo bufferInfo2 = this.f5543z;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Z) {
                MediaCodec.BufferInfo bufferInfo3 = this.f5543z;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0 && this.f5536v0 != C.TIME_UNSET) {
                    bufferInfo3.presentationTimeUs = this.f5538w0;
                }
            }
            this.f5519j0 = this.f5543z.presentationTimeUs < H();
            long j12 = this.f5538w0;
            this.f5520k0 = j12 != C.TIME_UNSET && j12 <= this.f5543z.presentationTimeUs;
            H1(this.f5543z.presentationTimeUs);
        }
        if (this.Y && this.f5532t0) {
            try {
                ByteBuffer byteBuffer2 = this.f5518i0;
                int i11 = this.f5517h0;
                MediaCodec.BufferInfo bufferInfo4 = this.f5543z;
                z10 = false;
                try {
                    zK1 = k1(j10, j11, hVar, byteBuffer2, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f5519j0, this.f5520k0, (t1.o) w1.a.e(this.D));
                } catch (IllegalStateException unused2) {
                    j1();
                    if (this.f5542y0) {
                        o1();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            ByteBuffer byteBuffer3 = this.f5518i0;
            int i12 = this.f5517h0;
            MediaCodec.BufferInfo bufferInfo5 = this.f5543z;
            zK1 = k1(j10, j11, hVar, byteBuffer3, i12, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f5519j0, this.f5520k0, (t1.o) w1.a.e(this.D));
        }
        if (zK1) {
            f1(this.f5543z.presentationTimeUs);
            boolean z11 = (this.f5543z.flags & 4) != 0 ? true : z10;
            t1();
            if (!z11) {
                return true;
            }
            j1();
        }
        return z10;
    }

    private boolean r0(j jVar, t1.o oVar, DrmSession drmSession, DrmSession drmSession2) {
        b2.b bVarC;
        b2.b bVarC2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (bVarC = drmSession2.c()) != null && (bVarC2 = drmSession.c()) != null && bVarC.getClass().equals(bVarC2.getClass())) {
            if (!(bVarC instanceof e2.l)) {
                return false;
            }
            if (!drmSession2.a().equals(drmSession.a()) || c0.f55769a < 23) {
                return true;
            }
            UUID uuid = t1.e.f52667e;
            if (!uuid.equals(drmSession.a()) && !uuid.equals(drmSession2.a())) {
                return !jVar.f5623g && drmSession2.d((String) w1.a.e(oVar.f52757n));
            }
        }
        return true;
    }

    private boolean s0() throws ExoPlaybackException {
        int i10;
        if (this.L == null || (i10 = this.f5526q0) == 2 || this.f5540x0) {
            return false;
        }
        if (i10 == 0 && B1()) {
            o0();
        }
        h hVar = (h) w1.a.e(this.L);
        if (this.f5516g0 < 0) {
            int iH = hVar.h();
            this.f5516g0 = iH;
            if (iH < 0) {
                return false;
            }
            this.f5537w.f4864d = hVar.d(iH);
            this.f5537w.b();
        }
        if (this.f5526q0 == 1) {
            if (!this.f5513d0) {
                this.f5532t0 = true;
                hVar.a(this.f5516g0, 0, 0, 0L, 4);
                s1();
            }
            this.f5526q0 = 2;
            return false;
        }
        if (this.f5511b0) {
            this.f5511b0 = false;
            ByteBuffer byteBuffer = (ByteBuffer) w1.a.e(this.f5537w.f4864d);
            byte[] bArr = G0;
            byteBuffer.put(bArr);
            hVar.a(this.f5516g0, 0, bArr.length, 0L, 0);
            s1();
            this.f5530s0 = true;
            return true;
        }
        if (this.f5525p0 == 1) {
            for (int i11 = 0; i11 < ((t1.o) w1.a.e(this.M)).f52760q.size(); i11++) {
                ((ByteBuffer) w1.a.e(this.f5537w.f4864d)).put((byte[]) this.M.f52760q.get(i11));
            }
            this.f5525p0 = 2;
        }
        int iPosition = ((ByteBuffer) w1.a.e(this.f5537w.f4864d)).position();
        f1 f1VarF = F();
        try {
            int iW = W(f1VarF, this.f5537w, 0);
            if (iW == -3) {
                if (hasReadStreamToEnd()) {
                    this.f5538w0 = this.f5536v0;
                }
                return false;
            }
            if (iW == -5) {
                if (this.f5525p0 == 2) {
                    this.f5537w.b();
                    this.f5525p0 = 1;
                }
                c1(f1VarF);
                return true;
            }
            if (this.f5537w.e()) {
                this.f5538w0 = this.f5536v0;
                if (this.f5525p0 == 2) {
                    this.f5537w.b();
                    this.f5525p0 = 1;
                }
                this.f5540x0 = true;
                if (!this.f5530s0) {
                    j1();
                    return false;
                }
                try {
                    if (!this.f5513d0) {
                        this.f5532t0 = true;
                        hVar.a(this.f5516g0, 0, 0, 0L, 4);
                        s1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw B(e10, this.C, c0.T(e10.getErrorCode()));
                }
            }
            if (!this.f5530s0 && !this.f5537w.g()) {
                this.f5537w.b();
                if (this.f5525p0 == 2) {
                    this.f5525p0 = 1;
                }
                return true;
            }
            boolean zM = this.f5537w.m();
            if (zM) {
                this.f5537w.f4863c.b(iPosition);
            }
            if (this.U && !zM) {
                x1.d.b((ByteBuffer) w1.a.e(this.f5537w.f4864d));
                if (((ByteBuffer) w1.a.e(this.f5537w.f4864d)).position() == 0) {
                    return true;
                }
                this.U = false;
            }
            long j10 = this.f5537w.f4866f;
            if (this.f5544z0) {
                if (this.A.isEmpty()) {
                    this.D0.f5555d.a(j10, (t1.o) w1.a.e(this.C));
                } else {
                    ((e) this.A.peekLast()).f5555d.a(j10, (t1.o) w1.a.e(this.C));
                }
                this.f5544z0 = false;
            }
            this.f5536v0 = Math.max(this.f5536v0, j10);
            if (hasReadStreamToEnd() || this.f5537w.h()) {
                this.f5538w0 = this.f5536v0;
            }
            this.f5537w.l();
            if (this.f5537w.d()) {
                L0(this.f5537w);
            }
            h1(this.f5537w);
            int iY0 = y0(this.f5537w);
            try {
                if (zM) {
                    ((h) w1.a.e(hVar)).j(this.f5516g0, 0, this.f5537w.f4863c, j10, iY0);
                } else {
                    ((h) w1.a.e(hVar)).a(this.f5516g0, 0, ((ByteBuffer) w1.a.e(this.f5537w.f4864d)).limit(), j10, iY0);
                }
                s1();
                this.f5530s0 = true;
                this.f5525p0 = 0;
                this.C0.f5384c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw B(e11, this.C, c0.T(e11.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e12) {
            Z0(e12);
            m1(0);
            t0();
            return true;
        }
    }

    private void s1() {
        this.f5516g0 = -1;
        this.f5537w.f4864d = null;
    }

    private void t0() {
        try {
            ((h) w1.a.i(this.L)).flush();
        } finally {
            q1();
        }
    }

    private void t1() {
        this.f5517h0 = -1;
        this.f5518i0 = null;
    }

    private void u1(DrmSession drmSession) {
        DrmSession.e(this.E, drmSession);
        this.E = drmSession;
    }

    private void v1(e eVar) {
        this.D0 = eVar;
        long j10 = eVar.f5554c;
        if (j10 != C.TIME_UNSET) {
            this.F0 = true;
            e1(j10);
        }
    }

    private List w0(boolean z10) {
        t1.o oVar = (t1.o) w1.a.e(this.C);
        List listD0 = D0(this.f5529s, oVar, z10);
        if (!listD0.isEmpty() || !z10) {
            return listD0;
        }
        List listD1 = D0(this.f5529s, oVar, false);
        if (!listD1.isEmpty()) {
            w1.n.h("MediaCodecRenderer", "Drm session requires secure decoder for " + oVar.f52757n + ", but no secure decoder available. Trying to proceed with " + listD1 + ".");
        }
        return listD1;
    }

    private void y1(DrmSession drmSession) {
        DrmSession.e(this.F, drmSession);
        this.F = drmSession;
    }

    private boolean z1(long j10) {
        return this.I == C.TIME_UNSET || D().elapsedRealtime() - j10 < this.I;
    }

    protected boolean A0() {
        return false;
    }

    protected boolean A1(j jVar) {
        return true;
    }

    protected abstract float B0(float f10, t1.o oVar, t1.o[] oVarArr);

    protected boolean B1() {
        return false;
    }

    protected final MediaFormat C0() {
        return this.N;
    }

    protected boolean C1(t1.o oVar) {
        return false;
    }

    protected abstract List D0(l lVar, t1.o oVar, boolean z10);

    protected abstract int D1(l lVar, t1.o oVar);

    protected long E0(boolean z10, long j10, long j11) {
        return super.w(j10, j11);
    }

    protected long F0() {
        return this.f5538w0;
    }

    protected abstract h.a G0(j jVar, t1.o oVar, MediaCrypto mediaCrypto, float f10);

    protected final long H0() {
        return this.D0.f5554c;
    }

    protected final void H1(long j10) {
        t1.o oVar = (t1.o) this.D0.f5555d.i(j10);
        if (oVar == null && this.F0 && this.N != null) {
            oVar = (t1.o) this.D0.f5555d.h();
        }
        if (oVar != null) {
            this.D = oVar;
        } else if (!this.O || this.D == null) {
            return;
        }
        d1((t1.o) w1.a.e(this.D), this.N);
        this.O = false;
        this.F0 = false;
    }

    protected final long I0() {
        return this.D0.f5553b;
    }

    protected float J0() {
        return this.J;
    }

    protected final f2.a K0() {
        return this.G;
    }

    @Override // androidx.media3.exoplayer.h
    protected void L() {
        this.C = null;
        v1(e.f5551e);
        this.A.clear();
        v0();
    }

    protected abstract void L0(DecoderInputBuffer decoderInputBuffer);

    @Override // androidx.media3.exoplayer.h
    protected void M(boolean z10, boolean z11) {
        this.C0 = new androidx.media3.exoplayer.i();
    }

    @Override // androidx.media3.exoplayer.h
    protected void O(long j10, boolean z10) throws ExoPlaybackException {
        this.f5540x0 = false;
        this.f5542y0 = false;
        this.A0 = false;
        if (this.f5521l0) {
            this.f5541y.b();
            this.f5539x.b();
            this.f5522m0 = false;
            this.B.d();
        } else {
            u0();
        }
        if (this.D0.f5555d.k() > 0) {
            this.f5544z0 = true;
        }
        this.D0.f5555d.c();
        this.A.clear();
    }

    @Override // androidx.media3.exoplayer.h
    protected void R() {
        try {
            m0();
            o1();
        } finally {
            y1(null);
        }
    }

    protected final boolean R0() {
        return this.f5521l0;
    }

    protected final boolean S0(t1.o oVar) {
        return this.F == null && C1(oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // androidx.media3.exoplayer.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void U(t1.o[] r13, long r14, long r16, androidx.media3.exoplayer.source.r.b r18) {
        /*
            r12 = this;
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$e r13 = r12.D0
            long r0 = r13.f5554c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$e r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.v1(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.A
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L52
            long r0 = r12.f5536v0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L36
            long r4 = r12.E0
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L52
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L52
        L36:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$e r5 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$e
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.v1(r5)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$e r13 = r12.D0
            long r13 = r13.f5554c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.g1()
        L51:
            return
        L52:
            java.util.ArrayDeque r13 = r12.A
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$e r5 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$e
            long r6 = r12.f5536v0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.U(t1.o[], long, long, androidx.media3.exoplayer.source.r$b):void");
    }

    protected final void X0() throws ExoPlaybackException {
        t1.o oVar;
        if (this.L != null || this.f5521l0 || (oVar = this.C) == null) {
            return;
        }
        if (S0(oVar)) {
            O0(oVar);
            return;
        }
        u1(this.F);
        if (this.E == null || Q0()) {
            try {
                DrmSession drmSession = this.E;
                Y0(this.H, drmSession != null && drmSession.d((String) w1.a.i(oVar.f52757n)));
            } catch (DecoderInitializationException e10) {
                throw B(e10, oVar, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.H;
        if (mediaCrypto == null || this.L != null) {
            return;
        }
        mediaCrypto.release();
        this.H = null;
    }

    protected abstract void Z0(Exception exc);

    @Override // androidx.media3.exoplayer.g2
    public final int a(t1.o oVar) throws ExoPlaybackException {
        try {
            return D1(this.f5529s, oVar);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw B(e10, oVar, 4002);
        }
    }

    protected abstract void a1(String str, h.a aVar, long j10, long j11);

    protected abstract void b1(String str);

    protected abstract androidx.media3.exoplayer.j c0(j jVar, t1.o oVar, t1.o oVar2);

    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    protected androidx.media3.exoplayer.j c1(f1 f1Var) throws ExoPlaybackException {
        int i10;
        boolean z10 = true;
        this.f5544z0 = true;
        t1.o oVarK = (t1.o) w1.a.e(f1Var.f5339b);
        String str = oVarK.f52757n;
        if (str == null) {
            throw B(new IllegalArgumentException("Sample MIME type is null."), oVarK, 4005);
        }
        if (Objects.equals(str, "video/av01") && !oVarK.f52760q.isEmpty()) {
            oVarK = oVarK.a().b0(null).K();
        }
        t1.o oVar = oVarK;
        y1(f1Var.f5338a);
        this.C = oVar;
        if (this.f5521l0) {
            this.f5523n0 = true;
            return null;
        }
        h hVar = this.L;
        if (hVar == null) {
            this.Q = null;
            X0();
            return null;
        }
        j jVar = (j) w1.a.e(this.S);
        t1.o oVar2 = (t1.o) w1.a.e(this.M);
        if (r0(jVar, oVar, this.E, this.F)) {
            o0();
            return new androidx.media3.exoplayer.j(jVar.f5617a, oVar2, oVar, 0, 128);
        }
        boolean z11 = this.F != this.E;
        w1.a.g(!z11 || c0.f55769a >= 23);
        androidx.media3.exoplayer.j jVarC0 = c0(jVar, oVar2, oVar);
        int i11 = jVarC0.f5404d;
        if (i11 != 0) {
            i10 = 16;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (F1(oVar)) {
                        this.M = oVar;
                        if (z11 && !p0()) {
                            i10 = 2;
                        }
                    }
                } else if (F1(oVar)) {
                    this.f5524o0 = true;
                    this.f5525p0 = 1;
                    int i12 = this.T;
                    if (i12 != 2 && (i12 != 1 || oVar.f52763t != oVar2.f52763t || oVar.f52764u != oVar2.f52764u)) {
                        z10 = false;
                    }
                    this.f5511b0 = z10;
                    this.M = oVar;
                    if (z11 && !p0()) {
                        i10 = 2;
                    }
                }
            } else if (F1(oVar)) {
                this.M = oVar;
                if (!z11 ? !n0() : !p0()) {
                    i10 = 2;
                }
            }
            return (jVarC0.f5404d != 0 || (this.L == hVar && this.f5528r0 != 3)) ? jVarC0 : new androidx.media3.exoplayer.j(jVar.f5617a, oVar2, oVar, 0, i10);
        }
        o0();
        i10 = 0;
        if (jVarC0.f5404d != 0) {
        }
    }

    protected abstract void d1(t1.o oVar, MediaFormat mediaFormat);

    protected void f1(long j10) {
        this.E0 = j10;
        while (!this.A.isEmpty() && j10 >= ((e) this.A.peek()).f5552a) {
            v1((e) w1.a.e((e) this.A.poll()));
            g1();
        }
    }

    @Override // androidx.media3.exoplayer.h, androidx.media3.exoplayer.d2.b
    public void handleMessage(int i10, Object obj) {
        if (i10 == 11) {
            this.G = (f2.a) obj;
        } else {
            super.handleMessage(i10, obj);
        }
    }

    @Override // androidx.media3.exoplayer.f2
    public boolean isEnded() {
        return this.f5542y0;
    }

    @Override // androidx.media3.exoplayer.f2
    public boolean isReady() {
        if (this.C == null) {
            return false;
        }
        if (K() || M0()) {
            return true;
        }
        return this.f5515f0 != C.TIME_UNSET && D().elapsedRealtime() < this.f5515f0;
    }

    @Override // androidx.media3.exoplayer.f2
    public void k(float f10, float f11) throws ExoPlaybackException {
        this.J = f10;
        this.K = f11;
        F1(this.M);
    }

    protected abstract boolean k1(long j10, long j11, h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, t1.o oVar);

    protected MediaCodecDecoderException l0(Throwable th2, j jVar) {
        return new MediaCodecDecoderException(th2, jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void o1() {
        try {
            h hVar = this.L;
            if (hVar != null) {
                hVar.release();
                this.C0.f5383b++;
                b1(((j) w1.a.e(this.S)).f5617a);
            }
            this.L = null;
            try {
                MediaCrypto mediaCrypto = this.H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.H = null;
                u1(null);
                r1();
            }
        } catch (Throwable th2) {
            this.L = null;
            try {
                MediaCrypto mediaCrypto2 = this.H;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.H = null;
                u1(null);
                r1();
            }
        }
    }

    protected void q1() {
        s1();
        t1();
        this.f5515f0 = C.TIME_UNSET;
        this.f5532t0 = false;
        this.f5530s0 = false;
        this.f5511b0 = false;
        this.f5512c0 = false;
        this.f5519j0 = false;
        this.f5520k0 = false;
        this.f5536v0 = C.TIME_UNSET;
        this.f5538w0 = C.TIME_UNSET;
        this.E0 = C.TIME_UNSET;
        this.f5526q0 = 0;
        this.f5528r0 = 0;
        this.f5525p0 = this.f5524o0 ? 1 : 0;
    }

    protected void r1() {
        q1();
        this.B0 = null;
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.f5534u0 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f5510a0 = false;
        this.f5513d0 = false;
        this.f5514e0 = false;
        this.f5524o0 = false;
        this.f5525p0 = 0;
    }

    @Override // androidx.media3.exoplayer.f2
    public void render(long j10, long j11) throws ExoPlaybackException {
        boolean z10 = false;
        if (this.A0) {
            this.A0 = false;
            j1();
        }
        ExoPlaybackException exoPlaybackException = this.B0;
        if (exoPlaybackException != null) {
            this.B0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f5542y0) {
                p1();
                return;
            }
            if (this.C != null || m1(2)) {
                X0();
                if (this.f5521l0) {
                    a0.a("bypassRender");
                    while (b0(j10, j11)) {
                    }
                    a0.b();
                } else if (this.L != null) {
                    long jElapsedRealtime = D().elapsedRealtime();
                    a0.a("drainAndFeed");
                    while (q0(j10, j11) && z1(jElapsedRealtime)) {
                    }
                    while (s0() && z1(jElapsedRealtime)) {
                    }
                    a0.b();
                } else {
                    this.C0.f5385d += Y(j10);
                    m1(1);
                }
                this.C0.c();
            }
        } catch (IllegalStateException e10) {
            if (!U0(e10)) {
                throw e10;
            }
            Z0(e10);
            if (c0.f55769a >= 21 && W0(e10)) {
                z10 = true;
            }
            if (z10) {
                o1();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionL0 = l0(e10, z0());
            throw C(mediaCodecDecoderExceptionL0, this.C, z10, mediaCodecDecoderExceptionL0.f5509c == 1101 ? 4006 : 4003);
        }
    }

    @Override // androidx.media3.exoplayer.h, androidx.media3.exoplayer.g2
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    protected final boolean u0() throws ExoPlaybackException {
        boolean zV0 = v0();
        if (zV0) {
            X0();
        }
        return zV0;
    }

    protected boolean v0() {
        if (this.L == null) {
            return false;
        }
        int i10 = this.f5528r0;
        if (i10 == 3 || this.V || ((this.W && !this.f5534u0) || (this.X && this.f5532t0))) {
            o1();
            return true;
        }
        if (i10 == 2) {
            int i11 = c0.f55769a;
            w1.a.g(i11 >= 23);
            if (i11 >= 23) {
                try {
                    G1();
                } catch (ExoPlaybackException e10) {
                    w1.n.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    o1();
                    return true;
                }
            }
        }
        t0();
        return false;
    }

    @Override // androidx.media3.exoplayer.f2
    public final long w(long j10, long j11) {
        return E0(this.f5514e0, j10, j11);
    }

    protected final void w1() {
        this.A0 = true;
    }

    protected final h x0() {
        return this.L;
    }

    protected final void x1(ExoPlaybackException exoPlaybackException) {
        this.B0 = exoPlaybackException;
    }

    protected int y0(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    protected final j z0() {
        return this.S;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class DecoderInitializationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f5546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j f5547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DecoderInitializationException f5549e;

        public DecoderInitializationException(t1.o oVar, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + oVar, th2, oVar.f52757n, z10, null, b(i10), null);
        }

        private static String b(int i10) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException c(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f5545a, this.f5546b, this.f5547c, this.f5548d, decoderInitializationException);
        }

        private static String d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        public DecoderInitializationException(t1.o oVar, Throwable th2, boolean z10, j jVar) {
            this("Decoder init failed: " + jVar.f5617a + ", " + oVar, th2, oVar.f52757n, z10, jVar, c0.f55769a >= 21 ? d(th2) : null, null);
        }

        private DecoderInitializationException(String str, Throwable th2, String str2, boolean z10, j jVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.f5545a = str2;
            this.f5546b = z10;
            this.f5547c = jVar;
            this.f5548d = str3;
            this.f5549e = decoderInitializationException;
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void S() {
    }

    @Override // androidx.media3.exoplayer.h
    protected void T() {
    }

    protected void g1() {
    }

    protected void p1() {
    }

    protected void e1(long j10) {
    }

    protected void h1(DecoderInputBuffer decoderInputBuffer) {
    }

    protected void i1(t1.o oVar) {
    }
}
