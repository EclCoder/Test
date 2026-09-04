package x4;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import y4.o;
import y4.p;
import y4.q;
import y4.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f56639a = Uri.parse("*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f56640b = Uri.parse("");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void onPostMessage(WebView webView, d dVar, Uri uri, boolean z10, x4.a aVar);
    }

    public static c a(WebView webView, String str, Set set) {
        if (o.V.d()) {
            return h(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw o.a();
    }

    public static void b(WebView webView, String str, Set set, a aVar) {
        if (!o.U.d()) {
            throw o.a();
        }
        h(webView).b(str, (String[]) set.toArray(new String[0]), aVar);
    }

    private static void c(WebView webView) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        Looper looperB = y4.c.b(webView);
        if (looperB == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + looperB + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    private static WebViewProviderBoundaryInterface d(WebView webView) {
        return f().createWebView(webView);
    }

    public static PackageInfo e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return y4.b.a();
        }
        try {
            return g();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static r f() {
        return p.c();
    }

    private static PackageInfo g() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    private static q h(WebView webView) {
        return new q(d(webView));
    }

    public static String i() {
        if (o.X.d()) {
            return f().getStatics().getVariationsHeader();
        }
        throw o.a();
    }

    public static WebViewClient j(WebView webView) {
        y4.a.e eVar = o.H;
        if (eVar.c()) {
            return y4.b.b(webView);
        }
        if (!eVar.d()) {
            throw o.a();
        }
        c(webView);
        return h(webView).c();
    }

    public static boolean k() {
        if (o.R.d()) {
            return f().getStatics().isMultiProcessEnabled();
        }
        throw o.a();
    }

    public static void l(WebView webView, String str) {
        if (!o.U.d()) {
            throw o.a();
        }
        h(webView).d(str);
    }

    public static void m(WebView webView, boolean z10) {
        if (!o.f57392f0.d()) {
            throw o.a();
        }
        h(webView).e(z10);
    }

    public static void n(WebView webView, String str) {
        if (!o.f57386c0.d()) {
            throw o.a();
        }
        h(webView).f(str);
    }
}
