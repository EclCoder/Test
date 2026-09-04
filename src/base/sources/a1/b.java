package a1;

import androidx.datastore.core.CorruptionException;
import kl.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import z0.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f86a;

    public b(Function1 produceNewData) {
        s.h(produceNewData, "produceNewData");
        this.f86a = produceNewData;
    }

    @Override // z0.d
    public Object a(CorruptionException corruptionException, f fVar) {
        return this.f86a.invoke(corruptionException);
    }
}
