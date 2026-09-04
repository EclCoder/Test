package com.inmobi.media;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ba, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2858ba extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2884ca f26253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2858ba(C2884ca c2884ca, ArrayList arrayList, kl.f fVar) {
        super(2, fVar);
        this.f26253b = c2884ca;
        this.f26254c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2858ba(this.f26253b, this.f26254c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2858ba(this.f26253b, this.f26254c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C2910da c2910da;
        Object objF = ll.b.f();
        int i10 = this.f26252a;
        if (i10 == 0) {
            fl.s.b(obj);
            Fb fb2 = (Fb) Gb.f24849a.getValue();
            this.f26252a = 1;
            obj = fb2.b(this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        ArrayList arrayList = this.f26254c;
        for (C3453yb c3453yb : (Iterable) obj) {
            CopyOnWriteArrayList copyOnWriteArrayList = Ub.f25828a;
            if (!Tb.a(c3453yb.f27931a)) {
                String strB = AbstractC2860bc.b(c3453yb.f27931a);
                if (strB != null) {
                    JSONObject jSONObject = new JSONObject(strB);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("vitals");
                    JSONArray jSONArray = jSONObject.getJSONArray("log");
                    kotlin.jvm.internal.s.e(jSONObject2);
                    kotlin.jvm.internal.s.e(jSONArray);
                    c2910da = new C2910da(jSONObject2, jSONArray, c3453yb);
                } else {
                    c2910da = null;
                }
                if (c2910da != null) {
                    arrayList.add(c2910da);
                }
            }
        }
        return fl.g0.f38750a;
    }
}
