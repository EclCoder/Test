package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public interface WebViewProviderBoundaryInterface {
    InvocationHandler addDocumentStartJavaScript(String str, String[] strArr);

    void addWebMessageListener(String str, String[] strArr, InvocationHandler invocationHandler);

    InvocationHandler[] createWebMessageChannel();

    InvocationHandler getProfile();

    WebChromeClient getWebChromeClient();

    WebViewClient getWebViewClient();

    InvocationHandler getWebViewRenderer();

    InvocationHandler getWebViewRendererClient();

    void insertVisualStateCallback(long j10, InvocationHandler invocationHandler);

    boolean isAudioMuted();

    void postMessageToMainFrame(InvocationHandler invocationHandler, Uri uri);

    void removeWebMessageListener(String str);

    void setAudioMuted(boolean z10);

    void setProfile(String str);

    void setWebViewRendererClient(InvocationHandler invocationHandler);
}
