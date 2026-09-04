package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import c1.pGX.geAgcEazw;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.inmobi.sdk.InMobiSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import tm.b0;
import tm.b2;
import tm.f1;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.u0;
import tm.v2;

/* JADX INFO: renamed from: com.vungle.ads.internal.model.f, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u000b?@ABCDEFGHIB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JJ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\"\"\u0004\b8\u00109R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010$\"\u0004\b<\u0010=¨\u0006J"}, d2 = {"Lcom/vungle/ads/internal/model/f;", "", "Lcom/vungle/ads/internal/model/h;", "device", "Lcom/vungle/ads/internal/model/d;", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "Lcom/vungle/ads/internal/model/f$k;", "user", "Lcom/vungle/ads/internal/model/f$i;", "ext", "Lcom/vungle/ads/internal/model/f$j;", com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA, "<init>", "(Lcom/vungle/ads/internal/model/h;Lcom/vungle/ads/internal/model/d;Lcom/vungle/ads/internal/model/f$k;Lcom/vungle/ads/internal/model/f$i;Lcom/vungle/ads/internal/model/f$j;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/h;Lcom/vungle/ads/internal/model/d;Lcom/vungle/ads/internal/model/f$k;Lcom/vungle/ads/internal/model/f$i;Lcom/vungle/ads/internal/model/f$j;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/f;Lsm/d;Lrm/f;)V", "component1", "()Lcom/vungle/ads/internal/model/h;", "component2", "()Lcom/vungle/ads/internal/model/d;", "component3", "()Lcom/vungle/ads/internal/model/f$k;", "component4", "()Lcom/vungle/ads/internal/model/f$i;", "component5", "()Lcom/vungle/ads/internal/model/f$j;", "copy", "(Lcom/vungle/ads/internal/model/h;Lcom/vungle/ads/internal/model/d;Lcom/vungle/ads/internal/model/f$k;Lcom/vungle/ads/internal/model/f$i;Lcom/vungle/ads/internal/model/f$j;)Lcom/vungle/ads/internal/model/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/h;", "getDevice", "Lcom/vungle/ads/internal/model/d;", "getApp", "Lcom/vungle/ads/internal/model/f$k;", "getUser", "Lcom/vungle/ads/internal/model/f$i;", "getExt", "setExt", "(Lcom/vungle/ads/internal/model/f$i;)V", "Lcom/vungle/ads/internal/model/f$j;", "getRequest", "setRequest", "(Lcom/vungle/ads/internal/model/f$j;)V", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "f", "g", "h", "i", "j", CampaignEx.JSON_KEY_AD_K, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@pm.k
public final /* data */ class CommonRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AppNode app;
    private final DeviceNode device;
    private RequestExt ext;
    private RequestParam request;
    private final User user;

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$a */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody", aVar, 5);
            g2Var.p("device", false);
            g2Var.p(MBridgeConstans.DYNAMIC_VIEW_WX_APP, true);
            g2Var.p("user", true);
            g2Var.p("ext", true);
            g2Var.p(com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA, true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            return new pm.d[]{DeviceNode.a.INSTANCE, qm.a.t(AppNode.a.INSTANCE), qm.a.t(User.a.INSTANCE), qm.a.t(RequestExt.a.INSTANCE), qm.a.t(RequestParam.a.INSTANCE)};
        }

        @Override // pm.c
        public CommonRequestBody deserialize(sm.e decoder) {
            int i10;
            Object objN;
            Object objE;
            Object objE2;
            Object objE3;
            Object objE4;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            Object objN2 = null;
            if (cVarB.l()) {
                objN = cVarB.n(descriptor2, 0, DeviceNode.a.INSTANCE, null);
                objE = cVarB.e(descriptor2, 1, AppNode.a.INSTANCE, null);
                objE2 = cVarB.e(descriptor2, 2, User.a.INSTANCE, null);
                objE3 = cVarB.e(descriptor2, 3, RequestExt.a.INSTANCE, null);
                objE4 = cVarB.e(descriptor2, 4, RequestParam.a.INSTANCE, null);
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Object objE5 = null;
                Object objE6 = null;
                Object objE7 = null;
                Object objE8 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objN2 = cVarB.n(descriptor2, 0, DeviceNode.a.INSTANCE, objN2);
                        i11 |= 1;
                    } else if (iO == 1) {
                        objE5 = cVarB.e(descriptor2, 1, AppNode.a.INSTANCE, objE5);
                        i11 |= 2;
                    } else if (iO == 2) {
                        objE6 = cVarB.e(descriptor2, 2, User.a.INSTANCE, objE6);
                        i11 |= 4;
                    } else if (iO == 3) {
                        objE7 = cVarB.e(descriptor2, 3, RequestExt.a.INSTANCE, objE7);
                        i11 |= 8;
                    } else {
                        if (iO != 4) {
                            throw new UnknownFieldException(iO);
                        }
                        objE8 = cVarB.e(descriptor2, 4, RequestParam.a.INSTANCE, objE8);
                        i11 |= 16;
                    }
                }
                Object obj = objN2;
                i10 = i11;
                objN = obj;
                objE = objE5;
                objE2 = objE6;
                objE3 = objE7;
                objE4 = objE8;
            }
            cVarB.d(descriptor2);
            return new CommonRequestBody(i10, (DeviceNode) objN, (AppNode) objE, (User) objE2, (RequestExt) objE3, (RequestParam) objE4, (q2) null);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, CommonRequestBody value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            CommonRequestBody.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$c, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002!\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014¨\u0006#"}, d2 = {"Lcom/vungle/ads/internal/model/f$c;", "", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/f$c;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/vungle/ads/internal/model/f$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class CCPA {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String status;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$c$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.CCPA", aVar, 1);
                g2Var.p(NotificationCompat.CATEGORY_STATUS, false);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{v2.f53598a};
            }

            @Override // pm.c
            public CCPA deserialize(sm.e decoder) {
                String strH;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                q2 q2Var = null;
                if (cVarB.l()) {
                    strH = cVarB.H(descriptor2, 0);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strH = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else {
                            if (iO != 0) {
                                throw new UnknownFieldException(iO);
                            }
                            strH = cVarB.H(descriptor2, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new CCPA(i10, strH, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, CCPA value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                CCPA.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$c$b, reason: from kotlin metadata */
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

        public /* synthetic */ CCPA(int i10, String str, q2 q2Var) {
            if (1 != (i10 & 1)) {
                b2.a(i10, 1, a.INSTANCE.getDescriptor());
            }
            this.status = str;
        }

        public static /* synthetic */ CCPA copy$default(CCPA ccpa, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ccpa.status;
            }
            return ccpa.copy(str);
        }

        public static final void write$Self(CCPA self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            output.F(serialDesc, 0, self.status);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        public final CCPA copy(String status) {
            s.h(status, "status");
            return new CCPA(status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CCPA) && s.c(this.status, ((CCPA) other).status);
        }

        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "CCPA(status=" + this.status + ')';
        }

        public CCPA(String status) {
            s.h(status, "status");
            this.status = status;
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$d, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b \u0010!\u001a\u0004\b\u0003\u0010\u0014¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/model/f$d;", "", "", "isCoppa", "<init>", "(Ljava/lang/Boolean;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/f$d;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/f$d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isCoppa$annotations", "()V", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class COPPA {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean isCoppa;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$d$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes6.dex */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.COPPA", aVar, 1);
                g2Var.p("is_coppa", false);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{qm.a.t(tm.i.f53507a)};
            }

            @Override // pm.c
            public COPPA deserialize(sm.e decoder) {
                Object objE;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                q2 q2Var = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, tm.i.f53507a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objE = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else {
                            if (iO != 0) {
                                throw new UnknownFieldException(iO);
                            }
                            objE = cVarB.e(descriptor2, 0, tm.i.f53507a, objE);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new COPPA(i10, (Boolean) objE, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, COPPA value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                COPPA.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$d$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes6.dex */
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

        public /* synthetic */ COPPA(int i10, Boolean bool, q2 q2Var) {
            if (1 != (i10 & 1)) {
                b2.a(i10, 1, a.INSTANCE.getDescriptor());
            }
            this.isCoppa = bool;
        }

        public static /* synthetic */ COPPA copy$default(COPPA coppa, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = coppa.isCoppa;
            }
            return coppa.copy(bool);
        }

        public static /* synthetic */ void isCoppa$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsCoppa() {
            return this.isCoppa;
        }

        public final COPPA copy(Boolean isCoppa) {
            return new COPPA(isCoppa);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof COPPA) && s.c(this.isCoppa, ((COPPA) other).isCoppa);
        }

        public int hashCode() {
            Boolean bool = this.isCoppa;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final Boolean isCoppa() {
            return this.isCoppa;
        }

        public String toString() {
            return "COPPA(isCoppa=" + this.isCoppa + ')';
        }

        public COPPA(Boolean bool) {
            this.isCoppa = bool;
        }

        public static final void write$Self(COPPA self, sm.d output, rm.f serialDesc) {
            s.h(self, geAgcEazw.dZLdWXcfcxOc);
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            output.w(serialDesc, 0, tm.i.f53507a, self.isCoppa);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$f, reason: collision with other inner class name and from kotlin metadata */
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

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$g, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBI\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u0018¨\u00064"}, d2 = {"Lcom/vungle/ads/internal/model/f$g;", "", "", "consentStatus", "consentSource", "", "consentTimestamp", "consentMessageVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/f$g;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/vungle/ads/internal/model/f$g;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConsentStatus", "getConsentStatus$annotations", "()V", "getConsentSource", "getConsentSource$annotations", "J", "getConsentTimestamp", "getConsentTimestamp$annotations", "getConsentMessageVersion", "getConsentMessageVersion$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class GDPR {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String consentMessageVersion;
        private final String consentSource;
        private final String consentStatus;
        private final long consentTimestamp;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$g$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.GDPR", aVar, 4);
                g2Var.p("consent_status", false);
                g2Var.p("consent_source", false);
                g2Var.p("consent_timestamp", false);
                g2Var.p("consent_message_version", false);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                v2 v2Var = v2.f53598a;
                return new pm.d[]{v2Var, v2Var, f1.f53474a, v2Var};
            }

            @Override // pm.c
            public GDPR deserialize(sm.e decoder) {
                String strH;
                String strH2;
                int i10;
                String str;
                long j10;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                if (cVarB.l()) {
                    strH = cVarB.H(descriptor2, 0);
                    String strH3 = cVarB.H(descriptor2, 1);
                    long jZ = cVarB.z(descriptor2, 2);
                    strH2 = cVarB.H(descriptor2, 3);
                    i10 = 15;
                    str = strH3;
                    j10 = jZ;
                } else {
                    strH = null;
                    String strH4 = null;
                    boolean z10 = true;
                    long jZ2 = 0;
                    String strH5 = null;
                    int i11 = 0;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            strH = cVarB.H(descriptor2, 0);
                            i11 |= 1;
                        } else if (iO == 1) {
                            strH4 = cVarB.H(descriptor2, 1);
                            i11 |= 2;
                        } else if (iO == 2) {
                            jZ2 = cVarB.z(descriptor2, 2);
                            i11 |= 4;
                        } else {
                            if (iO != 3) {
                                throw new UnknownFieldException(iO);
                            }
                            strH5 = cVarB.H(descriptor2, 3);
                            i11 |= 8;
                        }
                    }
                    strH2 = strH5;
                    i10 = i11;
                    str = strH4;
                    j10 = jZ2;
                }
                String str2 = strH;
                cVarB.d(descriptor2);
                return new GDPR(i10, str2, str, j10, strH2, null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, GDPR value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                GDPR.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$g$b, reason: from kotlin metadata */
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

        public /* synthetic */ GDPR(int i10, String str, String str2, long j10, String str3, q2 q2Var) {
            if (15 != (i10 & 15)) {
                b2.a(i10, 15, a.INSTANCE.getDescriptor());
            }
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j10;
            this.consentMessageVersion = str3;
        }

        public static /* synthetic */ GDPR copy$default(GDPR gdpr, String str, String str2, long j10, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gdpr.consentStatus;
            }
            if ((i10 & 2) != 0) {
                str2 = gdpr.consentSource;
            }
            if ((i10 & 4) != 0) {
                j10 = gdpr.consentTimestamp;
            }
            if ((i10 & 8) != 0) {
                str3 = gdpr.consentMessageVersion;
            }
            String str4 = str3;
            return gdpr.copy(str, str2, j10, str4);
        }

        public static final void write$Self(GDPR self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            output.F(serialDesc, 0, self.consentStatus);
            output.F(serialDesc, 1, self.consentSource);
            output.e(serialDesc, 2, self.consentTimestamp);
            output.F(serialDesc, 3, self.consentMessageVersion);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConsentStatus() {
            return this.consentStatus;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsentSource() {
            return this.consentSource;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final GDPR copy(String consentStatus, String consentSource, long consentTimestamp, String consentMessageVersion) {
            s.h(consentStatus, "consentStatus");
            s.h(consentSource, "consentSource");
            s.h(consentMessageVersion, "consentMessageVersion");
            return new GDPR(consentStatus, consentSource, consentTimestamp, consentMessageVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GDPR)) {
                return false;
            }
            GDPR gdpr = (GDPR) other;
            return s.c(this.consentStatus, gdpr.consentStatus) && s.c(this.consentSource, gdpr.consentSource) && this.consentTimestamp == gdpr.consentTimestamp && s.c(this.consentMessageVersion, gdpr.consentMessageVersion);
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentSource() {
            return this.consentSource;
        }

        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        public int hashCode() {
            return (((((this.consentStatus.hashCode() * 31) + this.consentSource.hashCode()) * 31) + Long.hashCode(this.consentTimestamp)) * 31) + this.consentMessageVersion.hashCode();
        }

        public String toString() {
            return "GDPR(consentStatus=" + this.consentStatus + ", consentSource=" + this.consentSource + ", consentTimestamp=" + this.consentTimestamp + ", consentMessageVersion=" + this.consentMessageVersion + ')';
        }

        public GDPR(String consentStatus, String consentSource, long j10, String consentMessageVersion) {
            s.h(consentStatus, "consentStatus");
            s.h(consentSource, "consentSource");
            s.h(consentMessageVersion, "consentMessageVersion");
            this.consentStatus = consentStatus;
            this.consentSource = consentSource;
            this.consentTimestamp = j10;
            this.consentMessageVersion = consentMessageVersion;
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentSource$annotations() {
        }

        public static /* synthetic */ void getConsentStatus$annotations() {
        }

        public static /* synthetic */ void getConsentTimestamp$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$h, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/model/f$h;", "", "", "tcf", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/f$h;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/vungle/ads/internal/model/f$h;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTcf", "getTcf$annotations", "()V", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class IAB {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String tcf;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$h$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.IAB", aVar, 1);
                g2Var.p("tcf", false);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{v2.f53598a};
            }

            @Override // pm.c
            public IAB deserialize(sm.e decoder) {
                String strH;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                q2 q2Var = null;
                if (cVarB.l()) {
                    strH = cVarB.H(descriptor2, 0);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strH = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else {
                            if (iO != 0) {
                                throw new UnknownFieldException(iO);
                            }
                            strH = cVarB.H(descriptor2, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new IAB(i10, strH, q2Var);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, IAB value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                IAB.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$h$b, reason: from kotlin metadata */
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

        public /* synthetic */ IAB(int i10, String str, q2 q2Var) {
            if (1 != (i10 & 1)) {
                b2.a(i10, 1, a.INSTANCE.getDescriptor());
            }
            this.tcf = str;
        }

        public static /* synthetic */ IAB copy$default(IAB iab, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = iab.tcf;
            }
            return iab.copy(str);
        }

        public static final void write$Self(IAB self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            output.F(serialDesc, 0, self.tcf);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTcf() {
            return this.tcf;
        }

        public final IAB copy(String tcf) {
            s.h(tcf, "tcf");
            return new IAB(tcf);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IAB) && s.c(this.tcf, ((IAB) other).tcf);
        }

        public final String getTcf() {
            return this.tcf;
        }

        public int hashCode() {
            return this.tcf.hashCode();
        }

        public String toString() {
            return "IAB(tcf=" + this.tcf + ')';
        }

        public IAB(String tcf) {
            s.h(tcf, "tcf");
            this.tcf = tcf;
        }

        public static /* synthetic */ void getTcf$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$i, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010*R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010\u001a¨\u00062"}, d2 = {"Lcom/vungle/ads/internal/model/f$i;", "", "", "configExtension", "signals", "", "configLastValidatedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/f$i;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/vungle/ads/internal/model/f$i;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConfigExtension", "getConfigExtension$annotations", "()V", "getSignals", "setSignals", "(Ljava/lang/String;)V", "getSignals$annotations", "Ljava/lang/Long;", "getConfigLastValidatedTimestamp", "getConfigLastValidatedTimestamp$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class RequestExt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String configExtension;
        private final Long configLastValidatedTimestamp;
        private String signals;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$i$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.RequestExt", aVar, 3);
                g2Var.p("config_extension", true);
                g2Var.p("signals", true);
                g2Var.p("config_last_validated_ts", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                v2 v2Var = v2.f53598a;
                return new pm.d[]{qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(f1.f53474a)};
            }

            @Override // pm.c
            public RequestExt deserialize(sm.e decoder) {
                int i10;
                Object objE;
                Object objE2;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                Object objE3 = null;
                if (cVarB.l()) {
                    v2 v2Var = v2.f53598a;
                    Object objE4 = cVarB.e(descriptor2, 0, v2Var, null);
                    objE = cVarB.e(descriptor2, 1, v2Var, null);
                    objE2 = cVarB.e(descriptor2, 2, f1.f53474a, null);
                    objE3 = objE4;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Object objE5 = null;
                    Object objE6 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objE3 = cVarB.e(descriptor2, 0, v2.f53598a, objE3);
                            i11 |= 1;
                        } else if (iO == 1) {
                            objE5 = cVarB.e(descriptor2, 1, v2.f53598a, objE5);
                            i11 |= 2;
                        } else {
                            if (iO != 2) {
                                throw new UnknownFieldException(iO);
                            }
                            objE6 = cVarB.e(descriptor2, 2, f1.f53474a, objE6);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    objE = objE5;
                    objE2 = objE6;
                }
                cVarB.d(descriptor2);
                return new RequestExt(i10, (String) objE3, (String) objE, (Long) objE2, (q2) null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, RequestExt value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                RequestExt.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$i$b, reason: from kotlin metadata */
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

        public RequestExt() {
            this((String) null, (String) null, (Long) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ RequestExt copy$default(RequestExt requestExt, String str, String str2, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = requestExt.configExtension;
            }
            if ((i10 & 2) != 0) {
                str2 = requestExt.signals;
            }
            if ((i10 & 4) != 0) {
                l10 = requestExt.configLastValidatedTimestamp;
            }
            return requestExt.copy(str, str2, l10);
        }

        public static final void write$Self(RequestExt self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.configExtension != null) {
                output.w(serialDesc, 0, v2.f53598a, self.configExtension);
            }
            if (output.k(serialDesc, 1) || self.signals != null) {
                output.w(serialDesc, 1, v2.f53598a, self.signals);
            }
            if (!output.k(serialDesc, 2) && self.configLastValidatedTimestamp == null) {
                return;
            }
            output.w(serialDesc, 2, f1.f53474a, self.configLastValidatedTimestamp);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConfigExtension() {
            return this.configExtension;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSignals() {
            return this.signals;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        public final RequestExt copy(String configExtension, String signals, Long configLastValidatedTimestamp) {
            return new RequestExt(configExtension, signals, configLastValidatedTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestExt)) {
                return false;
            }
            RequestExt requestExt = (RequestExt) other;
            return s.c(this.configExtension, requestExt.configExtension) && s.c(this.signals, requestExt.signals) && s.c(this.configLastValidatedTimestamp, requestExt.configLastValidatedTimestamp);
        }

        public final String getConfigExtension() {
            return this.configExtension;
        }

        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        public final String getSignals() {
            return this.signals;
        }

        public int hashCode() {
            String str = this.configExtension;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.signals;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l10 = this.configLastValidatedTimestamp;
            return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
        }

        public final void setSignals(String str) {
            this.signals = str;
        }

        public String toString() {
            return "RequestExt(configExtension=" + this.configExtension + ", signals=" + this.signals + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ')';
        }

        public /* synthetic */ RequestExt(int i10, String str, String str2, Long l10, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.configExtension = null;
            } else {
                this.configExtension = str;
            }
            if ((i10 & 2) == 0) {
                this.signals = null;
            } else {
                this.signals = str2;
            }
            if ((i10 & 4) == 0) {
                this.configLastValidatedTimestamp = null;
            } else {
                this.configLastValidatedTimestamp = l10;
            }
        }

        public RequestExt(String str, String str2, Long l10) {
            this.configExtension = str;
            this.signals = str2;
            this.configLastValidatedTimestamp = l10;
        }

        public /* synthetic */ RequestExt(String str, String str2, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : l10);
        }

        public static /* synthetic */ void getConfigExtension$annotations() {
        }

        public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
        }

        public static /* synthetic */ void getSignals$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$j, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGBa\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBo\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(Jj\u0010)\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010$J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010\u001eR*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00104\u0012\u0004\b8\u00109\u001a\u0004\b5\u0010 \"\u0004\b6\u00107R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010=\u0012\u0004\bA\u00109\u001a\u0004\b@\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\bB\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010(¨\u0006H"}, d2 = {"Lcom/vungle/ads/internal/model/f$j;", "", "", "", "placements", "Lcom/vungle/ads/internal/model/f$b;", "adSize", "", "adStartTime", "advAppId", "placementReferenceId", "user", "Lcom/vungle/ads/internal/model/f$e;", "csb", "<init>", "(Ljava/util/List;Lcom/vungle/ads/internal/model/f$b;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vungle/ads/internal/model/f$e;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/vungle/ads/internal/model/f$b;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vungle/ads/internal/model/f$e;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/f$j;Lsm/d;Lrm/f;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/vungle/ads/internal/model/f$b;", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()Lcom/vungle/ads/internal/model/f$e;", "copy", "(Ljava/util/List;Lcom/vungle/ads/internal/model/f$b;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vungle/ads/internal/model/f$e;)Lcom/vungle/ads/internal/model/f$j;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPlacements", "Lcom/vungle/ads/internal/model/f$b;", "getAdSize", "setAdSize", "(Lcom/vungle/ads/internal/model/f$b;)V", "getAdSize$annotations", "()V", "Ljava/lang/Long;", "getAdStartTime", "getAdStartTime$annotations", "Ljava/lang/String;", "getAdvAppId", "getAdvAppId$annotations", "getPlacementReferenceId", "getPlacementReferenceId$annotations", "getUser", "Lcom/vungle/ads/internal/model/f$e;", "getCsb", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class RequestParam {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private AdSizeParam adSize;
        private final Long adStartTime;
        private final String advAppId;
        private final CSBParam csb;
        private final String placementReferenceId;
        private final List<String> placements;
        private final String user;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$j$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", aVar, 7);
                g2Var.p("placements", true);
                g2Var.p("ad_size", true);
                g2Var.p("ad_start_time", true);
                g2Var.p(MBridgeConstans.APP_ID, true);
                g2Var.p("placement_reference_id", true);
                g2Var.p("user", true);
                g2Var.p("csb", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                v2 v2Var = v2.f53598a;
                return new pm.d[]{qm.a.t(new tm.f(v2Var)), qm.a.t(AdSizeParam.a.INSTANCE), qm.a.t(f1.f53474a), qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(CSBParam.a.INSTANCE)};
            }

            @Override // pm.c
            public RequestParam deserialize(sm.e decoder) {
                int i10;
                Object objE;
                Object objE2;
                Object objE3;
                Object objE4;
                Object objE5;
                Object objE6;
                Object objE7;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                int i11 = 6;
                Object objE8 = null;
                if (cVarB.l()) {
                    v2 v2Var = v2.f53598a;
                    objE = cVarB.e(descriptor2, 0, new tm.f(v2Var), null);
                    objE3 = cVarB.e(descriptor2, 1, AdSizeParam.a.INSTANCE, null);
                    objE4 = cVarB.e(descriptor2, 2, f1.f53474a, null);
                    objE5 = cVarB.e(descriptor2, 3, v2Var, null);
                    objE6 = cVarB.e(descriptor2, 4, v2Var, null);
                    objE7 = cVarB.e(descriptor2, 5, v2Var, null);
                    objE2 = cVarB.e(descriptor2, 6, CSBParam.a.INSTANCE, null);
                    i10 = 127;
                } else {
                    boolean z10 = true;
                    int i12 = 0;
                    Object objE9 = null;
                    Object objE10 = null;
                    Object objE11 = null;
                    Object objE12 = null;
                    Object objE13 = null;
                    Object objE14 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        switch (iO) {
                            case -1:
                                z10 = false;
                                i11 = 6;
                                break;
                            case 0:
                                objE8 = cVarB.e(descriptor2, 0, new tm.f(v2.f53598a), objE8);
                                i12 |= 1;
                                i11 = 6;
                                break;
                            case 1:
                                objE10 = cVarB.e(descriptor2, 1, AdSizeParam.a.INSTANCE, objE10);
                                i12 |= 2;
                                i11 = 6;
                                break;
                            case 2:
                                objE11 = cVarB.e(descriptor2, 2, f1.f53474a, objE11);
                                i12 |= 4;
                                break;
                            case 3:
                                objE12 = cVarB.e(descriptor2, 3, v2.f53598a, objE12);
                                i12 |= 8;
                                break;
                            case 4:
                                objE13 = cVarB.e(descriptor2, 4, v2.f53598a, objE13);
                                i12 |= 16;
                                break;
                            case 5:
                                objE14 = cVarB.e(descriptor2, 5, v2.f53598a, objE14);
                                i12 |= 32;
                                break;
                            case 6:
                                objE9 = cVarB.e(descriptor2, i11, CSBParam.a.INSTANCE, objE9);
                                i12 |= 64;
                                break;
                            default:
                                throw new UnknownFieldException(iO);
                        }
                    }
                    Object obj = objE8;
                    i10 = i12;
                    objE = obj;
                    objE2 = objE9;
                    objE3 = objE10;
                    objE4 = objE11;
                    objE5 = objE12;
                    objE6 = objE13;
                    objE7 = objE14;
                }
                cVarB.d(descriptor2);
                return new RequestParam(i10, (List) objE, (AdSizeParam) objE3, (Long) objE4, (String) objE5, (String) objE6, (String) objE7, (CSBParam) objE2, (q2) null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, RequestParam value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                RequestParam.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$j$b, reason: from kotlin metadata */
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

        public RequestParam() {
            this((List) null, (AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, (CSBParam) null, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RequestParam copy$default(RequestParam requestParam, List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, CSBParam cSBParam, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = requestParam.placements;
            }
            if ((i10 & 2) != 0) {
                adSizeParam = requestParam.adSize;
            }
            if ((i10 & 4) != 0) {
                l10 = requestParam.adStartTime;
            }
            if ((i10 & 8) != 0) {
                str = requestParam.advAppId;
            }
            if ((i10 & 16) != 0) {
                str2 = requestParam.placementReferenceId;
            }
            if ((i10 & 32) != 0) {
                str3 = requestParam.user;
            }
            if ((i10 & 64) != 0) {
                cSBParam = requestParam.csb;
            }
            String str4 = str3;
            CSBParam cSBParam2 = cSBParam;
            String str5 = str2;
            Long l11 = l10;
            return requestParam.copy(list, adSizeParam, l11, str, str5, str4, cSBParam2);
        }

        public static final void write$Self(RequestParam self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.placements != null) {
                output.w(serialDesc, 0, new tm.f(v2.f53598a), self.placements);
            }
            if (output.k(serialDesc, 1) || self.adSize != null) {
                output.w(serialDesc, 1, AdSizeParam.a.INSTANCE, self.adSize);
            }
            if (output.k(serialDesc, 2) || self.adStartTime != null) {
                output.w(serialDesc, 2, f1.f53474a, self.adStartTime);
            }
            if (output.k(serialDesc, 3) || self.advAppId != null) {
                output.w(serialDesc, 3, v2.f53598a, self.advAppId);
            }
            if (output.k(serialDesc, 4) || self.placementReferenceId != null) {
                output.w(serialDesc, 4, v2.f53598a, self.placementReferenceId);
            }
            if (output.k(serialDesc, 5) || self.user != null) {
                output.w(serialDesc, 5, v2.f53598a, self.user);
            }
            if (!output.k(serialDesc, 6) && self.csb == null) {
                return;
            }
            output.w(serialDesc, 6, CSBParam.a.INSTANCE, self.csb);
        }

        public final List<String> component1() {
            return this.placements;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdSizeParam getAdSize() {
            return this.adSize;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAdvAppId() {
            return this.advAppId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getUser() {
            return this.user;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final CSBParam getCsb() {
            return this.csb;
        }

        public final RequestParam copy(List<String> placements, AdSizeParam adSize, Long adStartTime, String advAppId, String placementReferenceId, String user, CSBParam csb) {
            return new RequestParam(placements, adSize, adStartTime, advAppId, placementReferenceId, user, csb);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestParam)) {
                return false;
            }
            RequestParam requestParam = (RequestParam) other;
            return s.c(this.placements, requestParam.placements) && s.c(this.adSize, requestParam.adSize) && s.c(this.adStartTime, requestParam.adStartTime) && s.c(this.advAppId, requestParam.advAppId) && s.c(this.placementReferenceId, requestParam.placementReferenceId) && s.c(this.user, requestParam.user) && s.c(this.csb, requestParam.csb);
        }

        public final AdSizeParam getAdSize() {
            return this.adSize;
        }

        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final CSBParam getCsb() {
            return this.csb;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public final List<String> getPlacements() {
            return this.placements;
        }

        public final String getUser() {
            return this.user;
        }

        public int hashCode() {
            List<String> list = this.placements;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            AdSizeParam adSizeParam = this.adSize;
            int iHashCode2 = (iHashCode + (adSizeParam == null ? 0 : adSizeParam.hashCode())) * 31;
            Long l10 = this.adStartTime;
            int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str = this.advAppId;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placementReferenceId;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.user;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CSBParam cSBParam = this.csb;
            return iHashCode6 + (cSBParam != null ? cSBParam.hashCode() : 0);
        }

        public final void setAdSize(AdSizeParam adSizeParam) {
            this.adSize = adSizeParam;
        }

        public String toString() {
            return "RequestParam(placements=" + this.placements + ", adSize=" + this.adSize + ", adStartTime=" + this.adStartTime + ", advAppId=" + this.advAppId + ", placementReferenceId=" + this.placementReferenceId + ", user=" + this.user + ", csb=" + this.csb + ')';
        }

        public /* synthetic */ RequestParam(int i10, List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, CSBParam cSBParam, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.placements = null;
            } else {
                this.placements = list;
            }
            if ((i10 & 2) == 0) {
                this.adSize = null;
            } else {
                this.adSize = adSizeParam;
            }
            if ((i10 & 4) == 0) {
                this.adStartTime = null;
            } else {
                this.adStartTime = l10;
            }
            if ((i10 & 8) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str;
            }
            if ((i10 & 16) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str2;
            }
            if ((i10 & 32) == 0) {
                this.user = null;
            } else {
                this.user = str3;
            }
            if ((i10 & 64) == 0) {
                this.csb = null;
            } else {
                this.csb = cSBParam;
            }
        }

        public RequestParam(List<String> list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, CSBParam cSBParam) {
            this.placements = list;
            this.adSize = adSizeParam;
            this.adStartTime = l10;
            this.advAppId = str;
            this.placementReferenceId = str2;
            this.user = str3;
            this.csb = cSBParam;
        }

        public /* synthetic */ RequestParam(List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, CSBParam cSBParam, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : adSizeParam, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : cSBParam);
        }

        public static /* synthetic */ void getAdSize$annotations() {
        }

        public static /* synthetic */ void getAdStartTime$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$k, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EFBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JL\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u00103R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u00107R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010 \"\u0004\b:\u0010;R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\"\"\u0004\b>\u0010?R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010$\"\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/vungle/ads/internal/model/f$k;", "", "Lcom/vungle/ads/internal/model/f$g;", InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "Lcom/vungle/ads/internal/model/f$c;", "ccpa", "Lcom/vungle/ads/internal/model/f$d;", "coppa", "Lcom/vungle/ads/fpd/c;", "fpd", "Lcom/vungle/ads/internal/model/f$h;", "iab", "<init>", "(Lcom/vungle/ads/internal/model/f$g;Lcom/vungle/ads/internal/model/f$c;Lcom/vungle/ads/internal/model/f$d;Lcom/vungle/ads/fpd/c;Lcom/vungle/ads/internal/model/f$h;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/f$g;Lcom/vungle/ads/internal/model/f$c;Lcom/vungle/ads/internal/model/f$d;Lcom/vungle/ads/fpd/c;Lcom/vungle/ads/internal/model/f$h;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/f$k;Lsm/d;Lrm/f;)V", "component1", "()Lcom/vungle/ads/internal/model/f$g;", "component2", "()Lcom/vungle/ads/internal/model/f$c;", "component3", "()Lcom/vungle/ads/internal/model/f$d;", "component4", "()Lcom/vungle/ads/fpd/c;", "component5", "()Lcom/vungle/ads/internal/model/f$h;", "copy", "(Lcom/vungle/ads/internal/model/f$g;Lcom/vungle/ads/internal/model/f$c;Lcom/vungle/ads/internal/model/f$d;Lcom/vungle/ads/fpd/c;Lcom/vungle/ads/internal/model/f$h;)Lcom/vungle/ads/internal/model/f$k;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/f$g;", "getGdpr", "setGdpr", "(Lcom/vungle/ads/internal/model/f$g;)V", "Lcom/vungle/ads/internal/model/f$c;", "getCcpa", "setCcpa", "(Lcom/vungle/ads/internal/model/f$c;)V", "Lcom/vungle/ads/internal/model/f$d;", "getCoppa", "setCoppa", "(Lcom/vungle/ads/internal/model/f$d;)V", "Lcom/vungle/ads/fpd/c;", "getFpd", "setFpd", "(Lcom/vungle/ads/fpd/c;)V", "Lcom/vungle/ads/internal/model/f$h;", "getIab", "setIab", "(Lcom/vungle/ads/internal/model/f$h;)V", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class User {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private CCPA ccpa;
        private COPPA coppa;
        private com.vungle.ads.fpd.c fpd;
        private GDPR gdpr;
        private IAB iab;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$k$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.User", aVar, 5);
                g2Var.p(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, true);
                g2Var.p("ccpa", true);
                g2Var.p("coppa", true);
                g2Var.p("fpd", true);
                g2Var.p("iab", true);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                return new pm.d[]{qm.a.t(GDPR.a.INSTANCE), qm.a.t(CCPA.a.INSTANCE), qm.a.t(COPPA.a.INSTANCE), qm.a.t(com.vungle.ads.fpd.c.a.INSTANCE), qm.a.t(IAB.a.INSTANCE)};
            }

            @Override // pm.c
            public User deserialize(sm.e decoder) {
                int i10;
                Object objE;
                Object objE2;
                Object objE3;
                Object objE4;
                Object objE5;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                Object objE6 = null;
                if (cVarB.l()) {
                    objE = cVarB.e(descriptor2, 0, GDPR.a.INSTANCE, null);
                    objE2 = cVarB.e(descriptor2, 1, CCPA.a.INSTANCE, null);
                    objE3 = cVarB.e(descriptor2, 2, COPPA.a.INSTANCE, null);
                    objE4 = cVarB.e(descriptor2, 3, com.vungle.ads.fpd.c.a.INSTANCE, null);
                    objE5 = cVarB.e(descriptor2, 4, IAB.a.INSTANCE, null);
                    i10 = 31;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Object objE7 = null;
                    Object objE8 = null;
                    Object objE9 = null;
                    Object objE10 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objE6 = cVarB.e(descriptor2, 0, GDPR.a.INSTANCE, objE6);
                            i11 |= 1;
                        } else if (iO == 1) {
                            objE7 = cVarB.e(descriptor2, 1, CCPA.a.INSTANCE, objE7);
                            i11 |= 2;
                        } else if (iO == 2) {
                            objE8 = cVarB.e(descriptor2, 2, COPPA.a.INSTANCE, objE8);
                            i11 |= 4;
                        } else if (iO == 3) {
                            objE9 = cVarB.e(descriptor2, 3, com.vungle.ads.fpd.c.a.INSTANCE, objE9);
                            i11 |= 8;
                        } else {
                            if (iO != 4) {
                                throw new UnknownFieldException(iO);
                            }
                            objE10 = cVarB.e(descriptor2, 4, IAB.a.INSTANCE, objE10);
                            i11 |= 16;
                        }
                    }
                    Object obj = objE6;
                    i10 = i11;
                    objE = obj;
                    objE2 = objE7;
                    objE3 = objE8;
                    objE4 = objE9;
                    objE5 = objE10;
                }
                cVarB.d(descriptor2);
                return new User(i10, (GDPR) objE, (CCPA) objE2, (COPPA) objE3, (com.vungle.ads.fpd.c) objE4, (IAB) objE5, (q2) null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, User value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                User.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$k$b, reason: from kotlin metadata */
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

        public User() {
            this((GDPR) null, (CCPA) null, (COPPA) null, (com.vungle.ads.fpd.c) null, (IAB) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ User copy$default(User user, GDPR gdpr, CCPA ccpa, COPPA coppa, com.vungle.ads.fpd.c cVar, IAB iab, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gdpr = user.gdpr;
            }
            if ((i10 & 2) != 0) {
                ccpa = user.ccpa;
            }
            if ((i10 & 4) != 0) {
                coppa = user.coppa;
            }
            if ((i10 & 8) != 0) {
                cVar = user.fpd;
            }
            if ((i10 & 16) != 0) {
                iab = user.iab;
            }
            IAB iab2 = iab;
            COPPA coppa2 = coppa;
            return user.copy(gdpr, ccpa, coppa2, cVar, iab2);
        }

        public static final void write$Self(User self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.gdpr != null) {
                output.w(serialDesc, 0, GDPR.a.INSTANCE, self.gdpr);
            }
            if (output.k(serialDesc, 1) || self.ccpa != null) {
                output.w(serialDesc, 1, CCPA.a.INSTANCE, self.ccpa);
            }
            if (output.k(serialDesc, 2) || self.coppa != null) {
                output.w(serialDesc, 2, COPPA.a.INSTANCE, self.coppa);
            }
            if (output.k(serialDesc, 3) || self.fpd != null) {
                output.w(serialDesc, 3, com.vungle.ads.fpd.c.a.INSTANCE, self.fpd);
            }
            if (!output.k(serialDesc, 4) && self.iab == null) {
                return;
            }
            output.w(serialDesc, 4, IAB.a.INSTANCE, self.iab);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GDPR getGdpr() {
            return this.gdpr;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CCPA getCcpa() {
            return this.ccpa;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final COPPA getCoppa() {
            return this.coppa;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final com.vungle.ads.fpd.c getFpd() {
            return this.fpd;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final IAB getIab() {
            return this.iab;
        }

        public final User copy(GDPR gdpr, CCPA ccpa, COPPA coppa, com.vungle.ads.fpd.c fpd, IAB iab) {
            return new User(gdpr, ccpa, coppa, fpd, iab);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return s.c(this.gdpr, user.gdpr) && s.c(this.ccpa, user.ccpa) && s.c(this.coppa, user.coppa) && s.c(this.fpd, user.fpd) && s.c(this.iab, user.iab);
        }

        public final CCPA getCcpa() {
            return this.ccpa;
        }

        public final COPPA getCoppa() {
            return this.coppa;
        }

        public final com.vungle.ads.fpd.c getFpd() {
            return this.fpd;
        }

        public final GDPR getGdpr() {
            return this.gdpr;
        }

        public final IAB getIab() {
            return this.iab;
        }

        public int hashCode() {
            GDPR gdpr = this.gdpr;
            int iHashCode = (gdpr == null ? 0 : gdpr.hashCode()) * 31;
            CCPA ccpa = this.ccpa;
            int iHashCode2 = (iHashCode + (ccpa == null ? 0 : ccpa.hashCode())) * 31;
            COPPA coppa = this.coppa;
            int iHashCode3 = (iHashCode2 + (coppa == null ? 0 : coppa.hashCode())) * 31;
            com.vungle.ads.fpd.c cVar = this.fpd;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            IAB iab = this.iab;
            return iHashCode4 + (iab != null ? iab.hashCode() : 0);
        }

        public final void setCcpa(CCPA ccpa) {
            this.ccpa = ccpa;
        }

        public final void setCoppa(COPPA coppa) {
            this.coppa = coppa;
        }

        public final void setFpd(com.vungle.ads.fpd.c cVar) {
            this.fpd = cVar;
        }

        public final void setGdpr(GDPR gdpr) {
            this.gdpr = gdpr;
        }

        public final void setIab(IAB iab) {
            this.iab = iab;
        }

        public String toString() {
            return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ", fpd=" + this.fpd + ", iab=" + this.iab + ')';
        }

        public /* synthetic */ User(int i10, GDPR gdpr, CCPA ccpa, COPPA coppa, com.vungle.ads.fpd.c cVar, IAB iab, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gdpr;
            }
            if ((i10 & 2) == 0) {
                this.ccpa = null;
            } else {
                this.ccpa = ccpa;
            }
            if ((i10 & 4) == 0) {
                this.coppa = null;
            } else {
                this.coppa = coppa;
            }
            if ((i10 & 8) == 0) {
                this.fpd = null;
            } else {
                this.fpd = cVar;
            }
            if ((i10 & 16) == 0) {
                this.iab = null;
            } else {
                this.iab = iab;
            }
        }

        public User(GDPR gdpr, CCPA ccpa, COPPA coppa, com.vungle.ads.fpd.c cVar, IAB iab) {
            this.gdpr = gdpr;
            this.ccpa = ccpa;
            this.coppa = coppa;
            this.fpd = cVar;
            this.iab = iab;
        }

        public /* synthetic */ User(GDPR gdpr, CCPA ccpa, COPPA coppa, com.vungle.ads.fpd.c cVar, IAB iab, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : gdpr, (i10 & 2) != 0 ? null : ccpa, (i10 & 4) != 0 ? null : coppa, (i10 & 8) != 0 ? null : cVar, (i10 & 16) != 0 ? null : iab);
        }
    }

    public /* synthetic */ CommonRequestBody(int i10, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, q2 q2Var) {
        if (1 != (i10 & 1)) {
            b2.a(i10, 1, a.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i10 & 2) == 0) {
            this.app = null;
        } else {
            this.app = appNode;
        }
        if ((i10 & 4) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i10 & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i10 & 16) == 0) {
            this.request = null;
        } else {
            this.request = requestParam;
        }
    }

    public static /* synthetic */ CommonRequestBody copy$default(CommonRequestBody commonRequestBody, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deviceNode = commonRequestBody.device;
        }
        if ((i10 & 2) != 0) {
            appNode = commonRequestBody.app;
        }
        if ((i10 & 4) != 0) {
            user = commonRequestBody.user;
        }
        if ((i10 & 8) != 0) {
            requestExt = commonRequestBody.ext;
        }
        if ((i10 & 16) != 0) {
            requestParam = commonRequestBody.request;
        }
        RequestParam requestParam2 = requestParam;
        User user2 = user;
        return commonRequestBody.copy(deviceNode, appNode, user2, requestExt, requestParam2);
    }

    public static final void write$Self(CommonRequestBody self, sm.d output, rm.f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        output.A(serialDesc, 0, DeviceNode.a.INSTANCE, self.device);
        if (output.k(serialDesc, 1) || self.app != null) {
            output.w(serialDesc, 1, AppNode.a.INSTANCE, self.app);
        }
        if (output.k(serialDesc, 2) || self.user != null) {
            output.w(serialDesc, 2, User.a.INSTANCE, self.user);
        }
        if (output.k(serialDesc, 3) || self.ext != null) {
            output.w(serialDesc, 3, RequestExt.a.INSTANCE, self.ext);
        }
        if (!output.k(serialDesc, 4) && self.request == null) {
            return;
        }
        output.w(serialDesc, 4, RequestParam.a.INSTANCE, self.request);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceNode getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AppNode getApp() {
        return this.app;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RequestExt getExt() {
        return this.ext;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RequestParam getRequest() {
        return this.request;
    }

    public final CommonRequestBody copy(DeviceNode device, AppNode app, User user, RequestExt ext, RequestParam request) {
        s.h(device, "device");
        return new CommonRequestBody(device, app, user, ext, request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRequestBody)) {
            return false;
        }
        CommonRequestBody commonRequestBody = (CommonRequestBody) other;
        return s.c(this.device, commonRequestBody.device) && s.c(this.app, commonRequestBody.app) && s.c(this.user, commonRequestBody.user) && s.c(this.ext, commonRequestBody.ext) && s.c(this.request, commonRequestBody.request);
    }

    public final AppNode getApp() {
        return this.app;
    }

    public final DeviceNode getDevice() {
        return this.device;
    }

    public final RequestExt getExt() {
        return this.ext;
    }

    public final RequestParam getRequest() {
        return this.request;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        AppNode appNode = this.app;
        int iHashCode2 = (iHashCode + (appNode == null ? 0 : appNode.hashCode())) * 31;
        User user = this.user;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        RequestExt requestExt = this.ext;
        int iHashCode4 = (iHashCode3 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RequestParam requestParam = this.request;
        return iHashCode4 + (requestParam != null ? requestParam.hashCode() : 0);
    }

    public final void setExt(RequestExt requestExt) {
        this.ext = requestExt;
    }

    public final void setRequest(RequestParam requestParam) {
        this.request = requestParam;
    }

    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006)"}, d2 = {"Lcom/vungle/ads/internal/model/f$b;", "", "", "width", "height", "<init>", "(II)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(IIILtm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/f$b;Lsm/d;Lrm/f;)V", "component1", "()I", "component2", "copy", "(II)Lcom/vungle/ads/internal/model/f$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getWidth$annotations", "()V", "getHeight", "getHeight$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class AdSizeParam {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int height;
        private final int width;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$b$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam", aVar, 2);
                g2Var.p("w", false);
                g2Var.p("h", false);
                descriptor = g2Var;
            }

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                u0 u0Var = u0.f53588a;
                return new pm.d[]{u0Var, u0Var};
            }

            @Override // pm.c
            public AdSizeParam deserialize(sm.e decoder) {
                int iS;
                int iS2;
                int i10;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                if (cVarB.l()) {
                    iS = cVarB.s(descriptor2, 0);
                    iS2 = cVarB.s(descriptor2, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    iS = 0;
                    int iS3 = 0;
                    int i11 = 0;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            iS = cVarB.s(descriptor2, 0);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            iS3 = cVarB.s(descriptor2, 1);
                            i11 |= 2;
                        }
                    }
                    iS2 = iS3;
                    i10 = i11;
                }
                cVarB.d(descriptor2);
                return new AdSizeParam(i10, iS, iS2, null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, AdSizeParam value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                AdSizeParam.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$b$b, reason: collision with other inner class name and from kotlin metadata */
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

        public AdSizeParam(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public static /* synthetic */ AdSizeParam copy$default(AdSizeParam adSizeParam, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = adSizeParam.width;
            }
            if ((i12 & 2) != 0) {
                i11 = adSizeParam.height;
            }
            return adSizeParam.copy(i10, i11);
        }

        public static final void write$Self(AdSizeParam self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            output.i(serialDesc, 0, self.width);
            output.i(serialDesc, 1, self.height);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final AdSizeParam copy(int width, int height) {
            return new AdSizeParam(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSizeParam)) {
                return false;
            }
            AdSizeParam adSizeParam = (AdSizeParam) other;
            return this.width == adSizeParam.width && this.height == adSizeParam.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
        }

        public String toString() {
            return "AdSizeParam(width=" + this.width + ", height=" + this.height + ')';
        }

        public /* synthetic */ AdSizeParam(int i10, int i11, int i12, q2 q2Var) {
            if (3 != (i10 & 3)) {
                b2.a(i10, 3, a.INSTANCE.getDescriptor());
            }
            this.width = i11;
            this.height = i12;
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    public CommonRequestBody(DeviceNode device, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam) {
        s.h(device, "device");
        this.device = device;
        this.app = appNode;
        this.user = user;
        this.ext = requestExt;
        this.request = requestParam;
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$e, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eBc\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010\"JX\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u001a\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b2\u00103\u001a\u0004\b\u0007\u0010 R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010\"R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b8\u00103\u001a\u0004\b7\u0010\"R \u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b:\u00103\u001a\u0004\b9\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b;\u0010\"¨\u0006?"}, d2 = {"Lcom/vungle/ads/internal/model/f$e;", "", "", "bidfloor", "", "phase", "", "isVXWinner", "", "parentAuctionId", "creativeId", "adUnitId", "ext", "<init>", "(DIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(IDIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/f$e;Lsm/d;Lrm/f;)V", "component1", "()D", "component2", "()I", "component3", "()Z", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "copy", "(DIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/f$e;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "D", "getBidfloor", "I", "getPhase", "Z", "isVXWinner$annotations", "()V", "Ljava/lang/String;", "getParentAuctionId", "getParentAuctionId$annotations", "getCreativeId", "getCreativeId$annotations", "getAdUnitId", "getAdUnitId$annotations", "getExt", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class CSBParam {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String adUnitId;
        private final double bidfloor;
        private final String creativeId;
        private final String ext;
        private final boolean isVXWinner;
        private final String parentAuctionId;
        private final int phase;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$e$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                v2 v2Var = v2.f53598a;
                return new pm.d[]{b0.f53441a, u0.f53588a, tm.i.f53507a, v2Var, v2Var, v2Var, qm.a.t(v2Var)};
            }

            @Override // pm.c
            public CSBParam deserialize(sm.e decoder) {
                int iS;
                boolean z10;
                int i10;
                String str;
                String str2;
                String str3;
                Object objE;
                double d10;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                if (cVarB.l()) {
                    double dI = cVarB.i(descriptor2, 0);
                    iS = cVarB.s(descriptor2, 1);
                    boolean zX = cVarB.x(descriptor2, 2);
                    String strH = cVarB.H(descriptor2, 3);
                    String strH2 = cVarB.H(descriptor2, 4);
                    String strH3 = cVarB.H(descriptor2, 5);
                    objE = cVarB.e(descriptor2, 6, v2.f53598a, null);
                    str3 = strH3;
                    str = strH;
                    str2 = strH2;
                    z10 = zX;
                    i10 = 127;
                    d10 = dI;
                } else {
                    boolean z11 = true;
                    iS = 0;
                    String strH4 = null;
                    String strH5 = null;
                    Object objE2 = null;
                    double dI2 = 0.0d;
                    boolean zX2 = false;
                    int i11 = 0;
                    String strH6 = null;
                    while (z11) {
                        int iO = cVarB.o(descriptor2);
                        switch (iO) {
                            case -1:
                                z11 = false;
                                continue;
                            case 0:
                                dI2 = cVarB.i(descriptor2, 0);
                                i11 |= 1;
                                continue;
                            case 1:
                                iS = cVarB.s(descriptor2, 1);
                                i11 |= 2;
                                break;
                            case 2:
                                zX2 = cVarB.x(descriptor2, 2);
                                i11 |= 4;
                                break;
                            case 3:
                                strH6 = cVarB.H(descriptor2, 3);
                                i11 |= 8;
                                break;
                            case 4:
                                strH4 = cVarB.H(descriptor2, 4);
                                i11 |= 16;
                                break;
                            case 5:
                                strH5 = cVarB.H(descriptor2, 5);
                                i11 |= 32;
                                break;
                            case 6:
                                objE2 = cVarB.e(descriptor2, 6, v2.f53598a, objE2);
                                i11 |= 64;
                                break;
                            default:
                                throw new UnknownFieldException(iO);
                        }
                    }
                    z10 = zX2;
                    i10 = i11;
                    str = strH6;
                    str2 = strH4;
                    str3 = strH5;
                    objE = objE2;
                    d10 = dI2;
                }
                int i12 = iS;
                cVarB.d(descriptor2);
                return new CSBParam(i10, d10, i12, z10, str, str2, str3, (String) objE, (q2) null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, CSBParam value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                CSBParam.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.CSBParam", aVar, 7);
                g2Var.p("bidfloor", false);
                g2Var.p("phase", false);
                g2Var.p("is_vx_winner", false);
                g2Var.p("parent_auction_id", false);
                g2Var.p(CampaignEx.JSON_KEY_CREATIVE_ID, false);
                g2Var.p("ad_unit_id", false);
                g2Var.p(qEagQqzJZsd.GoWtYEymFcvTMFw, true);
                descriptor = g2Var;
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.f$e$b, reason: from kotlin metadata */
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

        public CSBParam(double d10, int i10, boolean z10, String parentAuctionId, String creativeId, String adUnitId, String str) {
            s.h(parentAuctionId, "parentAuctionId");
            s.h(creativeId, "creativeId");
            s.h(adUnitId, "adUnitId");
            this.bidfloor = d10;
            this.phase = i10;
            this.isVXWinner = z10;
            this.parentAuctionId = parentAuctionId;
            this.creativeId = creativeId;
            this.adUnitId = adUnitId;
            this.ext = str;
        }

        public static /* synthetic */ CSBParam copy$default(CSBParam cSBParam, double d10, int i10, boolean z10, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d10 = cSBParam.bidfloor;
            }
            double d11 = d10;
            if ((i11 & 2) != 0) {
                i10 = cSBParam.phase;
            }
            int i12 = i10;
            if ((i11 & 4) != 0) {
                z10 = cSBParam.isVXWinner;
            }
            boolean z11 = z10;
            if ((i11 & 8) != 0) {
                str = cSBParam.parentAuctionId;
            }
            String str5 = str;
            if ((i11 & 16) != 0) {
                str2 = cSBParam.creativeId;
            }
            return cSBParam.copy(d11, i12, z11, str5, str2, (i11 & 32) != 0 ? cSBParam.adUnitId : str3, (i11 & 64) != 0 ? cSBParam.ext : str4);
        }

        public static final void write$Self(CSBParam self, sm.d output, rm.f serialDesc) {
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            output.j(serialDesc, 0, self.bidfloor);
            output.i(serialDesc, 1, self.phase);
            output.f(serialDesc, 2, self.isVXWinner);
            output.F(serialDesc, 3, self.parentAuctionId);
            output.F(serialDesc, 4, self.creativeId);
            output.F(serialDesc, 5, self.adUnitId);
            if (!output.k(serialDesc, 6) && self.ext == null) {
                return;
            }
            output.w(serialDesc, 6, v2.f53598a, self.ext);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getBidfloor() {
            return this.bidfloor;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPhase() {
            return this.phase;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsVXWinner() {
            return this.isVXWinner;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getParentAuctionId() {
            return this.parentAuctionId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCreativeId() {
            return this.creativeId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getAdUnitId() {
            return this.adUnitId;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getExt() {
            return this.ext;
        }

        public final CSBParam copy(double bidfloor, int phase, boolean isVXWinner, String parentAuctionId, String creativeId, String adUnitId, String ext) {
            s.h(parentAuctionId, "parentAuctionId");
            s.h(creativeId, "creativeId");
            s.h(adUnitId, "adUnitId");
            return new CSBParam(bidfloor, phase, isVXWinner, parentAuctionId, creativeId, adUnitId, ext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CSBParam)) {
                return false;
            }
            CSBParam cSBParam = (CSBParam) other;
            return s.c(Double.valueOf(this.bidfloor), Double.valueOf(cSBParam.bidfloor)) && this.phase == cSBParam.phase && this.isVXWinner == cSBParam.isVXWinner && s.c(this.parentAuctionId, cSBParam.parentAuctionId) && s.c(this.creativeId, cSBParam.creativeId) && s.c(this.adUnitId, cSBParam.adUnitId) && s.c(this.ext, cSBParam.ext);
        }

        public final String getAdUnitId() {
            return this.adUnitId;
        }

        public final double getBidfloor() {
            return this.bidfloor;
        }

        public final String getCreativeId() {
            return this.creativeId;
        }

        public final String getExt() {
            return this.ext;
        }

        public final String getParentAuctionId() {
            return this.parentAuctionId;
        }

        public final int getPhase() {
            return this.phase;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        public int hashCode() {
            int iHashCode = ((Double.hashCode(this.bidfloor) * 31) + Integer.hashCode(this.phase)) * 31;
            boolean z10 = this.isVXWinner;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int iHashCode2 = (((((((iHashCode + r10) * 31) + this.parentAuctionId.hashCode()) * 31) + this.creativeId.hashCode()) * 31) + this.adUnitId.hashCode()) * 31;
            String str = this.ext;
            return iHashCode2 + (str == null ? 0 : str.hashCode());
        }

        public final boolean isVXWinner() {
            return this.isVXWinner;
        }

        public String toString() {
            return "CSBParam(bidfloor=" + this.bidfloor + ", phase=" + this.phase + ", isVXWinner=" + this.isVXWinner + ", parentAuctionId=" + this.parentAuctionId + ", creativeId=" + this.creativeId + ", adUnitId=" + this.adUnitId + ", ext=" + this.ext + ')';
        }

        public /* synthetic */ CSBParam(int i10, double d10, int i11, boolean z10, String str, String str2, String str3, String str4, q2 q2Var) {
            if (63 != (i10 & 63)) {
                b2.a(i10, 63, a.INSTANCE.getDescriptor());
            }
            this.bidfloor = d10;
            this.phase = i11;
            this.isVXWinner = z10;
            this.parentAuctionId = str;
            this.creativeId = str2;
            this.adUnitId = str3;
            if ((i10 & 64) == 0) {
                this.ext = null;
            } else {
                this.ext = str4;
            }
        }

        public /* synthetic */ CSBParam(double d10, int i10, boolean z10, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(d10, i10, z10, str, str2, str3, (i11 & 64) != 0 ? null : str4);
        }

        public static /* synthetic */ void getAdUnitId$annotations() {
        }

        public static /* synthetic */ void getCreativeId$annotations() {
        }

        public static /* synthetic */ void getParentAuctionId$annotations() {
        }

        public static /* synthetic */ void isVXWinner$annotations() {
        }
    }

    public /* synthetic */ CommonRequestBody(DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceNode, (i10 & 2) != 0 ? null : appNode, (i10 & 4) != 0 ? null : user, (i10 & 8) != 0 ? null : requestExt, (i10 & 16) != 0 ? null : requestParam);
    }
}
