package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.media.Ec;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3228pi f24708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3322t9 f24709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3222pc f24710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3041ic f24711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3041ic f24712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3041ic f24713f;

    public Ec(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, InterfaceC3322t9 interfaceC3322t9) {
        this.f24708a = gestureDetectorOnGestureListenerC3228pi;
        this.f24709b = interfaceC3322t9;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        Context context = Xi.f26021a;
        if (context == null) {
            return false;
        }
        AudioManager audioManager = null;
        try {
            Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            audioManager = (AudioManager) systemService;
        } catch (Throwable unused) {
        }
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final void a(String url, Activity activity) {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(activity, "activity");
        InterfaceC3322t9 interfaceC3322t9 = this.f24709b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("MraidMediaProcessor", "doPlayMedia");
        }
        C3222pc c3222pc = new C3222pc(activity, this.f24709b);
        this.f24710c = c3222pc;
        c3222pc.setPlaybackData(url);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        C3222pc c3222pc2 = this.f24710c;
        if (c3222pc2 != null) {
            c3222pc2.setLayoutParams(layoutParams);
        }
        C3248qc c3248qc = new C3248qc(activity);
        c3248qc.setOnTouchListener(new View.OnTouchListener() { // from class: yh.h1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Ec.a(view, motionEvent);
            }
        });
        c3248qc.setBackgroundColor(-16777216);
        c3248qc.addView(this.f24710c);
        InterfaceC3322t9 interfaceC3322t10 = this.f24709b;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c3248qc, new ViewGroup.LayoutParams(-1, -1));
        C3222pc c3222pc3 = this.f24710c;
        if (c3222pc3 != null) {
            c3222pc3.setViewContainer(c3248qc);
        }
        C3222pc c3222pc4 = this.f24710c;
        if (c3222pc4 != null) {
            c3222pc4.requestFocus();
        }
        C3222pc c3222pc5 = this.f24710c;
        if (c3222pc5 != null) {
            c3222pc5.setOnKeyListener(new View.OnKeyListener() { // from class: yh.i1
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    return Ec.a(this.f57766a, view, i10, keyEvent);
                }
            });
        }
        C3222pc c3222pc6 = this.f24710c;
        if (c3222pc6 != null) {
            c3222pc6.setListener(new Dc(this));
        }
        C3222pc c3222pc7 = this.f24710c;
        if (c3222pc7 != null) {
            c3222pc7.a();
        }
    }

    public final void b(String str, boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24709b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24708a;
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.a(str, "fireHeadphonePluggedEvent(" + z10 + ");");
        }
    }

    public static final boolean a(Ec ec2, View view, int i10, KeyEvent keyEvent) {
        if (4 != i10 || keyEvent.getAction() != 0) {
            return false;
        }
        C3222pc c3222pc = ec2.f24710c;
        if (c3222pc == null) {
            return true;
        }
        c3222pc.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        InterfaceC3322t9 interfaceC3322t9 = this.f24709b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("MraidMediaProcessor", "deviceVolume");
        }
        Context context = Xi.f26021a;
        if (context == null) {
            return -1;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24708a;
        if (((gestureDetectorOnGestureListenerC3228pi == null || (renderingConfig = gestureDetectorOnGestureListenerC3228pi.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && Xi.f26026f) {
            return 0;
        }
        AudioManager audioManager = null;
        try {
            Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            audioManager = (AudioManager) systemService;
        } catch (Throwable unused) {
        }
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final void a(String str, boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24709b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24708a;
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.a(str, "fireDeviceMuteChangeEvent(" + z10 + ");");
        }
    }

    public final void a(String str, int i10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24709b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24708a;
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.a(str, "fireDeviceVolumeChangeEvent(" + i10 + HqKnbV.BwpwwIJcKvvWYb);
        }
    }
}
