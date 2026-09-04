package y4;

import android.os.Looper;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static ClassLoader a() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper b(WebView webView) {
        return webView.getWebViewLooper();
    }
}
