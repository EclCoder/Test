package com.vungle.ads.internal.load;

import com.vungle.ads.f0;
import com.vungle.ads.i0;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements Serializable {
    private final BidPayload adMarkup;
    private final i0 csbData;
    private final Placement placement;
    private final f0 requestAdSize;

    public b(Placement placement, BidPayload bidPayload, f0 f0Var, i0 i0Var) {
        s.h(placement, "placement");
        this.placement = placement;
        this.adMarkup = bidPayload;
        this.requestAdSize = f0Var;
        this.csbData = i0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.c(b.class, obj.getClass())) {
            b bVar = (b) obj;
            if (!s.c(this.placement.getReferenceId(), bVar.placement.getReferenceId()) || !s.c(this.requestAdSize, bVar.requestAdSize)) {
                return false;
            }
            BidPayload bidPayload = this.adMarkup;
            if (bidPayload != null) {
                if (!s.c(bidPayload, bVar.adMarkup)) {
                    return false;
                }
            } else if (bVar.adMarkup != null) {
                return false;
            }
            i0 i0Var = this.csbData;
            i0 i0Var2 = bVar.csbData;
            if (i0Var != null) {
                return s.c(i0Var, i0Var2);
            }
            if (i0Var2 == null) {
                return true;
            }
        }
        return false;
    }

    public final BidPayload getAdMarkup() {
        return this.adMarkup;
    }

    public final i0 getCsbData() {
        return this.csbData;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public final f0 getRequestAdSize() {
        return this.requestAdSize;
    }

    public int hashCode() {
        int iHashCode = this.placement.getReferenceId().hashCode() * 31;
        f0 f0Var = this.requestAdSize;
        int iHashCode2 = (iHashCode + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
        BidPayload bidPayload = this.adMarkup;
        int iHashCode3 = (iHashCode2 + (bidPayload != null ? bidPayload.hashCode() : 0)) * 31;
        i0 i0Var = this.csbData;
        return iHashCode3 + (i0Var != null ? i0Var.hashCode() : 0);
    }

    public String toString() {
        return "AdRequest{placementId='" + this.placement.getReferenceId() + "', adMarkup=" + this.adMarkup + ", requestAdSize=" + this.requestAdSize + ", csbData=" + this.csbData + '}';
    }

    public /* synthetic */ b(Placement placement, BidPayload bidPayload, f0 f0Var, i0 i0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(placement, bidPayload, f0Var, (i10 & 8) != 0 ? null : i0Var);
    }
}
