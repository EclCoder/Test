package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.s9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3296s9 implements Pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InMobiJsonResponse f27452b;

    public C3296s9(String content) {
        kotlin.jvm.internal.s.h(content, "content");
        this.f27451a = content;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.inmobi.media.Pg
    public final Object a(kl.f fVar) {
        C3270r9 c3270r9;
        int i10;
        C3296s9 c3296s9;
        if (fVar instanceof C3270r9) {
            c3270r9 = (C3270r9) fVar;
            int i11 = c3270r9.f27383d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3270r9.f27383d = i11 - Integer.MIN_VALUE;
            } else {
                c3270r9 = new C3270r9(this, (kotlin.coroutines.jvm.internal.d) fVar);
            }
        } else {
            c3270r9 = new C3270r9(this, (kotlin.coroutines.jvm.internal.d) fVar);
        }
        Object objCast = c3270r9.f27381b;
        Object objF = ll.b.f();
        int i12 = c3270r9.f27383d;
        try {
            if (i12 == 0) {
                fl.s.b(objCast);
                kotlin.jvm.internal.s.h(InMobiJsonResponse.class, "clazz");
                kotlin.jvm.internal.s.h(InMobiJsonResponse.class, "type");
                String str = this.f27451a;
                c3270r9.f27380a = this;
                c3270r9.f27383d = 1;
                JSONObject jsonObject = new JSONObject(str);
                kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
                kotlin.jvm.internal.s.h(InMobiJsonResponse.class, "type");
                objCast = InMobiJsonResponse.class.cast(AbstractC3323ta.a(jsonObject, InMobiJsonResponse.class, null, null));
                if (objCast == objF) {
                    return objF;
                }
                c3296s9 = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3296s9 = c3270r9.f27380a;
                fl.s.b(objCast);
            }
            c3296s9.f27452b = (InMobiJsonResponse) objCast;
            return fl.g0.f38750a;
        } catch (Throwable th2) {
            fl.e.b(th2);
            if (th2 instanceof JSONException) {
                i10 = 2309;
            } else {
                i10 = th2 instanceof ClassCastException ? 2310 : 2311;
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(gl.l0.m(fl.w.a("errorCode", kotlin.coroutines.jvm.internal.b.f((short) i10)))));
        }
    }

    @Override // com.inmobi.media.Pg
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InMobiJsonResponse b() {
        Objects.toString(this.f27452b);
        return this.f27452b;
    }

    @Override // com.inmobi.media.Pg
    public final void a() {
        if (this.f27452b == null || this.f27451a.length() == 0) {
            throw new Rg(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(gl.l0.m(fl.w.a("errorCode", (short) 3))));
        }
    }
}
