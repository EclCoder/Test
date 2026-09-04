package lg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f44500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f44501b;

    public a(Context context) {
        this.f44500a = androidx.preference.j.b(context);
        this.f44501b = context;
    }

    public boolean a(int i10) {
        return this.f44500a.contains(this.f44501b.getString(i10));
    }

    public boolean b(int i10, boolean z10) {
        return this.f44500a.getBoolean(this.f44501b.getString(i10), z10);
    }

    public float c(int i10, float f10) {
        return this.f44500a.getFloat(this.f44501b.getString(i10), f10);
    }

    public int d(int i10, int i11) {
        return this.f44500a.getInt(this.f44501b.getString(i10), i11);
    }

    public long e(int i10, long j10) {
        return this.f44500a.getLong(this.f44501b.getString(i10), j10);
    }

    public SharedPreferences f() {
        return this.f44500a;
    }

    public SharedPreferences g() {
        return new sf.j(this.f44501b, this.f44500a);
    }

    public String h(int i10, String str) {
        return this.f44500a.getString(this.f44501b.getString(i10), str);
    }

    public Set i(int i10, Set set) {
        return this.f44500a.getStringSet(this.f44501b.getString(i10), set);
    }

    public void j(int i10, boolean z10) {
        this.f44500a.edit().putBoolean(this.f44501b.getString(i10), z10).apply();
    }

    public void k(int i10, int i11) {
        this.f44500a.edit().putInt(this.f44501b.getString(i10), i11).apply();
    }

    public void l(int i10, long j10) {
        this.f44500a.edit().putLong(this.f44501b.getString(i10), j10).apply();
    }

    public void m(int i10, String str) {
        this.f44500a.edit().putString(this.f44501b.getString(i10), str).apply();
    }

    public void n(int i10, Set set) {
        this.f44500a.edit().putStringSet(this.f44501b.getString(i10), set).apply();
    }
}
