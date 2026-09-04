package com.inmobi.media;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f24971a = new LinkedHashMap();

    public static final String a(C3416x adComponent, double d10) {
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        LinkedHashMap linkedHashMap = f24971a;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(adComponent));
        Object atomicBoolean = linkedHashMap.get(numValueOf);
        int i10 = 0;
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
            linkedHashMap.put(numValueOf, atomicBoolean);
        }
        if (!((AtomicBoolean) atomicBoolean).compareAndSet(false, true)) {
            C3348u9 c3348u9 = adComponent.f27822a.f27105c;
            if (c3348u9 == null) {
                return "win/loss notification already triggered";
            }
            c3348u9.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            ArrayList arrayListA = D4.a(adComponent.f27823b, "win_beacon");
            if (arrayListA.isEmpty()) {
                C3348u9 c3348u10 = adComponent.f27822a.f27105c;
                if (c3348u10 == null) {
                    return "no win/loss notification url";
                }
                c3348u10.b("NativeWinLossBeacon", "Win beacon URLs not found or empty");
                return "no win/loss notification url";
            }
            int size = arrayListA.size();
            while (i10 < size) {
                Object obj = arrayListA.get(i10);
                i10++;
                String url = L3.a((String) obj, gl.l0.l(fl.w.a("${AUCTION_MIN_TO_WIN}", String.valueOf(d10)), fl.w.a("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d10))));
                A3 a10 = A3.f24440a;
                C3348u9 c3348u11 = adComponent.f27822a.f27105c;
                kotlin.jvm.internal.s.h(url, "url");
                A3.a(url, true, c3348u11);
            }
            if (d10 > 0.0d) {
                return null;
            }
            C3348u9 c3348u12 = adComponent.f27822a.f27105c;
            if (c3348u12 == null) {
                return "notification triggering with invalid params";
            }
            c3348u12.b("NativeWinLossBeacon", "Win notification triggered with invalid minBidToWin: " + d10);
            return "notification triggering with invalid params";
        } catch (Exception e10) {
            C3348u9 c3348u13 = adComponent.f27822a.f27105c;
            if (c3348u13 == null) {
                return "win notification failed internally";
            }
            c3348u13.a("NativeWinLossBeacon", "Exception in notifyWin", e10);
            return "win notification failed internally";
        }
    }

    public static final String a(C3416x adComponent, int i10, double d10) {
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        LinkedHashMap linkedHashMap = f24971a;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(adComponent));
        Object atomicBoolean = linkedHashMap.get(numValueOf);
        int i11 = 0;
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
            linkedHashMap.put(numValueOf, atomicBoolean);
        }
        if (((AtomicBoolean) atomicBoolean).compareAndSet(false, true)) {
            try {
                ArrayList arrayListA = D4.a(adComponent.f27823b, "loss_beacon");
                if (arrayListA.isEmpty()) {
                    C3348u9 c3348u9 = adComponent.f27822a.f27105c;
                    if (c3348u9 != null) {
                        c3348u9.b("NativeWinLossBeacon", "Loss beacon URLs not found or empty");
                        return "no win/loss notification url";
                    }
                    return "no win/loss notification url";
                }
                int size = arrayListA.size();
                while (i11 < size) {
                    Object obj = arrayListA.get(i11);
                    i11++;
                    String url = L3.a((String) obj, gl.l0.l(fl.w.a("${AUCTION_LOSS}", String.valueOf(i10)), fl.w.a("${AUCTION_PRICE}", String.valueOf(d10))));
                    A3 a10 = A3.f24440a;
                    C3348u9 c3348u10 = adComponent.f27822a.f27105c;
                    kotlin.jvm.internal.s.h(url, "url");
                    A3.a(url, true, c3348u10);
                }
                if (i10 > 0 && d10 > 0.0d) {
                    return null;
                }
                C3348u9 c3348u11 = adComponent.f27822a.f27105c;
                if (c3348u11 != null) {
                    c3348u11.b("NativeWinLossBeacon", "Loss notification triggered with invalid params - lossReason: " + i10 + ", auctionPrice: " + d10);
                    return "notification triggering with invalid params";
                }
                return "notification triggering with invalid params";
            } catch (Exception e10) {
                C3348u9 c3348u12 = adComponent.f27822a.f27105c;
                if (c3348u12 != null) {
                    c3348u12.a("NativeWinLossBeacon", PvZsvNiPV.PCyQSbo, e10);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        C3348u9 c3348u13 = adComponent.f27822a.f27105c;
        if (c3348u13 != null) {
            c3348u13.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
