package y4;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class m implements WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x4.f.a f57379a;

    public m(x4.f.a aVar) {
        this.f57379a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        x4.d dVarB = l.b((WebMessageBoundaryInterface) jp.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (dVarB != null) {
            this.f57379a.onPostMessage(webView, dVarB, uri, z10, g.b(invocationHandler2));
        }
    }
}
