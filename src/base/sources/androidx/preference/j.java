package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6403a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f6405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SharedPreferences.Editor f6406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f6408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6409g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PreferenceScreen f6411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f6412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f6413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f6414l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6404b = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6410h = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void m(Preference preference);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void i(PreferenceScreen preferenceScreen);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        boolean n(Preference preference);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class d {
    }

    public j(Context context) {
        this.f6403a = context;
        s(d(context));
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences(d(context), c());
    }

    private static int c() {
        return 0;
    }

    private static String d(Context context) {
        return context.getPackageName() + "_preferences";
    }

    private void n(boolean z10) {
        SharedPreferences.Editor editor;
        if (!z10 && (editor = this.f6406d) != null) {
            editor.apply();
        }
        this.f6407e = z10;
    }

    public Preference a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f6411i;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.Q0(charSequence);
    }

    SharedPreferences.Editor e() {
        if (!this.f6407e) {
            return l().edit();
        }
        if (this.f6406d == null) {
            this.f6406d = l().edit();
        }
        return this.f6406d;
    }

    long f() {
        long j10;
        synchronized (this) {
            j10 = this.f6404b;
            this.f6404b = 1 + j10;
        }
        return j10;
    }

    public b g() {
        return this.f6414l;
    }

    public c h() {
        return this.f6412j;
    }

    public d i() {
        return null;
    }

    public e j() {
        return null;
    }

    public PreferenceScreen k() {
        return this.f6411i;
    }

    public SharedPreferences l() {
        j();
        if (this.f6405c == null) {
            this.f6405c = (this.f6410h != 1 ? this.f6403a : androidx.core.content.a.createDeviceProtectedStorageContext(this.f6403a)).getSharedPreferences(this.f6408f, this.f6409g);
        }
        return this.f6405c;
    }

    public PreferenceScreen m(Context context, int i10, PreferenceScreen preferenceScreen) {
        n(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new i(context, this).d(i10, preferenceScreen);
        preferenceScreen2.Q(this);
        n(false);
        return preferenceScreen2;
    }

    public void o(a aVar) {
        this.f6413k = aVar;
    }

    public void p(b bVar) {
        this.f6414l = bVar;
    }

    public void q(c cVar) {
        this.f6412j = cVar;
    }

    public boolean r(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f6411i;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.V();
        }
        this.f6411i = preferenceScreen;
        return true;
    }

    public void s(String str) {
        this.f6408f = str;
        this.f6405c = null;
    }

    boolean t() {
        return !this.f6407e;
    }

    public void u(Preference preference) {
        a aVar = this.f6413k;
        if (aVar != null) {
            aVar.m(preference);
        }
    }
}
