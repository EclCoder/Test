package com.inmobi.media;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Cc extends ContentObserver implements InterfaceC3015hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f24590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ec f24592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cc(Ec ec2, String mJsCallbackNamespace, Context context, Handler handler) {
        super(handler);
        kotlin.jvm.internal.s.h(mJsCallbackNamespace, "mJsCallbackNamespace");
        this.f24592d = ec2;
        this.f24589a = mJsCallbackNamespace;
        this.f24590b = context;
        this.f24591c = -1;
    }

    @Override // com.inmobi.media.InterfaceC3015hc
    public final void a() {
        Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        context.getContentResolver().unregisterContentObserver(this);
    }

    @Override // com.inmobi.media.InterfaceC3015hc
    public final void b() {
        Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        em.k.d(H9.f24930c, null, null, new Bc(this, this.f24592d, z10, null), 3, null);
    }
}
