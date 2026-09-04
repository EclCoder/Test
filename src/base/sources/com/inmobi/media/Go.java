package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Go implements Io {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.ads.network.common.model.Ad f24902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3348u9 f24903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f24904c;

    public Go(com.inmobi.media.ads.network.common.model.Ad ad2, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h("l1", "tag");
        this.f24902a = ad2;
        this.f24903b = c3348u9;
        this.f24904c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.Io
    public final String a(double d10) {
        if (!this.f24904c.compareAndSet(false, true)) {
            C3348u9 c3348u9 = this.f24903b;
            if (c3348u9 == null) {
                return "win/loss notification already triggered";
            }
            c3348u9.b("l1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            com.inmobi.media.ads.network.common.model.Ad ad2 = this.f24902a;
            List listA = ad2 != null ? Li.a(ad2, "win_beacon") : null;
            if (listA != null && !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    String url = L3.a((String) it.next(), gl.l0.l(fl.w.a("${AUCTION_MIN_TO_WIN}", String.valueOf(d10)), fl.w.a("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d10))));
                    A3 a10 = A3.f24440a;
                    C3348u9 c3348u10 = this.f24903b;
                    kotlin.jvm.internal.s.h(url, "url");
                    A3.a(url, true, c3348u10);
                }
                if (d10 > 0.0d) {
                    return null;
                }
                C3348u9 c3348u11 = this.f24903b;
                if (c3348u11 == null) {
                    return "notification triggering with invalid params";
                }
                c3348u11.b("l1", "Win notification triggered with invalid minBidToWin: " + d10);
                return "notification triggering with invalid params";
            }
            C3348u9 c3348u12 = this.f24903b;
            if (c3348u12 == null) {
                return "no win/loss notification url";
            }
            c3348u12.b("l1", "Win beacon URLs not found or empty");
            return "no win/loss notification url";
        } catch (Exception e10) {
            C3348u9 c3348u13 = this.f24903b;
            if (c3348u13 == null) {
                return "win notification failed internally";
            }
            c3348u13.a("l1", "Exception in notifyWin", e10);
            return "win notification failed internally";
        }
    }

    @Override // com.inmobi.media.Io
    public final String a(int i10, double d10) {
        if (this.f24904c.compareAndSet(false, true)) {
            try {
                com.inmobi.media.ads.network.common.model.Ad ad2 = this.f24902a;
                List listA = ad2 != null ? Li.a(ad2, "loss_beacon") : null;
                if (listA != null && !listA.isEmpty()) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        String url = L3.a((String) it.next(), gl.l0.l(fl.w.a("${AUCTION_LOSS}", String.valueOf(i10)), fl.w.a("${AUCTION_PRICE}", String.valueOf(d10))));
                        A3 a10 = A3.f24440a;
                        C3348u9 c3348u9 = this.f24903b;
                        kotlin.jvm.internal.s.h(url, "url");
                        A3.a(url, true, c3348u9);
                    }
                    if (i10 > 0 && d10 > 0.0d) {
                        return null;
                    }
                    C3348u9 c3348u10 = this.f24903b;
                    if (c3348u10 != null) {
                        c3348u10.b("l1", "Loss notification triggered with invalid params - lossReason: " + i10 + ", auctionPrice: " + d10);
                        return "notification triggering with invalid params";
                    }
                    return "notification triggering with invalid params";
                }
                C3348u9 c3348u11 = this.f24903b;
                if (c3348u11 != null) {
                    c3348u11.b("l1", "Loss beacon URLs not found or empty");
                    return "no win/loss notification url";
                }
                return "no win/loss notification url";
            } catch (Exception e10) {
                C3348u9 c3348u12 = this.f24903b;
                if (c3348u12 != null) {
                    c3348u12.a("l1", "Exception in notifyLoss", e10);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        C3348u9 c3348u13 = this.f24903b;
        if (c3348u13 != null) {
            c3348u13.b("l1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
