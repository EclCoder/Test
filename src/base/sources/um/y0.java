package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y0 {
    public static final x0 a(kotlinx.serialization.json.b json, b0 reader, char[] buffer) {
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(reader, "reader");
        kotlin.jvm.internal.s.h(buffer, "buffer");
        return !json.e().a() ? new x0(reader, buffer) : new z0(reader, buffer);
    }

    public static /* synthetic */ x0 b(kotlinx.serialization.json.b bVar, b0 b0Var, char[] cArr, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cArr = p.f54801c.d();
        }
        return a(bVar, b0Var, cArr);
    }
}
