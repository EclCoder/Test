package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0 f25793a = new U0();

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, kotlin.coroutines.jvm.internal.d dVar) {
        T0 t10;
        int i10;
        if (dVar instanceof T0) {
            t10 = (T0) dVar;
            int i11 = t10.f25727c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t10.f25727c = i11 - Integer.MIN_VALUE;
            } else {
                t10 = new T0(this, dVar);
            }
        } else {
            t10 = new T0(this, dVar);
        }
        Object objCast = t10.f25725a;
        Object objF = ll.b.f();
        int i12 = t10.f25727c;
        try {
            if (i12 == 0) {
                fl.s.b(objCast);
                kotlin.jvm.internal.s.h(AdResponse.class, "clazz");
                kotlin.jvm.internal.s.h(AdResponse.class, "type");
                t10.f25727c = 1;
                JSONObject jsonObject = new JSONObject(str);
                kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
                kotlin.jvm.internal.s.h(AdResponse.class, "type");
                objCast = AdResponse.class.cast(AbstractC3323ta.a(jsonObject, AdResponse.class, null, null));
                if (objCast == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(objCast);
            }
            AdResponse adResponse = (AdResponse) objCast;
            if (adResponse != null) {
                return adResponse;
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(gl.l0.m(fl.w.a("errorCode", kotlin.coroutines.jvm.internal.b.f((short) 2232)))));
        } catch (Exception e10) {
            if (e10 instanceof JSONException) {
                i10 = 2113;
            } else {
                i10 = e10 instanceof ClassCastException ? 2207 : 2204;
            }
            e10.toString();
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(gl.l0.m(fl.w.a("errorCode", kotlin.coroutines.jvm.internal.b.f((short) i10)))));
        }
    }
}
