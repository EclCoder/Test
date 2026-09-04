package l5;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzcf;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f43913c;

    public j(String str, String str2) {
        this.f43911a = str;
        this.f43912b = str2;
        this.f43913c = new JSONObject(str);
        zzcf.zzk();
    }

    private final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f43913c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        return this.f43911a;
    }

    public List b() {
        return g();
    }

    public int c() {
        return this.f43913c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public String d() {
        JSONObject jSONObject = this.f43913c;
        return jSONObject.optString(BidResponsed.KEY_TOKEN, jSONObject.optString("purchaseToken"));
    }

    public String e() {
        return this.f43912b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return TextUtils.equals(this.f43911a, jVar.a()) && TextUtils.equals(this.f43912b, jVar.e());
    }

    public boolean f() {
        return this.f43913c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f43911a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f43911a));
    }
}
