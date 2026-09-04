package fg;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseLongArray;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fg.a f38598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f38599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f38600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioRecord f38601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioRecord f38602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f38603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f38604g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaProjection f38606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final eg.a f38607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Executor f38608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AudioManager.AudioRecordingCallback f38609l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h.b f38611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f38612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f38613p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private HandlerThread f38616s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private HandlerC0580d f38617t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private b f38622y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f38623z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f38605h = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f38610m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ConcurrentLinkedDeque f38614q = new ConcurrentLinkedDeque();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayBlockingQueue f38615r = new ArrayBlockingQueue(8);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AtomicLong f38618u = new AtomicLong();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicLong f38619v = new AtomicLong();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicLong f38620w = new AtomicLong();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicLong f38621x = new AtomicLong();
    private SparseLongArray A = new SparseLongArray(2);
    private final AtomicLong B = new AtomicLong(-1);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte[] f38624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f38626c;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h.b f38627a;

        c(Looper looper, h.b bVar) {
            super(looper);
            this.f38627a = bVar;
        }

        public static /* synthetic */ void a(c cVar, h hVar, MediaFormat mediaFormat) {
            h.b bVar = cVar.f38627a;
            if (bVar != null) {
                bVar.b(hVar, mediaFormat);
            }
        }

        public static /* synthetic */ void b(c cVar, Exception exc) {
            h.b bVar = cVar.f38627a;
            if (bVar != null) {
                bVar.onError(exc);
            }
        }

        public static /* synthetic */ void c(c cVar, h hVar, int i10, MediaCodec.BufferInfo bufferInfo) {
            h.b bVar = cVar.f38627a;
            if (bVar != null) {
                bVar.a(hVar, i10, bufferInfo);
            }
        }

        void d(final Exception exc) {
            Message.obtain(this, new Runnable() { // from class: fg.e
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.b(this.f38636a, exc);
                }
            }).sendToTarget();
        }

        void e(final h hVar, final int i10, final MediaCodec.BufferInfo bufferInfo) {
            Message.obtain(this, new Runnable() { // from class: fg.g
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.c(this.f38641a, hVar, i10, bufferInfo);
                }
            }).sendToTarget();
        }

        void f(final h hVar, final MediaFormat mediaFormat) {
            Message.obtain(this, new Runnable() { // from class: fg.f
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.a(this.f38638a, hVar, mediaFormat);
                }
            }).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: fg.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class HandlerC0580d extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f38628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private short[] f38629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private short[] f38630c;

        HandlerC0580d(Looper looper) {
            super(looper);
            this.f38628a = d.this.f38607j.b() * 4096;
            for (int i10 = 0; i10 < 10; i10++) {
                b bVar = new b();
                bVar.f38624a = new byte[this.f38628a];
                d.this.f38614q.offer(bVar);
            }
            if (d.this.f38607j.d().equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                int i11 = this.f38628a;
                this.f38629b = new short[i11 / 2];
                this.f38630c = new short[i11 / 2];
            }
        }

        private boolean a(b bVar) {
            int iD;
            String strD = d.this.f38607j.d();
            if (strD.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                AudioRecord audioRecord = d.this.f38602e;
                short[] sArr = this.f38629b;
                int i10 = audioRecord.read(sArr, 0, sArr.length);
                AudioRecord audioRecord2 = d.this.f38601d;
                short[] sArr2 = this.f38630c;
                int i11 = audioRecord2.read(sArr2, 0, sArr2.length);
                if (i10 < 0 && i11 < 0) {
                    return false;
                }
                if (i10 > 0) {
                    d.this.f38618u.incrementAndGet();
                    if (d.J(this.f38629b, i10)) {
                        d.this.f38619v.incrementAndGet();
                    }
                }
                this.f38630c = d.this.R(this.f38630c, Math.max(i11, 0), 2.0f);
                iD = d.this.D(this.f38629b, Math.max(i10, 0), this.f38630c, Math.max(i11, 0), bVar.f38624a);
                if (iD > 0) {
                    d.this.f38620w.incrementAndGet();
                    if (d.I(bVar.f38624a, iD)) {
                        d.this.f38621x.incrementAndGet();
                    }
                }
            } else if (strD.equals("1")) {
                AudioRecord audioRecord3 = d.this.f38602e;
                byte[] bArr = bVar.f38624a;
                iD = audioRecord3.read(bArr, 0, bArr.length);
                if (iD < 0) {
                    return false;
                }
                if (iD > 0) {
                    boolean zI = d.I(bVar.f38624a, iD);
                    d.this.f38618u.incrementAndGet();
                    d.this.f38620w.incrementAndGet();
                    if (zI) {
                        d.this.f38619v.incrementAndGet();
                        d.this.f38621x.incrementAndGet();
                    }
                }
            } else {
                AudioRecord audioRecord4 = d.this.f38601d;
                byte[] bArr2 = bVar.f38624a;
                iD = audioRecord4.read(bArr2, 0, bArr2.length);
                if (iD < 0) {
                    return false;
                }
                if (iD > 0) {
                    d.this.f38620w.incrementAndGet();
                    if (d.I(bVar.f38624a, iD)) {
                        d.this.f38621x.incrementAndGet();
                    }
                }
            }
            bVar.f38625b = iD;
            bVar.f38626c = d.this.E(iD << 3);
            return true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (d.this.f38610m.get()) {
                return;
            }
            try {
                b bVar = (b) d.this.f38614q.poll();
                if (bVar == null) {
                    bVar = new b();
                    bVar.f38624a = new byte[this.f38628a];
                }
                if (!a(bVar)) {
                    d.this.f38614q.offer(bVar);
                } else if (!d.this.f38615r.offer(bVar)) {
                    b bVar2 = (b) d.this.f38615r.poll();
                    if (bVar2 != null) {
                        d.this.f38614q.offer(bVar2);
                    }
                    d.this.f38615r.offer(bVar);
                    wp.a.a("Audio capture queue full, dropped oldest frame", new Object[0]);
                }
                if (d.this.f38610m.get()) {
                    return;
                }
                sendEmptyMessage(6);
            } catch (Exception e10) {
                wp.a.f(e10, "Audio capture failed", new Object[0]);
                d.this.f38612o.d(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class e extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedList f38632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedList f38633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f38634c;

        e(Looper looper) {
            super(looper);
            this.f38632a = new LinkedList();
            this.f38633b = new LinkedList();
            this.f38634c = 2048000 / d.this.f38603f;
        }

        private void a() {
            while (!d.this.f38610m.get()) {
                MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.f38632a.poll();
                if (bufferInfo == null) {
                    bufferInfo = new MediaCodec.BufferInfo();
                }
                MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
                int iDequeueOutputBuffer = d.this.f38598a.c().dequeueOutputBuffer(bufferInfo2, 1L);
                if (iDequeueOutputBuffer == -2) {
                    d.this.f38612o.f(d.this.f38598a, d.this.f38598a.c().getOutputFormat());
                }
                if (iDequeueOutputBuffer < 0) {
                    bufferInfo2.set(0, 0, 0L, 0);
                    this.f38632a.offer(bufferInfo2);
                    return;
                } else {
                    this.f38633b.offer(Integer.valueOf(iDequeueOutputBuffer));
                    d.this.f38612o.e(d.this.f38598a, iDequeueOutputBuffer, bufferInfo2);
                }
            }
        }

        private int b() {
            return d.this.f38598a.c().dequeueInputBuffer(0L);
        }

        private void c() {
            if (this.f38633b.size() > 1 || d.this.f38610m.get()) {
                return;
            }
            removeMessages(1);
            sendEmptyMessageDelayed(1, 0L);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                d.this.W();
                return;
            }
            if (i10 == 1) {
                if (d.this.f38610m.get()) {
                    return;
                }
                try {
                    if (d.this.f38615r.isEmpty()) {
                        sendEmptyMessageDelayed(1, 5L);
                        return;
                    }
                    int iB = b();
                    if (iB < 0) {
                        sendEmptyMessageDelayed(1, this.f38634c);
                        return;
                    }
                    boolean zF = d.this.F(iB);
                    if (zF && !d.this.f38610m.get()) {
                        sendEmptyMessage(2);
                        return;
                    } else {
                        if (zF) {
                            return;
                        }
                        sendEmptyMessageDelayed(1, 5L);
                        return;
                    }
                } catch (Exception e10) {
                    d.this.f38612o.d(e10);
                    return;
                }
            }
            if (i10 == 2) {
                a();
                c();
                return;
            }
            if (i10 == 3) {
                d.this.f38598a.i(message.arg1);
                this.f38633b.poll();
                c();
                return;
            }
            if (i10 == 4) {
                if (d.this.f38601d != null) {
                    try {
                        d.this.f38601d.stop();
                    } catch (Exception e11) {
                        wp.a.e(e11);
                    }
                }
                if (d.this.f38602e != null) {
                    try {
                        d.this.f38602e.stop();
                    } catch (Exception e12) {
                        wp.a.e(e12);
                    }
                }
                try {
                    d.this.f38598a.l();
                    return;
                } catch (IllegalStateException e13) {
                    wp.a.f(e13, "Audio encoder stop failed (codec may be in error state)", new Object[0]);
                    return;
                }
            }
            if (i10 != 5) {
                return;
            }
            if (d.this.f38616s != null) {
                d.this.f38616s.quitSafely();
                try {
                    d.this.f38616s.join(500L);
                } catch (InterruptedException unused) {
                }
                d.this.f38616s = null;
                d.this.f38617t = null;
            }
            if (d.this.f38622y != null) {
                d.this.f38614q.offer(d.this.f38622y);
                d.this.f38622y = null;
                d.this.f38623z = 0;
            }
            while (true) {
                b bVar = (b) d.this.f38615r.poll();
                if (bVar == null) {
                    break;
                } else {
                    d.this.f38614q.offer(bVar);
                }
            }
            if (d.this.f38601d != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    d.this.f38601d.unregisterAudioRecordingCallback(d.this.f38609l);
                }
                d.this.f38601d.release();
                d.this.f38601d = null;
            }
            if (d.this.f38602e != null) {
                d.this.f38602e.release();
                d.this.f38602e = null;
            }
            d.this.f38598a.h();
        }
    }

    d(eg.a aVar) {
        this.f38607j = aVar;
        this.f38598a = new fg.a(aVar);
        int iC = aVar.c();
        this.f38603f = iC;
        this.f38613p = iC * aVar.b();
        this.f38604g = aVar.b() == 2 ? 12 : 16;
        this.f38599b = new HandlerThread("AudioRecorder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int D(short[] sArr, int i10, short[] sArr2, int i11, byte[] bArr) {
        int i12;
        int iMax = Math.max(i10, i11);
        int i13 = 0;
        if (iMax < 0) {
            return 0;
        }
        while (i13 < iMax) {
            if (i13 >= i10) {
                i12 = sArr2[i13];
            } else {
                i12 = i13 >= i11 ? sArr[i13] : sArr[i13] + sArr2[i13];
            }
            int i14 = i12;
            if (i12 > 32767) {
                i14 = 32767;
            }
            if (i14 < -32768) {
                i14 = -32768;
            }
            int i15 = i13 * 2;
            bArr[i15] = (byte) (i14 & 255);
            bArr[i15 + 1] = (byte) ((i14 >> 8) & 255);
            i13++;
        }
        return iMax * 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long E(int i10) {
        int i11 = i10 >> 4;
        long j10 = this.A.get(i11, -1L);
        if (j10 == -1) {
            j10 = (((long) i11) * 1000000) / ((long) this.f38613p);
            this.A.put(i11, j10);
        }
        long jNanoTime = (System.nanoTime() / 1000) - j10;
        long j11 = this.B.get();
        if (j11 == -1) {
            j11 = jNanoTime;
        }
        if (jNanoTime - j11 < (j10 << 1)) {
            jNanoTime = j11;
        }
        this.B.set(j10 + jNanoTime);
        return jNanoTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    public boolean F(int i10) {
        boolean z10;
        long j10;
        int i11;
        int i12;
        int i13;
        if (i10 < 0 || this.f38610m.get()) {
            return false;
        }
        AudioRecord audioRecord = this.f38601d;
        if (audioRecord == null) {
            this.f38602e.getClass();
            if (this.f38602e.getRecordingState() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (audioRecord.getRecordingState() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        ByteBuffer byteBufferD = this.f38598a.d(i10);
        int iPosition = byteBufferD.position();
        if (z11) {
            j10 = 0;
            i11 = 4;
            i12 = 0;
        } else {
            b bVar = this.f38622y;
            if (bVar != null) {
                i13 = this.f38623z;
            } else {
                bVar = (b) this.f38615r.poll();
                if (bVar == null) {
                    this.f38598a.g(i10, iPosition, 0, System.nanoTime() / 1000, 0);
                    return false;
                }
                i13 = 0;
            }
            int i14 = bVar.f38625b - i13;
            int iMin = Math.min(i14, byteBufferD.limit());
            byteBufferD.clear();
            byteBufferD.put(bVar.f38624a, i13, iMin);
            j10 = bVar.f38626c + ((((long) i13) * 500000) / ((long) this.f38613p));
            if (iMin >= i14) {
                this.f38614q.offer(bVar);
                this.f38622y = null;
                this.f38623z = 0;
            } else {
                this.f38622y = bVar;
                this.f38623z = i13 + iMin;
            }
            i12 = iMin;
            i11 = 1;
        }
        this.f38598a.g(i10, iPosition, i12, j10, i11);
        return !z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean I(byte[] bArr, int i10) {
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10) {
                return true;
            }
            short s10 = (short) ((bArr[i12] << 8) | (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            if (s10 > 2 || s10 < -2) {
                return false;
            }
            i11 += 32;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean J(short[] sArr, int i10) {
        for (int i11 = 0; i11 < i10; i11 += 16) {
            short s10 = sArr[i11];
            if (s10 > 2 || s10 < -2) {
                return false;
            }
        }
        return true;
    }

    private void M(int i10, int i11) {
        int minBufferSize = AudioRecord.getMinBufferSize(i10, i11, 2) * 2;
        if (minBufferSize <= 0) {
            throw new IllegalArgumentException("Bad arguments: getMinBufferSize(" + i10 + ", " + i11 + ", 2)");
        }
        if ((this.f38607j.d().equals("1") || this.f38607j.d().equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) && Build.VERSION.SDK_INT >= 29) {
            fg.c.a();
            AudioRecord audioRecordBuild = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(44100).setChannelMask(16).build()).setBufferSizeInBytes(minBufferSize).setAudioPlaybackCaptureConfig(fg.b.a(this.f38606i).addMatchingUsage(1).addMatchingUsage(0).addMatchingUsage(14).build()).build();
            this.f38602e = audioRecordBuild;
            if (audioRecordBuild.getState() == 0) {
                throw new IllegalArgumentException("Bad arguments: getMinBufferSize(" + i10 + ", " + i11 + ", 2)");
            }
            this.f38602e.startRecording();
            wp.a.a("buffer size : %d", Integer.valueOf(minBufferSize));
        }
        if (this.f38607j.d().equals(MBridgeConstans.ENDCARD_URL_TYPE_PL) || this.f38607j.d().equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            AudioRecord audioRecord = new AudioRecord(1, i10, i11, 2, minBufferSize);
            this.f38601d = audioRecord;
            if (audioRecord.getState() != 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    this.f38601d.registerAudioRecordingCallback(this.f38608k, this.f38609l);
                }
                this.f38601d.startRecording();
                return;
            }
            throw new IllegalArgumentException("Bad arguments: getMinBufferSize(" + i10 + ", " + i11 + ", 2)");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x000c A[PHI: r2
      0x000c: PHI (r2v2 int) = (r2v0 int), (r2v1 int) binds: [B:5:0x000a, B:8:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    public short[] R(short[] sArr, int i10, float f10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = (int) (sArr[i11] * f10);
            int i13 = 32767;
            if (i12 > 32767) {
                i12 = i13;
            } else {
                i13 = -32768;
                if (i12 < -32768) {
                    i12 = i13;
                }
            }
            sArr[i11] = (short) i12;
        }
        return sArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        try {
            M(this.f38603f, this.f38604g);
            HandlerThread handlerThread = new HandlerThread("AudioCaptureThread");
            this.f38616s = handlerThread;
            handlerThread.start();
            this.f38617t = new HandlerC0580d(this.f38616s.getLooper());
            this.f38598a.k();
            this.f38617t.sendEmptyMessage(6);
            this.f38600c.sendEmptyMessage(1);
        } catch (Exception e10) {
            this.f38612o.d(e10);
        }
    }

    ByteBuffer G(int i10) {
        return this.f38598a.e(i10);
    }

    public eg.d.a H() {
        return new eg.d.a(this.f38618u.get(), this.f38619v.get(), this.f38620w.get(), this.f38621x.get());
    }

    public void K() {
        HandlerC0580d handlerC0580d = this.f38617t;
        if (handlerC0580d != null) {
            handlerC0580d.removeMessages(6);
        }
    }

    public void L() {
        this.B.set(-1L);
        HandlerC0580d handlerC0580d = this.f38617t;
        if (handlerC0580d != null) {
            handlerC0580d.sendEmptyMessage(6);
        }
    }

    public void N() {
        e eVar = this.f38600c;
        if (eVar != null) {
            eVar.sendEmptyMessage(5);
        }
        this.f38599b.quitSafely();
    }

    void O(int i10) {
        Message.obtain(this.f38600c, 3, i10, 0).sendToTarget();
    }

    public void P() {
        this.f38618u.set(0L);
        this.f38619v.set(0L);
        this.f38620w.set(0L);
        this.f38621x.set(0L);
    }

    public void Q() {
        this.B.set(-1L);
    }

    public void S(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        this.f38608k = executor;
        this.f38609l = audioRecordingCallback;
    }

    public void T(h.b bVar) {
        this.f38611n = bVar;
    }

    public void U(MediaProjection mediaProjection) {
        this.f38606i = mediaProjection;
    }

    public void V() {
        Looper looperMyLooper = Looper.myLooper();
        Objects.requireNonNull(looperMyLooper, "Should prepare in HandlerThread");
        this.f38612o = new c(looperMyLooper, this.f38611n);
        this.f38599b.start();
        e eVar = new e(this.f38599b.getLooper());
        this.f38600c = eVar;
        eVar.sendEmptyMessage(0);
    }

    public void X() {
        c cVar = this.f38612o;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
        this.f38610m.set(true);
        e eVar = this.f38600c;
        if (eVar != null) {
            eVar.sendEmptyMessage(4);
        }
    }
}
