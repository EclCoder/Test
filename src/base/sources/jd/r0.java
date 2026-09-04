package jd;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class r0 implements s0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f42374g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f42375h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0 f42376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f42377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final de.e f42379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m0 f42380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s0.a f42381f;

    public r0(Context context, String str, de.e eVar, m0 m0Var) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f42377b = context;
        this.f42378c = str;
        this.f42379d = eVar;
        this.f42380e = m0Var;
        this.f42376a = new t0();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        gd.g.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f42374g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f42375h, "");
    }

    private boolean n() {
        s0.a aVar = this.f42381f;
        if (aVar != null) {
            return aVar.e() == null && this.f42380e.d();
        }
        return true;
    }

    @Override // jd.s0
    public synchronized s0.a a() {
        if (!n()) {
            return this.f42381f;
        }
        gd.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesQ = i.q(this.f42377b);
        String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        gd.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f42380e.d()) {
            q0 q0VarD = d(false);
            gd.g.f().i("Fetched Firebase Installation ID: " + q0VarD.b());
            if (q0VarD.b() == null) {
                q0VarD = new q0(string == null ? c() : string, null);
            }
            if (Objects.equals(q0VarD.b(), string)) {
                this.f42381f = s0.a.a(l(sharedPreferencesQ), q0VarD);
            } else {
                this.f42381f = s0.a.a(b(q0VarD.b(), sharedPreferencesQ), q0VarD);
            }
        } else if (k(string)) {
            this.f42381f = s0.a.b(l(sharedPreferencesQ));
        } else {
            this.f42381f = s0.a.b(b(c(), sharedPreferencesQ));
        }
        gd.g.f().i("Install IDs: " + this.f42381f);
        return this.f42381f;
    }

    public q0 d(boolean z10) {
        String strB;
        kd.i.e();
        String str = null;
        if (z10) {
            try {
                strB = ((com.google.firebase.installations.f) Tasks.await(this.f42379d.a(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e10) {
                gd.g.f().l("Error getting Firebase authentication token.", e10);
                strB = null;
            }
        } else {
            strB = null;
        }
        try {
            str = (String) Tasks.await(this.f42379d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            gd.g.f().l("Error getting Firebase installation id.", e11);
        }
        return new q0(str, strB);
    }

    public String f() {
        return this.f42378c;
    }

    public String g() {
        return this.f42376a.a(this.f42377b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
