package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class Ac extends BroadcastReceiver implements InterfaceC3015hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ec f24468b;

    public Ac(Ec ec2, String jsCallbackNamespace) {
        kotlin.jvm.internal.s.h(jsCallbackNamespace, "jsCallbackNamespace");
        this.f24468b = ec2;
        this.f24467a = jsCallbackNamespace;
    }

    @Override // com.inmobi.media.InterfaceC3015hc
    public final void a() {
        Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        context.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.InterfaceC3015hc
    public final void b() {
        Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        J3.a(context, this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.s.h(context, WwUgngZLNA.zOXupWvflyLRse);
        kotlin.jvm.internal.s.h(intent, "intent");
        if (kotlin.jvm.internal.s.c("android.media.RINGER_MODE_CHANGED", intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            InterfaceC3322t9 interfaceC3322t9 = this.f24468b.f24709b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("MraidMediaProcessor", "Ringer mode action changed: " + intExtra);
            }
            this.f24468b.a(this.f24467a, 2 != intExtra);
        }
    }
}
