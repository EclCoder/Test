package com.inmobi.media;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.inmobi.media.eb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2936eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2988gb f26483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y5 f26484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f26485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26487e;

    public C2936eb(C2988gb c2988gb, Y5 embeddedBrowserViewClient) {
        kotlin.jvm.internal.s.h(embeddedBrowserViewClient, "embeddedBrowserViewClient");
        this.f26483a = c2988gb;
        this.f26484b = embeddedBrowserViewClient;
        this.f26485c = new LinkedHashSet();
    }

    public final void a(int i10, boolean z10, String str, Integer num) {
        try {
            if (this.f26487e) {
                return;
            }
            C2988gb c2988gb = this.f26483a;
            if (c2988gb != null) {
                c2988gb.f26602f = "IN_CUSTOM";
            }
            int i11 = 8100;
            switch (i10) {
                case 1:
                    if (z10) {
                        this.f26486d = str;
                        Y5 y10 = this.f26484b;
                        Ua funnelState = Ua.LPPageStart;
                        y10.getClass();
                        kotlin.jvm.internal.s.h(funnelState, "funnelState");
                        Xa.a(funnelState, c2988gb, (Integer) null, y10.f26061i);
                    }
                    break;
                case 2:
                    if (z10) {
                        this.f26486d = str;
                        this.f26487e = true;
                        if (!this.f26485c.contains(1)) {
                            Y5 y11 = this.f26484b;
                            Ua funnelState2 = Ua.LPPageStart;
                            C2988gb c2988gb2 = this.f26483a;
                            y11.getClass();
                            kotlin.jvm.internal.s.h(funnelState2, "funnelState");
                            Xa.a(funnelState2, c2988gb2, (Integer) 8006, y11.f26061i);
                        }
                        this.f26484b.f26059g.invoke();
                        Y5 y12 = this.f26484b;
                        Ua funnelState3 = Ua.LPCompleteSuccess;
                        C2988gb c2988gb3 = this.f26483a;
                        y12.getClass();
                        kotlin.jvm.internal.s.h(funnelState3, "funnelState");
                        Xa.a(funnelState3, c2988gb3, (Integer) null, y12.f26061i);
                    }
                    break;
                case 3:
                    if (z10 || (str != null && kotlin.jvm.internal.s.c(str, this.f26486d))) {
                        this.f26487e = true;
                        if (!this.f26485c.contains(1)) {
                            Y5 y13 = this.f26484b;
                            Ua funnelState4 = Ua.LPPageStart;
                            C2988gb c2988gb4 = this.f26483a;
                            y13.getClass();
                            kotlin.jvm.internal.s.h(funnelState4, "funnelState");
                            Xa.a(funnelState4, c2988gb4, (Integer) 8006, y13.f26061i);
                        }
                        Y5 y14 = this.f26484b;
                        Ua funnelState5 = Ua.LPCompleteFailed;
                        C2988gb c2988gb5 = this.f26483a;
                        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 8100);
                        y14.getClass();
                        kotlin.jvm.internal.s.h(funnelState5, "funnelState");
                        Xa.a(funnelState5, c2988gb5, numValueOf, y14.f26061i);
                    }
                    break;
                case 4:
                    if (z10) {
                        this.f26486d = str;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.f26487e = true;
                    switch (i10) {
                        case 5:
                            i11 = 8200;
                            break;
                        case 6:
                            i11 = 8300;
                            break;
                        case 7:
                            i11 = 8400;
                            break;
                        case 8:
                            i11 = 8600;
                            break;
                        case 9:
                            i11 = 8500;
                            break;
                    }
                    int i12 = 4;
                    if (!this.f26485c.contains(4)) {
                        i12 = 0;
                    }
                    int i13 = i11 + i12;
                    Y5 y15 = this.f26484b;
                    Ua funnelState6 = Ua.LPCompleteFailed;
                    C2988gb c2988gb6 = this.f26483a;
                    Integer numValueOf2 = Integer.valueOf(i13);
                    y15.getClass();
                    kotlin.jvm.internal.s.h(funnelState6, "funnelState");
                    Xa.a(funnelState6, c2988gb6, numValueOf2, y15.f26061i);
                    break;
            }
            this.f26485c.add(Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.toString();
        }
    }
}
