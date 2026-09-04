package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ob.m0;
import ob.o0;
import ob.r0;
import ob.z;
import p9.s1;
import q9.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaCodecRenderer extends com.google.android.exoplayer2.f {
    private static final byte[] F0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final u A;
    private ExoPlaybackException A0;
    private v0 B;
    protected s9.e B0;
    private v0 C;
    private b C0;
    private DrmSession D;
    private long D0;
    private DrmSession E;
    private boolean E0;
    private MediaCrypto F;
    private boolean G;
    private long H;
    private float I;
    private float J;
    private j K;
    private v0 L;
    private MediaFormat M;
    private boolean N;
    private float O;
    private ArrayDeque P;
    private DecoderInitializationException Q;
    private k R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f17179a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f17180b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f17181c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private g f17182d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private long f17183e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f17184f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f17185g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private ByteBuffer f17186h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f17187i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f17188j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f17189k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f17190l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f17191m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f17192n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f17193o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final j.b f17194p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f17195p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final l f17196q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f17197q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f17198r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f17199r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f17200s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f17201s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DecoderInputBuffer f17202t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f17203t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final DecoderInputBuffer f17204u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private long f17205u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final DecoderInputBuffer f17206v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f17207v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final f f17208w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f17209w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ArrayList f17210x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f17211x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final MediaCodec.BufferInfo f17212y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f17213y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ArrayDeque f17214z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f17215z0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public static void a(j.a aVar, s1 s1Var) {
            LogSessionId logSessionIdA = s1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f17288b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f17221e = new b(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final m0 f17225d = new m0();

        public b(long j10, long j11, long j12) {
            this.f17222a = j10;
            this.f17223b = j11;
            this.f17224c = j12;
        }
    }

    public MediaCodecRenderer(int i10, j.b bVar, l lVar, boolean z10, float f10) {
        super(i10);
        this.f17194p = bVar;
        this.f17196q = (l) ob.a.e(lVar);
        this.f17198r = z10;
        this.f17200s = f10;
        this.f17202t = DecoderInputBuffer.p();
        this.f17204u = new DecoderInputBuffer(0);
        this.f17206v = new DecoderInputBuffer(2);
        f fVar = new f();
        this.f17208w = fVar;
        this.f17210x = new ArrayList();
        this.f17212y = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = C.TIME_UNSET;
        this.f17214z = new ArrayDeque();
        Z0(b.f17221e);
        fVar.m(0);
        fVar.f16754c.order(ByteOrder.nativeOrder());
        this.A = new u();
        this.O = -1.0f;
        this.S = 0;
        this.f17193o0 = 0;
        this.f17184f0 = -1;
        this.f17185g0 = -1;
        this.f17183e0 = C.TIME_UNSET;
        this.f17205u0 = C.TIME_UNSET;
        this.f17207v0 = C.TIME_UNSET;
        this.D0 = C.TIME_UNSET;
        this.f17195p0 = 0;
        this.f17197q0 = 0;
    }

    private static boolean A0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x004a A[SYNTHETIC] */
    private void C0(MediaCrypto mediaCrypto, boolean z10) throws DecoderInitializationException {
        DecoderInitializationException decoderInitializationException;
        DecoderInitializationException decoderInitializationException2;
        if (this.P == null) {
            try {
                List listI0 = i0(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.P = arrayDeque;
                if (this.f17198r) {
                    arrayDeque.addAll(listI0);
                } else if (!listI0.isEmpty()) {
                    this.P.add((k) listI0.get(0));
                }
                this.Q = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(this.B, e10, z10, -49998);
            }
        }
        if (this.P.isEmpty()) {
            throw new DecoderInitializationException(this.B, (Throwable) null, z10, -49999);
        }
        k kVar = (k) this.P.peekFirst();
        while (this.K == null) {
            k kVar2 = (k) this.P.peekFirst();
            if (!e1(kVar2)) {
                return;
            }
            try {
                v0(kVar2, mediaCrypto);
            } catch (Exception e11) {
                if (kVar2 != kVar) {
                    throw e11;
                }
                try {
                    ob.u.i("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    v0(kVar2, mediaCrypto);
                } catch (Exception e12) {
                    ob.u.j("MediaCodecRenderer", "Failed to initialize decoder: " + kVar2, e12);
                    this.P.removeFirst();
                    decoderInitializationException = new DecoderInitializationException(this.B, e12, z10, kVar2);
                    D0(decoderInitializationException);
                    decoderInitializationException2 = this.Q;
                    if (decoderInitializationException2 == null) {
                        this.Q = decoderInitializationException;
                    } else {
                        this.Q = decoderInitializationException2.c(decoderInitializationException);
                    }
                    if (!this.P.isEmpty()) {
                        throw this.Q;
                    }
                }
                ob.u.j("MediaCodecRenderer", "Failed to initialize decoder: " + kVar2, e12);
                this.P.removeFirst();
                decoderInitializationException = new DecoderInitializationException(this.B, e12, z10, kVar2);
                D0(decoderInitializationException);
                decoderInitializationException2 = this.Q;
                if (decoderInitializationException2 == null) {
                    this.Q = decoderInitializationException;
                } else {
                    this.Q = decoderInitializationException2.c(decoderInitializationException);
                }
                if (!this.P.isEmpty()) {
                    throw this.Q;
                }
            }
        }
        this.P = null;
    }

    private void L() throws ExoPlaybackException {
        String str;
        ob.a.g(!this.f17209w0);
        o9.p pVarU = u();
        this.f17206v.b();
        do {
            this.f17206v.b();
            int I = I(pVarU, this.f17206v, 0);
            if (I == -5) {
                G0(pVarU);
                return;
            }
            if (I != -4) {
                if (I != -3) {
                    throw new IllegalStateException();
                }
                return;
            }
            if (this.f17206v.g()) {
                this.f17209w0 = true;
                return;
            }
            if (this.f17213y0) {
                v0 v0Var = (v0) ob.a.e(this.B);
                this.C = v0Var;
                H0(v0Var, null);
                this.f17213y0 = false;
            }
            this.f17206v.n();
            v0 v0Var2 = this.B;
            if (v0Var2 != null && (str = v0Var2.f18868l) != null && str.equals(MimeTypes.AUDIO_OPUS)) {
                this.A.a(this.f17206v, this.B.f18870n);
            }
        } while (this.f17208w.r(this.f17206v));
        this.f17190l0 = true;
    }

    private boolean M(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        ob.a.g(!this.f17211x0);
        if (this.f17208w.w()) {
            f fVar = this.f17208w;
            z10 = false;
            if (!O0(j10, j11, null, fVar.f16754c, this.f17185g0, 0, fVar.v(), this.f17208w.t(), this.f17208w.f(), this.f17208w.g(), this.C)) {
                return false;
            }
            J0(this.f17208w.u());
            this.f17208w.b();
        } else {
            z10 = false;
        }
        if (this.f17209w0) {
            this.f17211x0 = true;
            return z10;
        }
        if (this.f17190l0) {
            ob.a.g(this.f17208w.r(this.f17206v));
            this.f17190l0 = z10;
        }
        if (this.f17191m0) {
            if (this.f17208w.w()) {
                return true;
            }
            Y();
            this.f17191m0 = z10;
            B0();
            if (!this.f17189k0) {
                return z10;
            }
        }
        L();
        if (this.f17208w.w()) {
            this.f17208w.n();
        }
        if (this.f17208w.w() || this.f17209w0 || this.f17191m0) {
            return true;
        }
        return z10;
    }

    private void N0() throws ExoPlaybackException {
        int i10 = this.f17197q0;
        if (i10 == 1) {
            f0();
            return;
        }
        if (i10 == 2) {
            f0();
            k1();
        } else if (i10 == 3) {
            R0();
        } else {
            this.f17211x0 = true;
            T0();
        }
    }

    private static boolean P(String str, v0 v0Var) {
        return r0.f48425a < 21 && v0Var.f18870n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private void P0() {
        this.f17203t0 = true;
        MediaFormat mediaFormatC = this.K.c();
        if (this.S != 0 && mediaFormatC.getInteger("width") == 32 && mediaFormatC.getInteger("height") == 32) {
            this.f17180b0 = true;
            return;
        }
        if (this.Z) {
            mediaFormatC.setInteger("channel-count", 1);
        }
        this.M = mediaFormatC;
        this.N = true;
    }

    private static boolean Q(String str) {
        if (r0.f48425a >= 21 || !"OMX.SEC.mp3.dec".equals(str) || !"samsung".equals(r0.f48427c)) {
            return false;
        }
        String str2 = r0.f48426b;
        return str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01");
    }

    private boolean Q0(int i10) throws ExoPlaybackException {
        o9.p pVarU = u();
        this.f17202t.b();
        int I = I(pVarU, this.f17202t, i10 | 4);
        if (I == -5) {
            G0(pVarU);
            return true;
        }
        if (I != -4 || !this.f17202t.g()) {
            return false;
        }
        this.f17209w0 = true;
        N0();
        return false;
    }

    private static boolean R(String str) {
        int i10 = r0.f48425a;
        if (i10 <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i10 > 19) {
            return false;
        }
        String str2 = r0.f48426b;
        if ("hb2000".equals(str2) || "stvm8".equals(str2)) {
            return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
        }
        return false;
    }

    private void R0() throws ExoPlaybackException {
        S0();
        B0();
    }

    private static boolean S(String str) {
        return r0.f48425a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean T(k kVar) {
        String str = kVar.f17293a;
        int i10 = r0.f48425a;
        if (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) {
            return true;
        }
        if (i10 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(r0.f48427c) && "AFTS".equals(r0.f48428d) && kVar.f17299g;
        }
        return true;
    }

    private static boolean U(String str) {
        int i10 = r0.f48425a;
        if (i10 < 18) {
            return true;
        }
        if (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (i10 == 19 && r0.f48428d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    private static boolean V(String str, v0 v0Var) {
        return r0.f48425a <= 18 && v0Var.f18881y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private static boolean W(String str) {
        return r0.f48425a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void W0() {
        this.f17184f0 = -1;
        this.f17204u.f16754c = null;
    }

    private void X0() {
        this.f17185g0 = -1;
        this.f17186h0 = null;
    }

    private void Y() {
        this.f17191m0 = false;
        this.f17208w.b();
        this.f17206v.b();
        this.f17190l0 = false;
        this.f17189k0 = false;
        this.A.d();
    }

    private void Y0(DrmSession drmSession) {
        DrmSession.g(this.D, drmSession);
        this.D = drmSession;
    }

    private boolean Z() {
        if (this.f17199r0) {
            this.f17195p0 = 1;
            if (this.U || this.W) {
                this.f17197q0 = 3;
                return false;
            }
            this.f17197q0 = 1;
        }
        return true;
    }

    private void Z0(b bVar) {
        this.C0 = bVar;
        long j10 = bVar.f17224c;
        if (j10 != C.TIME_UNSET) {
            this.E0 = true;
            I0(j10);
        }
    }

    private void a0() throws ExoPlaybackException {
        if (!this.f17199r0) {
            R0();
        } else {
            this.f17195p0 = 1;
            this.f17197q0 = 3;
        }
    }

    private boolean b0() throws ExoPlaybackException {
        if (this.f17199r0) {
            this.f17195p0 = 1;
            if (this.U || this.W) {
                this.f17197q0 = 3;
                return false;
            }
            this.f17197q0 = 2;
        } else {
            k1();
        }
        return true;
    }

    private boolean c0(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        boolean zO0;
        int i10;
        if (!t0()) {
            if (this.X && this.f17201s0) {
                try {
                    i10 = this.K.i(this.f17212y);
                } catch (IllegalStateException unused) {
                    N0();
                    if (this.f17211x0) {
                        S0();
                    }
                    return false;
                }
            } else {
                i10 = this.K.i(this.f17212y);
            }
            if (i10 < 0) {
                if (i10 == -2) {
                    P0();
                    return true;
                }
                if (this.f17181c0 && (this.f17209w0 || this.f17195p0 == 2)) {
                    N0();
                }
                return false;
            }
            if (this.f17180b0) {
                this.f17180b0 = false;
                this.K.k(i10, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f17212y;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                N0();
                return false;
            }
            this.f17185g0 = i10;
            ByteBuffer byteBufferL = this.K.l(i10);
            this.f17186h0 = byteBufferL;
            if (byteBufferL != null) {
                byteBufferL.position(this.f17212y.offset);
                ByteBuffer byteBuffer = this.f17186h0;
                MediaCodec.BufferInfo bufferInfo2 = this.f17212y;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f17212y;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.f17205u0;
                    if (j12 != C.TIME_UNSET) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            this.f17187i0 = x0(this.f17212y.presentationTimeUs);
            long j13 = this.f17207v0;
            long j14 = this.f17212y.presentationTimeUs;
            this.f17188j0 = j13 == j14;
            l1(j14);
        }
        if (this.X && this.f17201s0) {
            try {
                j jVar = this.K;
                ByteBuffer byteBuffer2 = this.f17186h0;
                int i11 = this.f17185g0;
                MediaCodec.BufferInfo bufferInfo4 = this.f17212y;
                z10 = false;
                try {
                    zO0 = O0(j10, j11, jVar, byteBuffer2, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f17187i0, this.f17188j0, this.C);
                } catch (IllegalStateException unused2) {
                    N0();
                    if (this.f17211x0) {
                        S0();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            j jVar2 = this.K;
            ByteBuffer byteBuffer3 = this.f17186h0;
            int i12 = this.f17185g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f17212y;
            zO0 = O0(j10, j11, jVar2, byteBuffer3, i12, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f17187i0, this.f17188j0, this.C);
        }
        if (zO0) {
            J0(this.f17212y.presentationTimeUs);
            boolean z11 = (this.f17212y.flags & 4) != 0 ? true : z10;
            X0();
            if (!z11) {
                return true;
            }
            N0();
        }
        return z10;
    }

    private void c1(DrmSession drmSession) {
        DrmSession.g(this.E, drmSession);
        this.E = drmSession;
    }

    private boolean d0(k kVar, v0 v0Var, DrmSession drmSession, DrmSession drmSession2) {
        s9.b bVarC;
        s9.b bVarC2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (bVarC = drmSession2.c()) != null && (bVarC2 = drmSession.c()) != null && bVarC.getClass().equals(bVarC2.getClass())) {
            if (!(bVarC instanceof t9.l)) {
                return false;
            }
            t9.l lVar = (t9.l) bVarC;
            if (!drmSession2.a().equals(drmSession.a()) || r0.f48425a < 23) {
                return true;
            }
            UUID uuid = o9.b.f48266e;
            if (!uuid.equals(drmSession.a()) && !uuid.equals(drmSession2.a())) {
                return !kVar.f17299g && (lVar.f53181c ? false : drmSession2.d(v0Var.f18868l));
            }
        }
        return true;
    }

    private boolean d1(long j10) {
        return this.H == C.TIME_UNSET || SystemClock.elapsedRealtime() - j10 < this.H;
    }

    private boolean e0() throws ExoPlaybackException {
        int i10;
        if (this.K == null || (i10 = this.f17195p0) == 2 || this.f17209w0) {
            return false;
        }
        if (i10 == 0 && f1()) {
            a0();
        }
        if (this.f17184f0 < 0) {
            int iH = this.K.h();
            this.f17184f0 = iH;
            if (iH < 0) {
                return false;
            }
            this.f17204u.f16754c = this.K.d(iH);
            this.f17204u.b();
        }
        if (this.f17195p0 == 1) {
            if (!this.f17181c0) {
                this.f17201s0 = true;
                this.K.a(this.f17184f0, 0, 0, 0L, 4);
                W0();
            }
            this.f17195p0 = 2;
            return false;
        }
        if (this.f17179a0) {
            this.f17179a0 = false;
            ByteBuffer byteBuffer = this.f17204u.f16754c;
            byte[] bArr = F0;
            byteBuffer.put(bArr);
            this.K.a(this.f17184f0, 0, bArr.length, 0L, 0);
            W0();
            this.f17199r0 = true;
            return true;
        }
        if (this.f17193o0 == 1) {
            for (int i11 = 0; i11 < this.L.f18870n.size(); i11++) {
                this.f17204u.f16754c.put((byte[]) this.L.f18870n.get(i11));
            }
            this.f17193o0 = 2;
        }
        int iPosition = this.f17204u.f16754c.position();
        o9.p pVarU = u();
        try {
            int I = I(pVarU, this.f17204u, 0);
            if (hasReadStreamToEnd() || this.f17204u.j()) {
                this.f17207v0 = this.f17205u0;
            }
            if (I == -3) {
                return false;
            }
            if (I == -5) {
                if (this.f17193o0 == 2) {
                    this.f17204u.b();
                    this.f17193o0 = 1;
                }
                G0(pVarU);
                return true;
            }
            if (this.f17204u.g()) {
                if (this.f17193o0 == 2) {
                    this.f17204u.b();
                    this.f17193o0 = 1;
                }
                this.f17209w0 = true;
                if (!this.f17199r0) {
                    N0();
                    return false;
                }
                try {
                    if (!this.f17181c0) {
                        this.f17201s0 = true;
                        this.K.a(this.f17184f0, 0, 0, 0L, 4);
                        W0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw r(e10, this.B, r0.X(e10.getErrorCode()));
                }
            }
            if (!this.f17199r0 && !this.f17204u.i()) {
                this.f17204u.b();
                if (this.f17193o0 == 2) {
                    this.f17193o0 = 1;
                }
                return true;
            }
            boolean zO = this.f17204u.o();
            if (zO) {
                this.f17204u.f16753b.b(iPosition);
            }
            if (this.T && !zO) {
                z.b(this.f17204u.f16754c);
                if (this.f17204u.f16754c.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            DecoderInputBuffer decoderInputBuffer = this.f17204u;
            long jD = decoderInputBuffer.f16756e;
            g gVar = this.f17182d0;
            if (gVar != null) {
                jD = gVar.d(this.B, decoderInputBuffer);
                this.f17205u0 = Math.max(this.f17205u0, this.f17182d0.b(this.B));
            }
            long j10 = jD;
            if (this.f17204u.f()) {
                this.f17210x.add(Long.valueOf(j10));
            }
            if (this.f17213y0) {
                if (this.f17214z.isEmpty()) {
                    this.C0.f17225d.a(j10, this.B);
                } else {
                    ((b) this.f17214z.peekLast()).f17225d.a(j10, this.B);
                }
                this.f17213y0 = false;
            }
            this.f17205u0 = Math.max(this.f17205u0, j10);
            this.f17204u.n();
            if (this.f17204u.e()) {
                s0(this.f17204u);
            }
            L0(this.f17204u);
            try {
                if (zO) {
                    this.K.m(this.f17184f0, 0, this.f17204u.f16753b, j10, 0);
                } else {
                    this.K.a(this.f17184f0, 0, this.f17204u.f16754c.limit(), j10, 0);
                }
                W0();
                this.f17199r0 = true;
                this.f17193o0 = 0;
                this.B0.f51523c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw r(e11, this.B, r0.X(e11.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e12) {
            D0(e12);
            Q0(0);
            f0();
            return true;
        }
    }

    private void f0() {
        try {
            this.K.flush();
        } finally {
            U0();
        }
    }

    private List i0(boolean z10) {
        List listO0 = o0(this.f17196q, this.B, z10);
        if (!listO0.isEmpty() || !z10) {
            return listO0;
        }
        List listO1 = o0(this.f17196q, this.B, false);
        if (!listO1.isEmpty()) {
            ob.u.i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.f18868l + ", but no secure decoder available. Trying to proceed with " + listO1 + ".");
        }
        return listO1;
    }

    protected static boolean i1(v0 v0Var) {
        int i10 = v0Var.G;
        return i10 == 0 || i10 == 2;
    }

    private boolean j1(v0 v0Var) throws ExoPlaybackException {
        if (r0.f48425a >= 23 && this.K != null && this.f17197q0 != 3 && getState() != 0) {
            float fM0 = m0(this.J, v0Var, x());
            float f10 = this.O;
            if (f10 == fM0) {
                return true;
            }
            if (fM0 == -1.0f) {
                a0();
                return false;
            }
            if (f10 == -1.0f && fM0 <= this.f17200s) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fM0);
            this.K.b(bundle);
            this.O = fM0;
        }
        return true;
    }

    private void k1() throws ExoPlaybackException {
        s9.b bVarC = this.E.c();
        if (bVarC instanceof t9.l) {
            try {
                this.F.setMediaDrmSession(((t9.l) bVarC).f53180b);
            } catch (MediaCryptoException e10) {
                throw r(e10, this.B, 6006);
            }
        }
        Y0(this.E);
        this.f17195p0 = 0;
        this.f17197q0 = 0;
    }

    private boolean t0() {
        return this.f17185g0 >= 0;
    }

    private void u0(v0 v0Var) {
        Y();
        String str = v0Var.f18868l;
        if (MimeTypes.AUDIO_AAC.equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
            this.f17208w.x(32);
        } else {
            this.f17208w.x(1);
        }
        this.f17189k0 = true;
    }

    private void v0(k kVar, MediaCrypto mediaCrypto) {
        String str = kVar.f17293a;
        int i10 = r0.f48425a;
        float fM0 = i10 < 23 ? -1.0f : m0(this.J, this.B, x());
        float f10 = fM0 > this.f17200s ? fM0 : -1.0f;
        M0(this.B);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        j.a aVarP0 = p0(kVar, this.B, mediaCrypto, f10);
        if (i10 >= 31) {
            a.a(aVarP0, w());
        }
        try {
            o0.a("createCodec:" + str);
            this.K = this.f17194p.a(aVarP0);
            o0.c();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!kVar.o(this.B)) {
                ob.u.i("MediaCodecRenderer", r0.D("Format exceeds selected codec's capabilities [%s, %s]", v0.j(this.B), str));
            }
            this.R = kVar;
            this.O = f10;
            this.L = this.B;
            this.S = O(str);
            this.T = P(str, this.L);
            this.U = U(str);
            this.V = W(str);
            this.W = R(str);
            this.X = S(str);
            this.Y = Q(str);
            this.Z = V(str, this.L);
            this.f17181c0 = T(kVar) || l0();
            if (this.K.f()) {
                this.f17192n0 = true;
                this.f17193o0 = 1;
                this.f17179a0 = this.S != 0;
            }
            if ("c2.android.mp3.decoder".equals(kVar.f17293a)) {
                this.f17182d0 = new g();
            }
            if (getState() == 2) {
                this.f17183e0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.B0.f51521a++;
            E0(str, aVarP0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th2) {
            o0.c();
            throw th2;
        }
    }

    private boolean x0(long j10) {
        int size = this.f17210x.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Long) this.f17210x.get(i10)).longValue() == j10) {
                this.f17210x.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean y0(IllegalStateException illegalStateException) {
        if (r0.f48425a >= 21 && z0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean z0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    @Override // com.google.android.exoplayer2.f
    protected void A(boolean z10, boolean z11) {
        this.B0 = new s9.e();
    }

    @Override // com.google.android.exoplayer2.f
    protected void B(long j10, boolean z10) throws ExoPlaybackException {
        this.f17209w0 = false;
        this.f17211x0 = false;
        this.f17215z0 = false;
        if (this.f17189k0) {
            this.f17208w.b();
            this.f17206v.b();
            this.f17190l0 = false;
            this.A.d();
        } else {
            g0();
        }
        if (this.C0.f17225d.l() > 0) {
            this.f17213y0 = true;
        }
        this.C0.f17225d.c();
        this.f17214z.clear();
    }

    protected final void B0() throws ExoPlaybackException {
        v0 v0Var;
        if (this.K != null || this.f17189k0 || (v0Var = this.B) == null) {
            return;
        }
        if (w0(v0Var)) {
            u0(this.B);
            return;
        }
        Y0(this.E);
        String str = this.B.f18868l;
        DrmSession drmSession = this.D;
        if (drmSession != null) {
            s9.b bVarC = drmSession.c();
            if (this.F == null) {
                if (bVarC == null) {
                    if (this.D.getError() == null) {
                        return;
                    }
                } else if (bVarC instanceof t9.l) {
                    t9.l lVar = (t9.l) bVarC;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(lVar.f53179a, lVar.f53180b);
                        this.F = mediaCrypto;
                        this.G = !lVar.f53181c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw r(e10, this.B, 6006);
                    }
                }
            }
            if (t9.l.f53178d && (bVarC instanceof t9.l)) {
                int state = this.D.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) ob.a.e(this.D.getError());
                    throw r(drmSessionException, this.B, drmSessionException.f16837a);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            C0(this.F, this.G);
        } catch (DecoderInitializationException e11) {
            throw r(e11, this.B, 4001);
        }
    }

    protected abstract void D0(Exception exc);

    @Override // com.google.android.exoplayer2.f
    protected void E() {
        try {
            Y();
            S0();
        } finally {
            c1(null);
        }
    }

    protected abstract void E0(String str, j.a aVar, long j10, long j11);

    @Override // com.google.android.exoplayer2.f
    protected void F() {
    }

    protected abstract void F0(String str);

    @Override // com.google.android.exoplayer2.f
    protected void G() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    protected s9.g G0(o9.p pVar) throws ExoPlaybackException {
        int i10;
        boolean z10 = true;
        this.f17213y0 = true;
        v0 v0Var = (v0) ob.a.e(pVar.f48303b);
        if (v0Var.f18868l == null) {
            throw r(new IllegalArgumentException(), v0Var, 4005);
        }
        c1(pVar.f48302a);
        this.B = v0Var;
        if (this.f17189k0) {
            this.f17191m0 = true;
            return null;
        }
        j jVar = this.K;
        if (jVar == null) {
            this.P = null;
            B0();
            return null;
        }
        k kVar = this.R;
        v0 v0Var2 = this.L;
        if (d0(kVar, v0Var, this.D, this.E)) {
            a0();
            return new s9.g(kVar.f17293a, v0Var2, v0Var, 0, 128);
        }
        boolean z11 = this.E != this.D;
        ob.a.g(!z11 || r0.f48425a >= 23);
        s9.g gVarN = N(kVar, v0Var2, v0Var);
        int i11 = gVarN.f51538d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (j1(v0Var)) {
                        this.L = v0Var;
                        if (z11 && !b0()) {
                            i10 = 2;
                        }
                    } else {
                        i10 = 16;
                    }
                } else if (j1(v0Var)) {
                    this.f17192n0 = true;
                    this.f17193o0 = 1;
                    int i12 = this.S;
                    if (i12 != 2 && (i12 != 1 || v0Var.f18873q != v0Var2.f18873q || v0Var.f18874r != v0Var2.f18874r)) {
                        z10 = false;
                    }
                    this.f17179a0 = z10;
                    this.L = v0Var;
                    if (z11 && !b0()) {
                        i10 = 2;
                    }
                } else {
                    i10 = 16;
                }
            } else if (j1(v0Var)) {
                this.L = v0Var;
                if (!z11 ? !Z() : !b0()) {
                    i10 = 2;
                }
            } else {
                i10 = 16;
            }
            return (gVarN.f51538d != 0 || (this.K == jVar && this.f17197q0 != 3)) ? gVarN : new s9.g(kVar.f17293a, v0Var2, v0Var, 0, i10);
        }
        a0();
        i10 = 0;
        if (gVarN.f51538d != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // com.google.android.exoplayer2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void H(com.google.android.exoplayer2.v0[] r13, long r14, long r16) {
        /*
            r12 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r13 = r12.C0
            long r0 = r13.f17224c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r4 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.Z0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.f17214z
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L52
            long r0 = r12.f17205u0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L36
            long r4 = r12.D0
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L52
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L52
        L36:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r5 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.Z0(r5)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r13 = r12.C0
            long r13 = r13.f17224c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.K0()
        L51:
            return
        L52:
            java.util.ArrayDeque r13 = r12.f17214z
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r5 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            long r6 = r12.f17205u0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.H(com.google.android.exoplayer2.v0[], long, long):void");
    }

    protected abstract void H0(v0 v0Var, MediaFormat mediaFormat);

    protected void I0(long j10) {
    }

    protected void J0(long j10) {
        this.D0 = j10;
        while (!this.f17214z.isEmpty() && j10 >= ((b) this.f17214z.peek()).f17222a) {
            Z0((b) this.f17214z.poll());
            K0();
        }
    }

    protected void K0() {
    }

    protected abstract void L0(DecoderInputBuffer decoderInputBuffer);

    protected void M0(v0 v0Var) {
    }

    protected abstract s9.g N(k kVar, v0 v0Var, v0 v0Var2);

    protected abstract boolean O0(long j10, long j11, j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, v0 v0Var);

    /* JADX WARN: Multi-variable type inference failed */
    protected void S0() {
        try {
            j jVar = this.K;
            if (jVar != null) {
                jVar.release();
                this.B0.f51522b++;
                F0(this.R.f17293a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.F = null;
                Y0(null);
                V0();
            }
        } catch (Throwable th2) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.F = null;
                Y0(null);
                V0();
            }
        }
    }

    protected void T0() {
    }

    protected void U0() {
        W0();
        X0();
        this.f17183e0 = C.TIME_UNSET;
        this.f17201s0 = false;
        this.f17199r0 = false;
        this.f17179a0 = false;
        this.f17180b0 = false;
        this.f17187i0 = false;
        this.f17188j0 = false;
        this.f17210x.clear();
        this.f17205u0 = C.TIME_UNSET;
        this.f17207v0 = C.TIME_UNSET;
        this.D0 = C.TIME_UNSET;
        g gVar = this.f17182d0;
        if (gVar != null) {
            gVar.c();
        }
        this.f17195p0 = 0;
        this.f17197q0 = 0;
        this.f17193o0 = this.f17192n0 ? 1 : 0;
    }

    protected void V0() {
        U0();
        this.A0 = null;
        this.f17182d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f17203t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f17181c0 = false;
        this.f17192n0 = false;
        this.f17193o0 = 0;
        this.G = false;
    }

    protected MediaCodecDecoderException X(Throwable th2, k kVar) {
        return new MediaCodecDecoderException(th2, kVar);
    }

    @Override // com.google.android.exoplayer2.c2
    public final int a(v0 v0Var) throws ExoPlaybackException {
        try {
            return h1(this.f17196q, v0Var);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw r(e10, v0Var, 4002);
        }
    }

    protected final void a1() {
        this.f17215z0 = true;
    }

    protected final void b1(ExoPlaybackException exoPlaybackException) {
        this.A0 = exoPlaybackException;
    }

    protected boolean e1(k kVar) {
        return true;
    }

    protected boolean f1() {
        return false;
    }

    protected final boolean g0() throws ExoPlaybackException {
        boolean zH0 = h0();
        if (zH0) {
            B0();
        }
        return zH0;
    }

    protected boolean g1(v0 v0Var) {
        return false;
    }

    protected boolean h0() {
        if (this.K == null) {
            return false;
        }
        int i10 = this.f17197q0;
        if (i10 == 3 || this.U || ((this.V && !this.f17203t0) || (this.W && this.f17201s0))) {
            S0();
            return true;
        }
        if (i10 == 2) {
            int i11 = r0.f48425a;
            ob.a.g(i11 >= 23);
            if (i11 >= 23) {
                try {
                    k1();
                } catch (ExoPlaybackException e10) {
                    ob.u.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    S0();
                    return true;
                }
            }
        }
        f0();
        return false;
    }

    protected abstract int h1(l lVar, v0 v0Var);

    @Override // com.google.android.exoplayer2.b2
    public boolean isEnded() {
        return this.f17211x0;
    }

    @Override // com.google.android.exoplayer2.b2
    public boolean isReady() {
        if (this.B == null) {
            return false;
        }
        if (y() || t0()) {
            return true;
        }
        return this.f17183e0 != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.f17183e0;
    }

    protected final j j0() {
        return this.K;
    }

    @Override // com.google.android.exoplayer2.b2
    public void k(float f10, float f11) throws ExoPlaybackException {
        this.I = f10;
        this.J = f11;
        j1(this.L);
    }

    protected final k k0() {
        return this.R;
    }

    protected boolean l0() {
        return false;
    }

    protected final void l1(long j10) {
        v0 v0Var = (v0) this.C0.f17225d.j(j10);
        if (v0Var == null && this.E0 && this.M != null) {
            v0Var = (v0) this.C0.f17225d.i();
        }
        if (v0Var != null) {
            this.C = v0Var;
        } else if (!this.N || this.C == null) {
            return;
        }
        H0(this.C, this.M);
        this.N = false;
        this.E0 = false;
    }

    protected abstract float m0(float f10, v0 v0Var, v0[] v0VarArr);

    protected final MediaFormat n0() {
        return this.M;
    }

    protected abstract List o0(l lVar, v0 v0Var, boolean z10);

    protected abstract j.a p0(k kVar, v0 v0Var, MediaCrypto mediaCrypto, float f10);

    protected final long q0() {
        return this.C0.f17224c;
    }

    protected float r0() {
        return this.I;
    }

    @Override // com.google.android.exoplayer2.b2
    public void render(long j10, long j11) throws ExoPlaybackException {
        boolean z10 = false;
        if (this.f17215z0) {
            this.f17215z0 = false;
            N0();
        }
        ExoPlaybackException exoPlaybackException = this.A0;
        if (exoPlaybackException != null) {
            this.A0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f17211x0) {
                T0();
                return;
            }
            if (this.B != null || Q0(2)) {
                B0();
                if (this.f17189k0) {
                    o0.a("bypassRender");
                    while (M(j10, j11)) {
                    }
                    o0.c();
                } else if (this.K != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    o0.a("drainAndFeed");
                    while (c0(j10, j11) && d1(jElapsedRealtime)) {
                    }
                    while (e0() && d1(jElapsedRealtime)) {
                    }
                    o0.c();
                } else {
                    this.B0.f51524d += K(j10);
                    Q0(1);
                }
                this.B0.c();
            }
        } catch (IllegalStateException e10) {
            if (!y0(e10)) {
                throw e10;
            }
            D0(e10);
            if (r0.f48425a >= 21 && A0(e10)) {
                z10 = true;
            }
            if (z10) {
                S0();
            }
            throw s(X(e10, k0()), this.B, z10, 4003);
        }
    }

    protected void s0(DecoderInputBuffer decoderInputBuffer) {
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.c2
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    protected final boolean w0(v0 v0Var) {
        return this.E == null && g1(v0Var);
    }

    @Override // com.google.android.exoplayer2.f
    protected void z() {
        this.B = null;
        Z0(b.f17221e);
        this.f17214z.clear();
        h0();
    }

    private int O(String str) {
        int i10 = r0.f48425a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = r0.f48428d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith(QGbBllacZSmHKn.bWsr)) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = r0.f48426b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class DecoderInitializationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f17217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f17218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f17219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DecoderInitializationException f17220e;

        public DecoderInitializationException(v0 v0Var, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + v0Var, th2, v0Var.f18868l, z10, null, b(i10), null);
        }

        private static String b(int i10) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException c(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f17216a, this.f17217b, this.f17218c, this.f17219d, decoderInitializationException);
        }

        private static String d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        public DecoderInitializationException(v0 v0Var, Throwable th2, boolean z10, k kVar) {
            this("Decoder init failed: " + kVar.f17293a + ", " + v0Var, th2, v0Var.f18868l, z10, kVar, r0.f48425a >= 21 ? d(th2) : null, null);
        }

        private DecoderInitializationException(String str, Throwable th2, String str2, boolean z10, k kVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.f17216a = str2;
            this.f17217b = z10;
            this.f17218c = kVar;
            this.f17219d = str3;
            this.f17220e = decoderInitializationException;
        }
    }
}
