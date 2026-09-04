package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: renamed from: com.inmobi.media.g5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2982g5 extends androidx.browser.customtabs.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3034i5 f26582a;

    public C2982g5(C3034i5 c3034i5) {
        this.f26582a = c3034i5;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName name) {
        kotlin.jvm.internal.s.h(name, "name");
        this.f26582a.f26721a = null;
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        C3034i5 c3034i5 = this.f26582a;
        c3034i5.f26721a = null;
        U2 u10 = c3034i5.f26723c;
        if (u10 != null) {
            C2988gb c2988gb = u10.f25796c;
            if (c2988gb != null) {
                c2988gb.f26602f = "IN_NATIVE";
            }
            C2840ai c2840ai = (C2840ai) u10.f25802i.get();
            if (c2840ai != null) {
                Ua landingPageFunnelState = Ua.LPBrowserOpenFailed;
                C2988gb c2988gb2 = u10.f25796c;
                kotlin.jvm.internal.s.h(landingPageFunnelState, "landingPageFunnelState");
                c2840ai.f26222a.getLandingPageHandler().a(landingPageFunnelState, c2988gb2, (Integer) 8009);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.s.h(name, "name");
        this.f26582a.f26721a = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // androidx.browser.customtabs.e
    public final void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c client) {
        int iA;
        C2988gb c2988gb;
        C2840ai c2840ai;
        kotlin.jvm.internal.s.h(componentName, UoyZyZEcGYBpIg.gcUrAgI);
        kotlin.jvm.internal.s.h(client, "client");
        C3034i5 c3034i5 = this.f26582a;
        c3034i5.f26721a = client;
        U2 u10 = c3034i5.f26723c;
        if (u10 != null) {
            try {
                C3034i5 c3034i6 = u10.f25798e;
                androidx.browser.customtabs.i iVarF = c3034i6.f26724d;
                if (iVarF == null) {
                    androidx.browser.customtabs.c cVar = c3034i6.f26721a;
                    iVarF = cVar != null ? cVar.f(new C3008h5(c3034i6)) : null;
                    c3034i6.f26724d = iVarF;
                }
                if (iVarF != null) {
                    Bundle bundle = Bundle.EMPTY;
                    if (iVarF.h(bundle)) {
                        iVarF.m(u10.a(), bundle);
                    }
                }
            } catch (Throwable unused) {
            }
            try {
                try {
                    Uri uri = Uri.parse(u10.f25794a);
                    kotlin.jvm.internal.s.g(uri, "Uri.parse(this)");
                    u10.a(uri);
                } catch (Exception unused2) {
                    iA = 9;
                    c2988gb = u10.f25796c;
                    if (c2988gb != null) {
                        c2988gb.f26602f = "EX_NATIVE";
                    }
                    if (iA != 0 || iA == 1) {
                        c2840ai = (C2840ai) u10.f25802i.get();
                        if (c2840ai != null) {
                            K2.a(c2840ai, Ua.LPStartSuccess, u10.f25796c);
                        }
                    }
                    C2840ai c2840ai2 = (C2840ai) u10.f25802i.get();
                    if (c2840ai2 != null) {
                        Ua landingPageFunnelState = Ua.LPBrowserOpenFailed;
                        C2988gb c2988gb2 = u10.f25796c;
                        Integer numValueOf = Integer.valueOf(iA);
                        kotlin.jvm.internal.s.h(landingPageFunnelState, "landingPageFunnelState");
                        c2840ai2.f26222a.getLandingPageHandler().a(landingPageFunnelState, c2988gb2, numValueOf);
                    }
                }
            } catch (Throwable unused3) {
                Context context = u10.f25799f;
                String str = u10.f25794a;
                Object obj = u10.f25803j.get();
                kotlin.jvm.internal.s.e(obj);
                iA = B3.a(context, str, (InterfaceC3408wh) obj, u10.f25797d);
                c2988gb = u10.f25796c;
                if (c2988gb != null) {
                    c2988gb.f26602f = "EX_NATIVE";
                }
                if (iA != 0) {
                }
                c2840ai = (C2840ai) u10.f25802i.get();
                if (c2840ai != null) {
                    K2.a(c2840ai, Ua.LPStartSuccess, u10.f25796c);
                }
            }
        }
    }
}
