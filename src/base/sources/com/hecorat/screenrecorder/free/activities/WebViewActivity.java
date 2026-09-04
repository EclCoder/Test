package com.hecorat.screenrecorder.free.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.hecorat.screenrecorder.free.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/WebViewActivity;", "Lff/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "c", "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebViewActivity extends ff.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f22764d = "key_url";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            s.h(view, "view");
            s.h(url, "url");
            view.loadUrl(url);
            return true;
        }
    }

    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        View viewFindViewById = findViewById(R.id.root_view);
        s.g(viewFindViewById, "findViewById(...)");
        y0(viewFindViewById);
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
        }
        androidx.appcompat.app.a aVarL1 = l0();
        if (aVarL1 != null) {
            aVarL1.w(0.0f);
        }
        View viewFindViewById2 = findViewById(R.id.webview);
        s.g(viewFindViewById2, "findViewById(...)");
        WebView webView = (WebView) viewFindViewById2;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new b());
        String stringExtra = getIntent().getStringExtra(f22764d);
        if (stringExtra != null) {
            webView.loadUrl(stringExtra);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        s.h(item, "item");
        if (item.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
