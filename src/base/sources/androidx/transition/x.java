package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f7465b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7464a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f7466c = new ArrayList();

    public x(View view) {
        this.f7465b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f7465b == xVar.f7465b && this.f7464a.equals(xVar.f7464a);
    }

    public int hashCode() {
        return (this.f7465b.hashCode() * 31) + this.f7464a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f7465b + "\n") + "    values:";
        for (String str2 : this.f7464a.keySet()) {
            str = str + "    " + str2 + ": " + this.f7464a.get(str2) + "\n";
        }
        return str;
    }
}
