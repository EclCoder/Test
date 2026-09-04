package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7730b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7731c = m.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z4.f.b f7732a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.s.h(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                    if (objInvoke != null) {
                        return ((Integer) objInvoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.s.h(sidecarDeviceState, "sidecarDeviceState");
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        public final List c(SidecarWindowLayoutInfo info) {
            kotlin.jvm.internal.s.h(info, "info");
            try {
                try {
                    List list = info.displayFeatures;
                    return list == null ? gl.r.l() : list;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                    if (objInvoke != null) {
                        return (List) objInvoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return gl.r.l();
            }
        }

        public final void d(SidecarDeviceState sidecarDeviceState, int i10) {
            kotlin.jvm.internal.s.h(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i10;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.jvm.internal.t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7733a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            kotlin.jvm.internal.s.h(require, "$this$require");
            boolean z10 = true;
            if (require.getType() != 1 && require.getType() != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.jvm.internal.t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f7734a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            kotlin.jvm.internal.s.h(require, "$this$require");
            return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.jvm.internal.t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f7735a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            kotlin.jvm.internal.s.h(require, "$this$require");
            boolean z10 = true;
            if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.jvm.internal.t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f7736a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            kotlin.jvm.internal.s.h(require, "$this$require");
            return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
        }
    }

    public m(z4.f.b verificationMode) {
        kotlin.jvm.internal.s.h(verificationMode, "verificationMode");
        this.f7732a = verificationMode;
    }

    private final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.s.c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.s.c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (!b((SidecarDisplayFeature) list.get(i10), (SidecarDisplayFeature) list2.get(i10))) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (kotlin.jvm.internal.s.c(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = f7730b;
        return aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2);
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (kotlin.jvm.internal.s.c(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = f7730b;
        return c(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    public final u e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        kotlin.jvm.internal.s.h(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new u(gl.r.l());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        a aVar = f7730b;
        aVar.d(sidecarDeviceState, aVar.b(state));
        return new u(f(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final List f(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        kotlin.jvm.internal.s.h(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        kotlin.jvm.internal.s.h(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            androidx.window.layout.e eVarG = g((SidecarDisplayFeature) it.next(), deviceState);
            if (eVarG != null) {
                arrayList.add(eVarG);
            }
        }
        return arrayList;
    }

    public final androidx.window.layout.e g(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        k.b bVarA;
        j.b bVar;
        kotlin.jvm.internal.s.h(feature, "feature");
        kotlin.jvm.internal.s.h(deviceState, "deviceState");
        z4.f.a aVar = z4.f.f58627a;
        String TAG = f7731c;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) z4.f.a.b(aVar, feature, TAG, this.f7732a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f7733a).c("Feature bounds must not be 0", c.f7734a).c("TYPE_FOLD must have 0 area", d.f7735a).c("Feature be pinned to either left or top", e.f7736a).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVarA = k.b.f7719b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = k.b.f7719b.b();
        }
        int iB = f7730b.b(deviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            bVar = j.b.f7713d;
        } else {
            if (iB != 3 && iB == 4) {
                return null;
            }
            bVar = j.b.f7712c;
        }
        Rect rect = feature.getRect();
        kotlin.jvm.internal.s.g(rect, "feature.rect");
        return new k(new z4.b(rect), bVarA, bVar);
    }

    public /* synthetic */ m(z4.f.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? z4.f.b.QUIET : bVar);
    }
}
