package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: renamed from: com.inmobi.media.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3209p extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f27151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f27152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3209p(InterfaceC3322t9 interfaceC3322t9, Context context, long j10, kl.f fVar) {
        super(2, fVar);
        this.f27151a = interfaceC3322t9;
        this.f27152b = context;
        this.f27153c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3209p(this.f27151a, this.f27152b, this.f27153c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3209p) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        InterfaceC3322t9 interfaceC3322t9 = this.f27151a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("AdAudioTracker", "Starting audio volume tracking");
        }
        if (C3235q.f27290b == null) {
            Object systemService = this.f27152b.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            C3235q.f27290b = (AudioManager) systemService;
        }
        C3235q c3235q = C3235q.f27289a;
        C3235q.f27294f = J3.a(C3235q.f27295g, 0L, this.f27153c, new C3183o(null));
        C3235q.a(this.f27153c);
        Context context = this.f27152b;
        C3235q.f27291c = new C3079k();
        J3.a(context, C3235q.f27291c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        C3235q.a(Float.valueOf(c3235q.a()));
        return fl.g0.f38750a;
    }
}
