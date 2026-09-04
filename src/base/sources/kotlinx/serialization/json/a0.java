package kotlinx.serialization.json;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lkotlinx/serialization/json/a0;", "Lkotlinx/serialization/json/g0;", "<init>", "()V", "Lpm/d;", "serializer", "()Lpm/d;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@pm.k(with = b0.class)
public final class a0 extends g0 {
    public static final a0 INSTANCE = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final String content = "null";

    private a0() {
        super(null);
    }

    @Override // kotlinx.serialization.json.g0
    public String a() {
        return content;
    }

    public final pm.d serializer() {
        return b0.f43632a;
    }
}
