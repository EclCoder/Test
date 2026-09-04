package rf;

import android.os.Bundle;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.j0;
import com.facebook.o0;
import com.facebook.p0;
import com.hecorat.screenrecorder.free.models.FBLiveDestination;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import fl.g0;
import java.util.List;
import kotlin.jvm.internal.s;
import nh.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private tg.b f51324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f51325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FBLiveDestination f51327d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(o0 it) {
        s.h(it, "it");
        wp.a.a("Stream ended", new Object[0]);
    }

    public void b() {
        this.f51324a = null;
        this.f51325b = null;
    }

    public String c() throws JSONException {
        int length;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "message, from");
        JSONObject jSONObjectD = new j0(com.facebook.a.f14853l.e(), '/' + this.f51326c + "/comments", bundle, p0.GET, null, null, 48, null).k().d();
        if (jSONObjectD != null) {
            try {
                JSONArray jSONArray = jSONObjectD.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                if (jSONArray != null && (length = jSONArray.length()) > 0) {
                    int i10 = length - 1;
                    String string = jSONArray.getJSONObject(i10).getString(PglCryptUtils.KEY_MESSAGE);
                    return jSONArray.getJSONObject(i10).getJSONObject("from").getString("name") + ": " + string;
                }
            } catch (NullPointerException e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
        return null;
    }

    public final tg.b d() {
        String strQ;
        String string;
        if (this.f51324a == null) {
            com.facebook.a.c cVar = com.facebook.a.f14853l;
            com.facebook.a aVarE = cVar.e();
            if (aVarE != null && (strQ = aVarE.q()) != null) {
                Bundle bundle = new Bundle();
                bundle.putString("fields", "name,picture.type(large)");
                JSONObject jSONObjectD = new j0(cVar.e(), '/' + strQ, bundle, p0.GET, null, null, 48, null).k().d();
                if (jSONObjectD != null && (string = jSONObjectD.getString("name")) != null) {
                    this.f51324a = new tg.b(string, jSONObjectD.getJSONObject("picture").getJSONObject(DataSchemeDataSource.SCHEME_DATA).getString("url"));
                }
            }
            return null;
        }
        return this.f51324a;
    }

    public final List e() throws JSONException {
        JSONArray jSONArray;
        if (this.f51325b == null) {
            this.f51325b = p.b();
            JSONObject jSONObjectD = new j0(com.facebook.a.f14853l.e(), "/me/accounts", null, p0.GET, null, null, 48, null).k().d();
            if (jSONObjectD == null || (jSONArray = jSONObjectD.getJSONArray(DataSchemeDataSource.SCHEME_DATA)) == null) {
                return this.f51325b;
            }
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getJSONObject(i10).getString("name");
                String string2 = jSONArray.getJSONObject(i10).getString("id");
                String string3 = jSONArray.getJSONObject(i10).getString("access_token");
                s.e(string2);
                s.e(string);
                s.e(string3);
                FBLiveDestination fBLiveDestination = new FBLiveDestination(string2, string, string3, tg.a.PAGE);
                List list = this.f51325b;
                if (list != null) {
                    list.add(fBLiveDestination);
                }
            }
        }
        return this.f51325b;
    }

    public final tg.b f() {
        return this.f51324a;
    }

    public final void g(FBLiveDestination fBLiveDestination) {
        this.f51327d = fBLiveDestination;
    }

    public final void h(String str) {
        this.f51326c = str;
    }

    public void i() {
        FBLiveDestination fBLiveDestination = this.f51327d;
        if (fBLiveDestination != null) {
            try {
                j0.f15486n.A(p.c(fBLiveDestination), '/' + this.f51326c, new JSONObject("{\"end_live_video\":\"true\"}"), new j0.b() { // from class: rf.a
                    @Override // com.facebook.j0.b
                    public final void a(o0 o0Var) {
                        b.j(o0Var);
                    }
                }).l();
            } catch (JSONException e10) {
                e10.printStackTrace();
                com.google.firebase.crashlytics.a.b().d(e10);
                g0 g0Var = g0.f38750a;
            }
        }
    }
}
