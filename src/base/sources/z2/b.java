package z2;

import java.nio.ByteBuffer;
import java.util.Arrays;
import t1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b extends x2.c {
    @Override // x2.c
    protected u b(x2.b bVar, ByteBuffer byteBuffer) {
        return new u(c(new w1.u(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(w1.u uVar) {
        return new a((String) w1.a.e(uVar.A()), (String) w1.a.e(uVar.A()), uVar.z(), uVar.z(), Arrays.copyOfRange(uVar.e(), uVar.f(), uVar.g()));
    }
}
