package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends j1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f15349q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f15350r = r.class.getName();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f15351p;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(Context context, String url, String expectedRedirectUrl) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(url, "url");
            kotlin.jvm.internal.s.h(expectedRedirectUrl, "expectedRedirectUrl");
            j1.s(context);
            return new r(context, url, expectedRedirectUrl, null);
        }

        private a() {
        }
    }

    public /* synthetic */ r(Context context, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(r this$0) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.j1, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView webViewR = r();
        if (!u() || t() || webViewR == null || !webViewR.isShown()) {
            super.cancel();
            return;
        }
        if (this.f15351p) {
            return;
        }
        this.f15351p = true;
        webViewR.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.q
            @Override // java.lang.Runnable
            public final void run() {
                r.F(this.f15346a);
            }
        }, 1500L);
    }

    @Override // com.facebook.internal.j1
    public Bundle w(String str) {
        Bundle bundleQ0 = e1.q0(Uri.parse(str).getQuery());
        String string = bundleQ0.getString("bridge_args");
        bundleQ0.remove("bridge_args");
        if (!e1.e0(string)) {
            try {
                bundleQ0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", d.a(new JSONObject(string)));
            } catch (JSONException e10) {
                e1.m0(f15350r, "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = bundleQ0.getString("method_results");
        bundleQ0.remove("method_results");
        if (!e1.e0(string2)) {
            try {
                bundleQ0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", d.a(new JSONObject(string2)));
            } catch (JSONException e11) {
                e1.m0(f15350r, "Unable to parse bridge_args JSON", e11);
            }
        }
        bundleQ0.remove("version");
        bundleQ0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", u0.z());
        return bundleQ0;
    }

    private r(Context context, String str, String str2) {
        super(context, str);
        A(str2);
    }
}
