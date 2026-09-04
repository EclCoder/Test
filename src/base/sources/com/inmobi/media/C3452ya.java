package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ya, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3452ya extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ca f27928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC3000gn f27929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f27930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3452ya(Ca ca2, EnumC3000gn enumC3000gn, JSONObject jSONObject, kl.f fVar) {
        super(2, fVar);
        this.f27928a = ca2;
        this.f27929b = enumC3000gn;
        this.f27930c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3452ya(this.f27928a, this.f27929b, this.f27930c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3452ya) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        ll.b.f();
        fl.s.b(obj);
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f27928a.f24583a;
        EnumC3000gn action = this.f27929b;
        JSONObject jSONObject = this.f27930c;
        gestureDetectorOnGestureListenerC3228pi.getClass();
        kotlin.jvm.internal.s.h(action, "action");
        C3475z8 c3475z8 = gestureDetectorOnGestureListenerC3228pi.Z0;
        if (c3475z8 != null) {
            kotlin.jvm.internal.s.h(action, "action");
            switch (action.ordinal()) {
                case 0:
                    c3475z8.b(true);
                    break;
                case 1:
                    c3475z8.b(false);
                    break;
                case 2:
                    if (!c3475z8.f27992g.get()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("action", "play");
                        EnumC3399w8 enumC3399w8 = EnumC3399w8.PLAYING;
                        EnumC3399w8[] enumC3399w8Arr = {EnumC3399w8.LOADED, EnumC3399w8.PAUSED, EnumC3399w8.COMPLETED, enumC3399w8};
                        EnumC2933e8[] enumC2933e8Arr = EnumC2933e8.f26475a;
                        if (c3475z8.a(enumC3399w8Arr, "executeVideoPlayerActions", jSONObject2.toString(), enumC3399w8)) {
                            c3475z8.f27996k.d();
                        }
                    }
                    break;
                case 3:
                    if (!c3475z8.f27992g.get()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("action", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                        EnumC3399w8 enumC3399w9 = EnumC3399w8.PAUSED;
                        EnumC3399w8[] enumC3399w8Arr2 = {EnumC3399w8.LOADED, enumC3399w9, EnumC3399w8.COMPLETED, EnumC3399w8.PLAYING};
                        EnumC2933e8[] enumC2933e8Arr2 = EnumC2933e8.f26475a;
                        if (c3475z8.a(enumC3399w8Arr2, "executeVideoPlayerActions", jSONObject3.toString(), enumC3399w9)) {
                            c3475z8.f27996k.c();
                        }
                    }
                    break;
                case 4:
                    c3475z8.a(true);
                    break;
                case 5:
                    c3475z8.a(false);
                    break;
                case 6:
                    if (!c3475z8.f27992g.get()) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("action", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                        EnumC3399w8 enumC3399w10 = EnumC3399w8.PAUSED;
                        EnumC3399w8[] enumC3399w8Arr3 = {EnumC3399w8.LOADED, enumC3399w10, EnumC3399w8.COMPLETED, EnumC3399w8.PLAYING};
                        EnumC2933e8[] enumC2933e8Arr3 = EnumC2933e8.f26475a;
                        if (c3475z8.a(enumC3399w8Arr3, "executeVideoPlayerActions", jSONObject4.toString(), enumC3399w10)) {
                            c3475z8.f27996k.c();
                        }
                    }
                    Gf gf2 = c3475z8.f28001p;
                    if (gf2 != null) {
                        An videoEvent = new An((long) c3475z8.f27996k.a().getTime());
                        kotlin.jvm.internal.s.h(videoEvent, "videoEvent");
                        Ie ie2 = gf2.f24863e;
                        if (ie2 != null) {
                            ie2.a(videoEvent);
                        }
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            gestureDetectorOnGestureListenerC3228pi.a(EnumC3321t8.VIDEO_PLAYER_ACTION_EXECUTED, jSONObject);
        } else {
            EnumC3321t8 enumC3321t8 = EnumC3321t8.VIDEO_COMMAND_ERROR;
            EnumC2933e8[] enumC2933e8Arr4 = EnumC2933e8.f26475a;
            C2856b8 obj2 = new C2856b8(jSONObject);
            kotlin.jvm.internal.s.h(obj2, "obj");
            gestureDetectorOnGestureListenerC3228pi.a(enumC3321t8, AbstractC3323ta.a(obj2, C2856b8.class));
        }
        return fl.g0.f38750a;
    }
}
