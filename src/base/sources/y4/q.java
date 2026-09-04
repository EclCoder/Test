package y4;

import android.webkit.WebViewClient;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WebViewProviderBoundaryInterface f57418a;

    public q(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f57418a = webViewProviderBoundaryInterface;
    }

    public j a(String str, String[] strArr) {
        return j.a(this.f57418a.addDocumentStartJavaScript(str, strArr));
    }

    public void b(String str, String[] strArr, x4.f.a aVar) {
        this.f57418a.addWebMessageListener(str, strArr, jp.a.c(new m(aVar)));
    }

    public WebViewClient c() {
        return this.f57418a.getWebViewClient();
    }

    public void d(String str) {
        this.f57418a.removeWebMessageListener(str);
    }

    public void e(boolean z10) {
        this.f57418a.setAudioMuted(z10);
    }

    public void f(String str) {
        this.f57418a.setProfile(str);
    }
}
