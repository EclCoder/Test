package ke;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    f f43183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f43184b;

    a(f fVar, f fVar2) {
        this.f43183a = fVar;
        this.f43184b = fVar2;
    }

    public static a a(f fVar, f fVar2) {
        return new a(fVar, fVar2);
    }

    private String c(String str) {
        String strD = d(this.f43183a, str);
        if (strD != null) {
            return strD;
        }
        String strD2 = d(this.f43184b, str);
        return strD2 != null ? strD2 : "";
    }

    private static String d(f fVar, String str) {
        g gVarF = fVar.f();
        if (gVarF == null) {
            return null;
        }
        try {
            return gVarF.h().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    me.e b(g gVar) throws FirebaseRemoteConfigClientException {
        JSONArray jSONArrayK = gVar.k();
        long jL = gVar.l();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArrayK.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArrayK.getJSONObject(i10);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String strOptString = jSONArray.optString(0, "");
                hashSet.add(me.d.a().d(string).f(jSONObject.getString("variantId")).b(strOptString).c(c(strOptString)).e(jL).a());
            } catch (JSONException e10) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return me.e.a(hashSet);
    }
}
