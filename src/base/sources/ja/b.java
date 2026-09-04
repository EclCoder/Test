package ja;

import ha.d;
import ha.g;
import java.nio.ByteBuffer;
import java.util.Arrays;
import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends g {
    @Override // ha.g
    protected ha.a b(d dVar, ByteBuffer byteBuffer) {
        return new ha.a(c(new d0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(d0 d0Var) {
        return new a((String) ob.a.e(d0Var.B()), (String) ob.a.e(d0Var.B()), d0Var.A(), d0Var.A(), Arrays.copyOfRange(d0Var.e(), d0Var.f(), d0Var.g()));
    }
}
