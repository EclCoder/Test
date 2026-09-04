package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Bc extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cc f24532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ec f24533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bc(Cc cc2, Ec ec2, boolean z10, kl.f fVar) {
        super(2, fVar);
        this.f24532a = cc2;
        this.f24533b = ec2;
        this.f24534c = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Bc(this.f24532a, this.f24533b, this.f24534c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Bc) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Context context = this.f24532a.f24590b;
        if (context != null) {
            AudioManager audioManager = null;
            try {
                Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                if (!(systemService instanceof AudioManager)) {
                    systemService = null;
                }
                audioManager = (AudioManager) systemService;
            } catch (Throwable unused) {
            }
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    Cc cc2 = this.f24532a;
                    if (streamVolume != cc2.f24591c) {
                        cc2.f24591c = streamVolume;
                        InterfaceC3322t9 interfaceC3322t9 = this.f24533b.f24709b;
                        if (interfaceC3322t9 != null) {
                            ((C3348u9) interfaceC3322t9).a("MraidMediaProcessor", "volume change detected - " + this.f24534c);
                        }
                        this.f24533b.a(this.f24532a.f24589a, streamVolume);
                    }
                } catch (Exception e10) {
                    InterfaceC3322t9 interfaceC3322t10 = this.f24533b.f24709b;
                    if (interfaceC3322t10 != null) {
                        ((C3348u9) interfaceC3322t10).a("MraidMediaProcessor", "Unexpected error in volume listener", e10);
                    }
                }
            }
        }
        return fl.g0.f38750a;
    }
}
