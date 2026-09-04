package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Date f22392f = new Date(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Date f22393g = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f22394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f22395b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f22396c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f22397d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f22398e = new Object();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f22400b;

        a(int i10, Date date) {
            this.f22399a = i10;
            this.f22400b = date;
        }

        Date a() {
            return this.f22400b;
        }

        int b() {
            return this.f22399a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f22402b;

        public b(int i10, Date date) {
            this.f22401a = i10;
            this.f22402b = date;
        }

        Date a() {
            return this.f22402b;
        }

        int b() {
            return this.f22401a;
        }
    }

    public t(SharedPreferences sharedPreferences) {
        this.f22394a = sharedPreferences;
    }

    a a() {
        a aVar;
        synchronized (this.f22396c) {
            aVar = new a(this.f22394a.getInt("num_failed_fetches", 0), new Date(this.f22394a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long c() {
        return this.f22394a.getLong("fetch_timeout_in_seconds", 60L);
    }

    String d() {
        return this.f22394a.getString("last_fetch_etag", null);
    }

    Date e() {
        return new Date(this.f22394a.getLong("last_fetch_time_in_millis", -1L));
    }

    long f() {
        return this.f22394a.getLong("last_template_version", 0L);
    }

    public long g() {
        return this.f22394a.getLong("minimum_fetch_interval_in_seconds", m.f22325j);
    }

    public b h() {
        b bVar;
        synchronized (this.f22397d) {
            bVar = new b(this.f22394a.getInt("num_failed_realtime_streams", 0), new Date(this.f22394a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    void i() {
        k(0, f22393g);
    }

    void j() {
        p(0, f22393g);
    }

    void k(int i10, Date date) {
        synchronized (this.f22396c) {
            this.f22394a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void l(je.i iVar) {
        synchronized (this.f22395b) {
            this.f22394a.edit().putLong("fetch_timeout_in_seconds", iVar.a()).putLong("minimum_fetch_interval_in_seconds", iVar.b()).commit();
        }
    }

    void m(String str) {
        synchronized (this.f22395b) {
            this.f22394a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void n(long j10) {
        synchronized (this.f22395b) {
            this.f22394a.edit().putLong("last_template_version", j10).apply();
        }
    }

    public void o(Date date) {
        synchronized (this.f22397d) {
            this.f22394a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void p(int i10, Date date) {
        synchronized (this.f22397d) {
            this.f22394a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void q() {
        synchronized (this.f22395b) {
            this.f22394a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void r(Date date) {
        synchronized (this.f22395b) {
            this.f22394a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void s() {
        synchronized (this.f22395b) {
            this.f22394a.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    public Map b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f22394a.getString(IAoPeRfJn.fHTY, "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }
}
