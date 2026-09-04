package m7;

import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import bm.o;
import bm.r;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f45302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static JSONArray f45303c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f45301a = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String[] f45304d = {NotificationCompat.CATEGORY_EVENT, "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private d() {
    }

    public static final void a() {
        if (x7.a.c(d.class)) {
            return;
        }
        try {
            f45301a.g();
            if (f45303c != null) {
                f45302b = true;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
        }
    }

    public static final void b(Bundle params, String event) {
        if (x7.a.c(d.class)) {
            return;
        }
        try {
            s.h(params, "params");
            s.h(event, "event");
            params.putString(NotificationCompat.CATEGORY_EVENT, event);
            StringBuilder sb2 = new StringBuilder();
            e1 e1Var = e1.f15201a;
            Locale localeJ = e1Var.J();
            String language = localeJ != null ? localeJ.getLanguage() : null;
            String str = "";
            if (language == null) {
                language = "";
            }
            sb2.append(language);
            sb2.append('_');
            Locale localeJ2 = e1Var.J();
            String country = localeJ2 != null ? localeJ2.getCountry() : null;
            if (country == null) {
                country = "";
            }
            sb2.append(country);
            params.putString("_locale", sb2.toString());
            String strR = e1Var.R();
            if (strR == null) {
                strR = "";
            }
            params.putString("_appVersion", strR);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", "mobile");
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            params.putString("_deviceModel", str2);
            params.putString("_nativeAppID", h0.n());
            String strR2 = e1Var.R();
            if (strR2 != null) {
                str = strR2;
            }
            params.putString("_nativeAppShortVersion", str);
            params.putString("_timezone", e1Var.E());
            params.putString("_carrier", e1Var.z());
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", e1Var.x());
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
        }
    }

    public static final String c(JSONObject logic) {
        if (x7.a.c(d.class)) {
            return null;
        }
        try {
            s.h(logic, "logic");
            Iterator<String> itKeys = logic.keys();
            if (itKeys.hasNext()) {
                return itKeys.next();
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
            return null;
        }
    }

    public static final String d(Bundle bundle) {
        String strOptString;
        if (x7.a.c(d.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = f45303c;
            if (jSONArray == null) {
                return "[]";
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = f45303c;
            s.f(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i10 = 0; i10 < length; i10++) {
                String strOptString2 = jSONArray2.optString(i10);
                if (strOptString2 != null) {
                    JSONObject jSONObject = new JSONObject(strOptString2);
                    long jOptLong = jSONObject.optLong("id");
                    if (jOptLong != 0 && (strOptString = jSONObject.optString("rule")) != null && f(strOptString, bundle)) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
            }
            String string = new JSONArray((Collection) arrayList).toString();
            s.g(string, "JSONArray(res).toString()");
            return string;
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
            return null;
        }
    }

    public static final ArrayList e(JSONArray jSONArray) {
        if (x7.a.c(d.class) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(jSONArray.get(i10).toString());
            }
            return arrayList;
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
            return null;
        }
    }

    public static final boolean f(String str, Bundle bundle) {
        if (!x7.a.c(d.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strC = c(jSONObject);
                if (strC == null) {
                    return false;
                }
                Object obj = jSONObject.get(strC);
                int iHashCode = strC.hashCode();
                if (iHashCode != 3555) {
                    if (iHashCode != 96727) {
                        if (iHashCode == 109267 && strC.equals("not")) {
                            return !f(obj.toString(), bundle);
                        }
                    } else if (strC.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length = jSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            if (!f(jSONArray.get(i10).toString(), bundle)) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (strC.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 == null) {
                        return false;
                    }
                    int length2 = jSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (f(jSONArray2.get(i11).toString(), bundle)) {
                            return true;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return j(strC, jSONObject2, bundle);
            } catch (Throwable th2) {
                x7.a.b(th2, d.class);
            }
        }
        return false;
    }

    private final void g() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            w wVarV = a0.v(h0.n(), false);
            if (wVarV == null) {
                return;
            }
            f45303c = wVarV.k();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final void h(Bundle bundle, String event) {
        if (x7.a.c(d.class)) {
            return;
        }
        try {
            s.h(event, "event");
            if (!f45302b || bundle == null) {
                return;
            }
            try {
                b(bundle, event);
                bundle.putString("_audiencePropertyIds", d(bundle));
                bundle.putString("cs_maca", "1");
                i(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
        }
    }

    public static final void i(Bundle params) {
        if (x7.a.c(d.class)) {
            return;
        }
        try {
            s.h(params, "params");
            for (String str : f45304d) {
                params.remove(str);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:0x01a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:110:0x01bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x01be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:118:0x01da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:129:0x0208 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:130:0x0209 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:135:0x0216 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x0217 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:141:0x0225, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:150:0x0256, B:153:0x025d, B:155:0x0264, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:196:0x0314, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:145:0x0249, B:159:0x0288, B:162:0x0292, B:166:0x02ae, B:169:0x02b8, B:171:0x02c1, B:189:0x02ff, B:174:0x02ca, B:177:0x02d3, B:179:0x02e1, B:182:0x02ea, B:184:0x02f3, B:191:0x0308, B:198:0x031d, B:201:0x0326, B:23:0x005c), top: B:207:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:138:0x021d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x021e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:141:0x0225, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:150:0x0256, B:153:0x025d, B:155:0x0264, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:196:0x0314, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:145:0x0249, B:159:0x0288, B:162:0x0292, B:166:0x02ae, B:169:0x02b8, B:171:0x02c1, B:189:0x02ff, B:174:0x02ca, B:177:0x02d3, B:179:0x02e1, B:182:0x02ea, B:184:0x02f3, B:191:0x0308, B:198:0x031d, B:201:0x0326, B:23:0x005c), top: B:207:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0225 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:141:0x0225, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:150:0x0256, B:153:0x025d, B:155:0x0264, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:196:0x0314, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:145:0x0249, B:159:0x0288, B:162:0x0292, B:166:0x02ae, B:169:0x02b8, B:171:0x02c1, B:189:0x02ff, B:174:0x02ca, B:177:0x02d3, B:179:0x02e1, B:182:0x02ea, B:184:0x02f3, B:191:0x0308, B:198:0x031d, B:201:0x0326, B:23:0x005c), top: B:207:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0264 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:141:0x0225, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:150:0x0256, B:153:0x025d, B:155:0x0264, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:196:0x0314, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:145:0x0249, B:159:0x0288, B:162:0x0292, B:166:0x02ae, B:169:0x02b8, B:171:0x02c1, B:189:0x02ff, B:174:0x02ca, B:177:0x02d3, B:179:0x02e1, B:182:0x02ea, B:184:0x02f3, B:191:0x0308, B:198:0x031d, B:201:0x0326, B:23:0x005c), top: B:207:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:188:0x02fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:189:0x02ff A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:141:0x0225, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:150:0x0256, B:153:0x025d, B:155:0x0264, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:196:0x0314, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:145:0x0249, B:159:0x0288, B:162:0x0292, B:166:0x02ae, B:169:0x02b8, B:171:0x02c1, B:189:0x02ff, B:174:0x02ca, B:177:0x02d3, B:179:0x02e1, B:182:0x02ea, B:184:0x02f3, B:191:0x0308, B:198:0x031d, B:201:0x0326, B:23:0x005c), top: B:207:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0313 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:196:0x0314 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:141:0x0225, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:150:0x0256, B:153:0x025d, B:155:0x0264, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:196:0x0314, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:145:0x0249, B:159:0x0288, B:162:0x0292, B:166:0x02ae, B:169:0x02b8, B:171:0x02c1, B:189:0x02ff, B:174:0x02ca, B:177:0x02d3, B:179:0x02e1, B:182:0x02ea, B:184:0x02f3, B:191:0x0308, B:198:0x031d, B:201:0x0326, B:23:0x005c), top: B:207:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:209:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:? A[LOOP:0: B:140:0x0223->B:210:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[LOOP:1: B:154:0x0262->B:213:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005c A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:141:0x0225, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:150:0x0256, B:153:0x025d, B:155:0x0264, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:196:0x0314, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:145:0x0249, B:159:0x0288, B:162:0x0292, B:166:0x02ae, B:169:0x02b8, B:171:0x02c1, B:189:0x02ff, B:174:0x02ca, B:177:0x02d3, B:179:0x02e1, B:182:0x02ea, B:184:0x02f3, B:191:0x0308, B:198:0x031d, B:201:0x0326, B:23:0x005c), top: B:207:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x0181 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0182 A[RETURN] */
    public static final boolean j(String variable, JSONObject values, Bundle bundle) {
        Object obj;
        int size;
        int i10;
        String lowerCase;
        String lowerCase2;
        int size2;
        int i11;
        String lowerCase3;
        String lowerCase4;
        if (x7.a.c(d.class)) {
            return false;
        }
        try {
            s.h(variable, "variable");
            s.h(values, "values");
            String strC = c(values);
            if (strC == null) {
                return false;
            }
            String string = values.get(strC).toString();
            ArrayList arrayListE = e(values.optJSONArray(strC));
            if (s.c(strC, "exists")) {
                return bundle != null && bundle.containsKey(variable) == Boolean.parseBoolean(string);
            }
            if (bundle != null) {
                String lowerCase5 = variable.toLowerCase(Locale.ROOT);
                s.g(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                obj = bundle.get(lowerCase5);
                if (obj == null) {
                    if (bundle != null) {
                        obj = bundle.get(variable);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        return false;
                    }
                }
            } else {
                if (bundle != null) {
                    obj = bundle.get(variable);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    return false;
                }
            }
            switch (strC.hashCode()) {
                case -1729128927:
                    if (strC.equals("i_not_contains")) {
                        String string2 = obj.toString();
                        Locale locale = Locale.ROOT;
                        String lowerCase6 = string2.toLowerCase(locale);
                        s.g(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase7 = string.toLowerCase(locale);
                        s.g(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        return !r.T(lowerCase6, lowerCase7, false, 2, null);
                    }
                    return false;
                case -1179774633:
                    if (!strC.equals("is_any")) {
                        return false;
                    }
                    if (arrayListE == null) {
                        return false;
                    }
                    return arrayListE.contains(obj.toString());
                case -1039699439:
                    if (!strC.equals("not_in")) {
                        return false;
                    }
                    if (arrayListE == null) {
                        return false;
                    }
                    return arrayListE.contains(obj.toString());
                case -969266188:
                    if (strC.equals("starts_with")) {
                        return r.N(obj.toString(), string, false, 2, null);
                    }
                    return false;
                case -966353971:
                    if (strC.equals("regex_match")) {
                        return new o(string).h(obj.toString());
                    }
                    return false;
                case -665609109:
                    if (!strC.equals("is_not_any")) {
                        return false;
                    }
                    if (arrayListE == null) {
                        return false;
                    }
                    return arrayListE.contains(obj.toString());
                case -567445985:
                    if (strC.equals("contains")) {
                        return r.T(obj.toString(), string, false, 2, null);
                    }
                    return false;
                case -327990090:
                    if (!strC.equals("i_str_neq")) {
                        return false;
                    }
                    String string3 = obj.toString();
                    Locale locale2 = Locale.ROOT;
                    String lowerCase8 = string3.toLowerCase(locale2);
                    s.g(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase9 = string.toLowerCase(locale2);
                    s.g(lowerCase9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return !s.c(lowerCase8, lowerCase9);
                case -159812115:
                    if (!strC.equals("i_is_any")) {
                        return false;
                    }
                    if (arrayListE != null || arrayListE.isEmpty()) {
                        return false;
                    }
                    size = arrayListE.size();
                    i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayListE.get(i10);
                        i10++;
                        Locale locale3 = Locale.ROOT;
                        lowerCase = ((String) obj2).toLowerCase(locale3);
                        s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        lowerCase2 = obj.toString().toLowerCase(locale3);
                        s.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (s.c(lowerCase, lowerCase2)) {
                            return true;
                        }
                    }
                    return false;
                case -92753547:
                    if (!strC.equals("i_str_not_in")) {
                        return false;
                    }
                    if (arrayListE == null) {
                        return false;
                    }
                    if (arrayListE.isEmpty()) {
                        return true;
                    }
                    size2 = arrayListE.size();
                    i11 = 0;
                    while (i11 < size2) {
                        Object obj3 = arrayListE.get(i11);
                        i11++;
                        Locale locale4 = Locale.ROOT;
                        lowerCase3 = ((String) obj3).toLowerCase(locale4);
                        s.g(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        lowerCase4 = obj.toString().toLowerCase(locale4);
                        s.g(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (s.c(lowerCase3, lowerCase4)) {
                            return false;
                        }
                    }
                    return true;
                case 60:
                    if (!strC.equals("<")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (!strC.equals("=")) {
                        return false;
                    }
                    return s.c(obj.toString(), string);
                case DEPRECATED_API_USED_VALUE:
                    if (!strC.equals(">")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 1084:
                    if (!strC.equals("!=")) {
                        return false;
                    }
                    if (s.c(obj.toString(), string)) {
                        return false;
                    }
                    return true;
                case 1921:
                    if (!strC.equals("<=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 1952:
                    if (!strC.equals("==")) {
                        return false;
                    }
                    return s.c(obj.toString(), string);
                case 1983:
                    if (!strC.equals(">=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3244:
                    if (!strC.equals("eq")) {
                        return false;
                    }
                    return s.c(obj.toString(), string);
                case 3294:
                    if (!strC.equals("ge")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3309:
                    if (!strC.equals("gt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3365:
                    if (!strC.equals("in")) {
                        return false;
                    }
                    if (arrayListE == null) {
                        return false;
                    }
                    return arrayListE.contains(obj.toString());
                case 3449:
                    if (!strC.equals("le")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3464:
                    if (!strC.equals("lt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3511:
                    if (!strC.equals("ne")) {
                        return false;
                    }
                    if (s.c(obj.toString(), string)) {
                        return true;
                    }
                    return false;
                case 102680:
                    if (!strC.equals("gte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 107485:
                    if (!strC.equals("lte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 108954:
                    if (!strC.equals("neq")) {
                        return false;
                    }
                    if (s.c(obj.toString(), string)) {
                        return true;
                    }
                    return false;
                case 127966736:
                    if (!strC.equals("i_str_eq")) {
                        return false;
                    }
                    String string4 = obj.toString();
                    Locale locale5 = Locale.ROOT;
                    String lowerCase10 = string4.toLowerCase(locale5);
                    s.g(lowerCase10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase11 = string.toLowerCase(locale5);
                    s.g(lowerCase11, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return s.c(lowerCase10, lowerCase11);
                case 127966857:
                    if (!strC.equals("i_str_in")) {
                        return false;
                    }
                    if (arrayListE != null) {
                        return false;
                    }
                    size = arrayListE.size();
                    i10 = 0;
                    while (i10 < size) {
                        Object obj4 = arrayListE.get(i10);
                        i10++;
                        Locale locale6 = Locale.ROOT;
                        lowerCase = ((String) obj4).toLowerCase(locale6);
                        s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        lowerCase2 = obj.toString().toLowerCase(locale6);
                        s.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (s.c(lowerCase, lowerCase2)) {
                            return true;
                        }
                    }
                    return false;
                case 363990325:
                    if (!strC.equals("i_contains")) {
                        return false;
                    }
                    String string5 = obj.toString();
                    Locale locale7 = Locale.ROOT;
                    String lowerCase12 = string5.toLowerCase(locale7);
                    s.g(lowerCase12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase13 = string.toLowerCase(locale7);
                    s.g(lowerCase13, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return r.T(lowerCase12, lowerCase13, false, 2, null);
                case 1091487233:
                    if (!strC.equals("i_is_not_any")) {
                        return false;
                    }
                    if (arrayListE == null) {
                        return false;
                    }
                    if (arrayListE.isEmpty()) {
                        return true;
                    }
                    size2 = arrayListE.size();
                    i11 = 0;
                    while (i11 < size2) {
                        Object obj5 = arrayListE.get(i11);
                        i11++;
                        Locale locale8 = Locale.ROOT;
                        lowerCase3 = ((String) obj5).toLowerCase(locale8);
                        s.g(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        lowerCase4 = obj.toString().toLowerCase(locale8);
                        s.g(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (s.c(lowerCase3, lowerCase4)) {
                            return false;
                        }
                    }
                    return true;
                case 1918401035:
                    return strC.equals("not_contains") && !r.T(obj.toString(), string, false, 2, null);
                case 1961112862:
                    if (!strC.equals("i_starts_with")) {
                        return false;
                    }
                    String string6 = obj.toString();
                    Locale locale9 = Locale.ROOT;
                    String lowerCase14 = string6.toLowerCase(locale9);
                    s.g(lowerCase14, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase15 = string.toLowerCase(locale9);
                    s.g(lowerCase15, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return r.N(lowerCase14, lowerCase15, false, 2, null);
                default:
                    return false;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
            return false;
        }
    }
}
