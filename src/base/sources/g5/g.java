package g5;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static g f38943e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f38944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f38945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f38946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f38947d;

    private g(Context context, k5.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f38944a = new a(applicationContext, aVar);
        this.f38945b = new b(applicationContext, aVar);
        this.f38946c = new e(applicationContext, aVar);
        this.f38947d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, k5.a aVar) {
        try {
            if (f38943e == null) {
                f38943e = new g(context, aVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38943e;
    }

    public a a() {
        return this.f38944a;
    }

    public b b() {
        return this.f38945b;
    }

    public e d() {
        return this.f38946c;
    }

    public f e() {
        return this.f38947d;
    }
}
