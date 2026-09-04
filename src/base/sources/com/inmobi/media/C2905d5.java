package com.inmobi.media;

import android.net.Network;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.AdConfig;
import java.net.InetAddress;

/* JADX INFO: renamed from: com.inmobi.media.d5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2905d5 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Network f26392a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2905d5(Network network, kl.f fVar) {
        super(2, fVar);
        this.f26392a = network;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2905d5(this.f26392a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2905d5(this.f26392a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        String urlDomain;
        ll.b.f();
        fl.s.b(obj);
        try {
            try {
                AdConfig.CustomNetworkValidation customNetworkValidationA = C2930e5.a();
                if (customNetworkValidationA == null || (urlDomain = customNetworkValidationA.getUrlDomain()) == null) {
                    z10 = false;
                } else {
                    if (urlDomain.length() <= 0) {
                        urlDomain = null;
                    }
                    if (urlDomain != null) {
                        z10 = !kotlin.jvm.internal.s.c(InetAddress.getByName(urlDomain).toString(), "");
                    } else {
                        z10 = false;
                    }
                }
            } catch (Exception unused) {
            }
            try {
                C2930e5.f26447b = z10;
                C2930e5.f26446a = this.f26392a;
                C2930e5.f26448c = SystemClock.elapsedRealtime();
                Network network = C2930e5.f26446a;
            } catch (Exception e10) {
                fl.k kVar = W9.f25935a;
                W9.a(new M2(e10));
            }
            C2930e5.f26450e.set(false);
            return fl.g0.f38750a;
        } catch (Throwable th2) {
            C2930e5.f26450e.set(false);
            throw th2;
        }
    }
}
