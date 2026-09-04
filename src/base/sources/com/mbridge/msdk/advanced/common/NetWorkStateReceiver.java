package com.mbridge.msdk.advanced.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class NetWorkStateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28100c = "NetWorkStateReceiver";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f28101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28102b;

    public NetWorkStateReceiver(WebView webView) {
        this.f28101a = webView;
    }

    public void a() {
        this.f28101a = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                a(this.f28101a, 0);
                return;
            }
            if (!com.mbridge.msdk.foundation.same.a.f30504z) {
                a(this.f28101a, 0);
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                a(this.f28101a, 0);
                return;
            }
            if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                if (activeNetworkInfo.getType() == 1) {
                    a(this.f28101a, 9);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    a(this.f28101a, 0);
                    return;
                }
                int networkType = telephonyManager.getNetworkType();
                this.f28102b = networkType;
                int iC = m0.c(networkType);
                this.f28102b = iC;
                a(this.f28101a, iC);
            }
        } catch (Throwable th2) {
            q0.a(f28100c, th2.getMessage());
        }
    }

    public void a(WebView webView, int i10) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a(webView, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th2) {
                q0.a(f28100c, th2.getMessage());
            }
        }
    }
}
