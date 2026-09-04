package vf;

import androidx.lifecycle.p1;
import androidx.lifecycle.s1;
import java.util.Map;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class k implements s1.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f55435b;

    public k(Map creators) {
        s.h(creators, "creators");
        this.f55435b = creators;
    }

    @Override // androidx.lifecycle.s1.c
    public p1 a(Class modelClass) {
        s.h(modelClass, "modelClass");
        el.a aVar = (el.a) this.f55435b.get(modelClass);
        if (aVar == null) {
            for (Map.Entry entry : this.f55435b.entrySet()) {
                Class<?> cls = (Class) entry.getKey();
                el.a aVar2 = (el.a) entry.getValue();
                if (modelClass.isAssignableFrom(cls)) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Unknown model class: " + modelClass);
        }
        try {
            Object obj = aVar.get();
            s.f(obj, "null cannot be cast to non-null type T of com.hecorat.screenrecorder.free.di.AzViewModelFactory.create");
            return (p1) obj;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
