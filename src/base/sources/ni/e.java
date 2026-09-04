package ni;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AudioRecord f47781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f47782c;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f47791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected HandlerThread f47792m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47780a = "MicrophoneManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected byte[] f47783d = new byte[8192];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected byte[] f47784e = new byte[8192];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f47785f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47786g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47787h = 32000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f47788i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f47789j = 12;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f47790k = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected b f47793n = new h();

    public e(c cVar) {
        this.f47782c = cVar;
    }

    private void d(int i10, int i11) {
        int iMax = Math.max(AudioRecord.getMinBufferSize(i10, i11, 2), 8192);
        this.f47783d = new byte[iMax];
        this.f47784e = new byte[iMax];
    }

    private void e() {
        AudioRecord audioRecord = this.f47781b;
        if (audioRecord == null) {
            throw new IllegalStateException("Error starting, microphone was stopped or not created, use createMicrophone() before start()");
        }
        audioRecord.startRecording();
        this.f47785f = true;
        Log.i("MicrophoneManager", "Microphone started");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        while (this.f47785f) {
            li.e eVarG = g();
            if (eVarG != null) {
                this.f47782c.a(eVarG);
            }
        }
    }

    public boolean c(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        try {
            this.f47787h = i11;
            int i12 = z10 ? 12 : 16;
            this.f47789j = i12;
            d(i11, i12);
            AudioRecord audioRecord = new AudioRecord(i10, i11, this.f47789j, 2, 40960);
            this.f47781b = audioRecord;
            a aVar = new a(audioRecord.getAudioSessionId());
            this.f47791l = aVar;
            if (z11) {
                aVar.a();
            }
            if (z12) {
                this.f47791l.b();
            }
            String str = z10 ? "Stereo" : "Mono";
            if (this.f47781b.getState() != 1) {
                throw new IllegalArgumentException("Some parameters specified are not valid");
            }
            Log.i("MicrophoneManager", "Microphone created, " + i11 + "hz, " + str);
            this.f47786g = true;
            return this.f47786g;
        } catch (IllegalArgumentException e10) {
            Log.e("MicrophoneManager", "create microphone error", e10);
        }
    }

    protected li.e g() {
        long jNanoTime = System.nanoTime() / 1000;
        AudioRecord audioRecord = this.f47781b;
        byte[] bArr = this.f47783d;
        int i10 = audioRecord.read(bArr, 0, bArr.length);
        if (i10 >= 0) {
            return new li.e(this.f47790k ? this.f47784e : this.f47793n.a(this.f47783d), 0, i10, jNanoTime);
        }
        Log.e("MicrophoneManager", "read error: " + i10);
        return null;
    }

    public synchronized void h() {
        e();
        HandlerThread handlerThread = new HandlerThread("MicrophoneManager");
        this.f47792m = handlerThread;
        handlerThread.start();
        new Handler(this.f47792m.getLooper()).post(new Runnable() { // from class: ni.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f47779a.f();
            }
        });
    }

    public synchronized void i() {
        try {
            this.f47785f = false;
            this.f47786g = false;
            HandlerThread handlerThread = this.f47792m;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            AudioRecord audioRecord = this.f47781b;
            if (audioRecord != null) {
                audioRecord.setRecordPositionUpdateListener(null);
                this.f47781b.stop();
                this.f47781b.release();
                this.f47781b = null;
            }
            a aVar = this.f47791l;
            if (aVar != null) {
                aVar.c();
            }
            Log.i("MicrophoneManager", "Microphone stopped");
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
