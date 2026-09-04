package zf;

import com.hecorat.screenrecorder.free.models.EncodeParam;
import com.squareup.moshi.r;
import em.k0;
import fl.g0;
import kl.f;
import kotlin.jvm.internal.s;
import xf.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f58824b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r moshi, k0 dispatcher) {
        super(dispatcher);
        s.h(moshi, "moshi");
        s.h(dispatcher, "dispatcher");
        this.f58824b = moshi;
    }

    static /* synthetic */ Object d(b bVar, EncodeParam encodeParam, f fVar) {
        com.squareup.moshi.f fVarC = bVar.f58824b.c(EncodeParam.class);
        s.g(fVarC, "adapter(...)");
        String json = fVarC.toJson(encodeParam);
        s.g(json, "toJson(...)");
        bVar.e(json);
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xf.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object a(EncodeParam encodeParam, f fVar) {
        return d(this, encodeParam, fVar);
    }

    protected abstract void e(String str);
}
