package a5;

import android.content.ComponentName;
import bm.r;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentName f146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f147b;

    public a(ComponentName componentName, String str) {
        s.h(componentName, "componentName");
        this.f146a = componentName;
        this.f147b = str;
        String packageName = componentName.getPackageName();
        s.g(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        s.g(className, "componentName.className");
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (r.T(packageName, "*", false, 2, null) && r.f0(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (r.T(className, "*", false, 2, null) && r.f0(className, "*", 0, false, 6, null) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.c(this.f146a, aVar.f146a) && s.c(this.f147b, aVar.f147b);
    }

    public int hashCode() {
        int iHashCode = this.f146a.hashCode() * 31;
        String str = this.f147b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.f146a + ", intentAction=" + ((Object) this.f147b) + ')';
    }
}
