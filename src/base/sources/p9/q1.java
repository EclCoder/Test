package p9;

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
import c2.t1;
import c2.u1;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.android.exoplayer2.x1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f8.Ygx.FuoITeVPeXAj;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q1 implements p9.b, r1.a {
    private boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r1 f49742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PlaybackSession f49743c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f49749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f49750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f49751k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PlaybackException f49754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f49755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f49756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f49757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.android.exoplayer2.v0 f49758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.android.exoplayer2.v0 f49759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.android.exoplayer2.v0 f49760t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f49761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f49762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f49763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f49764x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f49765y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f49766z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h2.d f49745e = new h2.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h2.b f49746f = new h2.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f49748h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f49747g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f49744d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f49752l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f49753m = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49768b;

        public a(int i10, int i11) {
            this.f49767a = i10;
            this.f49768b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.v0 f49769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f49771c;

        public b(com.google.android.exoplayer2.v0 v0Var, int i10, String str) {
            this.f49769a = v0Var;
            this.f49770b = i10;
            this.f49771c = str;
        }
    }

    private q1(Context context, PlaybackSession playbackSession) {
        this.f49741a = context.getApplicationContext();
        this.f49743c = playbackSession;
        p1 p1Var = new p1();
        this.f49742b = p1Var;
        p1Var.b(this);
    }

    private static int A0(com.google.android.exoplayer2.drm.h hVar) {
        for (int i10 = 0; i10 < hVar.f16857d; i10++) {
            UUID uuid = hVar.f(i10).f16859b;
            if (uuid.equals(o9.b.f48265d)) {
                return 3;
            }
            if (uuid.equals(o9.b.f48266e)) {
                return 2;
            }
            if (uuid.equals(o9.b.f48264c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a B0(PlaybackException playbackException, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (playbackException.f16429a == 1001) {
            return new a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z11 = exoPlaybackException.f16410i == 1;
            i10 = exoPlaybackException.f16414m;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) ob.a.e(playbackException.getCause());
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
                return new a(13, ob.r0.Y(((MediaCodecRenderer.DecoderInitializationException) th2).f17219d));
            }
            if (th2 instanceof MediaCodecDecoderException) {
                return new a(14, ob.r0.Y(((MediaCodecDecoderException) th2).f17178b));
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof AudioSink.InitializationException) {
                return new a(17, ((AudioSink.InitializationException) th2).f16459a);
            }
            if (th2 instanceof AudioSink.WriteException) {
                return new a(18, ((AudioSink.WriteException) th2).f16464a);
            }
            if (ob.r0.f48425a < 16 || !(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(y0(errorCode), errorCode);
        }
        if (th2 instanceof HttpDataSource$InvalidResponseCodeException) {
            return new a(5, ((HttpDataSource$InvalidResponseCodeException) th2).f18739d);
        }
        if ((th2 instanceof HttpDataSource$InvalidContentTypeException) || (th2 instanceof ParserException)) {
            return new a(z10 ? 10 : 11, 0);
        }
        boolean z12 = th2 instanceof HttpDataSource$HttpDataSourceException;
        if (z12 || (th2 instanceof UdpDataSource.UdpDataSourceException)) {
            if (ob.b0.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            if (cause instanceof UnknownHostException) {
                return new a(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new a(7, 0);
            }
            return (z12 && ((HttpDataSource$HttpDataSourceException) th2).f18737c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (playbackException.f16429a == 1002) {
            return new a(21, 0);
        }
        if (!(th2 instanceof DrmSession.DrmSessionException)) {
            if (!(th2 instanceof FileDataSource.FileDataSourceException) || !(th2.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) ob.a.e(th2.getCause())).getCause();
            return (ob.r0.f48425a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th3 = (Throwable) ob.a.e(th2.getCause());
        int i11 = ob.r0.f48425a;
        if (i11 >= 21 && (th3 instanceof MediaDrm.MediaDrmStateException)) {
            int iY = ob.r0.Y(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
            return new a(y0(iY), iY);
        }
        if (i11 >= 23 && (th3 instanceof MediaDrmResetException)) {
            return new a(27, 0);
        }
        if (i11 >= 18 && (th3 instanceof NotProvisionedException)) {
            return new a(24, 0);
        }
        if (i11 >= 18 && (th3 instanceof DeniedByServerException)) {
            return new a(29, 0);
        }
        if (th3 instanceof UnsupportedDrmException) {
            return new a(23, 0);
        }
        return th3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0);
    }

    private static Pair C0(String str) {
        String[] strArrY0 = ob.r0.Y0(str, "-");
        return Pair.create(strArrY0[0], strArrY0.length >= 2 ? strArrY0[1] : null);
    }

    private static int E0(Context context) {
        switch (ob.b0.d(context).f()) {
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

    private static int F0(com.google.android.exoplayer2.y0 y0Var) {
        com.google.android.exoplayer2.y0.h hVar = y0Var.f18982b;
        if (hVar == null) {
            return 0;
        }
        int iW0 = ob.r0.w0(hVar.f19079a, hVar.f19080b);
        if (iW0 == 0) {
            return 3;
        }
        if (iW0 != 1) {
            return iW0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int G0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void H0(p9.b.C0765b c0765b) {
        for (int i10 = 0; i10 < c0765b.d(); i10++) {
            int iB = c0765b.b(i10);
            p9.b.a aVarC = c0765b.c(iB);
            if (iB == 0) {
                this.f49742b.c(aVarC);
            } else if (iB == 11) {
                this.f49742b.d(aVarC, this.f49751k);
            } else {
                this.f49742b.e(aVarC);
            }
        }
    }

    private void I0(long j10) {
        int iE0 = E0(this.f49741a);
        if (iE0 != this.f49753m) {
            this.f49753m = iE0;
            this.f49743c.reportNetworkEvent(c2.p1.a().setNetworkType(iE0).setTimeSinceCreatedMillis(j10 - this.f49744d).build());
        }
    }

    private void J0(long j10) {
        PlaybackException playbackException = this.f49754n;
        if (playbackException == null) {
            return;
        }
        a aVarB0 = B0(playbackException, this.f49741a, this.f49762v == 4);
        this.f49743c.reportPlaybackErrorEvent(c2.r1.a().setTimeSinceCreatedMillis(j10 - this.f49744d).setErrorCode(aVarB0.f49767a).setSubErrorCode(aVarB0.f49768b).setException(playbackException).build());
        this.A = true;
        this.f49754n = null;
    }

    private void K0(x1 x1Var, p9.b.C0765b c0765b, long j10) {
        if (x1Var.getPlaybackState() != 2) {
            this.f49761u = false;
        }
        if (x1Var.d() == null) {
            this.f49763w = false;
        } else if (c0765b.a(10)) {
            this.f49763w = true;
        }
        int iS0 = S0(x1Var);
        if (this.f49752l != iS0) {
            this.f49752l = iS0;
            this.A = true;
            this.f49743c.reportPlaybackStateEvent(c2.s1.a().setState(this.f49752l).setTimeSinceCreatedMillis(j10 - this.f49744d).build());
        }
    }

    private void L0(x1 x1Var, p9.b.C0765b c0765b, long j10) {
        if (c0765b.a(2)) {
            i2 i2VarE = x1Var.e();
            boolean zD = i2VarE.d(2);
            boolean zD2 = i2VarE.d(1);
            boolean zD3 = i2VarE.d(3);
            if (zD || zD2 || zD3) {
                if (!zD) {
                    Q0(j10, null, 0);
                }
                if (!zD2) {
                    M0(j10, null, 0);
                }
                if (!zD3) {
                    O0(j10, null, 0);
                }
            }
        }
        if (v0(this.f49755o)) {
            b bVar = this.f49755o;
            com.google.android.exoplayer2.v0 v0Var = bVar.f49769a;
            if (v0Var.f18874r != -1) {
                Q0(j10, v0Var, bVar.f49770b);
                this.f49755o = null;
            }
        }
        if (v0(this.f49756p)) {
            b bVar2 = this.f49756p;
            M0(j10, bVar2.f49769a, bVar2.f49770b);
            this.f49756p = null;
        }
        if (v0(this.f49757q)) {
            b bVar3 = this.f49757q;
            O0(j10, bVar3.f49769a, bVar3.f49770b);
            this.f49757q = null;
        }
    }

    private void M0(long j10, com.google.android.exoplayer2.v0 v0Var, int i10) {
        if (ob.r0.c(this.f49759s, v0Var)) {
            return;
        }
        if (this.f49759s == null && i10 == 0) {
            i10 = 1;
        }
        this.f49759s = v0Var;
        R0(0, j10, v0Var, i10);
    }

    private void N0(x1 x1Var, p9.b.C0765b c0765b) {
        com.google.android.exoplayer2.drm.h hVarZ0;
        if (c0765b.a(0)) {
            p9.b.a aVarC = c0765b.c(0);
            if (this.f49750j != null) {
                P0(aVarC.f49597b, aVarC.f49599d);
            }
        }
        if (c0765b.a(2) && this.f49750j != null && (hVarZ0 = z0(x1Var.e().b())) != null) {
            t1.a(ob.r0.j(this.f49750j)).setDrmType(A0(hVarZ0));
        }
        if (c0765b.a(TTAdConstant.IMAGE_MODE_1011)) {
            this.f49766z++;
        }
    }

    private void O0(long j10, com.google.android.exoplayer2.v0 v0Var, int i10) {
        if (ob.r0.c(this.f49760t, v0Var)) {
            return;
        }
        if (this.f49760t == null && i10 == 0) {
            i10 = 1;
        }
        this.f49760t = v0Var;
        R0(2, j10, v0Var, i10);
    }

    private void P0(h2 h2Var, com.google.android.exoplayer2.source.p.b bVar) {
        int iF;
        PlaybackMetrics.Builder builder = this.f49750j;
        if (bVar == null || (iF = h2Var.f(bVar.f51199a)) == -1) {
            return;
        }
        h2Var.j(iF, this.f49746f);
        h2Var.r(this.f49746f.f17000c, this.f49745e);
        builder.setStreamType(F0(this.f49745e.f17020c));
        h2.d dVar = this.f49745e;
        if (dVar.f17031n != C.TIME_UNSET && !dVar.f17029l && !dVar.f17026i && !dVar.h()) {
            builder.setMediaDurationMillis(this.f49745e.f());
        }
        builder.setPlaybackType(this.f49745e.h() ? 2 : 1);
        this.A = true;
    }

    private void Q0(long j10, com.google.android.exoplayer2.v0 v0Var, int i10) {
        if (ob.r0.c(this.f49758r, v0Var)) {
            return;
        }
        if (this.f49758r == null && i10 == 0) {
            i10 = 1;
        }
        this.f49758r = v0Var;
        R0(1, j10, v0Var, i10);
    }

    private void R0(int i10, long j10, com.google.android.exoplayer2.v0 v0Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = c2.o1.a(i10).setTimeSinceCreatedMillis(j10 - this.f49744d);
        if (v0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(G0(i11));
            String str = v0Var.f18867k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = v0Var.f18868l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = v0Var.f18865i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = v0Var.f18864h;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = v0Var.f18873q;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = v0Var.f18874r;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = v0Var.f18881y;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = v0Var.f18882z;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = v0Var.f18859c;
            if (str4 != null) {
                Pair pairC0 = C0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairC0.first);
                Object obj = pairC0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = v0Var.f18875s;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f49743c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int S0(x1 x1Var) {
        int playbackState = x1Var.getPlaybackState();
        if (this.f49761u) {
            return 5;
        }
        if (this.f49763w) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i10 = this.f49752l;
            if (i10 == 0 || i10 == 2) {
                return 2;
            }
            if (x1Var.getPlayWhenReady()) {
                return x1Var.h() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (x1Var.getPlayWhenReady()) {
                return x1Var.h() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.f49752l == 0) {
            return this.f49752l;
        }
        return 12;
    }

    private boolean v0(b bVar) {
        return bVar != null && bVar.f49771c.equals(this.f49742b.a());
    }

    public static q1 w0(Context context) {
        MediaMetricsManager mediaMetricsManagerA = u1.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new q1(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private void x0() {
        PlaybackMetrics.Builder builder = this.f49750j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f49766z);
            this.f49750j.setVideoFramesDropped(this.f49764x);
            this.f49750j.setVideoFramesPlayed(this.f49765y);
            Long l10 = (Long) this.f49747g.get(this.f49749i);
            this.f49750j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f49748h.get(this.f49749i);
            this.f49750j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f49750j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f49743c.reportPlaybackMetrics(this.f49750j.build());
        }
        this.f49750j = null;
        this.f49749i = null;
        this.f49766z = 0;
        this.f49764x = 0;
        this.f49765y = 0;
        this.f49758r = null;
        this.f49759s = null;
        this.f49760t = null;
        this.A = false;
    }

    private static int y0(int i10) {
        switch (ob.r0.X(i10)) {
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

    private static com.google.android.exoplayer2.drm.h z0(com.google.common.collect.c0 c0Var) {
        com.google.android.exoplayer2.drm.h hVar;
        com.google.common.collect.p1 it = c0Var.iterator();
        while (it.hasNext()) {
            i2.a aVar = (i2.a) it.next();
            for (int i10 = 0; i10 < aVar.f17053a; i10++) {
                if (aVar.h(i10) && (hVar = aVar.c(i10).f18871o) != null) {
                    return hVar;
                }
            }
        }
        return null;
    }

    public LogSessionId D0() {
        return this.f49743c.getSessionId();
    }

    @Override // p9.b
    public void F(p9.b.a aVar, s9.e eVar) {
        this.f49764x += eVar.f51527g;
        this.f49765y += eVar.f51525e;
    }

    @Override // p9.r1.a
    public void G(p9.b.a aVar, String str, String str2) {
    }

    @Override // p9.r1.a
    public void I(p9.b.a aVar, String str) {
    }

    @Override // p9.b
    public void U(x1 x1Var, p9.b.C0765b c0765b) {
        if (c0765b.d() == 0) {
            return;
        }
        H0(c0765b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        N0(x1Var, c0765b);
        J0(jElapsedRealtime);
        L0(x1Var, c0765b, jElapsedRealtime);
        I0(jElapsedRealtime);
        K0(x1Var, c0765b, jElapsedRealtime);
        if (c0765b.a(1028)) {
            this.f49742b.f(c0765b.c(1028));
        }
    }

    @Override // p9.r1.a
    public void a0(p9.b.a aVar, String str, boolean z10) {
        com.google.android.exoplayer2.source.p.b bVar = aVar.f49599d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f49749i)) {
            x0();
        }
        this.f49747g.remove(str);
        this.f49748h.remove(str);
    }

    @Override // p9.b
    public void f(p9.b.a aVar, ra.i iVar, ra.j jVar, IOException iOException, boolean z10) {
        this.f49762v = jVar.f51192a;
    }

    @Override // p9.b
    public void k0(p9.b.a aVar, x1.e eVar, x1.e eVar2, int i10) {
        if (i10 == 1) {
            this.f49761u = true;
        }
        this.f49751k = i10;
    }

    @Override // p9.b
    public void n(p9.b.a aVar, pb.z zVar) {
        b bVar = this.f49755o;
        if (bVar != null) {
            com.google.android.exoplayer2.v0 v0Var = bVar.f49769a;
            if (v0Var.f18874r == -1) {
                this.f49755o = new b(v0Var.b().n0(zVar.f49997a).S(zVar.f49998b).G(), bVar.f49770b, bVar.f49771c);
            }
        }
    }

    @Override // p9.b
    public void q(p9.b.a aVar, int i10, long j10, long j11) {
        com.google.android.exoplayer2.source.p.b bVar = aVar.f49599d;
        if (bVar != null) {
            String strG = this.f49742b.g(aVar.f49597b, (com.google.android.exoplayer2.source.p.b) ob.a.e(bVar));
            Long l10 = (Long) this.f49748h.get(strG);
            Long l11 = (Long) this.f49747g.get(strG);
            this.f49748h.put(strG, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f49747g.put(strG, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    @Override // p9.b
    public void y(p9.b.a aVar, PlaybackException playbackException) {
        this.f49754n = playbackException;
    }

    @Override // p9.b
    public void z(p9.b.a aVar, ra.j jVar) {
        if (aVar.f49599d == null) {
            return;
        }
        b bVar = new b((com.google.android.exoplayer2.v0) ob.a.e(jVar.f51194c), jVar.f51195d, this.f49742b.g(aVar.f49597b, (com.google.android.exoplayer2.source.p.b) ob.a.e(aVar.f49599d)));
        int i10 = jVar.f51193b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f49756p = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f49757q = bVar;
                return;
            }
        }
        this.f49755o = bVar;
    }

    @Override // p9.r1.a
    public void H(p9.b.a aVar, String str) {
        com.google.android.exoplayer2.source.p.b bVar = aVar.f49599d;
        if (bVar == null || !bVar.b()) {
            x0();
            this.f49749i = str;
            this.f49750j = c2.q1.a().setPlayerName(FuoITeVPeXAj.njMMxZJeoF).setPlayerVersion("2.19.1");
            P0(aVar.f49597b, aVar.f49599d);
        }
    }
}
