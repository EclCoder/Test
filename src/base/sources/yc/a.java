package yc;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f57475g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final DateFormat f57476h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f57477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f57478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f57479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f57480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f57481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f57482f;

    public a(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f57477a = str;
        this.f57478b = str2;
        this.f57479c = str3;
        this.f57480d = date;
        this.f57481e = j10;
        this.f57482f = j11;
    }

    static a a(bd.a.c cVar) {
        String str = cVar.f8829d;
        if (str == null) {
            str = "";
        }
        return new a(cVar.f8827b, String.valueOf(cVar.f8828c), str, new Date(cVar.f8838m), cVar.f8830e, cVar.f8835j);
    }

    static a b(Map map) throws AbtException {
        g(map);
        try {
            return new a((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f57476h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    private static void g(Map map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f57475g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String c() {
        return this.f57477a;
    }

    long d() {
        return this.f57480d.getTime();
    }

    String e() {
        return this.f57478b;
    }

    bd.a.c f(String str) {
        bd.a.c cVar = new bd.a.c();
        cVar.f8826a = str;
        cVar.f8838m = d();
        cVar.f8827b = this.f57477a;
        cVar.f8828c = this.f57478b;
        cVar.f8829d = TextUtils.isEmpty(this.f57479c) ? null : this.f57479c;
        cVar.f8830e = this.f57481e;
        cVar.f8835j = this.f57482f;
        return cVar;
    }
}
