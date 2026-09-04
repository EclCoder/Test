package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.inmobi.media.Th;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class Th extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f25764a;

    public Th(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        this.f25764a = gestureDetectorOnGestureListenerC3228pi;
    }

    public static final void a(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.confirm();
    }

    public static final void b(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.confirm();
    }

    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.s.g(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage cm2) {
        kotlin.jvm.internal.s.h(cm2, "cm");
        String str = cm2.message() + " -- From line " + cm2.lineNumber() + " of " + cm2.sourceId();
        InterfaceC3322t9 interfaceC3322t9 = this.f25764a.f27233i;
        if (interfaceC3322t9 == null) {
            return true;
        }
        String str2 = GestureDetectorOnGestureListenerC3228pi.f27210i1;
        kotlin.jvm.internal.s.g(str2, "access$getTAG$cp(...)");
        ((C3348u9) interfaceC3322t9).c(str2, "Console message:" + str);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final String origin, final GeolocationPermissions.Callback callback) {
        kotlin.jvm.internal.s.h(origin, "origin");
        kotlin.jvm.internal.s.h(callback, "callback");
        if (this.f25764a.f27257u.get() != null) {
            new AlertDialog.Builder((Context) this.f25764a.f27257u.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: yh.i4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Th.a(callback, origin, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: yh.j4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Th.b(callback, origin, dialogInterface, i10);
                }
            }).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(origin, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(message, "message");
        kotlin.jvm.internal.s.h(result, "result");
        InterfaceC3322t9 interfaceC3322t9 = this.f25764a.f27233i;
        if (interfaceC3322t9 != null) {
            String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
            kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
            ((C3348u9) interfaceC3322t9).a(str, "jsAlert called with: " + message + url);
        }
        if (!this.f25764a.a(result)) {
            return true;
        }
        Activity fullScreenActivity = this.f25764a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new AlertDialog.Builder(fullScreenActivity).setMessage(message).setTitle(url).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: yh.h4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Th.a(result, dialogInterface, i10);
                }
            }).setCancelable(false).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(message, "message");
        kotlin.jvm.internal.s.h(result, "result");
        InterfaceC3322t9 interfaceC3322t9 = this.f25764a.f27233i;
        if (interfaceC3322t9 != null) {
            String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
            kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
            ((C3348u9) interfaceC3322t9).a(str, "jsConfirm called with: " + message + url);
        }
        if (!this.f25764a.a(result)) {
            return true;
        }
        if (this.f25764a.getFullScreenActivity() != null) {
            new AlertDialog.Builder(this.f25764a.getFullScreenActivity()).setMessage(message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: yh.k4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Th.b(result, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: yh.l4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Th.c(result, dialogInterface, i10);
                }
            }).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(message, "message");
        kotlin.jvm.internal.s.h(defaultValue, "defaultValue");
        kotlin.jvm.internal.s.h(result, "result");
        InterfaceC3322t9 interfaceC3322t9 = this.f25764a.f27233i;
        if (interfaceC3322t9 != null) {
            String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
            kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
            ((C3348u9) interfaceC3322t9).a(str, "jsPrompt called with: " + message + url);
        }
        if (!this.f25764a.a(result)) {
            return true;
        }
        if (this.f25764a.getFullScreenActivity() != null) {
            return false;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f25764a.f27233i;
        if (interfaceC3322t9 != null) {
            String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
            kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
            ((C3348u9) interfaceC3322t9).c(str, "webview progress changed - " + i10);
        }
        super.onProgressChanged(webView, i10);
    }

    public static final void a(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i10) {
        callback.invoke(str, true, false);
    }

    public static final void b(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i10) {
        callback.invoke(str, false, false);
    }
}
