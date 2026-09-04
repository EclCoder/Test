package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e1 {
    public static final d1 a(kotlinx.serialization.json.b json, String source) {
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(source, "source");
        return !json.e().a() ? new d1(source) : new f1(source);
    }
}
