package kotlinx.serialization.json;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import um.g1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\u001bB\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001e0\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lkotlinx/serialization/json/d0;", "Lkotlinx/serialization/json/i;", "", "", "content", "<init>", "(Ljava/util/Map;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "key", "f", "(Ljava/lang/String;)Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "g", "(Lkotlinx/serialization/json/i;)Z", "h", "(Ljava/lang/String;)Lkotlinx/serialization/json/i;", "isEmpty", "()Z", "a", "Ljava/util/Map;", "", "", CampaignEx.JSON_KEY_AD_K, "()Ljava/util/Set;", "entries", "m", "keys", "n", "size", "", "o", "()Ljava/util/Collection;", "values", "Companion", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@pm.k(with = f0.class)
public final class d0 extends i implements Map<String, i>, ul.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map content;

    /* JADX INFO: renamed from: kotlinx.serialization.json.d0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        private Companion() {
        }

        public final pm.d serializer() {
            return f0.f43659a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Map content) {
        super(null);
        kotlin.jvm.internal.s.h(content, "content");
        this.content = content;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i compute(String str, BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i computeIfAbsent(String str, Function<? super String, ? extends i> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i computeIfPresent(String str, BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return f((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof i) {
            return g((i) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, i>> entrySet() {
        return k();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return kotlin.jvm.internal.s.c(this.content, other);
    }

    public boolean f(String key) {
        kotlin.jvm.internal.s.h(key, "key");
        return this.content.containsKey(key);
    }

    public boolean g(i value) {
        kotlin.jvm.internal.s.h(value, "value");
        return this.content.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i get(Object obj) {
        if (obj instanceof String) {
            return h((String) obj);
        }
        return null;
    }

    public i h(String key) {
        kotlin.jvm.internal.s.h(key, "key");
        return (i) this.content.get(key);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    public Set k() {
        return this.content.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m();
    }

    public Set m() {
        return this.content.keySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i merge(String str, i iVar, BiFunction<? super i, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int n() {
        return this.content.size();
    }

    public Collection o() {
        return this.content.values();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public i remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i put(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends i> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i putIfAbsent(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i replace(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return n();
    }

    public String toString() {
        return gl.r.l0(this.content.entrySet(), ",", "{", "}", 0, null, new Function1() { // from class: kotlinx.serialization.json.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d0.r((Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<i> values() {
        return o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence r(Map.Entry entry) {
        kotlin.jvm.internal.s.h(entry, "<destruct>");
        String str = (String) entry.getKey();
        i iVar = (i) entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        g1.c(sb2, str);
        sb2.append(':');
        sb2.append(iVar);
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, PvZsvNiPV.gkcsTfcS);
        return string;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, i iVar, i iVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
