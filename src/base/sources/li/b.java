package li;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HandlerThread f44586d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected MediaCodec f44588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected long f44589g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MediaCodec.Callback f44593k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f44597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected String f44598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected si.a.d f44599q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f44583a = "BaseEncoder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final mi.b f44584b = new mi.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaCodec.BufferInfo f44585c = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected BlockingQueue f44587e = new ArrayBlockingQueue(80);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected volatile boolean f44590h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f44591i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected si.a.c f44592j = si.a.c.f52430a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f44594l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f44595m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f44596n = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends MediaCodec.Callback {
        a() {
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            Log.e(b.this.f44583a, "Error", codecException);
            b.d(b.this);
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
            try {
                b.this.m(mediaCodec, i10);
            } catch (IllegalStateException e10) {
                Log.i(b.this.f44583a, "Encoding error", e10);
                b.this.t(e10);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
            try {
                b.this.p(mediaCodec, i10, bufferInfo);
            } catch (IllegalStateException e10) {
                Log.i(b.this.f44583a, "Encoding error", e10);
                b.this.t(e10);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            b.this.b(mediaCodec, mediaFormat);
        }
    }

    static /* bridge */ /* synthetic */ d d(b bVar) {
        bVar.getClass();
        return null;
    }

    private void h() {
        this.f44593k = new a();
    }

    private void l() {
        if (!this.f44598p.equals(MimeTypes.AUDIO_ALAW)) {
            this.f44588f.start();
        }
        if (this.f44598p.equals(MimeTypes.AUDIO_ALAW)) {
            this.f44597o.post(new Runnable() { // from class: li.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44582a.o();
                }
            });
        }
        this.f44590h = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        while (this.f44590h) {
            try {
                j();
            } catch (IllegalStateException e10) {
                Log.i(this.f44583a, "Encoding error", e10);
                t(e10);
            }
        }
    }

    private void q() {
        try {
            e eVarK = k();
            while (eVarK == null) {
                eVarK = k();
            }
            byte[] bArrB = this.f44584b.b(eVarK.a(), eVarK.c(), eVarK.e());
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrB, 0, bArrB.length);
            this.f44585c.presentationTimeUs = f(eVarK, this.f44589g);
            MediaCodec.BufferInfo bufferInfo = this.f44585c;
            bufferInfo.size = bArrB.length;
            bufferInfo.offset = 0;
            w(byteBufferWrap, bufferInfo);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            Log.i(this.f44583a, "Encoding error", e);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (NullPointerException e11) {
            e = e11;
            Log.i(this.f44583a, "Encoding error", e);
        }
    }

    private void r(ByteBuffer byteBuffer, MediaCodec mediaCodec, int i10) {
        try {
            e eVarK = k();
            while (eVarK == null) {
                eVarK = k();
            }
            byteBuffer.clear();
            int iMax = Math.max(0, Math.min(eVarK.e(), byteBuffer.remaining()) - eVarK.c());
            byteBuffer.put(eVarK.a(), eVarK.c(), iMax);
            mediaCodec.queueInputBuffer(i10, 0, iMax, f(eVarK, this.f44589g), 0);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            Log.i(this.f44583a, "Encoding error", e);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (NullPointerException e11) {
            e = e11;
            Log.i(this.f44583a, "Encoding error", e);
        }
    }

    private void s(ByteBuffer byteBuffer, MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        g(byteBuffer, bufferInfo);
        w(byteBuffer, bufferInfo);
        mediaCodec.releaseOutputBuffer(i10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(IllegalStateException illegalStateException) {
        if (this.f44595m) {
            Log.e(this.f44599q.name(), "Encoder crashed, trying to recover it");
            u();
        }
    }

    public void A() {
        B(true);
    }

    public void B(boolean z10) {
        if (z10) {
            this.f44589g = 0L;
        }
        this.f44590h = false;
        C();
        HandlerThread handlerThread = this.f44586d;
        if (handlerThread != null) {
            if (handlerThread.getLooper() != null) {
                if (this.f44586d.getLooper().getThread() != null) {
                    this.f44586d.getLooper().getThread().interrupt();
                }
                this.f44586d.getLooper().quit();
            }
            this.f44586d.quit();
            MediaCodec mediaCodec = this.f44588f;
            if (mediaCodec != null) {
                try {
                    mediaCodec.flush();
                } catch (IllegalStateException unused) {
                }
            }
            try {
                this.f44586d.getLooper().getThread().join(500L);
            } catch (Exception unused2) {
            }
        }
        this.f44587e.clear();
        this.f44587e = new ArrayBlockingQueue(80);
        try {
            this.f44588f.stop();
            this.f44588f.release();
            this.f44588f = null;
        } catch (IllegalStateException | NullPointerException unused3) {
            this.f44588f = null;
        }
        this.f44596n = false;
        this.f44594l = 0L;
    }

    protected abstract void C();

    protected abstract long f(e eVar, long j10);

    protected abstract void g(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    protected void i(MediaCodec.BufferInfo bufferInfo) {
        long j10 = this.f44594l;
        long j11 = bufferInfo.presentationTimeUs;
        if (j10 > j11) {
            bufferInfo.presentationTimeUs = j10;
        } else {
            this.f44594l = j11;
        }
    }

    protected void j() {
        int iDequeueInputBuffer;
        if (this.f44598p.equals(MimeTypes.AUDIO_ALAW)) {
            q();
            return;
        }
        if (this.f44591i && (iDequeueInputBuffer = this.f44588f.dequeueInputBuffer(0L)) >= 0) {
            m(this.f44588f, iDequeueInputBuffer);
        }
        while (this.f44590h) {
            int iDequeueOutputBuffer = this.f44588f.dequeueOutputBuffer(this.f44585c, 0L);
            if (iDequeueOutputBuffer == -2) {
                b(this.f44588f, this.f44588f.getOutputFormat());
            } else if (iDequeueOutputBuffer < 0) {
                return;
            } else {
                p(this.f44588f, iDequeueOutputBuffer, this.f44585c);
            }
        }
    }

    protected abstract e k();

    public void m(MediaCodec mediaCodec, int i10) {
        r(mediaCodec.getInputBuffer(i10), mediaCodec, i10);
    }

    public boolean n() {
        return this.f44590h;
    }

    public void p(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        s(mediaCodec.getOutputBuffer(i10), mediaCodec, i10, bufferInfo);
    }

    public abstract boolean u();

    public void v() {
        z(false);
        l();
    }

    protected abstract void w(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    protected void x() {
        HandlerThread handlerThread = new HandlerThread(this.f44583a);
        this.f44586d = handlerThread;
        handlerThread.start();
        this.f44597o = new Handler(this.f44586d.getLooper());
        if (this.f44598p.equals(MimeTypes.AUDIO_ALAW)) {
            return;
        }
        h();
        this.f44588f.setCallback(this.f44593k, this.f44597o);
    }

    public void y(long j10) {
        if (this.f44596n) {
            this.f44589g = j10;
            z(true);
            l();
        } else {
            throw new IllegalStateException(this.f44583a + " not prepared yet. You must call prepare method before start it");
        }
    }

    public abstract void z(boolean z10);
}
