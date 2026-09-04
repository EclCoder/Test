package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.c2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.w1;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import ob.r0;
import ob.u;
import ob.w;
import ob.x;
import ob.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class k extends MediaCodecRenderer implements w {
    private final Context G0;
    private final e.a H0;
    private final AudioSink I0;
    private int J0;
    private boolean K0;
    private v0 L0;
    private v0 M0;
    private long N0;
    private boolean O0;
    private boolean P0;
    private boolean Q0;
    private boolean R0;
    private b2.a S0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public static void a(AudioSink audioSink, Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements AudioSink.a {
        private c() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void a(Exception exc) {
            u.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            k.this.H0.l(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void b(long j10) {
            k.this.H0.r(j10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void c() {
            if (k.this.S0 != null) {
                k.this.S0.a();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void d() {
            k.this.D();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void e() {
            if (k.this.S0 != null) {
                k.this.S0.b();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onPositionDiscontinuity() {
            k.this.v1();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onSkipSilenceEnabledChanged(boolean z10) {
            k.this.H0.s(z10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onUnderrun(int i10, long j10, long j11) {
            k.this.H0.t(i10, j10, j11);
        }
    }

    public k(Context context, com.google.android.exoplayer2.mediacodec.j.b bVar, com.google.android.exoplayer2.mediacodec.l lVar, boolean z10, Handler handler, e eVar, AudioSink audioSink) {
        super(1, bVar, lVar, z10, 44100.0f);
        this.G0 = context.getApplicationContext();
        this.I0 = audioSink;
        this.H0 = new e.a(handler, eVar);
        audioSink.h(new c());
    }

    private static boolean p1(String str) {
        if (r0.f48425a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(r0.f48427c)) {
            return false;
        }
        String str2 = r0.f48426b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    private static boolean q1() {
        if (r0.f48425a != 23) {
            return false;
        }
        String str = r0.f48428d;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    private int r1(com.google.android.exoplayer2.mediacodec.k kVar, v0 v0Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(kVar.f17293a) || (i10 = r0.f48425a) >= 24 || (i10 == 23 && r0.E0(this.G0))) {
            return v0Var.f18869m;
        }
        return -1;
    }

    private static List t1(com.google.android.exoplayer2.mediacodec.l lVar, v0 v0Var, boolean z10, AudioSink audioSink) {
        com.google.android.exoplayer2.mediacodec.k kVarX;
        if (v0Var.f18868l == null) {
            return c0.C();
        }
        return (!audioSink.a(v0Var) || (kVarX = MediaCodecUtil.x()) == null) ? MediaCodecUtil.v(lVar, v0Var, z10, false) : c0.D(kVarX);
    }

    private void w1() {
        long currentPositionUs = this.I0.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.P0) {
                currentPositionUs = Math.max(this.N0, currentPositionUs);
            }
            this.N0 = currentPositionUs;
            this.P0 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void A(boolean z10, boolean z11) {
        super.A(z10, z11);
        this.H0.p(this.B0);
        if (t().f48290a) {
            this.I0.e();
        } else {
            this.I0.disableTunneling();
        }
        this.I0.k(w());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void B(long j10, boolean z10) throws ExoPlaybackException {
        super.B(j10, z10);
        if (this.R0) {
            this.I0.j();
        } else {
            this.I0.flush();
        }
        this.N0 = j10;
        this.O0 = true;
        this.P0 = true;
    }

    @Override // com.google.android.exoplayer2.f
    protected void C() {
        this.I0.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void D0(Exception exc) {
        u.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.H0.k(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void E() {
        try {
            super.E();
        } finally {
            if (this.Q0) {
                this.Q0 = false;
                this.I0.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void E0(String str, com.google.android.exoplayer2.mediacodec.j.a aVar, long j10, long j11) {
        this.H0.m(str, j10, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void F() {
        super.F();
        this.I0.play();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void F0(String str) {
        this.H0.n(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void G() {
        w1();
        this.I0.pause();
        super.G();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected s9.g G0(o9.p pVar) throws ExoPlaybackException {
        this.L0 = (v0) ob.a.e(pVar.f48303b);
        s9.g gVarG0 = super.G0(pVar);
        this.H0.q(this.L0, gVarG0);
        return gVarG0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void H0(v0 v0Var, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iF0;
        int i10;
        v0 v0Var2 = this.M0;
        int[] iArr = null;
        if (v0Var2 != null) {
            v0Var = v0Var2;
        } else if (j0() != null) {
            if (MimeTypes.AUDIO_RAW.equals(v0Var.f18868l)) {
                iF0 = v0Var.A;
            } else if (r0.f48425a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iF0 = mediaFormat.containsKey("v-bits-per-sample") ? r0.f0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iF0 = mediaFormat.getInteger("pcm-encoding");
            }
            v0 v0VarG = new v0.b().g0(MimeTypes.AUDIO_RAW).a0(iF0).P(v0Var.B).Q(v0Var.C).J(mediaFormat.getInteger("channel-count")).h0(mediaFormat.getInteger("sample-rate")).G();
            if (this.K0 && v0VarG.f18881y == 6 && (i10 = v0Var.f18881y) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < v0Var.f18881y; i11++) {
                    iArr[i11] = i11;
                }
            }
            v0Var = v0VarG;
        }
        try {
            this.I0.l(v0Var, 0, iArr);
        } catch (AudioSink.ConfigurationException e10) {
            throw r(e10, e10.f16458a, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void I0(long j10) {
        this.I0.d(j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void K0() {
        super.K0();
        this.I0.handleDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void L0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.O0 || decoderInputBuffer.f()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f16756e - this.N0) > 500000) {
            this.N0 = decoderInputBuffer.f16756e;
        }
        this.O0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected s9.g N(com.google.android.exoplayer2.mediacodec.k kVar, v0 v0Var, v0 v0Var2) {
        s9.g gVarF = kVar.f(v0Var, v0Var2);
        int i10 = gVarF.f51539e;
        if (w0(v0Var2)) {
            i10 |= 32768;
        }
        if (r1(kVar, v0Var2) > this.J0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new s9.g(kVar.f17293a, v0Var, v0Var2, i11 != 0 ? 0 : gVarF.f51538d, i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean O0(long j10, long j11, com.google.android.exoplayer2.mediacodec.j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, v0 v0Var) throws ExoPlaybackException {
        ob.a.e(byteBuffer);
        if (this.M0 != null && (i11 & 2) != 0) {
            ((com.google.android.exoplayer2.mediacodec.j) ob.a.e(jVar)).k(i10, false);
            return true;
        }
        if (z10) {
            if (jVar != null) {
                jVar.k(i10, false);
            }
            this.B0.f51526f += i12;
            this.I0.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.I0.c(byteBuffer, j12, i12)) {
                return false;
            }
            if (jVar != null) {
                jVar.k(i10, false);
            }
            this.B0.f51525e += i12;
            return true;
        } catch (AudioSink.InitializationException e10) {
            throw s(e10, this.L0, e10.f16460b, 5001);
        } catch (AudioSink.WriteException e11) {
            throw s(e11, v0Var, e11.f16465b, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void T0() throws ExoPlaybackException {
        try {
            this.I0.playToEndOfStream();
        } catch (AudioSink.WriteException e10) {
            throw s(e10, e10.f16466c, e10.f16465b, 5002);
        }
    }

    @Override // ob.w
    public void b(w1 w1Var) {
        this.I0.b(w1Var);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean g1(v0 v0Var) {
        return this.I0.a(v0Var);
    }

    @Override // com.google.android.exoplayer2.b2, com.google.android.exoplayer2.c2
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // ob.w
    public w1 getPlaybackParameters() {
        return this.I0.getPlaybackParameters();
    }

    @Override // ob.w
    public long getPositionUs() {
        if (getState() == 2) {
            w1();
        }
        return this.N0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int h1(com.google.android.exoplayer2.mediacodec.l lVar, v0 v0Var) {
        boolean z10;
        if (!y.o(v0Var.f18868l)) {
            return c2.h(0);
        }
        int i10 = r0.f48425a >= 21 ? 32 : 0;
        boolean z11 = true;
        boolean z12 = v0Var.G != 0;
        boolean zI1 = MediaCodecRenderer.i1(v0Var);
        int i11 = 8;
        if (zI1 && this.I0.a(v0Var) && (!z12 || MediaCodecUtil.x() != null)) {
            return c2.p(4, 8, i10);
        }
        if (MimeTypes.AUDIO_RAW.equals(v0Var.f18868l) && !this.I0.a(v0Var)) {
            return c2.h(1);
        }
        if (!this.I0.a(r0.g0(2, v0Var.f18881y, v0Var.f18882z))) {
            return c2.h(1);
        }
        List listT1 = t1(lVar, v0Var, false, this.I0);
        if (listT1.isEmpty()) {
            return c2.h(1);
        }
        if (!zI1) {
            return c2.h(2);
        }
        com.google.android.exoplayer2.mediacodec.k kVar = (com.google.android.exoplayer2.mediacodec.k) listT1.get(0);
        boolean zO = kVar.o(v0Var);
        if (!zO) {
            int i12 = 1;
            while (true) {
                if (i12 >= listT1.size()) {
                    z10 = true;
                    z11 = zO;
                    break;
                }
                com.google.android.exoplayer2.mediacodec.k kVar2 = (com.google.android.exoplayer2.mediacodec.k) listT1.get(i12);
                if (kVar2.o(v0Var)) {
                    z10 = false;
                    kVar = kVar2;
                    break;
                }
                i12++;
            }
        } else {
            z10 = true;
            z11 = zO;
            break;
        }
        int i13 = z11 ? 4 : 3;
        if (z11 && kVar.r(v0Var)) {
            i11 = 16;
        }
        return c2.e(i13, i11, i10, kVar.f17300h ? 64 : 0, z10 ? 128 : 0);
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.y1.b
    public void handleMessage(int i10, Object obj) {
        if (i10 == 2) {
            this.I0.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.I0.g((com.google.android.exoplayer2.audio.a) obj);
            return;
        }
        if (i10 == 6) {
            this.I0.m((q9.p) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.I0.f(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.I0.setAudioSessionId(((Integer) obj).intValue());
                break;
            case 11:
                this.S0 = (b2.a) obj;
                break;
            case 12:
                if (r0.f48425a >= 23) {
                    b.a(this.I0, obj);
                }
                break;
            default:
                super.handleMessage(i10, obj);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.b2
    public boolean isEnded() {
        return super.isEnded() && this.I0.isEnded();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.b2
    public boolean isReady() {
        return this.I0.hasPendingData() || super.isReady();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float m0(float f10, v0 v0Var, v0[] v0VarArr) {
        int iMax = -1;
        for (v0 v0Var2 : v0VarArr) {
            int i10 = v0Var2.f18882z;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List o0(com.google.android.exoplayer2.mediacodec.l lVar, v0 v0Var, boolean z10) {
        return MediaCodecUtil.w(t1(lVar, v0Var, z10, this.I0), v0Var);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected com.google.android.exoplayer2.mediacodec.j.a p0(com.google.android.exoplayer2.mediacodec.k kVar, v0 v0Var, MediaCrypto mediaCrypto, float f10) {
        this.J0 = s1(kVar, v0Var, x());
        this.K0 = p1(kVar.f17293a);
        MediaFormat mediaFormatU1 = u1(v0Var, kVar.f17295c, this.J0, f10);
        this.M0 = (!MimeTypes.AUDIO_RAW.equals(kVar.f17294b) || MimeTypes.AUDIO_RAW.equals(v0Var.f18868l)) ? null : v0Var;
        return com.google.android.exoplayer2.mediacodec.j.a.a(kVar, mediaFormatU1, v0Var, mediaCrypto);
    }

    protected int s1(com.google.android.exoplayer2.mediacodec.k kVar, v0 v0Var, v0[] v0VarArr) {
        int iR1 = r1(kVar, v0Var);
        if (v0VarArr.length == 1) {
            return iR1;
        }
        for (v0 v0Var2 : v0VarArr) {
            if (kVar.f(v0Var, v0Var2).f51538d != 0) {
                iR1 = Math.max(iR1, r1(kVar, v0Var2));
            }
        }
        return iR1;
    }

    protected MediaFormat u1(v0 v0Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", v0Var.f18881y);
        mediaFormat.setInteger("sample-rate", v0Var.f18882z);
        x.e(mediaFormat, v0Var.f18870n);
        x.d(mediaFormat, "max-input-size", i10);
        int i11 = r0.f48425a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !q1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(v0Var.f18868l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.I0.i(r0.g0(4, v0Var.f18881y, v0Var.f18882z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    protected void v1() {
        this.P0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void z() {
        this.Q0 = true;
        this.L0 = null;
        try {
            this.I0.flush();
            try {
                super.z();
            } finally {
                this.H0.o(this.B0);
            }
        } catch (Throwable th2) {
            try {
                super.z();
                throw th2;
            } finally {
                this.H0.o(this.B0);
            }
        }
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.b2
    public w getMediaClock() {
        return this;
    }
}
