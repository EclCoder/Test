package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.interstitial.signalcommon.interstitial;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import com.mbridge.msdk.splash.signal.SplashSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HashMap<String, Class> f31718d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f31719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f31720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WindVaneWebView f31721c;

    public e(Context context, WindVaneWebView windVaneWebView) {
        this.f31719a = context;
        this.f31721c = windVaneWebView;
        a();
    }

    public void a(Context context) {
        this.f31719a = context;
    }

    public void a(Object obj) {
        this.f31720b = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f31718d.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!g.class.isAssignableFrom(cls)) {
                return null;
            }
            g gVar = (g) cls.newInstance();
            gVar.initialize(context, windVaneWebView);
            gVar.initialize(this.f31720b, windVaneWebView);
            return gVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void a(String str, Class cls) {
        if (f31718d == null) {
            f31718d = new HashMap<>();
        }
        f31718d.put(str, cls);
    }

    public Object a(String str) {
        if (f31718d == null) {
            f31718d = new HashMap<>();
        }
        return a(str, this.f31721c, this.f31719a);
    }

    public void a() {
        try {
            int i10 = interstitial.f31103i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f31591a, interstitial.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            int i11 = RewardSignal.f34710i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f31592b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            int i12 = VideoCommunication.f34736j;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f31593c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            int i13 = MraidSignalCommunication.f31662h;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f31595e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i14 = BannerSignalPlugin.f31650i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f31596f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            int i15 = SplashSignal.f32787i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f31597g, SplashSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
        try {
            int i16 = WebGLCheckSignal.f31674g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f31598h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (com.mbridge.msdk.util.b.a()) {
                Class<?> cls = Class.forName(HqKnbV.OcWDMbaAco);
                a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }
}
