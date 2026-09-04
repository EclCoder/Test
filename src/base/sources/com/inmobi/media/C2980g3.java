package com.inmobi.media;

import android.os.Message;

/* JADX INFO: renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2980g3 implements InterfaceC3213p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HandlerC3083k3 f26580a;

    public C2980g3(HandlerC3083k3 handlerC3083k3) {
        this.f26580a = handlerC3083k3;
    }

    @Override // com.inmobi.media.InterfaceC3213p3
    public final void a(V2 click) {
        kotlin.jvm.internal.s.h(click, "click");
        HandlerC3083k3 handlerC3083k3 = this.f26580a;
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = click;
        handlerC3083k3.sendMessage(messageObtain);
    }

    @Override // com.inmobi.media.InterfaceC3213p3
    public final void a(V2 click, EnumC2931e6 enumC2931e6) {
        EnumC2931e6 errorCode = EnumC2931e6.f26453d;
        kotlin.jvm.internal.s.h(click, "click");
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        A3 a10 = A3.f24440a;
        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
        String str = click.f25870b;
        A3.b(click);
        this.f26580a.b(click);
    }
}
