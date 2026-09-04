package ne;

import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements z0.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f47168a;

    public g0(o0 sessionGenerator) {
        kotlin.jvm.internal.s.h(sessionGenerator, "sessionGenerator");
        this.f47168a = sessionGenerator;
    }

    @Override // z0.d0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SessionData getDefaultValue() {
        return new SessionData(this.f47168a.a(null), (Time) null, (Map) null, 6, (DefaultConstructorMarker) null);
    }

    @Override // z0.d0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(SessionData sessionData, OutputStream outputStream, kl.f fVar) throws IOException {
        outputStream.write(bm.r.x(kotlinx.serialization.json.b.f43628d.c(SessionData.INSTANCE.serializer(), sessionData)));
        return fl.g0.f38750a;
    }

    @Override // z0.d0
    public Object readFrom(InputStream inputStream, kl.f fVar) throws CorruptionException {
        try {
            kotlinx.serialization.json.b.a aVar = kotlinx.serialization.json.b.f43628d;
            String strW = bm.r.w(ql.a.c(inputStream));
            aVar.a();
            return (SessionData) aVar.b(SessionData.INSTANCE.serializer(), strW);
        } catch (Exception e10) {
            throw new CorruptionException("Cannot parse session data", e10);
        }
    }
}
