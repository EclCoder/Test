package tg;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f53418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Drawable f53419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f53420e;

    public c(String label, String packageName, String activityName, Drawable icon, int i10) {
        s.h(label, "label");
        s.h(packageName, "packageName");
        s.h(activityName, "activityName");
        s.h(icon, "icon");
        this.f53416a = label;
        this.f53417b = packageName;
        this.f53418c = activityName;
        this.f53419d = icon;
        this.f53420e = i10;
    }

    public final String a() {
        return this.f53418c;
    }

    public final Drawable b() {
        return this.f53419d;
    }

    public final String c() {
        return this.f53416a;
    }

    public final String d() {
        return this.f53417b;
    }

    public final int e() {
        return this.f53420e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.c(this.f53416a, cVar.f53416a) && s.c(this.f53417b, cVar.f53417b) && s.c(this.f53418c, cVar.f53418c) && s.c(this.f53419d, cVar.f53419d) && this.f53420e == cVar.f53420e;
    }

    public int hashCode() {
        return (((((((this.f53416a.hashCode() * 31) + this.f53417b.hashCode()) * 31) + this.f53418c.hashCode()) * 31) + this.f53419d.hashCode()) * 31) + Integer.hashCode(this.f53420e);
    }

    public String toString() {
        return "ShareableApp(label=" + this.f53416a + ", packageName=" + this.f53417b + ", activityName=" + this.f53418c + ", icon=" + this.f53419d + ", priority=" + this.f53420e + ')';
    }
}
