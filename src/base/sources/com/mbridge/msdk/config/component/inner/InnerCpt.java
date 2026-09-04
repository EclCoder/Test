package com.mbridge.msdk.config.component.inner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class InnerCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f28783h = "InnerCpt";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f28784i = "700001";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    com.mbridge.msdk.config.component.inner.model.a f28785j;

    private void a(Context context, String str, String str2, Map<String, Object> map) {
        String message;
        Intent intent;
        boolean z10 = false;
        try {
            message = "";
            if (!TextUtils.isEmpty(str)) {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                if (!TextUtils.isEmpty(scheme) && scheme.equals("intent")) {
                    intent = Intent.parseUri(str, 1);
                } else if (TextUtils.isEmpty(scheme) || !scheme.equals("android-app")) {
                    intent = new Intent("android.intent.action.VIEW", uri);
                    intent.setData(uri);
                } else {
                    intent = Intent.parseUri(str, 2);
                }
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : this.f28785j.b().entrySet()) {
                        intent.putExtra(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                if (intent != null) {
                    intent.setComponent(null);
                    intent.setSelector(null);
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                    if (context instanceof Activity) {
                        context.startActivity(intent);
                    } else {
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                    }
                    z10 = true;
                }
            }
        } catch (Throwable th2) {
            q0.b("InnerCpt", th2.getMessage(), th2);
            message = th2.getMessage();
        }
        a(z10, message);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f28523f = "901001";
        this.f28785j = new com.mbridge.msdk.config.component.inner.model.a(map);
        if (e() != null) {
            this.f28785j.a(e().getContext());
        } else {
            this.f28785j.a(c.n().d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (this.f28785j.f().equals(com.mbridge.msdk.config.component.common.util.c.c("336"))) {
            String strC = this.f28785j.c();
            if (!TextUtils.isEmpty(strC) && strC.equals(com.mbridge.msdk.config.component.common.util.c.c("339"))) {
                g();
            }
            a("901006", (HashMap<String, Object>) null);
        }
    }

    public void g() {
        com.mbridge.msdk.config.component.inner.model.a aVar = this.f28785j;
        if (aVar != null) {
            a(aVar.a(), this.f28785j.d(), this.f28785j.e(), this.f28785j.b());
        }
    }

    private void a(boolean z10, String str) {
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.c("500"), String.valueOf(z10 ? 1 : 0));
        if (!z10) {
            map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), str);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), "700001");
        }
        a(a("901005", (Map<String, Object>) map));
    }
}
