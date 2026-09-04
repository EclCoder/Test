package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f2143f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f2144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f2145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f2146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f2147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    HashMap f2148e;

    public d() {
        int i10 = f2143f;
        this.f2144a = i10;
        this.f2145b = i10;
        this.f2146c = null;
    }

    public abstract void a(HashMap map);

    public abstract d b();

    public d c(d dVar) {
        this.f2144a = dVar.f2144a;
        this.f2145b = dVar.f2145b;
        this.f2146c = dVar.f2146c;
        this.f2147d = dVar.f2147d;
        this.f2148e = dVar.f2148e;
        return this;
    }

    abstract void d(HashSet hashSet);

    abstract void e(Context context, AttributeSet attributeSet);

    boolean f(String str) {
        String str2 = this.f2146c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void g(int i10) {
        this.f2144a = i10;
    }

    public d i(int i10) {
        this.f2145b = i10;
        return this;
    }

    boolean j(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    float k(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    int l(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public void h(HashMap map) {
    }
}
