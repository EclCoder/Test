package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfuu implements x4.f.a {
    final /* synthetic */ zzfuw zza;

    zzfuu(zzfuw zzfuwVar) {
        Objects.requireNonNull(zzfuwVar);
        this.zza = zzfuwVar;
    }

    @Override // x4.f.a
    public final void onPostMessage(WebView webView, x4.d dVar, Uri uri, boolean z10, x4.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(dVar.b());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA).getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzfuh.zza.getClass();
            }
        } catch (JSONException e10) {
            zzfwf.zza("Error parsing JS message in JavaScriptSessionService.", e10);
        }
    }
}
