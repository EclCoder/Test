package qe;

import androidx.datastore.core.CorruptionException;
import bm.r;
import fl.g0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import z0.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f50683a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SessionConfigs f50684b = new SessionConfigs(null, null, null, null, null);

    private i() {
    }

    @Override // z0.d0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SessionConfigs getDefaultValue() {
        return f50684b;
    }

    @Override // z0.d0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(SessionConfigs sessionConfigs, OutputStream outputStream, kl.f fVar) throws IOException {
        outputStream.write(r.x(kotlinx.serialization.json.b.f43628d.c(SessionConfigs.INSTANCE.serializer(), sessionConfigs)));
        return g0.f38750a;
    }

    @Override // z0.d0
    public Object readFrom(InputStream inputStream, kl.f fVar) throws CorruptionException {
        try {
            kotlinx.serialization.json.b.a aVar = kotlinx.serialization.json.b.f43628d;
            String strW = r.w(ql.a.c(inputStream));
            aVar.a();
            return (SessionConfigs) aVar.b(SessionConfigs.INSTANCE.serializer(), strW);
        } catch (Exception e10) {
            throw new CorruptionException("Cannot parse session configs", e10);
        }
    }
}
