package y4;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f57419a;

    public s(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f57419a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // y4.r
    public String[] a() {
        return this.f57419a.getSupportedFeatures();
    }

    @Override // y4.r
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) jp.a.a(WebViewProviderBoundaryInterface.class, this.f57419a.createWebView(webView));
    }

    @Override // y4.r
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) jp.a.a(ProfileStoreBoundaryInterface.class, this.f57419a.getProfileStore());
    }

    @Override // y4.r
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) jp.a.a(StaticsBoundaryInterface.class, this.f57419a.getStatics());
    }
}
