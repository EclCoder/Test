package y3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f57142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f57143b;

    public a(int i10) {
        fl.q[] qVarArr;
        this.f57142a = i10;
        Map mapH = gl.l0.h();
        if (mapH.isEmpty()) {
            qVarArr = new fl.q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapH.size());
            for (Map.Entry entry : mapH.entrySet()) {
                arrayList.add(fl.w.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (fl.q[]) arrayList.toArray(new fl.q[0]);
        }
        Bundle bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        n4.k.a(bundleA);
        this.f57143b = bundleA;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kotlin.jvm.internal.s.c(a.class, obj.getClass()) && h() == ((a) obj).h();
    }

    @Override // y3.e1
    public Bundle g() {
        return this.f57143b;
    }

    @Override // y3.e1
    public int h() {
        return this.f57142a;
    }

    public int hashCode() {
        return 31 + h();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + h() + ')';
    }
}
