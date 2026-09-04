package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f5340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f5341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f5342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t1.b f5343d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5345f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f5347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5348i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f5346g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5344e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f5349a;

        public a(Handler handler) {
            this.f5349a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f5349a.post(new Runnable() { // from class: androidx.media3.exoplayer.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.h(i10);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void t(float f10);

        void u(int i10);
    }

    public g(Context context, Handler handler, b bVar) {
        this.f5340a = (AudioManager) w1.a.e((AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f5342c = bVar;
        this.f5341b = new a(handler);
    }

    private void a() {
        this.f5340a.abandonAudioFocus(this.f5341b);
    }

    private void b() {
        int i10 = this.f5344e;
        if (i10 == 1 || i10 == 0) {
            return;
        }
        if (w1.c0.f55769a >= 26) {
            c();
        } else {
            a();
        }
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f5347h;
        if (audioFocusRequest != null) {
            this.f5340a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(t1.b bVar) {
        if (bVar == null) {
            return 0;
        }
        switch (bVar.f52560c) {
            case 0:
                w1.n.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (bVar.f52558a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                w1.n.h("AudioFocusManager", "Unidentified audio usage: " + bVar.f52560c);
                return 0;
            case 16:
                return 4;
        }
    }

    private void f(int i10) {
        b bVar = this.f5342c;
        if (bVar != null) {
            bVar.u(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !q()) {
                n(4);
                return;
            } else {
                f(0);
                n(3);
                return;
            }
        }
        if (i10 == -1) {
            f(-1);
            b();
            n(1);
        } else if (i10 == 1) {
            n(2);
            f(1);
        } else {
            w1.n.h("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private int j() {
        if (this.f5344e == 2) {
            return 1;
        }
        if ((w1.c0.f55769a >= 26 ? l() : k()) == 1) {
            n(2);
            return 1;
        }
        n(1);
        return -1;
    }

    private int k() {
        return this.f5340a.requestAudioFocus(this.f5341b, w1.c0.h0(((t1.b) w1.a.e(this.f5343d)).f52560c), this.f5345f);
    }

    private int l() {
        AudioFocusRequest.Builder builderA;
        AudioFocusRequest audioFocusRequest = this.f5347h;
        if (audioFocusRequest == null || this.f5348i) {
            if (audioFocusRequest == null) {
                e.a();
                builderA = c.a(this.f5345f);
            } else {
                e.a();
                builderA = d.a(this.f5347h);
            }
            this.f5347h = builderA.setAudioAttributes(((t1.b) w1.a.e(this.f5343d)).a().f52564a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f5341b).build();
            this.f5348i = false;
        }
        return this.f5340a.requestAudioFocus(this.f5347h);
    }

    private void n(int i10) {
        if (this.f5344e == i10) {
            return;
        }
        this.f5344e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f5346g == f10) {
            return;
        }
        this.f5346g = f10;
        b bVar = this.f5342c;
        if (bVar != null) {
            bVar.t(f10);
        }
    }

    private boolean o(int i10) {
        return i10 != 1 && this.f5345f == 1;
    }

    private boolean q() {
        t1.b bVar = this.f5343d;
        return bVar != null && bVar.f52558a == 1;
    }

    public float g() {
        return this.f5346g;
    }

    public void i() {
        this.f5342c = null;
        b();
        n(0);
    }

    public void m(t1.b bVar) {
        if (w1.c0.c(this.f5343d, bVar)) {
            return;
        }
        this.f5343d = bVar;
        int iE = e(bVar);
        this.f5345f = iE;
        boolean z10 = true;
        if (iE != 1 && iE != 0) {
            z10 = false;
        }
        w1.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int p(boolean z10, int i10) {
        if (!o(i10)) {
            b();
            n(0);
            return 1;
        }
        if (z10) {
            return j();
        }
        int i11 = this.f5344e;
        if (i11 != 1) {
            return i11 != 3 ? 1 : 0;
        }
        return -1;
    }
}
