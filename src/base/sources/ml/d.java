package ml;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f46473b = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f46474a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(Enum[] entries) {
        s.h(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        s.e(componentType);
        this.f46474a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f46474a.getEnumConstants();
        s.g(enumConstants, "getEnumConstants(...)");
        return b.a((Enum[]) enumConstants);
    }
}
