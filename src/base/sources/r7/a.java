package r7;

import android.util.Patterns;
import bm.r;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import fl.w;
import gl.l0;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f51110a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map f51111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map f51112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map f51113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static JSONObject f51114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f51115f;

    private a() {
    }

    public static final float[] a(JSONObject viewHierarchy, String appName) {
        if (x7.a.c(a.class)) {
            return null;
        }
        try {
            s.h(viewHierarchy, "viewHierarchy");
            s.h(appName, "appName");
            if (!f51115f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                String lowerCase = appName.toLowerCase();
                s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                JSONObject jSONObject = new JSONObject(viewHierarchy.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW).toString());
                String screenName = viewHierarchy.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                a aVar = f51110a;
                aVar.j(jSONObject, jSONArray);
                aVar.m(fArr, aVar.i(jSONObject));
                JSONObject jSONObjectB = aVar.b(jSONObject);
                if (jSONObjectB == null) {
                    return null;
                }
                s.g(screenName, "screenName");
                String string = jSONObject.toString();
                s.g(string, "viewTree.toString()");
                aVar.m(fArr, aVar.h(jSONObjectB, jSONArray, screenName, string, lowerCase));
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
            return null;
        }
    }

    private final JSONObject b(JSONObject jSONObject) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                s.g(jSONObject2, "children.getJSONObject(i)");
                JSONObject jSONObjectB = b(jSONObject2);
                if (jSONObjectB != null) {
                    return jSONObjectB;
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
        return null;
    }

    public static final String c(String buttonText, String activityName, String appName) {
        if (x7.a.c(a.class)) {
            return null;
        }
        try {
            s.h(buttonText, "buttonText");
            s.h(activityName, "activityName");
            s.h(appName, "appName");
            String lowerCase = (appName + " | " + activityName + ", " + buttonText).toLowerCase();
            s.g(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
            return null;
        }
    }

    public static final void d(File file) {
        if (x7.a.c(a.class)) {
            return;
        }
        try {
            try {
                f51114e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f51114e = new JSONObject(new String(bArr, bm.d.f9079b));
                f51111b = l0.l(w.a("ENGLISH", "1"), w.a("GERMAN", MBridgeConstans.API_REUQEST_CATEGORY_APP), w.a("SPANISH", "3"), w.a("JAPANESE", "4"));
                f51112c = l0.l(w.a("VIEW_CONTENT", MBridgeConstans.ENDCARD_URL_TYPE_PL), w.a("SEARCH", "1"), w.a("ADD_TO_CART", MBridgeConstans.API_REUQEST_CATEGORY_APP), w.a("ADD_TO_WISHLIST", "3"), w.a("INITIATE_CHECKOUT", "4"), w.a("ADD_PAYMENT_INFO", CampaignEx.CLICKMODE_ON), w.a("PURCHASE", "6"), w.a("LEAD", "7"), w.a("COMPLETE_REGISTRATION", "8"));
                f51113d = l0.l(w.a("BUTTON_TEXT", "1"), w.a("PAGE_TITLE", MBridgeConstans.API_REUQEST_CATEGORY_APP), w.a("RESOLVED_DOCUMENT_LINK", "3"), w.a("BUTTON_ID", "4"));
                f51115f = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
        }
    }

    private final boolean e(JSONObject jSONObject) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    public static final boolean f() {
        if (x7.a.c(a.class)) {
            return false;
        }
        try {
            return f51115f;
        } catch (Throwable th2) {
            x7.a.b(th2, a.class);
            return false;
        }
    }

    private final boolean g(String[] strArr, String[] strArr2) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (r.T(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        if (x7.a.c(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (jSONArrayOptJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            boolean z11 = z10;
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i11));
                }
                return z11;
            }
            int length3 = jSONArrayOptJSONArray.length();
            for (int i12 = 0; i12 < length3; i12++) {
                JSONObject child = jSONArrayOptJSONArray.getJSONObject(i12);
                s.g(child, "child");
                if (j(child, jSONArray)) {
                    jSONArray2.put(child);
                    z11 = true;
                }
            }
            jSONObject.put("childviews", jSONArray2);
            return z11;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final boolean k(String str, String str2) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final boolean l(String str, String str2, String str3, String str4) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (x7.a.c(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = f51114e;
            String strOptString = null;
            Map map = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            if (jSONObject == null) {
                s.w("rules");
                jSONObject = null;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
            if (jSONObjectOptJSONObject3 != null) {
                Map map2 = f51111b;
                if (map2 == null) {
                    s.w("languageInfo");
                    map2 = null;
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject((String) map2.get(str));
                if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                    Map map3 = f51112c;
                    if (map3 == null) {
                        s.w("eventInfo");
                        map3 = null;
                    }
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject((String) map3.get(str2));
                    if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                        Map map4 = f51113d;
                        if (map4 == null) {
                            s.w("textTypeInfo");
                        } else {
                            map = map4;
                        }
                        strOptString = jSONObjectOptJSONObject2.optString((String) map.get(str3));
                    }
                }
            }
            if (strOptString == null) {
                return false;
            }
            return k(strOptString, str4);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final void m(float[] fArr, float[] fArr2) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                fArr[i10] = fArr[i10] + fArr2[i10];
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void n(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("text", "");
            s.g(strOptString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = strOptString.toLowerCase();
            s.g(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint", "");
            s.g(strOptString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = strOptString2.toLowerCase();
            s.g(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject currentChildView = jSONArrayOptJSONArray.getJSONObject(i10);
                    s.g(currentChildView, "currentChildView");
                    n(currentChildView, sb2, sb3);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f10;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            int length = jSONArray.length();
            float f11 = 1.0f;
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                int i11 = 0;
                while (i11 < length2) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    f10 = f11;
                    try {
                        s.g(jSONObject2, "siblings.getJSONObject(i)");
                        if (e(jSONObject2)) {
                            fArr[9] = fArr[9] + f10;
                        }
                        i11++;
                        f11 = f10;
                    } catch (JSONException unused) {
                    }
                }
            } catch (JSONException unused2) {
            }
            f10 = f11;
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            n(jSONObject, sb3, sb2);
            String string = sb2.toString();
            s.g(string, "hintSB.toString()");
            String string2 = sb3.toString();
            s.g(string2, "textSB.toString()");
            fArr[15] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? f10 : 0.0f;
            fArr[16] = l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? f10 : 0.0f;
            fArr[17] = l("ENGLISH", "COMPLETE_REGISTRATION", vHmGJpUTWNVV.mHo, string) ? f10 : 0.0f;
            fArr[18] = r.T(str2, "password", false, 2, null) ? f10 : 0.0f;
            fArr[19] = k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? f10 : 0.0f;
            fArr[20] = k("(?i)(sign in)|login|signIn", str2) ? f10 : 0.0f;
            fArr[21] = k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? f10 : 0.0f;
            fArr[22] = l("ENGLISH", "PURCHASE", "BUTTON_TEXT", string2) ? f10 : 0.0f;
            fArr[24] = l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? f10 : 0.0f;
            fArr[25] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? f10 : 0.0f;
            fArr[27] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? f10 : 0.0f;
            fArr[28] = l("ENGLISH", "LEAD", "BUTTON_TEXT", string2) ? f10 : 0.0f;
            fArr[29] = l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? f10 : 0.0f;
            return fArr;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final float[] i(JSONObject jSONObject) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            String strOptString = jSONObject.optString("text");
            s.g(strOptString, "node.optString(TEXT_KEY)");
            String lowerCase = strOptString.toLowerCase();
            s.g(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint");
            s.g(strOptString2, "node.optString(HINT_KEY)");
            String lowerCase2 = strOptString2.toLowerCase();
            s.g(lowerCase2, "this as java.lang.String).toLowerCase()");
            String strOptString3 = jSONObject.optString("classname");
            s.g(strOptString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = strOptString3.toLowerCase();
            s.g(lowerCase3, "this as java.lang.String).toLowerCase()");
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", RewardPlus.AMOUNT, BidResponsed.KEY_PRICE, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{mTFeqtajA.MIVoBhkdVnYtH, "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (r.T(lowerCase3, "checkbox", false, 2, null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (r.T(lowerCase3, "radio", false, 2, null) && r.T(lowerCase3, "button", false, 2, null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                    s.g(jSONObject2, "childViews.getJSONObject(i)");
                    m(fArr, i(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }
}
