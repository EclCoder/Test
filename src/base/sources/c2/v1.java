package c2;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements c2.b, w1.a {
    private boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1 f9443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PlaybackSession f9444c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f9451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9452k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PlaybackException f9455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f9456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f9457p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f9458q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private t1.o f9459r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private t1.o f9460s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private t1.o f9461t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f9462u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f9463v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f9464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f9465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f9466y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f9467z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t1.a0.c f9446e = new t1.a0.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t1.a0.b f9447f = new t1.a0.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f9449h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f9448g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f9445d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f9453l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9454m = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9469b;

        public a(int i10, int i11) {
            this.f9468a = i10;
            this.f9469b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t1.o f9470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f9472c;

        public b(t1.o oVar, int i10, String str) {
            this.f9470a = oVar;
            this.f9471b = i10;
            this.f9472c = str;
        }
    }

    private v1(Context context, PlaybackSession playbackSession) {
        this.f9442a = context.getApplicationContext();
        this.f9444c = playbackSession;
        n1 n1Var = new n1();
        this.f9443b = n1Var;
        n1Var.c(this);
    }

    private static int A0(Context context) {
        switch (w1.s.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int B0(t1.r rVar) {
        t1.r.h hVar = rVar.f52818b;
        if (hVar == null) {
            return 0;
        }
        int iQ0 = w1.c0.q0(hVar.f52910a, hVar.f52911b);
        if (iQ0 == 0) {
            return 3;
        }
        if (iQ0 != 1) {
            return iQ0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int C0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void D0(c2.b.C0124b c0124b) {
        for (int i10 = 0; i10 < c0124b.d(); i10++) {
            int iB = c0124b.b(i10);
            c2.b.a aVarC = c0124b.c(iB);
            if (iB == 0) {
                this.f9443b.f(aVarC);
            } else if (iB == 11) {
                this.f9443b.d(aVarC, this.f9452k);
            } else {
                this.f9443b.g(aVarC);
            }
        }
    }

    private void E0(long j10) {
        int iA0 = A0(this.f9442a);
        if (iA0 != this.f9454m) {
            this.f9454m = iA0;
            this.f9444c.reportNetworkEvent(p1.a().setNetworkType(iA0).setTimeSinceCreatedMillis(j10 - this.f9445d).build());
        }
    }

    private void F0(long j10) {
        PlaybackException playbackException = this.f9455n;
        if (playbackException == null) {
            return;
        }
        a aVarX0 = x0(playbackException, this.f9442a, this.f9463v == 4);
        this.f9444c.reportPlaybackErrorEvent(r1.a().setTimeSinceCreatedMillis(j10 - this.f9445d).setErrorCode(aVarX0.f9468a).setSubErrorCode(aVarX0.f9469b).setException(playbackException).build());
        this.A = true;
        this.f9455n = null;
    }

    private void G0(t1.x xVar, c2.b.C0124b c0124b, long j10) {
        if (xVar.getPlaybackState() != 2) {
            this.f9462u = false;
        }
        if (xVar.d() == null) {
            this.f9464w = false;
        } else if (c0124b.a(10)) {
            this.f9464w = true;
        }
        int iO0 = O0(xVar);
        if (this.f9453l != iO0) {
            this.f9453l = iO0;
            this.A = true;
            this.f9444c.reportPlaybackStateEvent(s1.a().setState(this.f9453l).setTimeSinceCreatedMillis(j10 - this.f9445d).build());
        }
    }

    private void H0(t1.x xVar, c2.b.C0124b c0124b, long j10) {
        if (c0124b.a(2)) {
            t1.d0 d0VarE = xVar.e();
            boolean zB = d0VarE.b(2);
            boolean zB2 = d0VarE.b(1);
            boolean zB3 = d0VarE.b(3);
            if (zB || zB2 || zB3) {
                if (!zB) {
                    M0(j10, null, 0);
                }
                if (!zB2) {
                    I0(j10, null, 0);
                }
                if (!zB3) {
                    K0(j10, null, 0);
                }
            }
        }
        if (r0(this.f9456o)) {
            b bVar = this.f9456o;
            t1.o oVar = bVar.f9470a;
            if (oVar.f52764u != -1) {
                M0(j10, oVar, bVar.f9471b);
                this.f9456o = null;
            }
        }
        if (r0(this.f9457p)) {
            b bVar2 = this.f9457p;
            I0(j10, bVar2.f9470a, bVar2.f9471b);
            this.f9457p = null;
        }
        if (r0(this.f9458q)) {
            b bVar3 = this.f9458q;
            K0(j10, bVar3.f9470a, bVar3.f9471b);
            this.f9458q = null;
        }
    }

    private void I0(long j10, t1.o oVar, int i10) {
        if (w1.c0.c(this.f9460s, oVar)) {
            return;
        }
        if (this.f9460s == null && i10 == 0) {
            i10 = 1;
        }
        this.f9460s = oVar;
        N0(0, j10, oVar, i10);
    }

    private void J0(t1.x xVar, c2.b.C0124b c0124b) {
        t1.k kVarV0;
        if (c0124b.a(0)) {
            c2.b.a aVarC = c0124b.c(0);
            if (this.f9451j != null) {
                L0(aVarC.f9282b, aVarC.f9284d);
            }
        }
        if (c0124b.a(2) && this.f9451j != null && (kVarV0 = v0(xVar.e().a())) != null) {
            t1.a(w1.c0.h(this.f9451j)).setDrmType(w0(kVarV0));
        }
        if (c0124b.a(TTAdConstant.IMAGE_MODE_1011)) {
            this.f9467z++;
        }
    }

    private void K0(long j10, t1.o oVar, int i10) {
        if (w1.c0.c(this.f9461t, oVar)) {
            return;
        }
        if (this.f9461t == null && i10 == 0) {
            i10 = 1;
        }
        this.f9461t = oVar;
        N0(2, j10, oVar, i10);
    }

    private void L0(t1.a0 a0Var, androidx.media3.exoplayer.source.r.b bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.f9451j;
        if (bVar == null || (iB = a0Var.b(bVar.f6055a)) == -1) {
            return;
        }
        a0Var.f(iB, this.f9447f);
        a0Var.n(this.f9447f.f52521c, this.f9446e);
        builder.setStreamType(B0(this.f9446e.f52538c));
        t1.a0.c cVar = this.f9446e;
        if (cVar.f52548m != C.TIME_UNSET && !cVar.f52546k && !cVar.f52544i && !cVar.f()) {
            builder.setMediaDurationMillis(this.f9446e.d());
        }
        builder.setPlaybackType(this.f9446e.f() ? 2 : 1);
        this.A = true;
    }

    private void M0(long j10, t1.o oVar, int i10) {
        if (w1.c0.c(this.f9459r, oVar)) {
            return;
        }
        if (this.f9459r == null && i10 == 0) {
            i10 = 1;
        }
        this.f9459r = oVar;
        N0(1, j10, oVar, i10);
    }

    private void N0(int i10, long j10, t1.o oVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = o1.a(i10).setTimeSinceCreatedMillis(j10 - this.f9445d);
        if (oVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(C0(i11));
            String str = oVar.f52756m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = oVar.f52757n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = oVar.f52753j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = oVar.f52752i;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = oVar.f52763t;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = oVar.f52764u;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = oVar.B;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = oVar.C;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = oVar.f52747d;
            if (str4 != null) {
                Pair pairY0 = y0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairY0.first);
                Object obj = pairY0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = oVar.f52765v;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f9444c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int O0(t1.x xVar) {
        int playbackState = xVar.getPlaybackState();
        if (this.f9462u) {
            return 5;
        }
        if (this.f9464w) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i10 = this.f9453l;
            if (i10 == 0 || i10 == 2 || i10 == 12) {
                return 2;
            }
            if (xVar.getPlayWhenReady()) {
                return xVar.h() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (xVar.getPlayWhenReady()) {
                return xVar.h() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.f9453l == 0) {
            return this.f9453l;
        }
        return 12;
    }

    private boolean r0(b bVar) {
        return bVar != null && bVar.f9472c.equals(this.f9443b.a());
    }

    public static v1 s0(Context context) {
        MediaMetricsManager mediaMetricsManagerA = u1.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new v1(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private void t0() {
        PlaybackMetrics.Builder builder = this.f9451j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f9467z);
            this.f9451j.setVideoFramesDropped(this.f9465x);
            this.f9451j.setVideoFramesPlayed(this.f9466y);
            Long l10 = (Long) this.f9448g.get(this.f9450i);
            this.f9451j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f9449h.get(this.f9450i);
            this.f9451j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f9451j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f9444c.reportPlaybackMetrics(this.f9451j.build());
        }
        this.f9451j = null;
        this.f9450i = null;
        this.f9467z = 0;
        this.f9465x = 0;
        this.f9466y = 0;
        this.f9459r = null;
        this.f9460s = null;
        this.f9461t = null;
        this.A = false;
    }

    private static int u0(int i10) {
        switch (w1.c0.T(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static t1.k v0(com.google.common.collect.c0 c0Var) {
        t1.k kVar;
        com.google.common.collect.p1 it = c0Var.iterator();
        while (it.hasNext()) {
            t1.d0.a aVar = (t1.d0.a) it.next();
            for (int i10 = 0; i10 < aVar.f52658a; i10++) {
                if (aVar.e(i10) && (kVar = aVar.b(i10).f52761r) != null) {
                    return kVar;
                }
            }
        }
        return null;
    }

    private static int w0(t1.k kVar) {
        for (int i10 = 0; i10 < kVar.f52715d; i10++) {
            UUID uuid = kVar.c(i10).f52717b;
            if (uuid.equals(t1.e.f52666d)) {
                return 3;
            }
            if (uuid.equals(t1.e.f52667e)) {
                return 2;
            }
            if (uuid.equals(t1.e.f52665c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a x0(PlaybackException playbackException, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (playbackException.f4619a == 1001) {
            return new a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z11 = exoPlaybackException.f4878j == 1;
            i10 = exoPlaybackException.f4882n;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) w1.a.e(playbackException.getCause());
        if (!(th2 instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new a(13, w1.c0.U(((MediaCodecRenderer.DecoderInitializationException) th2).f5548d));
            }
            if (th2 instanceof MediaCodecDecoderException) {
                return new a(14, ((MediaCodecDecoderException) th2).f5509c);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof AudioSink.InitializationException) {
                return new a(17, ((AudioSink.InitializationException) th2).f4893a);
            }
            if (th2 instanceof AudioSink.WriteException) {
                return new a(18, ((AudioSink.WriteException) th2).f4898a);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(u0(errorCode), errorCode);
        }
        if (th2 instanceof HttpDataSource$InvalidResponseCodeException) {
            return new a(5, ((HttpDataSource$InvalidResponseCodeException) th2).f4712d);
        }
        if ((th2 instanceof HttpDataSource$InvalidContentTypeException) || (th2 instanceof ParserException)) {
            return new a(z10 ? 10 : 11, 0);
        }
        boolean z12 = th2 instanceof HttpDataSource$HttpDataSourceException;
        if (z12 || (th2 instanceof UdpDataSource.UdpDataSourceException)) {
            if (w1.s.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            if (cause instanceof UnknownHostException) {
                return new a(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new a(7, 0);
            }
            return (z12 && ((HttpDataSource$HttpDataSourceException) th2).f4710c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (playbackException.f4619a == 1002) {
            return new a(21, 0);
        }
        if (!(th2 instanceof DrmSession.DrmSessionException)) {
            if (!(th2 instanceof FileDataSource.FileDataSourceException) || !(th2.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) w1.a.e(th2.getCause())).getCause();
            return (w1.c0.f55769a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th3 = (Throwable) w1.a.e(th2.getCause());
        int i11 = w1.c0.f55769a;
        if (i11 >= 21 && (th3 instanceof MediaDrm.MediaDrmStateException)) {
            int iU = w1.c0.U(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
            return new a(u0(iU), iU);
        }
        if (i11 >= 23 && (th3 instanceof MediaDrmResetException)) {
            return new a(27, 0);
        }
        if (th3 instanceof NotProvisionedException) {
            return new a(24, 0);
        }
        if (th3 instanceof DeniedByServerException) {
            return new a(29, 0);
        }
        if (th3 instanceof UnsupportedDrmException) {
            return new a(23, 0);
        }
        return th3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0);
    }

    private static Pair y0(String str) {
        String[] strArrU0 = w1.c0.U0(str, "-");
        return Pair.create(strArrU0[0], strArrU0.length >= 2 ? strArrU0[1] : null);
    }

    @Override // c2.w1.a
    public void O(c2.b.a aVar, String str, boolean z10) {
        androidx.media3.exoplayer.source.r.b bVar = aVar.f9284d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f9450i)) {
            t0();
        }
        this.f9448g.remove(str);
        this.f9449h.remove(str);
    }

    @Override // c2.b
    public void Q(c2.b.a aVar, PlaybackException playbackException) {
        this.f9455n = playbackException;
    }

    @Override // c2.b
    public void W(c2.b.a aVar, t1.g0 g0Var) {
        b bVar = this.f9456o;
        if (bVar != null) {
            t1.o oVar = bVar.f9470a;
            if (oVar.f52764u == -1) {
                this.f9456o = new b(oVar.a().t0(g0Var.f52694a).Y(g0Var.f52695b).K(), bVar.f9471b, bVar.f9472c);
            }
        }
    }

    @Override // c2.w1.a
    public void X(c2.b.a aVar, String str) {
        androidx.media3.exoplayer.source.r.b bVar = aVar.f9284d;
        if (bVar == null || !bVar.b()) {
            t0();
            this.f9450i = str;
            this.f9451j = q1.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.1");
            L0(aVar.f9282b, aVar.f9284d);
        }
    }

    @Override // c2.b
    public void a0(c2.b.a aVar, androidx.media3.exoplayer.i iVar) {
        this.f9465x += iVar.f5388g;
        this.f9466y += iVar.f5386e;
    }

    @Override // c2.b
    public void b0(c2.b.a aVar, i2.j jVar) {
        if (aVar.f9284d == null) {
            return;
        }
        b bVar = new b((t1.o) w1.a.e(jVar.f40770c), jVar.f40771d, this.f9443b.b(aVar.f9282b, (androidx.media3.exoplayer.source.r.b) w1.a.e(aVar.f9284d)));
        int i10 = jVar.f40769b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f9457p = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f9458q = bVar;
                return;
            }
        }
        this.f9456o = bVar;
    }

    @Override // c2.b
    public void i(c2.b.a aVar, int i10, long j10, long j11) {
        androidx.media3.exoplayer.source.r.b bVar = aVar.f9284d;
        if (bVar != null) {
            String strB = this.f9443b.b(aVar.f9282b, (androidx.media3.exoplayer.source.r.b) w1.a.e(bVar));
            Long l10 = (Long) this.f9449h.get(strB);
            Long l11 = (Long) this.f9448g.get(strB);
            this.f9449h.put(strB, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f9448g.put(strB, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    @Override // c2.b
    public void j(c2.b.a aVar, i2.i iVar, i2.j jVar, IOException iOException, boolean z10) {
        this.f9463v = jVar.f40768a;
    }

    @Override // c2.b
    public void m(c2.b.a aVar, t1.x.e eVar, t1.x.e eVar2, int i10) {
        if (i10 == 1) {
            this.f9462u = true;
        }
        this.f9452k = i10;
    }

    @Override // c2.b
    public void m0(t1.x xVar, c2.b.C0124b c0124b) {
        if (c0124b.d() == 0) {
            return;
        }
        D0(c0124b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        J0(xVar, c0124b);
        F0(jElapsedRealtime);
        H0(xVar, c0124b, jElapsedRealtime);
        E0(jElapsedRealtime);
        G0(xVar, c0124b, jElapsedRealtime);
        if (c0124b.a(1028)) {
            this.f9443b.e(c0124b.c(1028));
        }
    }

    public LogSessionId z0() {
        return this.f9444c.getSessionId();
    }

    @Override // c2.w1.a
    public void i0(c2.b.a aVar, String str) {
    }

    @Override // c2.w1.a
    public void l0(c2.b.a aVar, String str, String str2) {
    }
}
