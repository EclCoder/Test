package tm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rm.f f53503c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Map.Entry, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f53504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f53505b;

        public a(Object obj, Object obj2) {
            this.f53504a = obj;
            this.f53505b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.s.c(this.f53504a, aVar.f53504a) && kotlin.jvm.internal.s.c(this.f53505b, aVar.f53505b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f53504a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f53505b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f53504a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f53505b;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f53504a + ", value=" + this.f53505b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(final pm.d keySerializer, final pm.d valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.s.h(keySerializer, "keySerializer");
        kotlin.jvm.internal.s.h(valueSerializer, "valueSerializer");
        this.f53503c = rm.l.d("kotlin.collections.Map.Entry", rm.n.c.f51423a, new rm.f[0], new Function1() { // from class: tm.g1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h1.g(keySerializer, valueSerializer, (rm.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 g(pm.d dVar, pm.d dVar2, rm.a buildSerialDescriptor) {
        kotlin.jvm.internal.s.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
        rm.a.b(buildSerialDescriptor, "key", dVar.getDescriptor(), null, false, 12, null);
        rm.a.b(buildSerialDescriptor, AppMeasurementSdk.ConditionalUserProperty.VALUE, dVar2.getDescriptor(), null, false, 12, null);
        return fl.g0.f38750a;
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.f53503c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.x0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object a(Map.Entry entry) {
        kotlin.jvm.internal.s.h(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.x0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object c(Map.Entry entry) {
        kotlin.jvm.internal.s.h(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.x0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry e(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
