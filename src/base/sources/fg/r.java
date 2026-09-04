package fg;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import com.mbridge.msdk.MBridgeConstans;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class r extends eg.d {
    private int A;
    private MediaMuxer B;
    private boolean C;
    private long D;
    private long E;
    private long F;
    private long G;
    private long H;
    private final AtomicBoolean I;
    private final AtomicBoolean J;
    private final AtomicBoolean K;
    private HandlerThread L;
    private c M;
    private Handler N;
    private long O;
    private long P;
    private final LinkedList Q;
    private final LinkedList R;
    private final LinkedList S;
    private final LinkedList T;
    private long U;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u f38656v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private d f38657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private MediaFormat f38658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private MediaFormat f38659y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f38660z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f38661a = false;

        a() {
        }

        @Override // fg.h.b
        public void a(h hVar, int i10, MediaCodec.BufferInfo bufferInfo) {
            try {
                if (r.this.O >= r.this.P && (bufferInfo.flags & 1) != 0) {
                    wp.a.a("Max size reached", new Object[0]);
                    r.this.f0();
                }
                r.this.X(i10, bufferInfo);
            } catch (Exception e10) {
                Message.obtain(r.this.M, 2, e10).sendToTarget();
            }
        }

        @Override // fg.h.b
        public void b(h hVar, MediaFormat mediaFormat) {
            r.this.c0(mediaFormat);
            r.this.j0();
        }

        @Override // fg.h.b
        public void onError(Exception exc) {
            this.f38661a = true;
            Message.obtain(r.this.M, 2, exc).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f38663a = false;

        b() {
        }

        @Override // fg.h.b
        public void a(h hVar, int i10, MediaCodec.BufferInfo bufferInfo) {
            try {
                r.this.W(i10, bufferInfo);
            } catch (Exception e10) {
                Message.obtain(r.this.M, 2, e10).sendToTarget();
            }
        }

        @Override // fg.h.b
        public void b(h hVar, MediaFormat mediaFormat) {
            r.this.a0(mediaFormat);
            r.this.j0();
        }

        @Override // fg.h.b
        public void onError(Exception exc) {
            this.f38663a = true;
            wp.a.f(exc, "AudioRecorder ran into an error! ", new Object[0]);
            Message.obtain(r.this.M, 2, exc).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                try {
                    r.this.Y();
                    r.this.N.post(new Runnable() { // from class: fg.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((eg.d) r.this).f37875r.b(null);
                        }
                    });
                    return;
                } catch (Exception e10) {
                    r.this.N.post(new Runnable() { // from class: fg.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((eg.d) r.this).f37875r.b(e10);
                        }
                    });
                    r.this.l0();
                    r.this.Z(true);
                    return;
                }
            }
            if (i10 == 1) {
                r.this.l0();
                if (message.arg1 != 1) {
                    try {
                        r.this.g0();
                    } catch (Exception e11) {
                        ((eg.d) r.this).f37875r.d(e11);
                    }
                }
                Uri uri = ((eg.d) r.this).f37860c;
                String str = ((eg.d) r.this).f37863f;
                ((eg.d) r.this).f37875r.a(r.this.Z(false), str, uri);
                return;
            }
            if (i10 == 2) {
                r.this.l0();
                r.this.Z(true);
                ((eg.d) r.this).f37875r.c((Throwable) message.obj);
                return;
            }
            if (i10 == 3) {
                wp.a.a("msg pause called", new Object[0]);
                r.this.K.set(true);
                r.this.D = System.nanoTime();
                if (r.this.f38657w != null) {
                    r.this.f38657w.K();
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (r.this.D != -1) {
                r.A(r.this, System.nanoTime() - r.this.D);
                r.this.D = -1L;
            }
            if (r.this.f38657w != null) {
                r.this.f38657w.L();
            }
            if (r.this.J.get()) {
                r.this.f38656v.n();
            }
            r.this.K.set(false);
        }
    }

    public r(Context context, eg.e eVar, eg.a aVar, String str, MediaProjection mediaProjection, String str2, eg.d.c cVar) {
        super(context, eVar, aVar, str, mediaProjection, str2, cVar);
        this.f38658x = null;
        this.f38659y = null;
        this.f38660z = -1;
        this.A = -1;
        this.C = false;
        this.E = 0L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = new AtomicBoolean(false);
        this.J = new AtomicBoolean(false);
        this.K = new AtomicBoolean(false);
        this.N = new Handler(Looper.getMainLooper());
        this.O = 0L;
        this.Q = new LinkedList();
        this.R = new LinkedList();
        this.S = new LinkedList();
        this.T = new LinkedList();
        e0(eVar, aVar, mediaProjection);
    }

    static /* synthetic */ long A(r rVar, long j10) {
        long j11 = rVar.E + j10;
        rVar.E = j11;
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i10, MediaCodec.BufferInfo bufferInfo) {
        if (!this.J.get()) {
            wp.a.i("muxAudio: Already stopped!", new Object[0]);
            return;
        }
        if (!this.C || this.A == -1) {
            this.R.add(Integer.valueOf(i10));
            this.S.add(bufferInfo);
            return;
        }
        ByteBuffer byteBufferG = this.f38657w.G(i10);
        if (!this.K.get()) {
            m0(this.A, bufferInfo, byteBufferG);
        }
        this.f38657w.O(i10);
        if ((bufferInfo.flags & 4) != 0) {
            this.A = -1;
            h0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(int i10, MediaCodec.BufferInfo bufferInfo) {
        if (!this.J.get()) {
            wp.a.i("muxVideo: Already stopped!", new Object[0]);
            return;
        }
        if (!this.C || this.f38660z == -1) {
            this.Q.add(Integer.valueOf(i10));
            this.T.add(bufferInfo);
            return;
        }
        if (!this.K.get()) {
            m0(this.f38660z, bufferInfo, this.f38656v.e(i10));
        }
        this.f38656v.i(i10);
        if ((bufferInfo.flags & 4) != 0) {
            this.f38660z = -1;
            h0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() throws IOException {
        if (this.J.get() || this.I.get()) {
            throw new IllegalStateException();
        }
        if (this.f37872o == null) {
            throw new IllegalStateException("maybe release");
        }
        this.J.set(true);
        this.K.set(false);
        this.D = -1L;
        this.E = 0L;
        this.F = -1L;
        this.G = -1L;
        if (Build.VERSION.SDK_INT < 29 || this.f37860c == null) {
            this.B = new MediaMuxer(this.f37859b, 0);
        } else {
            this.f37866i = this.f37858a.getContentResolver().openFileDescriptor(this.f37860c, "w");
            j.a();
            this.B = i.a(this.f37866i.getFileDescriptor(), 0);
        }
        k0();
        i0();
        this.f37872o.setSurface(this.f38656v.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Exception Z(boolean z10) {
        this.f37869l = true;
        this.f38659y = null;
        this.f38658x = null;
        this.A = -1;
        this.f38660z = -1;
        this.C = false;
        HandlerThread handlerThread = this.L;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.L = null;
        }
        u uVar = this.f38656v;
        if (uVar != null) {
            uVar.h();
            this.f38656v = null;
        }
        d dVar = this.f38657w;
        if (dVar != null) {
            this.f37877t = dVar.H();
            this.f38657w.N();
            this.f38657w = null;
        }
        lg.d dVar2 = new lg.d();
        MediaMuxer mediaMuxer = this.B;
        if (mediaMuxer != null) {
            Objects.requireNonNull(mediaMuxer);
            dVar2.a(new k(mediaMuxer));
            MediaMuxer mediaMuxer2 = this.B;
            Objects.requireNonNull(mediaMuxer2);
            dVar2.a(new l(mediaMuxer2));
        }
        ParcelFileDescriptor parcelFileDescriptor = this.f37866i;
        if (parcelFileDescriptor != null) {
            dVar2.a(parcelFileDescriptor);
        }
        VirtualDisplay virtualDisplay = this.f37872o;
        if (virtualDisplay != null) {
            virtualDisplay.setSurface(null);
            VirtualDisplay virtualDisplay2 = this.f37872o;
            Objects.requireNonNull(virtualDisplay2);
            dVar2.a(new m(virtualDisplay2));
        }
        MediaProjection mediaProjection = this.f37871n;
        if (mediaProjection != null) {
            Objects.requireNonNull(mediaProjection);
            dVar2.a(new n(mediaProjection));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && this.f37860c != null) {
            dVar2.a(new Closeable() { // from class: fg.o
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    r rVar = this.f38653a;
                    rVar.l(rVar.f37860c);
                }
            });
        }
        if (i10 >= 29) {
            dVar2.a(new Closeable() { // from class: fg.p
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    this.f38654a.d();
                }
            });
        }
        try {
            dVar2.close();
            e = null;
        } catch (Exception e10) {
            e = e10;
            if (z10) {
                this.f37875r.d(e);
            }
        }
        this.B = null;
        this.f37872o = null;
        this.f37871n = null;
        this.M = null;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(MediaFormat mediaFormat) {
        if (this.A >= 0 || this.C) {
            throw new IllegalStateException("output format already changed!");
        }
        this.f38659y = mediaFormat;
    }

    private void b0(MediaCodec.BufferInfo bufferInfo) {
        long j10 = this.U;
        if (j10 != 0) {
            bufferInfo.presentationTimeUs = Math.max(0L, (bufferInfo.presentationTimeUs - j10) - (this.E / 1000));
        } else {
            this.U = bufferInfo.presentationTimeUs;
            bufferInfo.presentationTimeUs = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(MediaFormat mediaFormat) {
        if (this.f38660z >= 0 || this.C) {
            throw new IllegalStateException("output format already changed!");
        }
        this.f38658x = mediaFormat;
    }

    private void d0(MediaCodec.BufferInfo bufferInfo) {
        long j10 = this.U;
        if (j10 != 0) {
            bufferInfo.presentationTimeUs = Math.max(0L, (bufferInfo.presentationTimeUs - j10) - (this.E / 1000));
        } else {
            this.U = bufferInfo.presentationTimeUs;
            bufferInfo.presentationTimeUs = 0L;
        }
    }

    private void e0(eg.e eVar, eg.a aVar, MediaProjection mediaProjection) {
        this.P = (long) (this.f37865h * 0.9d);
        this.f38656v = new u(eVar);
        if (aVar == null) {
            this.f38657w = null;
            return;
        }
        this.f38657w = new d(aVar);
        if (aVar.d().equals("1") || aVar.d().equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            this.f38657w.U(mediaProjection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() throws Exception {
        Uri uri;
        this.C = false;
        lg.d dVar = new lg.d();
        MediaMuxer mediaMuxer = this.B;
        Objects.requireNonNull(mediaMuxer);
        dVar.a(new k(mediaMuxer));
        MediaMuxer mediaMuxer2 = this.B;
        Objects.requireNonNull(mediaMuxer2);
        dVar.a(new l(mediaMuxer2));
        ParcelFileDescriptor parcelFileDescriptor = this.f37866i;
        if (parcelFileDescriptor != null) {
            dVar.a(parcelFileDescriptor);
            this.f37866i = null;
        }
        this.f38660z = -1;
        this.A = -1;
        try {
            dVar.close();
        } catch (Exception e10) {
            this.f37875r.d(e10);
        }
        this.B = null;
        wp.a.a("Closed muxer", new Object[0]);
        if (Build.VERSION.SDK_INT >= 29 && (uri = this.f37860c) != null) {
            l(uri);
            for (int i10 = 0; this.f37868k.get() && i10 < 2000; i10 += 50) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException unused) {
                }
            }
            if (this.f37867j == null || this.f37864g == null) {
                wp.a.i("Pre-allocation not ready! Falling back to synchronous allocation.", new Object[0]);
                c();
            }
            this.f37866i = this.f37867j;
            this.f37867j = null;
            this.f37860c = this.f37864g;
            j.a();
            this.B = i.a(this.f37866i.getFileDescriptor(), 0);
            wp.a.a("Created next muxer by URI: %s", this.f37860c);
            k();
        } else {
            if (this.f37859b == null) {
                throw new Exception("Cannot rotate: no filePath and device is below Android Q");
            }
            p();
            this.B = new MediaMuxer(this.f37863f, 0);
        }
        this.U = 0L;
        this.E = 0L;
        this.F = -1L;
        this.G = -1L;
        this.f37878u++;
        d dVar2 = this.f38657w;
        if (dVar2 != null) {
            dVar2.Q();
            this.f38657w.P();
        }
        j0();
        this.O = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        bufferInfo.set(0, 0, 0L, 4);
        wp.a.a("Signal EOS to muxer ", new Object[0]);
        int i10 = this.f38660z;
        if (i10 != -1) {
            m0(i10, bufferInfo, byteBufferAllocate);
        }
        int i11 = this.A;
        if (i11 != -1) {
            m0(i11, bufferInfo, byteBufferAllocate);
        }
        this.f38660z = -1;
        this.A = -1;
    }

    private void h0(boolean z10) {
        c cVar = this.M;
        if (cVar != null) {
            cVar.sendMessageAtFrontOfQueue(Message.obtain(cVar, 1, z10 ? 1 : 0, 0));
        }
    }

    private void i0() {
        if (this.f38657w == null) {
            return;
        }
        this.f38657w.T(new b());
        this.f38657w.V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        MediaFormat mediaFormat;
        if (this.C || (mediaFormat = this.f38658x) == null) {
            return;
        }
        if (this.f38657w != null && this.f38659y == null) {
            return;
        }
        this.f38660z = this.B.addTrack(mediaFormat);
        this.A = this.f38657w == null ? -1 : this.B.addTrack(this.f38659y);
        this.B.start();
        this.C = true;
        if (this.Q.isEmpty() && this.R.isEmpty()) {
            return;
        }
        while (true) {
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.T.poll();
            if (bufferInfo == null) {
                break;
            }
            try {
                X(((Integer) this.Q.poll()).intValue(), bufferInfo);
            } catch (Exception e10) {
                Message.obtain(this.M, 2, e10).sendToTarget();
            }
        }
        if (this.f38657w == null) {
            return;
        }
        while (true) {
            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.S.poll();
            if (bufferInfo2 == null) {
                return;
            }
            try {
                W(((Integer) this.R.poll()).intValue(), bufferInfo2);
            } catch (Exception e11) {
                Message.obtain(this.M, 2, e11).sendToTarget();
                return;
            }
        }
    }

    private void k0() throws IOException {
        this.f38656v.j(new a());
        this.f38656v.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        this.J.set(false);
        this.K.set(false);
        this.S.clear();
        this.R.clear();
        this.T.clear();
        this.Q.clear();
        try {
            u uVar = this.f38656v;
            if (uVar != null) {
                uVar.l();
            }
        } catch (IllegalStateException e10) {
            this.f37875r.d(e10);
        }
        try {
            d dVar = this.f38657w;
            if (dVar != null) {
                dVar.X();
            }
        } catch (IllegalStateException e11) {
            this.f37875r.d(e11);
        }
    }

    private void m0(int i10, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        int i11 = bufferInfo.flags;
        if ((i11 & 2) != 0) {
            bufferInfo.size = 0;
        }
        boolean z10 = (i11 & 4) != 0;
        if (bufferInfo.size == 0 && !z10) {
            byteBuffer = null;
        } else if (bufferInfo.presentationTimeUs != 0) {
            if (i10 == this.f38660z) {
                d0(bufferInfo);
                long j10 = this.G;
                if (j10 >= 0 && bufferInfo.presentationTimeUs <= j10) {
                    bufferInfo.presentationTimeUs = j10 + 1;
                }
            } else if (i10 == this.A) {
                b0(bufferInfo);
                long j11 = this.F;
                if (j11 >= 0 && bufferInfo.presentationTimeUs <= j11) {
                    bufferInfo.presentationTimeUs = j11 + 1;
                }
            }
        }
        if (byteBuffer != null) {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.B.writeSampleData(i10, byteBuffer, bufferInfo);
            this.O += (long) bufferInfo.size;
            if (i10 == this.A) {
                this.F = bufferInfo.presentationTimeUs;
            } else if (i10 == this.f38660z) {
                this.G = bufferInfo.presentationTimeUs;
            }
            eg.d.b bVar = this.f37876s;
            if (bVar != null) {
                long j12 = this.H;
                if (j12 <= 0 || bufferInfo.presentationTimeUs < j12) {
                    return;
                }
                bVar.a();
            }
        }
    }

    public static /* synthetic */ void s(r rVar) {
        if (rVar.C) {
            return;
        }
        rVar.l0();
        rVar.Z(false);
        rVar.f37875r.c(new RuntimeException(String.format("Muxer didn't start after 5s: %sx%s, %s fps, %s mbps", Integer.valueOf(rVar.f37873p.d()), Integer.valueOf(rVar.f37873p.c()), Integer.valueOf(rVar.f37873p.b()), Integer.valueOf(rVar.f37873p.a()))));
    }

    @Override // eg.d
    public void e() {
        this.I.set(true);
        c cVar = this.M;
        if (cVar != null && this.J.get()) {
            wp.a.a("Stop without EOS", new Object[0]);
            h0(false);
        } else if (cVar != null) {
            cVar.sendEmptyMessage(1);
        } else {
            Z(true);
        }
    }

    @Override // eg.d
    public void j() {
        c cVar = this.M;
        if (cVar != null) {
            cVar.sendEmptyMessage(3);
        }
    }

    @Override // eg.d
    public void m() {
        c cVar = this.M;
        if (cVar != null) {
            cVar.sendEmptyMessage(4);
        }
    }

    @Override // eg.d
    public void n(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        d dVar;
        if (Build.VERSION.SDK_INT < 29 || (dVar = this.f38657w) == null) {
            return;
        }
        dVar.S(executor, audioRecordingCallback);
    }

    @Override // eg.d
    public void q() {
        if (this.L != null) {
            throw new IllegalStateException();
        }
        int i10 = this.f37870m;
        if (i10 > 0) {
            this.H = ((long) i10) * 1000000;
        }
        HandlerThread handlerThread = new HandlerThread("MediaCodecEngine", -19);
        this.L = handlerThread;
        handlerThread.start();
        c cVar = new c(this.L.getLooper());
        this.M = cVar;
        cVar.sendEmptyMessage(0);
        this.M.postDelayed(new Runnable() { // from class: fg.q
            @Override // java.lang.Runnable
            public final void run() {
                r.s(this.f38655a);
            }
        }, 5000L);
        this.O = 0L;
        if (Build.VERSION.SDK_INT < 29 || this.f37860c == null) {
            return;
        }
        k();
    }

    public r(Context context, eg.e eVar, eg.a aVar, Uri uri, MediaProjection mediaProjection, String str, eg.d.c cVar) {
        super(context, eVar, aVar, uri, mediaProjection, str, cVar);
        this.f38658x = null;
        this.f38659y = null;
        this.f38660z = -1;
        this.A = -1;
        this.C = false;
        this.E = 0L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = new AtomicBoolean(false);
        this.J = new AtomicBoolean(false);
        this.K = new AtomicBoolean(false);
        this.N = new Handler(Looper.getMainLooper());
        this.O = 0L;
        this.Q = new LinkedList();
        this.R = new LinkedList();
        this.S = new LinkedList();
        this.T = new LinkedList();
        e0(eVar, aVar, mediaProjection);
    }
}
