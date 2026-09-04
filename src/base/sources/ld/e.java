package ld;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f44319a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44321c;

    public e(int i10, int i11) {
        this.f44320b = i10;
        this.f44321c = i11;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f44321c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    public synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f44319a));
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f44319a.size() >= this.f44320b && !this.f44319a.containsKey(strB)) {
            gd.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f44320b);
            return false;
        }
        String strC = c(str2, this.f44321c);
        if (jd.i.z((String) this.f44319a.get(strB), strC)) {
            return false;
        }
        Map map = this.f44319a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = b((String) entry.getKey());
                if (this.f44319a.size() < this.f44320b || this.f44319a.containsKey(strB)) {
                    String str = (String) entry.getValue();
                    this.f44319a.put(strB, str == null ? "" : c(str, this.f44321c));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                gd.g.f().k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f44320b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
