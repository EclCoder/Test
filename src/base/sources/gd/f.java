package gd;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f39119b = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f39120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f39121b;

        private b() {
            int iP = jd.i.p(f.this.f39118a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f39120a = null;
                    this.f39121b = null;
                    return;
                } else {
                    this.f39120a = "Flutter";
                    this.f39121b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f39120a = "Unity";
            String string = f.this.f39118a.getResources().getString(iP);
            this.f39121b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f39118a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f39118a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f39118a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f39119b == null) {
            this.f39119b = new b();
        }
        return this.f39119b;
    }

    public String d() {
        return f().f39120a;
    }

    public String e() {
        return f().f39121b;
    }
}
