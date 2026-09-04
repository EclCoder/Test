package com.vungle.ads;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i0 implements Serializable {
    private final String adUnitId;
    private final String auctionId;
    private final double bidFloor;
    private final String creativeId;
    private final Map<String, String> extras;
    private final boolean isVXWinner;
    private final int phase;

    public /* synthetic */ i0(double d10, String str, String str2, String str3, int i10, boolean z10, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, str, str2, str3, i10, z10, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Double.compare(this.bidFloor, i0Var.bidFloor) == 0 && kotlin.jvm.internal.s.c(this.auctionId, i0Var.auctionId) && kotlin.jvm.internal.s.c(this.creativeId, i0Var.creativeId) && kotlin.jvm.internal.s.c(this.adUnitId, i0Var.adUnitId) && this.phase == i0Var.phase && this.isVXWinner == i0Var.isVXWinner && kotlin.jvm.internal.s.c(this.extras, i0Var.extras);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getAuctionId() {
        return this.auctionId;
    }

    public final double getBidFloor() {
        return this.bidFloor;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final int getPhase() {
        return this.phase;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Double.hashCode(this.bidFloor) * 31) + this.auctionId.hashCode()) * 31) + this.creativeId.hashCode()) * 31) + this.adUnitId.hashCode()) * 31) + this.phase) * 31) + Boolean.hashCode(this.isVXWinner)) * 31;
        Map<String, String> map = this.extras;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final boolean isVXWinner() {
        return this.isVXWinner;
    }

    private i0(double d10, String str, String str2, String str3, int i10, boolean z10, Map<String, String> map) {
        this.bidFloor = d10;
        this.auctionId = str;
        this.creativeId = str2;
        this.adUnitId = str3;
        this.phase = i10;
        this.isVXWinner = z10;
        this.extras = map;
    }

    /* synthetic */ i0(double d10, String str, String str2, String str3, int i10, boolean z10, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, str, str2, str3, i10, z10, (i11 & 64) != 0 ? null : map);
    }
}
