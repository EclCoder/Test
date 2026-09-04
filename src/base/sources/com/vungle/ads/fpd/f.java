package com.vungle.ads.fpd;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.vungle.ads.internal.util.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import pm.k;
import tm.g2;
import tm.i;
import tm.k0;
import tm.l0;
import tm.q2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b)\b\u0007\u0018\u0000 F2\u00020\u0001:\u0002GHB\u0007¢\u0006\u0004\b\u0002\u0010\u0003BK\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0002\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u0019J\u001f\u0010\"\u001a\u00020\u00002\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\nH\u0007¢\u0006\u0004\b'\u0010%J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u0010\u0019J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0006H\u0007¢\u0006\u0004\b+\u0010\u0019J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0006H\u0007¢\u0006\u0004\b-\u0010\u0019J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010\u0019J\u0017\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0006H\u0007¢\u0006\u0004\b1\u0010\u0019J\u0017\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0006H\u0007¢\u0006\u0004\b3\u0010\u0019J\u0017\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0006H\u0007¢\u0006\u0004\b5\u0010\u0019J\u0017\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0006H\u0007¢\u0006\u0004\b7\u0010\u0019J\u0017\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0006H\u0007¢\u0006\u0004\b9\u0010\u0019J\u0017\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0006H\u0007¢\u0006\u0004\b;\u0010\u0019J\u0017\u0010=\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0006H\u0007¢\u0006\u0004\b=\u0010\u0019J\u0017\u0010?\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0006H\u0007¢\u0006\u0004\b?\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0007\u0010@\u0012\u0004\bA\u0010\u0003R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\b\u0010@\u0012\u0004\bB\u0010\u0003R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\t\u0010@\u0012\u0004\bC\u0010\u0003R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000b\u0010D\u0012\u0004\bE\u0010\u0003¨\u0006I"}, d2 = {"Lcom/vungle/ads/fpd/f;", "", "<init>", "()V", "", "seen1", "", "iaaRevenueUSD", "iapRevenueUSD", "totalRevenueUSD", "", "isUserAPurchaser", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/fpd/f;Lsm/d;Lrm/f;)V", "totalEarningsUsd", "setTotalEarningsUsd", "(F)Lcom/vungle/ads/fpd/f;", "setIAARevenueUSD", "setIAPRevenueUSD", "setTotalRevenueUSD", "earningsByPlacement", "setEarningsByPlacement", "", "", "topNAdomain", "setTopNAdomain", "(Ljava/util/List;)Lcom/vungle/ads/fpd/f;", "setIsUserAPurchaser", "(Z)Lcom/vungle/ads/fpd/f;", "isUserASubscriber", "setIsUserASubscriber", "last7DaysMedianSpendUsd", "setLast7DaysMedianSpendUsd", "last7DaysTotalSpendUsd", "setLast7DaysTotalSpendUsd", "last30DaysTotalSpendUsd", "setLast30DaysTotalSpendUsd", "last7DaysMeanSpendUsd", "setLast7DaysMeanSpendUsd", "last30DaysMedianSpendUsd", "setLast30DaysMedianSpendUsd", "last30DaysMeanSpendUsd", "setLast30DaysMeanSpendUsd", "last7DaysUserPltvUsd", "setLast7DaysUserPltvUsd", "last7DaysUserLtvUsd", "setLast7DaysUserLtvUsd", "last30DaysUserPltvUsd", "setLast30DaysUserPltvUsd", "last30DaysUserLtvUsd", "setLast30DaysUserLtvUsd", "last7DaysPlacementFillRate", "setLast7DaysPlacementFillRate", "last30DaysPlacementFillRate", "setLast30DaysPlacementFillRate", "Ljava/lang/Float;", "getIaaRevenueUSD$annotations", "getIapRevenueUSD$annotations", "getTotalRevenueUSD$annotations", "Ljava/lang/Boolean;", "isUserAPurchaser$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@k
public final class f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Float iaaRevenueUSD;
    private Float iapRevenueUSD;
    private Boolean isUserAPurchaser;
    private Float totalRevenueUSD;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.fpd.Revenue", aVar, 4);
            g2Var.p("iaa_revenue_usd", true);
            g2Var.p("iap_revenue_usd", true);
            g2Var.p("total_revenue_usd", true);
            g2Var.p("is_user_a_purchaser", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            k0 k0Var = k0.f53526a;
            return new pm.d[]{qm.a.t(k0Var), qm.a.t(k0Var), qm.a.t(k0Var), qm.a.t(i.f53507a)};
        }

        @Override // pm.c
        public f deserialize(sm.e decoder) {
            Object objE;
            int i10;
            Object objE2;
            Object objE3;
            Object objE4;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            Object objE5 = null;
            if (cVarB.l()) {
                k0 k0Var = k0.f53526a;
                objE2 = cVarB.e(descriptor2, 0, k0Var, null);
                Object objE6 = cVarB.e(descriptor2, 1, k0Var, null);
                objE3 = cVarB.e(descriptor2, 2, k0Var, null);
                objE4 = cVarB.e(descriptor2, 3, i.f53507a, null);
                objE = objE6;
                i10 = 15;
            } else {
                boolean z10 = true;
                int i11 = 0;
                objE = null;
                Object objE7 = null;
                Object objE8 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objE5 = cVarB.e(descriptor2, 0, k0.f53526a, objE5);
                        i11 |= 1;
                    } else if (iO == 1) {
                        objE = cVarB.e(descriptor2, 1, k0.f53526a, objE);
                        i11 |= 2;
                    } else if (iO == 2) {
                        objE7 = cVarB.e(descriptor2, 2, k0.f53526a, objE7);
                        i11 |= 4;
                    } else {
                        if (iO != 3) {
                            throw new UnknownFieldException(iO);
                        }
                        objE8 = cVarB.e(descriptor2, 3, i.f53507a, objE8);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                objE2 = objE5;
                objE3 = objE7;
                objE4 = objE8;
            }
            cVarB.d(descriptor2);
            return new f(i10, (Float) objE2, (Float) objE, (Float) objE3, (Boolean) objE4, null);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, f value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            f.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.fpd.f$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pm.d serializer() {
            return a.INSTANCE;
        }

        private Companion() {
        }
    }

    public f() {
    }

    public static final void write$Self(f self, sm.d output, rm.f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || self.iaaRevenueUSD != null) {
            output.w(serialDesc, 0, k0.f53526a, self.iaaRevenueUSD);
        }
        if (output.k(serialDesc, 1) || self.iapRevenueUSD != null) {
            output.w(serialDesc, 1, k0.f53526a, self.iapRevenueUSD);
        }
        if (output.k(serialDesc, 2) || self.totalRevenueUSD != null) {
            output.w(serialDesc, 2, k0.f53526a, self.totalRevenueUSD);
        }
        if (!output.k(serialDesc, 3) && self.isUserAPurchaser == null) {
            return;
        }
        output.w(serialDesc, 3, i.f53507a, self.isUserAPurchaser);
    }

    public final f setIAARevenueUSD(float iaaRevenueUSD) {
        if (t.isInRange$default(t.INSTANCE, iaaRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.iaaRevenueUSD = Float.valueOf(iaaRevenueUSD);
        }
        return this;
    }

    public final f setIAPRevenueUSD(float iapRevenueUSD) {
        if (t.isInRange$default(t.INSTANCE, iapRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.iapRevenueUSD = Float.valueOf(iapRevenueUSD);
        }
        return this;
    }

    public final f setIsUserAPurchaser(boolean isUserAPurchaser) {
        this.isUserAPurchaser = Boolean.valueOf(isUserAPurchaser);
        return this;
    }

    public final f setTotalRevenueUSD(float totalRevenueUSD) {
        if (t.isInRange$default(t.INSTANCE, totalRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.totalRevenueUSD = Float.valueOf(totalRevenueUSD);
        }
        return this;
    }

    public /* synthetic */ f(int i10, Float f10, Float f11, Float f12, Boolean bool, q2 q2Var) {
        if ((i10 & 1) == 0) {
            this.iaaRevenueUSD = null;
        } else {
            this.iaaRevenueUSD = f10;
        }
        if ((i10 & 2) == 0) {
            this.iapRevenueUSD = null;
        } else {
            this.iapRevenueUSD = f11;
        }
        if ((i10 & 4) == 0) {
            this.totalRevenueUSD = null;
        } else {
            this.totalRevenueUSD = f12;
        }
        if ((i10 & 8) == 0) {
            this.isUserAPurchaser = null;
        } else {
            this.isUserAPurchaser = bool;
        }
    }

    private static /* synthetic */ void getIaaRevenueUSD$annotations() {
    }

    private static /* synthetic */ void getIapRevenueUSD$annotations() {
    }

    private static /* synthetic */ void getTotalRevenueUSD$annotations() {
    }

    private static /* synthetic */ void isUserAPurchaser$annotations() {
    }

    public final f setEarningsByPlacement(float earningsByPlacement) {
        return this;
    }

    public final f setIsUserASubscriber(boolean isUserASubscriber) {
        return this;
    }

    public final f setLast30DaysMeanSpendUsd(float last30DaysMeanSpendUsd) {
        return this;
    }

    public final f setLast30DaysMedianSpendUsd(float last30DaysMedianSpendUsd) {
        return this;
    }

    public final f setLast30DaysPlacementFillRate(float last30DaysPlacementFillRate) {
        return this;
    }

    public final f setLast30DaysTotalSpendUsd(float last30DaysTotalSpendUsd) {
        return this;
    }

    public final f setLast30DaysUserLtvUsd(float last30DaysUserLtvUsd) {
        return this;
    }

    public final f setLast30DaysUserPltvUsd(float last30DaysUserPltvUsd) {
        return this;
    }

    public final f setLast7DaysMeanSpendUsd(float last7DaysMeanSpendUsd) {
        return this;
    }

    public final f setLast7DaysMedianSpendUsd(float last7DaysMedianSpendUsd) {
        return this;
    }

    public final f setLast7DaysPlacementFillRate(float last7DaysPlacementFillRate) {
        return this;
    }

    public final f setLast7DaysTotalSpendUsd(float last7DaysTotalSpendUsd) {
        return this;
    }

    public final f setLast7DaysUserLtvUsd(float last7DaysUserLtvUsd) {
        return this;
    }

    public final f setLast7DaysUserPltvUsd(float last7DaysUserPltvUsd) {
        return this;
    }

    public final f setTopNAdomain(List<String> topNAdomain) {
        return this;
    }

    public final f setTotalEarningsUsd(float totalEarningsUsd) {
        return this;
    }
}
