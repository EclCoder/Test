package com.bytedance.sdk.component.ojm;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends WebView {
    private qor dkl;
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final HashSet<String> f12938hn;
    public long hnj;
    private boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12939sk;

    public sk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12938hn = new HashSet<>();
        this.hnj = System.currentTimeMillis();
        hn();
    }

    private void hn() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new dkl.hnj());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (this.qor || this.f12939sk) {
            return;
        }
        super.addJavascriptInterface(obj, str);
        this.f12938hn.add(str);
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z10) {
        if (this.qor || this.f12939sk) {
            return;
        }
        super.clearCache(z10);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.qor) {
            return;
        }
        this.qor = true;
        hnj();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.qor && !this.f12939sk) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.qor || this.f12939sk) {
            return;
        }
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i10) {
        if (this.qor || this.f12939sk) {
            return;
        }
        super.goBackOrForward(i10);
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.qor || this.f12939sk) {
            return;
        }
        super.goForward();
    }

    public void hnj() {
        if (this.qor) {
            return;
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        setOnScrollChangeListener(null);
        Iterator<String> it = this.f12938hn.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
        this.f12938hn.clear();
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.qor || this.f12939sk) {
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.qor || this.f12939sk) {
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.gjv) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.qor || this.f12939sk) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.qor || this.f12939sk) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.qor || this.f12939sk) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.qor || this.f12939sk) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.qor || this.f12939sk) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.qor || this.f12939sk) {
            return;
        }
        super.reload();
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.qor || this.f12939sk) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.f12938hn.remove(str);
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.qor || this.f12939sk) {
            return;
        }
        super.resumeTimers();
    }

    public void setDestroyOnDetached(boolean z10) {
        this.gjv = z10;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        qor qorVar = this.dkl;
        if (qorVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            qorVar.hnj(onTouchListener);
            super.setOnTouchListener(this.dkl);
        }
    }

    public void setRecycler(boolean z10) {
        this.f12939sk = z10;
    }

    public void setTouchListenerProxy(qor qorVar) {
        this.dkl = qorVar;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.qor || this.f12939sk) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (this.qor || this.f12939sk) {
            return;
        }
        try {
            super.loadUrl(str, map);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    public sk(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12938hn = new HashSet<>();
        this.hnj = System.currentTimeMillis();
        hn();
    }
}
