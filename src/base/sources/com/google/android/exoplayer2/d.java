package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f16723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f16724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f16725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.a f16726d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16728f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f16730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f16731i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f16729g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16727e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f16732a;

        public a(Handler handler) {
            this.f16732a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f16732a.post(new Runnable() { // from class: com.google.android.exoplayer2.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.h(i10);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void t(float f10);

        void u(int i10);
    }

    public d(Context context, Handler handler, b bVar) {
        this.f16723a = (AudioManager) ob.a.e((AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f16725c = bVar;
        this.f16724b = new a(handler);
    }

    private void a() {
        this.f16723a.abandonAudioFocus(this.f16724b);
    }

    private void b() {
        if (this.f16727e == 0) {
            return;
        }
        if (ob.r0.f48425a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f16730h;
        if (audioFocusRequest != null) {
            this.f16723a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(com.google.android.exoplayer2.audio.a aVar) {
        if (aVar == null) {
            return 0;
        }
        switch (aVar.f16548c) {
            case 0:
                ob.u.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                if (aVar.f16546a == 1) {
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
                ob.u.i("AudioFocusManager", "Unidentified audio usage: " + aVar.f16548c);
                return 0;
            case 16:
                return ob.r0.f48425a >= 19 ? 4 : 2;
        }
    }

    private void f(int i10) {
        b bVar = this.f16725c;
        if (bVar != null) {
            bVar.u(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !q()) {
                n(3);
                return;
            } else {
                f(0);
                n(2);
                return;
            }
        }
        if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 == 1) {
            n(1);
            f(1);
        } else {
            ob.u.i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private int j() {
        if (this.f16727e == 1) {
            return 1;
        }
        if ((ob.r0.f48425a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.f16723a.requestAudioFocus(this.f16724b, ob.r0.j0(((com.google.android.exoplayer2.audio.a) ob.a.e(this.f16726d)).f16548c), this.f16728f);
    }

    private int l() {
        AudioFocusRequest.Builder builderA;
        AudioFocusRequest audioFocusRequest = this.f16730h;
        if (audioFocusRequest == null || this.f16731i) {
            if (audioFocusRequest == null) {
                androidx.media3.exoplayer.e.a();
                builderA = androidx.media3.exoplayer.c.a(this.f16728f);
            } else {
                androidx.media3.exoplayer.e.a();
                builderA = androidx.media3.exoplayer.d.a(this.f16730h);
            }
            this.f16730h = builderA.setAudioAttributes(((com.google.android.exoplayer2.audio.a) ob.a.e(this.f16726d)).b().f16552a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f16724b).build();
            this.f16731i = false;
        }
        return this.f16723a.requestAudioFocus(this.f16730h);
    }

    private void n(int i10) {
        if (this.f16727e == i10) {
            return;
        }
        this.f16727e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f16729g == f10) {
            return;
        }
        this.f16729g = f10;
        b bVar = this.f16725c;
        if (bVar != null) {
            bVar.t(f10);
        }
    }

    private boolean o(int i10) {
        return i10 == 1 || this.f16728f != 1;
    }

    private boolean q() {
        com.google.android.exoplayer2.audio.a aVar = this.f16726d;
        return aVar != null && aVar.f16546a == 1;
    }

    public float g() {
        return this.f16729g;
    }

    public void i() {
        this.f16725c = null;
        b();
    }

    public void m(com.google.android.exoplayer2.audio.a aVar) {
        if (ob.r0.c(this.f16726d, aVar)) {
            return;
        }
        this.f16726d = aVar;
        int iE = e(aVar);
        this.f16728f = iE;
        boolean z10 = true;
        if (iE != 1 && iE != 0) {
            z10 = false;
        }
        ob.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int p(boolean z10, int i10) {
        if (o(i10)) {
            b();
            return z10 ? 1 : -1;
        }
        if (z10) {
            return j();
        }
        return -1;
    }
}
