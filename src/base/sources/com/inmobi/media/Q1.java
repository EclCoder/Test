package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.inmobi.media.Q1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f25529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioAttributes f25530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioFocusRequest f25531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f25532f;

    public Q1(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext, "getApplicationContext(...)");
        this.f25527a = applicationContext;
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        kotlin.jvm.internal.s.g(audioAttributesBuild, "build(...)");
        this.f25530d = audioAttributesBuild;
    }

    public final void a() {
        this.f25528b = false;
        try {
            Object systemService = this.f25527a.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f25531e;
                    if (audioFocusRequest != null) {
                        audioManager.abandonAudioFocusRequest(audioFocusRequest);
                        return;
                    }
                    return;
                }
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f25532f;
                if (onAudioFocusChangeListener != null) {
                    audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new AudioManager.OnAudioFocusChangeListener() { // from class: yh.s3
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                Q1.a(this.f57919a, i10);
            }
        };
    }

    public final AudioFocusRequest c() {
        AudioFocusRequest.Builder audioAttributes = androidx.media3.exoplayer.c.a(2).setAudioAttributes(this.f25530d);
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f25532f;
        kotlin.jvm.internal.s.e(onAudioFocusChangeListener);
        AudioFocusRequest audioFocusRequestBuild = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener, ((ExecutorC2937ec) AbstractC3293s6.f27440e.getValue()).f26488a).build();
        kotlin.jvm.internal.s.g(audioFocusRequestBuild, "build(...)");
        return audioFocusRequestBuild;
    }

    public final void d() {
        WeakReference weakReference = this.f25529c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f25529c = null;
        a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f25531e = null;
        }
        this.f25532f = null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    public final boolean e() {
        int iRequestAudioFocus;
        try {
            Object systemService = this.f25527a.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager == null) {
                iRequestAudioFocus = 0;
            } else {
                if (this.f25532f == null) {
                    this.f25532f = b();
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (this.f25531e == null) {
                        this.f25531e = c();
                    }
                    AudioFocusRequest audioFocusRequest = this.f25531e;
                    if (audioFocusRequest != null) {
                        iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                    } else {
                        iRequestAudioFocus = 0;
                    }
                } else {
                    iRequestAudioFocus = audioManager.requestAudioFocus(this.f25532f, 3, 2);
                }
            }
            return iRequestAudioFocus == 1;
        } catch (Throwable unused) {
        }
    }

    public static final void a(Q1 q10, int i10) {
        P1 p10;
        P1 p11;
        WeakReference weakReference;
        P1 p12;
        if (i10 == -2) {
            q10.f25528b = true;
            WeakReference weakReference2 = q10.f25529c;
            if (weakReference2 == null || (p10 = (P1) weakReference2.get()) == null) {
                return;
            }
            p10.a();
            return;
        }
        if (i10 == -1) {
            q10.f25528b = false;
            WeakReference weakReference3 = q10.f25529c;
            if (weakReference3 == null || (p11 = (P1) weakReference3.get()) == null) {
                return;
            }
            p11.a();
            return;
        }
        if (i10 != 1) {
            return;
        }
        if (q10.f25528b && (weakReference = q10.f25529c) != null && (p12 = (P1) weakReference.get()) != null) {
            p12.b();
        }
        q10.f25528b = false;
    }
}
