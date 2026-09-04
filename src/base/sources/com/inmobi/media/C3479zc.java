package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3479zc extends BroadcastReceiver implements InterfaceC3015hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ec f28011b;

    public C3479zc(Ec ec2, String jsCallbackNamespace) {
        kotlin.jvm.internal.s.h(jsCallbackNamespace, "jsCallbackNamespace");
        this.f28011b = ec2;
        this.f28010a = jsCallbackNamespace;
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
        J3.a(context, this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(intent, "intent");
        if (kotlin.jvm.internal.s.c("android.intent.action.HEADSET_PLUG", intent.getAction())) {
            int intExtra = intent.getIntExtra("state", 0);
            InterfaceC3322t9 interfaceC3322t9 = this.f28011b.f24709b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("MraidMediaProcessor", "Headphone plugged state changed: " + intExtra);
            }
            this.f28011b.b(this.f28010a, 1 == intExtra);
        }
    }
}
