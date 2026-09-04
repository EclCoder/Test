package com.iab.omid.library.vungle.messagelistener;

import android.net.Uri;
import android.webkit.WebView;
import com.iab.omid.library.vungle.utils.g;
import com.iab.omid.library.vungle.utils.i;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Arrays;
import java.util.HashSet;
import o4.Wz.OGoz;
import org.json.JSONException;
import org.json.JSONObject;
import x4.d;
import x4.f;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i f24283c = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebView f24284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f24285b;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.messagelistener.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes6.dex */
    class C0359a implements f.a {
        C0359a() {
        }

        @Override // x4.f.a
        public void onPostMessage(WebView webView, d dVar, Uri uri, boolean z10, x4.a aVar) {
            a.this.a(dVar.b());
        }
    }

    public a(WebView webView, b bVar) {
        g.a(webView, "WebView is null");
        this.f24284a = webView;
        this.f24285b = bVar;
    }

    public void a() {
        try {
            if (!x4.g.a("WEB_MESSAGE_LISTENER")) {
                this.f24285b.onWebMessageListenerUnsupported();
                return;
            }
            try {
                b();
                f24283c.a(this.f24284a, this.f24285b.getListenerName(), new HashSet(Arrays.asList(OGoz.LXW)), new C0359a());
                return;
            } catch (Exception e10) {
                com.iab.omid.library.vungle.utils.d.a("Error adding WebView listener", e10);
            }
        } catch (NoClassDefFoundError unused) {
        }
        this.f24285b.onWebMessageListenerUnsupported();
    }

    public void b() {
        f24283c.a(this.f24284a, this.f24285b.getListenerName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f24285b.onMessageReceived(jSONObject.getString("method"), jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA));
        } catch (JSONException e10) {
            com.iab.omid.library.vungle.utils.d.a("Error parsing JS message", e10);
        }
    }
}
