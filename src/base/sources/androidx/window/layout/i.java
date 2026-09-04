package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f7706a = new i();

    private i() {
    }

    private final boolean c(Activity activity, z4.b bVar) {
        Rect rectA = z.f7766a.a(activity).a();
        if (bVar.e()) {
            return false;
        }
        if (bVar.d() != rectA.width() && bVar.a() != rectA.height()) {
            return false;
        }
        if (bVar.d() >= rectA.width() || bVar.a() >= rectA.height()) {
            return (bVar.d() == rectA.width() && bVar.a() == rectA.height()) ? false : true;
        }
        return false;
    }

    public final j a(Activity activity, FoldingFeature oemFeature) {
        k.b bVarA;
        j.b bVar;
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            bVarA = k.b.f7719b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = k.b.f7719b.b();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            bVar = j.b.f7712c;
        } else {
            if (state != 2) {
                return null;
            }
            bVar = j.b.f7713d;
        }
        Rect bounds = oemFeature.getBounds();
        kotlin.jvm.internal.s.g(bounds, "oemFeature.bounds");
        if (!c(activity, new z4.b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        kotlin.jvm.internal.s.g(bounds2, "oemFeature.bounds");
        return new k(new z4.b(bounds2), bVarA, bVar);
    }

    public final u b(Activity activity, WindowLayoutInfo info) {
        j jVarA;
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        kotlin.jvm.internal.s.g(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                i iVar = f7706a;
                kotlin.jvm.internal.s.g(feature, "feature");
                jVarA = iVar.a(activity, feature);
            } else {
                jVarA = null;
            }
            if (jVarA != null) {
                arrayList.add(jVarA);
            }
        }
        return new u(arrayList);
    }
}
